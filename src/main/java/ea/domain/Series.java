package ea.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
@Entity
public class Series {
    @Id @GeneratedValue
    private Integer id;
    private String nameOfTheShow;
    private String description;
    private String studio;
    private String genre;
    private Integer rating;
    // director and cast
    @ManyToOne
    private Director director;
    @ElementCollection @OneToMany(mappedBy ="seriesList" )
    private List<Artist> artistList;

    public Integer getId() {
        return  id;
    }

    public void setId(Integer seriesId) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }


    public String getNameOfTheShow() {
        return nameOfTheShow;
    }

    public void setNameOfTheShow(String nameOfTheShow) {
        this.nameOfTheShow = nameOfTheShow;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", nameOfTheShow='" + nameOfTheShow + '\'' +
                ", description='" + description + '\'' +
                ", studio='" + studio + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", director=" + director +
                ", artistList=" + artistList +
                '}';
    }
}
