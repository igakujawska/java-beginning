package zadania_io_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOFileMain {
    public static void main(String[] args) {

        // 1. Zaczynamy blok try, bo praca na plikach jest "niebezpieczna"
        try {
            File file = new File("fragment.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // narzędzia do zapisywania kopii pliku
            String sciezka = "fragment-kopia.txt";
            FileWriter fileWriter = new FileWriter(sciezka);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szukaną frazę:");
            String szukanaFraza = scanner.nextLine();

            String linia;
            int liczbaZnakow = 0;
            boolean czyZawieraFraze = false;
            int nrLinii = 0;

            // Poprawione nawiasy w pętli while!
            while ((linia = bufferedReader.readLine()) != null) {
                nrLinii++;

                // a) wypisz jego zawartość na ekran (zakomentowane na wideo)
                // System.out.println(linia);

                // b) zlicz i wypisz ilość znaków
                liczbaZnakow += linia.length();

                // c) sprawdź czy znajduje się dana fraza
                if (linia.toLowerCase().contains(szukanaFraza)) {
                    czyZawieraFraze = true;
                }

                // d) wypisz nr linii wraz z całą linią, gdzie znajduje się tekst
                if (linia.toLowerCase().contains(szukanaFraza)) {
                    System.out.println(nrLinii + ": " + linia);
                }

                // e) przekopiuj całą zawartość do nowego pliku
                bufferedWriter.write(linia + "\n");
            }

            // podsumowania POZA pętlą while żeby wydrukowały się tylko raz
            System.out.println();
            System.out.println("Liczba znaków: " + liczbaZnakow);
            System.out.println("Czy zawiera frazę: " + czyZawieraFraze);

            bufferedWriter.write("kopia pliku utworzona przez igę");

            // !!!!zamykamy wszystkie strumienie i scannera
            bufferedWriter.close();
            bufferedReader.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać danych");
        }
    }
}
