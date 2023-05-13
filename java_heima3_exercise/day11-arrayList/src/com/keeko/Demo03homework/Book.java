package com.keeko.Demo03homework;

public class Book {
    private String bookId;
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String bookId, String name, String author, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
