import exceptions.Bank;
import exceptions.DzieleniePrzezZeroExc;
import zad73.MatematyczneIntro;
import zad73.Programist;
import zad73.TablicaObliczeniowa;
import zadania_abstrakcja_interfejs.GwiazdaSmierci;
import zadania_abstrakcja_interfejs.Kolo;
import zadania_abstrakcja_interfejs.Prostokat;

public class Main{
    public static void main(String[] args) {

        // zadania 1-6
        PierwszyProgram program1 = new PierwszyProgram();
        program1.liczSilnie();
        program1.choinka1();
        program1.choinka2();
        program1.dlImienia();
        program1.sprCzyImieToJanAlicja();
        program1.wlkLitery();
        program1.zmieniaczLiter();
        program1.zad2();
        program1.zad3();

        Programist programist = new Programist("Britney", "Spears","Java", 79990);
        System.out.println("imię: " + programist.pobierzImie());
        System.out.println("nazwisko: " + programist.pobierzNazwisko());
        System.out.println("język programowania: " + programist.pobierzJezyk());
        System.out.println("wynagrodzenie: " + programist.pobierzZarobki());

        int[] tablica = {93,32031,128792,1287,127,1,3988912,9};
        TablicaObliczeniowa obliczonka = new TablicaObliczeniowa(tablica);
        System.out.println("Suma to "+ obliczonka.suma());
        System.out.println("Średnia to "+ obliczonka.średnia());
        System.out.println("Minimum to "+ obliczonka.min());
        System.out.println("Maksimum to "+ obliczonka.max());

        System.out.println("Obwód koła to: "+obliczonka.obwodKola(8) + ", a jego pole to: "+ obliczonka.poleKola(8));
        System.out.println("Obwód prostokąta to: "+obliczonka.obwodProstokata(7,57) + ", a jego pole to: "+ obliczonka.poleProstokata(7, 57));

        System.out.println("\n--- ZADANIE 2 ---");
        // wyjątek Checked wywolywany, więc i potrzebny try-catch:
        try {
            // Próbujemy podzielić przez zero z uzyciem klasy
            System.out.println("Wynik z dzielenia: " + MatematyczneIntro.podziel(10, 0));
        } catch (DzieleniePrzezZeroExc e) {
            System.out.println("Złapano błąd z metody podziel: Nie wolno dzielić przez zero!");
        }

        System.out.println("\n--- ZADANIE 3 ---");
        // wyrzuca wyjątek Unchecked (LiczbaUjemnaException).
        // skoro to wyjątek typu Unchecked, to NIE MUSIMY owijać w try-catch.
        // program przy tej linijce celowo zatrzyma się i wywali
        System.out.println("Obwód koła: " + MatematyczneIntro.obwodKola(5));

        Bank.zrobPrzelew(7889.0);
        /*gdyby nie słowo static przy zrobPrzelew to potrzebne:
        Bank mojBank = new Bank();
        mojBank.zrobPrzelew(150.0); */

        System.out.println("\n--- ZADANIE 4 ---");
        // obiekt nowej klasy
        GwiazdaSmierci imperium = new GwiazdaSmierci();
        imperium.atakujLaserem();

        System.out.println("\n--- ZADANIE 5 ---");

        Kolo mojeKolo = new Kolo(5.0);
        System.out.println("Pole koła: " + mojeKolo.pole());
        System.out.println("Obwód koła: " + mojeKolo.obwod());

        Prostokat mojProstokat = new Prostokat(4.0, 10.0);
        System.out.println("Pole prostokąta: " + mojProstokat.pole());
        System.out.println("Obwód prostokąta: " + mojProstokat.obwod());

        System.out.println("\n--- ZADANIE 6 ---");
        // klasa anonimowa
        Info mojeInfo = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("informacja wypisana z klasy anonimowej");
            }
        };
        mojeInfo.wyswietlInfo();

    }

        interface Info{
        void wyswietlInfo();
        }
}