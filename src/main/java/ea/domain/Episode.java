package ea.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Episode {
    @Id
    @GeneratedValue
    private Integer episodeId;
    @ElementCollection
    List<Artist> artistList;
}
