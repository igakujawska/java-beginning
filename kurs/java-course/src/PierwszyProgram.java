public class PierwszyProgram {
    //loops
    long liczba=13L;
    long silnia=1;

    public void liczSilnie(){
        for(long i=liczba; i>=1; i--){
            silnia*=i;
        }
        System.out.println("silnia z "+ liczba +"wynosi: "+ silnia);
    }

    //choinka na prawo
    int liczbaGwiazdek=1;
    int liczbaPoziomów=9;

    public void choinka1(){
        for(int i=1; i<=liczbaPoziomów; i++){
            for(int j=1; j<=liczbaGwiazdek; j++){
                System.out.print("*");
            }
            liczbaGwiazdek++;
            System.out.println();
        }
    }
    //choinka na lewo
    //jako, że program pamieta liczbe gwiazdek i jest ona duza, to liczba spacji
    //wychodzi na minusie, a choinka sie rozrasta. podmieniam wiec ja jako liczbe rzedow,
    //ktora sie nie zmienia, a jest rowna choince
    public void choinka2(){
        for(int i=1; i<=liczbaPoziomów; i++){
            for(int j=1; j<=liczbaPoziomów-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//string - zadania

    String imie = "Britney";
    String nazwisko = "Spears";
    String imieNazwisko = "Britney Spears";
    public void dlImienia(){
        System.out.println("Długość twojego imienia to "+ imie.length());
    }
    public void sprCzyImieToJanAlicja(){
        if(imie.equals("Alicja") || imie.equals("Jan")){
            System.out.println("Fajnie");
        } else {
            System.out.println("niefajnie");}
    }
    public void wlkLitery(){
        System.out.println(nazwisko.toUpperCase());
        }

    public void zmieniaczLiter(){
        System.out.println(nazwisko.replace('i','e'));
    }

    public void zad2(){
        String zdanie= "If you stay, you can't go wrong";
        for(int i = 0; i<zdanie.length(); i++){
            System.out.println(zdanie.charAt(i));
        }
    }

    public void zad3(){
        String zdanie= "If you stay, you can't go wrong";
        for(int i = zdanie.length()-1; i>=0; i--){
            System.out.println(zdanie.charAt(i));
        }
    }
}


