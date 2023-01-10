class Person {
    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }
    // "Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН"
    public String personInfo() {
        return " Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phone;
    }
    String name;
    String surname;
    String city;
    String phone;
}
class hw12 {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "Нью-Йорк", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Шанхай", "12325436454");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37754634686");
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}