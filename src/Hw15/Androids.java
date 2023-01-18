package Hw15;

public class Androids implements SmartPhone, Linux {


    @Override
    public void call() {
        System.out.println("Android Call");

    }

    @Override
    public void internet() {
        System.out.println("Android Internet");

    }

    @Override
    public void sms() {
        System.out.println("Android SMS");

    }
}
