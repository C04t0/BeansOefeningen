package org.apotheosis;


import configuration.ProjectConfig;
import configuration.ProjectConfigStereotype;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Methode 1 (via @Bean annotatie)

        Car car = context.getBean(Car.class);
        System.out.println(car.getName());

        //Methode 2 (via stereotyping)

        AnnotationConfigApplicationContext contextStereotype =
                new AnnotationConfigApplicationContext(ProjectConfigStereotype.class);

        CarStereotype carStereotype = contextStereotype.getBean(CarStereotype.class);
        System.out.println(carStereotype.getName());
        System.out.println(carStereotype.getColour());


        //Methode 3 (via fabrieksmethode)

        Car car2 = new Car();
        car2.setName("Antoinette");
        Supplier<Car> carSupplier = () -> car2;
        context.registerBean("car2", Car.class, carSupplier);
        Car carBean = context.getBean(Car.class);

        System.out.println(carBean.getName());


        Car car3 = new Car();
        car3.setColour("brown");
        Car car4 = new Car();
        car4.setColour("black");
        Car car5 = new Car();
        car5.setColour("black");
        Car car6 = new Car();
        car6.setColour("yellow");
        Car car7 = new Car();
        car7.setColour("red");











    }
}
