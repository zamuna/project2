package ea.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
@Entity
public class Director {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "director")
    private List<Series> seriesList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer directorId) {
        this.id = directorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
