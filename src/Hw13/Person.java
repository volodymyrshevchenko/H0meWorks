package Hw13;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public String address;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String gender) {
        this.firstName = firstName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, int age, String gender, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }


    }