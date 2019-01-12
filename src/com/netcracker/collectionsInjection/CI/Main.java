package com.netcracker.collectionsInjection.CI;


import com.netcracker.beanClasses.CinemaList;
import com.netcracker.beanClasses.CinemaMap;
import com.netcracker.beanClasses.CinemaSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("typesinjection-config.xml");

        CinemaList list = (CinemaList) context.getBean("cinemaListCI");
        CinemaSet set = (CinemaSet) context.getBean("cinemaSetCI");
        CinemaMap map = (CinemaMap) context.getBean("cinemaMapCI");

        System.out.println(list.getList());
        System.out.println(set.getSet());
        System.out.println(map.getMap());


    }
}
