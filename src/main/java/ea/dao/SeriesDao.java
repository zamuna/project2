package ea.dao;


import domain.car.NoSuchResourceException;
import ea.domain.Series;
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
public class SeriesDao implements ISeriesDao {
    @Autowired
    private SessionFactory sessionFactory;
    Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private static int idCount = 1;
    private Map<Integer, Series> seriess = new HashMap<>();

    public SeriesDao() {
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Series> getAll() {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        return session.createQuery("FROM Series").list();
    }

    @Transactional
    public void add(Series series) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        session.merge(series);
    }

    @Override
    public Series get(int id) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }		Query q = session.createQuery("FROM Series where id = :id");
        q.setParameter("id", id);
        Series result = (Series)q.uniqueResult();

        if (result == null) {
            throw new NoSuchResourceException("Series", id);
        }

        return result;
    }

    @Transactional
    public void update(int seriesId, Series series) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        session.merge(series);
    }

    @Transactional
    public void delete(Series series) {
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        System.out.println(series.getId());
        session.delete(series);

    }
}
