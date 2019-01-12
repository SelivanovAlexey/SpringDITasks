package com.netcracker.inheritance;

import com.netcracker.beanClasses.Cinema;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-config.xml");

        Cinema ironMan = (Cinema) context.getBean("ironMan");

        System.out.println(ironMan);
    }
}
