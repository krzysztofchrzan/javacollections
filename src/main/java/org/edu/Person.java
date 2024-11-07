package org.edu;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname(){
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAll() {
        return name + " " + surname + " " + age;
    }
}