package com.lits.oop.lesson19;

import java.time.LocalDate;

public class Car {
    private String mark;

    private String model;

    private String color;

    private LocalDate produced;

    public Car() {
    }

    public Car(String mark, String model, String color, LocalDate produced) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.produced = produced;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public LocalDate getProduced() {
        return produced;
    }

    public void setProduced(LocalDate produced) {
        this.produced = produced;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", produced=" + produced +
                '}';
    }
}
