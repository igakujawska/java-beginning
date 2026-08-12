package watki;

public class Biegacz implements Runnable {

    private String nazwa;

    // Konstruktor zapamiętujący nazwę biegacza
    public Biegacz(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println("Będę pierwszy - to ja " + nazwa);
        }
    }
}