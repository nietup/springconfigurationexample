package spring.book.configuration.example.springconfigurationexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.book.configuration.example.springconfigurationexample.Starship.Starship;

public class SpringconfigurationexampleApplication {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        Starship starship = context.getBean(Starship.class);
        starship.reportForDudy();
    }
}
