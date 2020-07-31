package spring.book.configuration.example.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.book.configuration.example.App.Staff.FleetCommander;
import spring.book.configuration.example.App.Starship.Starship;

@Configuration
public class AppConfig {
    @Bean
    Starship starship() {
        return new Starship("Hello Spring!", System.out);
    }

    @Bean
    Starship ssEnterprise() {
        return new Starship("SS Enterprise reporting for duty.", System.out);
    }

    @Bean
    FleetCommander fleetCommander(Starship starship, Starship ssEnterprise) {
        return new FleetCommander(
                starship,
                starship,
                ssEnterprise
        );
    }
}
