package com.mycompany.brigettesetlago16feb;

public class BrigetteSetlago16Feb {

    public static void main(String[] args) {
        // What should be displayed
        Person person = new Person(
            "Ryuk",
            35,
            "male",
            new String[] {"being a hardarse", "agile", "SSD hard drives"}
        );

        String greeting = person.hello();
        System.out.println(greeting);
    }
}

class Person {
    // My declarations
    private String name;
    private int age;
    private String gender;
    private String[] interests;

    // Constructor
    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    // Hello function
    public String hello() {
        String interestsString = String.join(", ", interests);
        return String.format(
            "Hello, my name is %s, my gender is %s and I am %d years old. My interests are %s.",
            name, gender, age, interestsString
        );
    }
}
