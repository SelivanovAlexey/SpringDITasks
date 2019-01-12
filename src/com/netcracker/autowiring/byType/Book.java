package com.netcracker.autowiring.byType;


public class Book {
    private BookOwner bookOwner;

    @Override
    public String toString() {
        return "Book{" +
                "bookOwner=" + bookOwner +
                '}';
    }

    public BookOwner getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(BookOwner bookOwner) {
        this.bookOwner = bookOwner;
    }
}
