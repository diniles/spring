package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> helloween = new ArrayList<>();
        helloween.add(new Person("Daniel", "Löble", 1973));
        helloween.add(new Person("Sascha", "Gerstner", 1977));
        helloween.add(new Person("Andi", "Deris", 1964));
        helloween.add(new Person("Michael", "Kiske", 1968));
        helloween.add(new Person("Kai", "Hansen", 1963));
        helloween.add(new Person("Markus", "Grosskopf", 1965));
        helloween.add(new Person("Michael", "Weikath", 1962));

        for (Person person : helloween) {
            System.out.println(person);
        }
    }
}