package spring.book.configuration.example.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.book.configuration.example.App.Staff.FleetCommander;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FleetCommander fleetCommander = context.getBean(FleetCommander.class);
        fleetCommander.command();
    }
}
