package zadania1;
import java.util.Scanner;
public class zad12 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić liczbę przejechanych kilometrów: ");
    double przejechaneKilometry = scanner.nextDouble();


    System.out.print("Proszę wprowadzić liczbę zużytych litrów paliwa: ");
    double zuzyteLitryPaliwa = scanner.nextDouble();

    double kilometryNaLitrze = przejechaneKilometry / zuzyteLitryPaliwa;


    System.out.println("Liczba kilometrów przejechanych na litrze paliwa wynosi: " + kilometryNaLitrze);

    scanner.close();
}
}
