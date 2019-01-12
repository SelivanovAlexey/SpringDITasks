package com.netcracker.autowiring.no;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringNo-config.xml");

        //autowire = no
        Book book = (Book) context.getBean("book");
        System.out.println("Book details:" + book);
    }
}
