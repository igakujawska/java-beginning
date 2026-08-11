package zad73;

public class TablicaObliczeniowa {
    private int[] tablica;

    //KONSTRUKTOR
    public TablicaObliczeniowa(int[] podajTablice){
        tablica = podajTablice;
    }

    public int suma(){
        int suma = 0;
        for(int i = 0; i<tablica.length; i++){
            suma += tablica[i];
        }
        return suma;
    }

    public int średnia(){
        return suma()/ tablica.length;
    }

    public int min(){
        int min=Integer.MAX_VALUE;
        for(int i = 0; i< tablica.length; i++){
            if(tablica[i]<min){
                min=tablica[i];
            }
        }
        return min;
    }

    public int max(){
        int max=Integer.MIN_VALUE;
        for(int i = 0; i< tablica.length; i++){
            if(tablica[i]>max){
                max=tablica[i];
            }
        }
        return max;
    }

    public static double PI = 3.14; //final bo to stała
    public static double obwodKola(double r){
        return 2*PI*r;
    }

    public static double poleKola(double r){
        return PI*r*r;
    }

    public static double poleProstokata(double a, double b){
        return a*b;
    }

    public static double obwodProstokata(double a, double b){
        return 2*(a+b);
    }

}
