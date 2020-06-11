package com.example.sqllitedemo;

import android.media.Image;

import java.util.Locale;

public class Book {
    int id;
    String name;
    String author;
    long publishYear;
    Category category;

    public Book() {
    }

    public Book(long id, String name, String author, long publishYear, Category category) {
        this.id = (int) id;
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.category = category;
    }

    public Book(String name, String author, long publishYear, Category category) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (int) id;
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

    public long getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(long publishYear) {
        this.publishYear = publishYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Name:" +getName() + " \n" +"Author: "+getAuthor() +"\n" + "Publish Year: "+getPublishYear() + "\n" + "Category: " +getCategory().getName();
    }
}
