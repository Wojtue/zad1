package zadania4;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class zad3 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int szybkosc, godziny;

    System.out.println("Podaj szybkość pojazdu (km/h):");
    szybkosc = scanner.nextInt();

    while (szybkosc <= 0) {
        System.out.println("Szybkość nie może być ujemna ani równa zero. Podaj ponownie:");
        szybkosc = scanner.nextInt();
    }

    System.out.println("Podaj liczbę godzin podróży:");
    godziny = scanner.nextInt();

    while (godziny < 1) {
        System.out.println("Czas podróży musi wynosić co najmniej 1 godzinę. Podaj ponownie:");
        godziny = scanner.nextInt();
    }

    try {
        PrintWriter pw = new PrintWriter("odleglosc.txt");

        pw.println("Godzina\tPrzebyta odległość");
        pw.println("--------------------------------");

        for (int i = 1; i <= godziny; i++) {
            int odleglosc = szybkosc * i;
            pw.println(i + "\t" + odleglosc);
        }

        pw.close(); // Pamiętaj, aby zamknąć plik po zakończeniu zapisu
        System.out.println("Dane zostały zapisane w pliku odleglosc.txt.");

    } catch (FileNotFoundException e) {
        System.out.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
    }
}
}
