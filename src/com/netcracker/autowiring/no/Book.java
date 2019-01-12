package com.netcracker.autowiring.no;


public class Book {
    private String title;
    private BookOwner bookOwner;


    @Override
    public String toString() {
        return "Book{" +
                "bookOwner=" + bookOwner +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookOwner getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(BookOwner bookOwner) {
        this.bookOwner = bookOwner;
    }

    public Book(String title, BookOwner bookOwner) {
        this.title = title;
        this.bookOwner = bookOwner;
    }
}
