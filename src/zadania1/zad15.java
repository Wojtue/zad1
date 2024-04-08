package zadania1;
import java.util.Scanner;
public class zad15 {public static void main(String[] args) {

    final double MARZA = 0.4;


    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić cenę detaliczną płytki: ");
    double cenaDetaliczna = scanner.nextDouble();


    double zysk = cenaDetaliczna * MARZA;

    System.out.println("Zysk ze sprzedaży produktu wynosi: " + zysk + " zł.");

    scanner.close();
}
}
