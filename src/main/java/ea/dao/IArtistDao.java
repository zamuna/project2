package ea.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ea.domain.Artist;


public interface IArtistDao{

	public abstract List<Artist> getAll();

	public abstract void add(Artist artist);

	public abstract Artist get(int id);

	public abstract void update(int artistId, Artist artist);

	public abstract void delete(Artist artist);

}