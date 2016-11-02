package nl.lemkes.springboot.standalone.batch.repository;

import nl.lemkes.springboot.standalone.batch.model.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Hans on 2-11-2016.
 */
@Repository
public interface DataRepository extends CrudRepository<Data, Long> {

}
