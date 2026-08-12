package zad73;

import exceptions.DzieleniePrzezZeroExc;
import exceptions.LiczbaUjemnaException;

public class MatematyczneIntro {

        // ZADANIE 2: Metoda z wyjątkiem Checked (MUSI byc "throws" w nagłówku)
        public static int podziel(int a, int b) throws DzieleniePrzezZeroExc {
            if (b == 0) {
                throw new DzieleniePrzezZeroExc(); // błąd z plik 1
            }
            return a / b;
        }

        // ZADANIE 3: Metoda z wyjątkiem Unchecked (NIE MUSI byc "throws" w nagłówku)
        public static double obwodKola(double r) {
            if (r < 0) {
                throw new LiczbaUjemnaException(); //błąd z plik 2!
            }
            return 2 * 3.14 * r;
        }
    }

