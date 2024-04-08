package zadania3;
import java.util.Scanner;
public class zad1 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int liczba;

    System.out.println("Wpisz liczbę z przedziału od 10 do 24:");
    liczba = scanner.nextInt();

    while (liczba < 10 || liczba > 24) {
        System.out.println("Nieprawidłowa wartość. Spróbuj ponownie:");
        liczba = scanner.nextInt();
    }

    System.out.println("Wprowadzono poprawną liczbę: " + liczba);
}

}
