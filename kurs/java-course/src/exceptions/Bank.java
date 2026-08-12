package exceptions;
public class Bank {

    // Unchecked (RuntimeException) wiec bez "throws KwotaUjemnaException" w nagłówku
    public static void zrobPrzelew(double kwota) {
        if(kwota<=0){
            throw new KwotaUjemnaException();
        }
        //else
        System.out.println("Przelew na kwotę " + kwota + " zł wysłany pomyślnie.");
    }
}