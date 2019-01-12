package com.netcracker.lookupMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup-config.xml");

        Car car = context.getBean(Car.class);
        System.out.println(car.getPassengerIn("Jake"));
        System.out.println(car.getPassengerIn("Mary"));
    }
}
