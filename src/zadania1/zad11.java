package zadania1;
import java.util.Scanner;
public class zad11 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    final double PODATEK_STANOWY = 0.04; // 4%
    final double PODATEK_LOKALNY = 0.02; // 2%


    System.out.print("Proszę wprowadzić wartość kupowanego produktu: ");
    double wartoscProduktu = scanner.nextDouble();


    double podatekStanowy = wartoscProduktu * PODATEK_STANOWY;
    double podatekLokalny = wartoscProduktu * PODATEK_LOKALNY;

    double lacznaCenaSprzedazy = wartoscProduktu + podatekStanowy + podatekLokalny;


    System.out.printf("Wartość produktu: %.2f zł\n", wartoscProduktu);
    System.out.printf("Podatek stanowy: %.2f zł\n", podatekStanowy);
    System.out.printf("Podatek lokalny: %.2f zł\n", podatekLokalny);
    System.out.printf("Łączna cena sprzedaży: %.2f zł\n", lacznaCenaSprzedazy);


    scanner.close();
}
}
