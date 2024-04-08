package zadania1;

public class zad18 { public static void main(String[] args) {

    int liczbaAkcji = 600;
    double cenaZaAkcje = 21.77;
    final double PROWIZJA_STAWKA = 0.02; // 2%

    double kwotaBezProwizji = liczbaAkcji * cenaZaAkcje;
    double prowizja = kwotaBezProwizji * PROWIZJA_STAWKA;
    double lacznaKwota = kwotaBezProwizji + prowizja;

    System.out.println("Kwota zapłacona za same akcje (bez prowizji): " + kwotaBezProwizji + " zł");
    System.out.println("Wysokość prowizji: " + prowizja + " zł");
    System.out.println("Łączna zapłacona kwota (cena akcji plus prowizja): " + lacznaKwota + " zł");
}
}
