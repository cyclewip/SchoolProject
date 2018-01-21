package com.company;

import java.util.ArrayList;

public class CourseMaterial {
    private String book = "";
    private double cost;


    public CourseMaterial(String book, int cost) {
        this.book = book;
        this.cost = cost;
    }

    public CourseMaterial() {
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
