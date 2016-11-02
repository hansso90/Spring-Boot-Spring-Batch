package nl.lemkes.springboot.standalone.batch.model;

import javax.persistence.*;

/**
 * Created by Hans on 2-11-2016.
 */
@Entity
@Table(name = "data")
public class Data extends AbstractModel {

    @Column(nullable = false)
    private String data;

    @OneToOne(fetch = FetchType.EAGER)
    private Hash hash;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Hash getHash() {
        return hash;
    }

    public void setHash(Hash hash) {
        this.hash = hash;
    }
}
