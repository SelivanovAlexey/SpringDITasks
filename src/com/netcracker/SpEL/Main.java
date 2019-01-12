package com.netcracker.SpEL;

import com.netcracker.beanClasses.Cinema;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");

        Cinema starWars = (Cinema) context.getBean("starWarsFilm");

        System.out.println(starWars);
    }
}
