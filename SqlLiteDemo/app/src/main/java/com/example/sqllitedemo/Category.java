package com.example.sqllitedemo;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class Category {
    int id;
    String name;
    String des;
    ArrayList<Book> listBooks;

    public Category() {
    }

    public Category(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public Category(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }
    @NonNull

    @Override
    public String toString() {
        return "Category: " + getName() +"\n" + "Description: " + getDes();
    }
}
