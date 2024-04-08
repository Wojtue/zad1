package zadania3;
import java.util.Scanner;

public class zad3 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String odpowiedz;

    do {
        System.out.print("Proszę wpisać tekst 'Tak' lub 'Nie': ");
        odpowiedz = scanner.nextLine();
    } while (!"Tak".equalsIgnoreCase(odpowiedz) && !"Nie".equalsIgnoreCase(odpowiedz)); // Sprawdzanie, czy odpowiedź to "Tak" lub "Nie" bez względu na wielkość liter

    System.out.println("Podany tekst to: " + odpowiedz);

    scanner.close();
}
}
