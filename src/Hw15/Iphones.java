package Hw15;

public class Iphones implements SmartPhone, Ios {

    @Override
    public void call() {
        System.out.println("Ios Call");

    }

    @Override
    public void internet() {
        System.out.println("ios Internet");

    }

    @Override
    public void sms() {
        System.out.println("Ios SMS");

    }
}
