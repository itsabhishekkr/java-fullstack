package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("befor context");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("after context");

        Car car=context.getBean(Car.class);

        car.drive();


    }
}
