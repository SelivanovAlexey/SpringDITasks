package com.netcracker.SpEL;

import com.netcracker.beanClasses.ActionGenre;
import com.netcracker.beanClasses.IGenre;

public class SimpleConfig {
    private String title = "Star Wars";
    private IGenre genre = new ActionGenre();
    private int duration = 148;

    public String getTitle() {
        return title;
    }

    public IGenre getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
