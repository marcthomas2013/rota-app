package rota-app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RotaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RotaAppApplication.class, args);
    }
}
