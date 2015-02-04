package rota;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import rota.dao.PersonRepository;
import rota.entities.Person;
import rota.services.PeopleService;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RotaAppApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RotaAppApplication.class, args);
    }
    
	@Bean
	public CommandLineRunner init(
			final PeopleService peopleService) {

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				peopleService.createTestData();
			}
		};
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<RotaAppApplication> applicationClass = RotaAppApplication.class;
}
