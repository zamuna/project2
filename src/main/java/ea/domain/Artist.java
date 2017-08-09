package ea.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Artist {
	@Id @GeneratedValue
	private int id;
	private String name;
	private String birthPlace;
	private String biography;
	@ManyToMany
	private List<Series> seriesList;
	
	@ElementCollection
	
	private List<byte[]> photos = new ArrayList<>();
	
	private double price;
	public Artist() {}
	
	public Artist(String name, String birthPlace, String biography, double price) {
		super();
		this.name = name;
		this.birthPlace = birthPlace;
		this.biography = biography;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<byte[]> getPhotos() {
		return photos;
	}

	public void setPhotos(List<byte[]> photos) {
		this.photos = photos;
	}

	public List<Series> getSeriesList() {
		return seriesList;
	}

	public void setSeriesList(List<Series> seriesList) {
		this.seriesList = seriesList;
	}
}
