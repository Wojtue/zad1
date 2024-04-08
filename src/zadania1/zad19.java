package zadania1;

public class zad19 {public static void main(String[] args) {
    int liczbaAnkietowanych = 12467;
    double procentKupujacychNapojEnergetyczny = 0.14;
    double procentPreferujacychSmakCytrusowy = 0.64;

    int liczbaKupujacychNapojEnergetyczny = (int) (liczbaAnkietowanych * procentKupujacychNapojEnergetyczny);
    int liczbaPreferujacychSmakCytrusowy = (int) (liczbaKupujacychNapojEnergetyczny * procentPreferujacychSmakCytrusowy);


    System.out.println("Przybliżona liczba ankietowanych osób, które kupują przynajmniej jeden napój energetyczny tygodniowo: " + liczbaKupujacychNapojEnergetyczny);
    System.out.println("Przybliżona liczba ankietowanych osób, które preferują napoje energetyczne o smaku cytrusowym: " + liczbaPreferujacychSmakCytrusowy);
}
}
