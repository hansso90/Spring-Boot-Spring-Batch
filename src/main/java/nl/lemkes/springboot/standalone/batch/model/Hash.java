package nl.lemkes.springboot.standalone.batch.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Hans on 2-11-2016.
 */
@Entity
@Table(name = "hash")
public class Hash extends AbstractModel {

    @Column(nullable = false)
    private String hash;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date hashDate;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
