public class Osoba {
    public static int liczbaInstancji = 0;
    private int id;
    private String imie;

    public Osoba() {
        this.id = 0;
        this.imie = "";
        this.liczbaInstancji++;
    }

    public Osoba(int id, String imie) {
        this.id = id;
        this.imie = imie;
        this.liczbaInstancji++;
    }

    public Osoba(Osoba osoba) {
        this.id = osoba.id;
        this.imie = osoba.imie;
        this.liczbaInstancji++;
    }

    public void wypiszImie(String argument) {
        if (this.imie != "")
            System.out.println("Cześć " + argument + " mam na imię " + this.imie);
        else
            System.out.println("Brak danych");
    }
}
