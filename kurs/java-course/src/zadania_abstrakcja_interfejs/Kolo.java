package zadania_abstrakcja_interfejs;

import zad73.TablicaObliczeniowa;

public class Kolo implements Figury{

    // 1. Prywatne pole wiec klasa pamieta podany promień
    private double r;

    // 2. Publiczny konstruktor zatem uruchamia się, przy tworzeniu obiekt (np. new Kolo(5.0))
    public Kolo(double r) {
        // "this.r" to zmienna klasy z linijki wyżej, a "r" to wartość z nawiasu
        this.r = r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }
}
