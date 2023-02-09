package configuration;

import org.apotheosis.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean
    Car car() {
        Car car = new Car();
        car.setName("Bertje");
        return car;
    }
    @Bean (value = "Antoinette")
    Car car1() {
        Car car = new Car();
        car.setName("Antoinette");
        return car;
    }
}
