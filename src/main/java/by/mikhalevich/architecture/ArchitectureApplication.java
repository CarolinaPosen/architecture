package by.mikhalevich.architecture;

import by.mikhalevich.architecture.repositories.AircraftCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArchitectureApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ArchitectureApplication.class, args);

    }

}
