package com.netcracker.factoryMethod;

import com.netcracker.beanClasses.IGenre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryMethod-config.xml");

        IGenre action = (IGenre) context.getBean("action");

        action.showGenre();
    }
}
