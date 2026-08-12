package watki;

public class MainWatki {
    public static void main(String[] args) {

        System.out.println("--- ZADANIE 1 ---");

        // wątek robie za pomocą klasy anonimowej z interfejsem Runnable
        Thread watek1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        });
            watek1.start();

        System.out.println("\n--- ZADANIE 2 ---");

        Czasoodmierzacz stoper = new Czasoodmierzacz();

        // stoper do prawdziwego Wątku
        Thread watekStopera = new Thread(stoper);
        watekStopera.start();

        System.out.println("\n--- ZADANIE 3 ---");

        Biegacz zawodnik1 = new Biegacz("Wątek Alfa");
        Biegacz zawodnik2 = new Biegacz("Wątek Omega");

        // Ładujemy ich do wątków Javy
        Thread watekAlfa = new Thread(zawodnik1);
        Thread watekOmega = new Thread(zawodnik2);

        watekAlfa.start();
        watekOmega.start();

    }
}