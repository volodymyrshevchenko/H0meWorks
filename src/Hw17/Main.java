package Hw17;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vova",3,12,1994,"vova@gmail.com","2626262","Shevchenko",100,120,2000,28);
        user.printAccountInfo();

        User user2 = new User("Alina",17,3,1996,"alina@gmail.com","34242","Shevchenko",120,110,2,26);
        user2.printAccountInfo();

        User user3 = new User("John",11,11,1990,"shshshs@gmail.com","346356","wick",120,130,1200,30);
        user3.printAccountInfo();

        user.setSurname("James");
        user.setPressure(1249);
        user2.setPressure(1241);
        user2.setWeight(111);

        user.printAccountInfo();
        user2.printAccountInfo();



    }
}
