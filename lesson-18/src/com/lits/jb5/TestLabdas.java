package com.lits.oop.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLabdas {

    public static void main(String[] args) {
        TestLabdas t = new TestLabdas();
//        t.test(new Test() {
//            @Override
//            public boolean apply(int one) {
//                return false;
//            }
//        });

//        t.test(e -> {
//            System.out.println("dsafasfasf");
//            return true;
//        });

//        t.test(t::test2);
//        List<String> y = Stream.of("1","2","3").peek(e -> System.out.println(e)).map(e -> e + "Mapped").collect(Collectors.toList());
//        y.forEach(e -> System.out.println(e));
//        y.stream().map(e -> e.substring(0,1)).map(e -> Integer.parseInt(e)).forEach(e -> System.out.println(e));

        List<Person> persons = Arrays.asList(new Person("Peter", 103, Arrays.asList(1,23,4,5)),
                new Person("Valera", 12, Arrays.asList(1,1,1,1)), new Person("John", 54, Arrays.asList(2,3,4,5)));
//        Map<Integer, String> m = persons.stream().peek(p -> System.out.println("Name: " + p.name + " age: " + p.age)).collect(Collectors.toMap(p -> p.age, p -> p.name));
//        m.entrySet().stream().forEach(p -> System.out.println("key: " + p.getKey() + " value: " + p.getValue()));
        persons.stream().flatMap(p -> p.marks.stream()).skip(3).forEach(e -> System.out.println(e));
    }


    public void test(Test test) {
//        test.apply(2);
    }

    public boolean test2(int io) {

        return io > 0;
    }
}
