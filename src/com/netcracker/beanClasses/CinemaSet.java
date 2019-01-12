package com.netcracker.beanClasses;

import java.util.Set;

public class CinemaSet {

    private Set<Cinema> set;

    public CinemaSet() {
    }

    public CinemaSet(Set<Cinema> set) {
        System.out.println("CI usage in set");
        this.set = set;
    }

    public void setSet(Set<Cinema> set) {
        System.out.println("SI usage in set");
        this.set = set;
    }

    public Set<Cinema> getSet() {
        return set;
    }
}
