package zadania1;
import java.util.Scanner;
public class zad14 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić wynik z pierwszego testu: ");
    double test1 = scanner.nextDouble();

    System.out.print("Proszę wprowadzić wynik z drugiego testu: ");
    double test2 = scanner.nextDouble();

    System.out.print("Proszę wprowadzić wynik z trzeciego testu: ");
    double test3 = scanner.nextDouble();


    double srednia = (test1 + test2 + test3) / 3;


    System.out.println("Wynik z pierwszego testu: " + test1);
    System.out.println("Wynik z drugiego testu: " + test2);
    System.out.println("Wynik z trzeciego testu: " + test3);
    System.out.println("Średnia z testów: " + srednia);


    scanner.close();
}
}
