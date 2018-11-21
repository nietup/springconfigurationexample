package spring.book.configuration.example.springconfigurationexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.book.configuration.example.springconfigurationexample.Starship.Starship;

@Configuration
public class AppConfig {
    @Bean
    Starship starship() {
        return new Starship("Hello Spring!", System.out);
    }
}
