package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author qsbao on 19/11/2017
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

}
