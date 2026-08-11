package exceptions;

public class ZadaniaWyjatki {

    public static void main(String[] args) {

        //Zadanie 1
        try {
            int a = 7999;
            int b = 5465;
            System.out.println(a/b);
        } catch(ArithmeticException e){
            System.out.println("Nie mozna dzielic przez 0");
        }

        //Zadanie 2
        try {
            System.out.println("Wynik z dzielenia z metody: " + podziel(8, 233));
        } catch (DzieleniePrzezZeroExc e) {
            System.out.println("Nie wolno dzielić przez zero w nowej metodzie!");
        }

    }

    public static int podziel(int a, int b) throws DzieleniePrzezZeroExc{
        if(b == 0){
            throw new DzieleniePrzezZeroExc();
        }
        return a / b;
    }

}