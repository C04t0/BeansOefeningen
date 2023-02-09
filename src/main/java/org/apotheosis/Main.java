package org.apotheosis;


import configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Methode 1 (via @Bean annotatie)

        Animal animal = context.getBean(Animal.class);
        System.out.println(animal.getName());

        //Methode 2 (via stereotyping)

        Animal animal1 = context.getBean(Animal.class);
        System.out.println(animal1.getName());


        //Methode 3 (via fabrieksmethode)

        Animal animal2 = new Animal();
        animal2.setName("Antoinette");
        Supplier<Animal> animalSupplier = () -> animal2;
        context.registerBean("animal2", Animal.class, animalSupplier);
        Animal animalBean = context.getBean(Animal.class);

        System.out.println(animalBean.getName());




    }
}
