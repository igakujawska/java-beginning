package watki;

public class Czasoodmierzacz implements Runnable {

    @Override
    public void run() {
        int sekundy = 0;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Błąd wątku!");
            }

            sekundy++;
            System.out.println("Program działa już: " + sekundy + " sekund(y)");
        }
    }
}
