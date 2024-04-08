package zadania1;

public class zad22 { public static void main(String[] args) {
    int liczbaAkcji = 1000;
    double cenaZakupu = 32.87;
    double cenaSprzedazy = 33.92;
    double prowizjaProcent = 2.0;


    double kwotaZakupu = liczbaAkcji * cenaZakupu;
    double prowizjaZakupu = kwotaZakupu * (prowizjaProcent / 100);
    double kwotaSprzedazy = liczbaAkcji * cenaSprzedazy;
    double prowizjaSprzedazy = kwotaSprzedazy * (prowizjaProcent / 100);
    double zysk = kwotaSprzedazy - kwotaZakupu - prowizjaZakupu - prowizjaSprzedazy;


    System.out.println("Kwota zapłacona przez Jacka za akcje: " + kwotaZakupu + " zł");
    System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie: " + prowizjaZakupu + " zł");
    System.out.println("Kwota otrzymana przez Jacka ze sprzedaży akcji: " + kwotaSprzedazy + " zł");
    System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży: " + prowizjaSprzedazy + " zł");
    System.out.println("Zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji: " + zysk + " zł");
}
}

