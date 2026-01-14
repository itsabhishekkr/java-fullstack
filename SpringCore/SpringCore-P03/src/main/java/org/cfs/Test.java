package org.cfs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Motor motor = context.getBean(Motor.class);
        motor.doWork();
        context.close();
    }
}
