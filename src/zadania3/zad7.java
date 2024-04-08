package zadania3;
import java.util.Scanner;
public class zad7 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;

    for (int i = 1; i <= 7; i++) {
        System.out.println("Wprowadź liczbę #" + i + ":");
        int liczba = scanner.nextInt();
        suma += liczba;
    }

    System.out.println("Suma wprowadzonych liczb wynosi: " + suma);
}
}
