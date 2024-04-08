package zadania1;
import java.util.Scanner;
public class zad17 {public static void main(String[] args) {

    final double PODATEK_STAWKA = 0.0675; // 6.75%
    final double NAPIWEK_STAWKA = 0.20; // 20%


    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić cenę posiłku: ");
    double cenaPosilku = scanner.nextDouble();


    double podatek = cenaPosilku * PODATEK_STAWKA;


    double napiwek = (cenaPosilku + podatek) * NAPIWEK_STAWKA;


    double calkowitaKwota = cenaPosilku + podatek + napiwek;


    System.out.println("Cena posiłku: " + cenaPosilku + " zł");
    System.out.println("Podatek: " + podatek + " zł");
    System.out.println("Napiwek: " + napiwek + " zł");
    System.out.println("Łączna kwota do zapłaty: " + calkowitaKwota + " zł");

    scanner.close();
}
}
