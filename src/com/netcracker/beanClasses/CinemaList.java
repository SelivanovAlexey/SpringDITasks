package com.netcracker.beanClasses;

import java.util.List;

public class CinemaList {

    private List<Cinema> list;

    public CinemaList() {
    }

    public CinemaList(List<Cinema> list) {
        System.out.println("CI usage in list");
        this.list = list;
    }

    public void setList(List<Cinema> list) {
        System.out.println("SI usage in list");
        this.list = list;
    }

    public List<Cinema> getList() {
        return list;
    }
}

