package com.netcracker.autowiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringByType-config.xml");

        //autowire = byType
        Book book = (Book) context.getBean("book");
        System.out.println("Book details:" + book);
    }
}
