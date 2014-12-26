package rota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import rota.dao.PersonRepository;
import rota.entities.Person;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RotaAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RotaAppApplication.class, args);
        PersonRepository repository = context.getBean(PersonRepository.class);

        // save a couple of customers
        repository.save(new Person("Mr", "Jack", "Bauer", "jack.bauer@ctu.gov"));
        repository.save(new Person("Miss", "Chloe", "O'Brian", "chloe.obrian@ctu.gov"));
    }
}
