package zad73;

public class Programist {
    //POLA
    private String imie;
    private String nazwisko;
    private String jezyk;
    private double zarobki;

    //KONSTRUKTORY
    public Programist(String podajImie, String podajNazwisko, String podajJezyk, double podajZarobki){
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

    //METODY
    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzJezyk(){
        return jezyk;
    }
    public double pobierzZarobki(){
        return zarobki;
    }
}

