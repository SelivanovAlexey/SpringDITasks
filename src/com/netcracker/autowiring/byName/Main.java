package com.netcracker.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringByName-config.xml");

        //autowire = byName
        Book book = (Book) context.getBean("book");
        System.out.println("Book details:" + book);
    }

}
