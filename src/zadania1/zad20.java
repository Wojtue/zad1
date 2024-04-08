package zadania1;
import java.util.Scanner;

public class zad20 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    double cukierNa48 = 1.5;
    double masloNa48 = 1;
    double mąkaNa48 = 2.75;


    System.out.print("Wpisz oczekiwaną liczbę ciasteczek: ");
    int oczekiwanaLiczbaCiasteczek = scanner.nextInt();


    double skala = (double) oczekiwanaLiczbaCiasteczek / 48;
    double cukier = cukierNa48 * skala;
    double maslo = masloNa48 * skala;
    double mąka = mąkaNa48 * skala;


    System.out.println("Aby upiec " + oczekiwanaLiczbaCiasteczek + " ciasteczek, potrzebujesz:");
    System.out.println(cukier + " szklanek cukru");
    System.out.println(maslo + " szklanki masła");
    System.out.println(mąka + " szklanek mąki");
}
}
