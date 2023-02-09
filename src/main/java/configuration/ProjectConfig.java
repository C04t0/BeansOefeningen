package configuration;

import org.apotheosis.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class ProjectConfig {


    @Primary
    @Bean
    Animal animal() {
        Animal animal = new Animal();
        animal.setName("Bertje");
        return animal;
    }


}
