package ea.dao;

import domain.car.NoSuchResourceException;
import ea.domain.Director;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zamuna on 8/7/2017.
 */
@Repository
public class DirectorDao implements IDirectorDao {
    @Autowired
    private SessionFactory sessionFactory;
    Session session;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private static int idCount = 1;
    private Map<Integer, Director> directors = new HashMap<>();

    public DirectorDao() {
    }
    @Transactional
    @SuppressWarnings("unchecked")
    public List<Director> getAll() {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        return session.createQuery("FROM Director").list();
    }

    @Transactional
    public void add(Director director) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        session.merge(director);
    }

    @Override
    public Director get(int id) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }		Query q = session.createQuery("FROM Director where id = :id");
        q.setParameter("id", id);
        Director result = (Director)q.uniqueResult();

        if (result == null) {
            throw new NoSuchResourceException("Director", id);
        }

        return result;
    }

    @Transactional
    public void update(int directorId, Director director) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        session.merge(director);
    }

    @Transactional
    public void delete(Director director) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        session.delete(director);
//        session.flush();

    }
}
