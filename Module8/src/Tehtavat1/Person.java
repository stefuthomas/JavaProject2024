package Tehtavat1;

import java.util.*;


public class Person {
    private String name, city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}

class PersonSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Antti", "Helsinki", 20));
        people.add(new Person("Matti", "Helsinki", 50));
        people.add(new Person("Jussi", "Turku", 32));
        people.add(new Person("Pekka", "Turku", 26));
        people.add(new Person("Lauri", "Jyväskylä", 47));
        people.add(new Person("Erkki", "Jyväskylä", 19));

        System.out.println("People ordered in ascending oreder:");
        Collections.sort(people, Comparator.comparingInt(Person :: getAge));
        people.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));

        System.out.println();
        people.removeIf(person -> person.getCity() != "Turku");
        System.out.println("Only the people from Turku:");
        people.forEach(person -> System.out.println(person.getName() + " " + person.getCity()));
    }
}