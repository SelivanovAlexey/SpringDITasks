package com.netcracker.typesInjection.SI;

import com.netcracker.beanClasses.Cinema;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("typesinjection-config.xml");

        Cinema inceptionFilm = (Cinema) context.getBean("inception");
        Cinema incrediblesFilm = (Cinema) context.getBean("incredibles");
        Cinema cobainMontageOfHeckFilm = (Cinema) context.getBean("cobainMontageOfHeck");

        System.out.println(inceptionFilm);
        System.out.println(incrediblesFilm);
        System.out.println(cobainMontageOfHeckFilm);

        System.out.println(inceptionFilm.getTitle());
        inceptionFilm.getGenre().showGenre();

        System.out.println(incrediblesFilm.getTitle());
        incrediblesFilm.getGenre().showGenre();

        System.out.println(cobainMontageOfHeckFilm.getTitle());
        cobainMontageOfHeckFilm.getGenre().showGenre();
    }
}
