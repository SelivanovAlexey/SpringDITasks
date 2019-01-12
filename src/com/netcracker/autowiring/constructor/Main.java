package com.netcracker.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringConstructor-config.xml");

        //autowire = constructor
        Book book = (Book) context.getBean("book");
        System.out.println("Book details:" + book);
    }
}
