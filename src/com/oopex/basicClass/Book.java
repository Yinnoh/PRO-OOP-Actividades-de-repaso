package com.oopex.basicClass;

import java.math.BigInteger;

public class Book {
    private String ISBN;
    private String name;
    private String author;
    private String category;
    private long sales;

    public Book(){}

    public Book(String name, String author, String category, String ISBN, long sales) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.ISBN = ISBN;
        this.sales = sales;
    }

    public Book(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }


}
