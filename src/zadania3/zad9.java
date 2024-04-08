package zadania3;
import java.util.Scanner;
public class zad9 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char czyKontynuowac;

    do {
        System.out.println("Wprowadź pierwszą liczbę:");
        int liczba1 = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int liczba2 = scanner.nextInt();

        int suma = liczba1 + liczba2;
        System.out.println("Suma tych liczb wynosi: " + suma);

        System.out.println("Czy chcesz kontynuować? (T/N)");
        czyKontynuowac = scanner.next().charAt(0);
    } while (czyKontynuowac == 'T' || czyKontynuowac == 't');

    System.out.println("Koniec programu.");
}
}
