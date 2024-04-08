package zadania1;
import java.util.Scanner;

public class zad23 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj długość rzędu w metrach: ");
    double R = scanner.nextDouble();

    System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach: ");
    double E = scanner.nextDouble();

    System.out.println("Podaj odległość między sadzonkami w metrach: ");
    double S = scanner.nextDouble();


    double V = (R - 2 * E) / S;


    System.out.println("Liczba sadzonek, które zmieszczą się w rzędzie: " + (int)V);

    scanner.close();
}
}
