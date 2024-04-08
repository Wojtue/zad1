package zadania4;
import java.util.Scanner;

public class zad1 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int liczba, suma = 0;

    System.out.println("Podaj dodatnią niezerową liczbę całkowitą:");
    liczba = scanner.nextInt();

    // Sprawdzenie, czy podana liczba jest dodatnia i niezerowa
    while (liczba <= 0) {
        System.out.println("Liczba musi być dodatnia i niezerowa. Spróbuj ponownie:");
        liczba = scanner.nextInt();
    }

    // Obliczanie sumy
    for (int i = 1; i <= liczba; i++) {
        suma += i;
    }

    System.out.println("Suma liczb od 1 do " + liczba + " wynosi: " + suma);
}
}
