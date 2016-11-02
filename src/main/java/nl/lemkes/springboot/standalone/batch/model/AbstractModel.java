package nl.lemkes.springboot.standalone.batch.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Hans on 2-11-2016.
 */
@MappedSuperclass
public abstract class AbstractModel implements Serializable {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
