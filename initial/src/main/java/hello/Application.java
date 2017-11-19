package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qsbao on 19/11/2017
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.deleteAll();

        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        repository.findAll().forEach(System.out::println);
        System.out.println();

        System.out.println(repository.findByFirstName("Alice"));
        System.out.println();

        repository.findByLastName("Smith").forEach(System.out::println);
    }
}
