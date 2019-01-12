package com.netcracker.autowiring.byName;


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

    public void setBookOwner2(BookOwner bookOwner) {
        this.bookOwner = bookOwner;
    }
}
