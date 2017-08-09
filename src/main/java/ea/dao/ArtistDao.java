package ea.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import domain.car.NoSuchResourceException;
import ea.domain.Artist;

@Repository
public class ArtistDao implements IArtistDao {

	@Autowired
	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private static int idCount = 1;
	private Map<Integer, Artist> artists = new HashMap<>();

	public ArtistDao() {
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Artist> getAll() {
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session.createQuery("FROM Artist").list();			
	}

	@Transactional
	public void add(Artist artist) {
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		session.merge(artist);
	}

	@Override
	public Artist get(int id) {
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}		Query q = session.createQuery("FROM Artist where id = :id");
		q.setParameter("id", id);
		Artist result = (Artist)q.uniqueResult();

		if (result == null) {
			throw new NoSuchResourceException("Artist", id);
		}

		return result;
	}

	@Transactional
	public void update(int artistId, Artist artist) {
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		session.merge(artist);
	}

	@Transactional
	public void delete(Artist artist) {
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		System.out.println(artist.getId());
		session.delete(artist);
		
	}
}
