package zadania1;
import java.util.Scanner;
public class zad21 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Wprowadź początkową kwotę zdeponowaną na koncie: ");
    double P = scanner.nextDouble();

    System.out.print("Wprowadź roczną stopę oprocentowania (w formie dziesiętnej, np. 0.05 dla 5%): ");
    double r = scanner.nextDouble();

    System.out.print("Wprowadź ile razy w roku odsetki są kapitalizowane (np. 12 dla kapitalizacji miesięcznej): ");
    int n = scanner.nextInt();

    System.out.print("Wprowadź liczbę lat, przez jakie środki będą znajdować się na koncie: ");
    int t = scanner.nextInt();


    double A = P * Math.pow(1 + r / n, n * t);


    System.out.printf("Kwota na koncie po %d latach wyniesie: %.2f zł\n", t, A);
}
}
