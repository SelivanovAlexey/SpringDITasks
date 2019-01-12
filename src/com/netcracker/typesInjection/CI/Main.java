package com.netcracker.typesInjection.CI;

import com.netcracker.beanClasses.Cinema;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("typesinjection-config.xml");

        Cinema avengersFilm = (Cinema) context.getBean("avengers");
        Cinema snatchFilm = (Cinema) context.getBean("snatch");
        Cinema winterOnFireFilm = (Cinema) context.getBean("winterOnFire");

        System.out.println(avengersFilm);
        System.out.println(snatchFilm);
        System.out.println(winterOnFireFilm);


        avengersFilm.getGenre().showGenre();
        snatchFilm.getGenre().showGenre();
        winterOnFireFilm.getGenre().showGenre();
    }
}
