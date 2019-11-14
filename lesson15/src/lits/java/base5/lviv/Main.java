package lits.java.base5.lviv;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        var strings = new HashSet<String>();

        strings.add("One");
        strings.add("One");
        strings.add("One");

        System.out.println(strings.size());

        var linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("three");
        linkedHashSet.add("one");
        linkedHashSet.add("two");

        System.out.println(linkedHashSet);

        var people = new TreeSet<>();

        people.add(new Person("John", 34));
        people.add(new Person("Max", 22));
        people.add(new Person("Mike", 29));

        System.out.println(people);


    }
}
