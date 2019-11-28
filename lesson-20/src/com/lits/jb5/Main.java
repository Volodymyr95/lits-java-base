package com.lits.oop.lesson19;

import com.lits.oop.first.Auto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Consumer<String> t = m::t;
        t.accept("test lambda");

        int i = 200;
        int c1 = 200;
        int b = 200;
        BiConsumer<String, String> biConsumer = (one, two) -> System.out.println(one + two + i);

        Function<String, Integer> fun = (String response) -> {
            System.out.println("HTTP response: " + response);
            return Integer.parseInt(response.substring(0, 3));
        };
        Integer res = fun.apply("200 OK");

        System.out.println("GLOBAL response " + res);


        Consumer<String> stat1 = s -> Main.print(s + i + b + c1);

        Consumer<Auto> stat2 = s -> Main.print(s.name()+ i);

        Consumer<String> stat3 = s -> Main.print(s + i);

        List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "red", LocalDate.of(2012, 2,3)), new Car("Mazda", "3", "red", LocalDate.of(2003, 2,3)),
                new Car("BMW", "M3", "red", LocalDate.of(2002, 2,3)), new Car("ACURA", "TFX", "WHITE", LocalDate.of(2017, 2,3)));

        cars.sort(Comparator.comparing(Car::getProduced));

        cars.stream().filter(c -> c.getColor().equals("red")).forEach(c -> System.out.println(c.toString()));

        cars.stream().filter(c -> "red".equals(c.getColor())).sorted((o1, o2) -> o1.getProduced().compareTo(o2.getProduced())).forEach(c -> System.out.println(c));

    }

    static void print(String s) {
        System.out.println(s);
    }


    static void lambda$1(String s) {
        System.out.println(s);
    }

    static void lambda$2(Main m, String s) {
        m.t(s);
    }

    static void lambda$3(String one, String two) {
        System.out.println(one + two);
    }

    static void lambda$4(String one, String two, int i) {
        System.out.println(one + two + i);
    }

    static void lambda$5(String s, int i) {
        Main.print(s + i);
    }

    static void lambda$5(Auto s, int i) {
        Main.print(s.name() + i);
    }

    static void lambda$6(String s, int i, int b, int c) {
        Main.print(s + i + b + c);
    }

    public void t (String s) {
        System.out.println(s);
    }
}
