package zadania4;
import java.util.Scanner;
public class zad2 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int szybkosc, godziny;

    System.out.println("Podaj szybkość pojazdu (km/h):");
    szybkosc = scanner.nextInt();

    // Sprawdzenie, czy podana szybkość jest dodatnia
    while (szybkosc <= 0) {
        System.out.println("Szybkość nie może być ujemna ani równa zero. Podaj ponownie:");
        szybkosc = scanner.nextInt();
    }

    System.out.println("Podaj liczbę godzin podróży:");
    godziny = scanner.nextInt();

    // Sprawdzenie, czy liczba godzin jest większa niż 0
    while (godziny < 1) {
        System.out.println("Czas podróży musi wynosić co najmniej 1 godzinę. Podaj ponownie:");
        godziny = scanner.nextInt();
    }

    System.out.println("Godzina\tPrzebyta odległość");
    System.out.println("--------------------------------");

    for (int i = 1; i <= godziny; i++) {
        int odleglosc = szybkosc * i;
        System.out.println(i + "\t" + odleglosc);
    }
}
}
