package com.bean;

public class Bird {
    private int bid;
    private String color;
    private int age;
    private String shape;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Bird(String color, int age, String shape) {
        this.color = color;
        this.age = age;
        this.shape = shape;
    }

    public Bird() {
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
