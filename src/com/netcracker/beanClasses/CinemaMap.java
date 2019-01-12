package com.netcracker.beanClasses;

import java.util.Map;

public class CinemaMap {

    private Map<Integer, Cinema> map;

    public CinemaMap() {
    }

    public CinemaMap(Map<Integer,Cinema> map) {
        System.out.println("CI usage in map");
        this.map = map;
    }

    public void setMap(Map<Integer,Cinema> map) {
        System.out.println("SI usage in map");
        this.map = map;
    }

    public Map<Integer, Cinema> getMap() {
        return map;
    }
}
