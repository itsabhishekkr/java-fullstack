package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("befor context");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("after context");

        System.out.println("befor bean created");
        Car car1=context.getBean(Car.class);
        System.out.println("after bean created");
//        car.drive();

        Car car2=context.getBean(Car.class);
        System.out.println("same car engine "+ (car1==car2));


        PetrolEngine p1=context.getBean(PetrolEngine.class);
        PetrolEngine p2=context.getBean(PetrolEngine.class);
        System.out.println("same petrol engine  "+ (p1==p2));

    }
}
