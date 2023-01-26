package Hw16;

public class Burger {
    public String bulochka;
    public String meet;
    public String cheese;
    public String onion;
    public String mayo;
    public String doublemeat;

    public Burger(String bulochka, String meet, String cheese, String onion, String mayo) {
        this.bulochka = bulochka;
        this.meet = meet;
        this.cheese = cheese;
        this.onion = onion;
        this.mayo = mayo;

        System.out.println(" ClassicBurger " + bulochka + meet + cheese + onion + mayo);
    }

    public Burger(String bulochka, String meet, String cheese, String onion) {
        this.bulochka = bulochka;
        this.meet = meet;
        this.cheese = cheese;
        this.onion = onion;

        System.out.println(" BurgerNoMayo " + bulochka + meet + cheese + onion);
    }

    public Burger(String bulochka, String meet, String cheese, String onion, String mayo, String doublemeat) {
        this.bulochka = bulochka;
        this.meet = meet;
        this.cheese = cheese;
        this.onion = onion;
        this.mayo = mayo;
        this.doublemeat = doublemeat;

        System.out.println(" Burgerdouble " + bulochka + meet + cheese + onion + mayo + doublemeat);
    }
}



