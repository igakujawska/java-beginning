package zadania_scanner;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

        // obiekt scannera tylko raz na cały program
        Scanner scanner = new Scanner(System.in);

        // --- ZADANIE 1 ---
        System.out.println("--- ZADANIE 1 ---");
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj wzrost (w cm): ");
        int wzrost = scanner.nextInt();

        // WAŻNE: wczytując liczbę (nextInt) w pamięci komputera zostaje "niewidzialny"
        // znak wciśnięcia entera, któru trzeba "połknąć" pustym nextLine(),
        // by nie psuł czytania tekstu w kolejnych zad
        scanner.nextLine();

        System.out.println("Jestem " + imie + " " + nazwisko + " i mam " + wzrost + " cm wzrostu.");

        // --- ZADANIE 2 ---
        System.out.println("\n--- ZADANIE 2 ---");
        System.out.println("Wpisuj teksty (wpisz 'x' lub 'X' aby zakończyć):");

        while (true) {
            String tekst = scanner.nextLine();

            // ignoreCase do ignorowania wielkości liter (reaguje i na 'x' i na 'X')
            if (tekst.equalsIgnoreCase("x")) {
                break;
            }
            System.out.print(tekst + ";");
        }
        System.out.println();

        // --- ZADANIE 3 ---
        System.out.println("\n--- ZADANIE 3 ---");
        System.out.print("Wpisz całą linię tekstu: ");
        String zdanie = scanner.nextLine();

        System.out.print("Ile razy wypisać to zdanie? ");
        int ileRazy = scanner.nextInt();

        for (int i = 0; i < ileRazy; i++) {
            System.out.println(zdanie);
        }

        // --- ZADANIE 4 ---
        System.out.println("\n--- ZADANIE 4 ---");
        System.out.println("Podawaj liczby do zsumowania (liczba ujemna kończy działanie):");

        int suma = 0;

        while (true) {
            int liczba = scanner.nextInt();

            if (liczba < 0) {
                break;
            }

            suma += liczba;
        }

        System.out.println("Suma podanych liczb wynosi: " + suma);

        scanner.close();
    }
}