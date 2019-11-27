package com.lits.oop.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Person {
    public String name;
    public int age;
    public List<Integer> marks;

    public Person(String name, int age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = Optional.ofNullable(marks).orElseGet(ArrayList::new);
    }
}
