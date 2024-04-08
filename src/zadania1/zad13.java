package zadania1;
import java.util.Scanner;
public class zad13 { public static void main(String[] args) {

    final int LICZBA_CIATSECZEK_W_PUDELKU = 40;
    final int LICZBA_PORCJI_W_PUDELKU = 10;
    final int KALORIE_NA_PORCJE = 300;


    double kalorieNaCiasteczko = (double) KALORIE_NA_PORCJE / (LICZBA_CIATSECZEK_W_PUDELKU / LICZBA_PORCJI_W_PUDELKU);


    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić liczbę zjedzonych ciasteczek: ");
    int zjedzoneCiasteczka = scanner.nextInt();


    double skonsumowaneKalorie = zjedzoneCiasteczka * kalorieNaCiasteczko;


    System.out.println("Zjedzone ciasteczka dostarczyły: " + skonsumowaneKalorie + " kalorii.");

    scanner.close();
}
}
