package Hw17;

public class User {
    private String name;
    private int dayOfBirthday;
    private int monthOfBirthday;
    private int yearOfBirthday;
    private String email;
    private String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    public User(String name, int dayOfBirthday, int monthOfBirthday, int yearOfBirthday, String email, String phone, String surname, int weight, int pressure, int steps, int age) {
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public int getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


    public int getAge() {
        return age;
    }

    public void setSteps(int steps) {
        this.steps = steps;




    }

    public void printAccountInfo(){
        System.out.println("Name - " + name);
        System.out.println("DayOfBirth - " + dayOfBirthday);
        System.out.println("MonthOfBirthday - " + monthOfBirthday);
        System.out.println("YearOfBirthday - " + yearOfBirthday);
        System.out.println("Email - " + email);
        System.out.println("Phone - " + phone);
        System.out.println("Surname - " + surname);
        System.out.println("Weight - " + weight);
        System.out.println("Pressure - " + pressure);
        System.out.println("Steps - " + steps);
        System.out.println("Age - " + age);
    }
}
