package zadania3;
import java.util.Scanner;
public class zad11 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("Podaj liczbę (" + (i + 1) + " z 10): ");
        int liczba = scanner.nextInt();
        suma += liczba;
    }

    System.out.println("Suma wprowadzonych liczb to: " + suma);
}
}
