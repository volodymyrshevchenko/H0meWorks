package Hw16;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("bulochka","meet","cheese","onion","mayo");
        System.out.println();

        Burger burgerNoMayo = new Burger("bulochka","meet","cheese","onion");
        System.out.println();

        Burger burgerDoubleMeet = new Burger("bulochka","meet","cheese","onion","mayo","doublemeet");
        System.out.println();

    }


}
