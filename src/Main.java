import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba zarejestrowanych osób to " + Osoba.liczbaInstancji);

        Osoba osoba = new Osoba();

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj id");
        int idWczytane = klawiatura.nextInt();

        System.out.println("Podaj imie");
        String imieWczytane = klawiatura.next();

        Osoba osoba2 = new Osoba(idWczytane, imieWczytane);

        Osoba osoba3 = new Osoba(osoba2);

        osoba.wypiszImie("Jan");
        osoba2.wypiszImie("Jan");
        osoba3.wypiszImie("Jan");

        System.out.println("Liczba zarejestrowanych osób to " + Osoba.liczbaInstancji);
    }
}