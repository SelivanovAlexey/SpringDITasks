package com.netcracker.beanClasses;


import java.util.Objects;

public class Cinema {

    private String title;
    private IGenre genre;
    private int duration;

    public Cinema() {
    }

    public Cinema(String title, IGenre genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        System.out.println("CI usage for " + title);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "title='" + title + '\'' +
                ", genre=" + genre.getClass() +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return duration == cinema.duration &&
                Objects.equals(title, cinema.title) &&
                Objects.equals(genre, cinema.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, duration);
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public IGenre getGenre() {
        return genre;
    }

    public void setGenre(IGenre genre) {
        System.out.println("SI usage for " + this.title);
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
