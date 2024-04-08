package zadania1;
import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość pokoju nr1: ");
        int dlugosc1 = scanner.nextInt();
        System.out.print("Podaj szerokość pokoju nr1: ");
        int szerokosc1 = scanner.nextInt();

        System.out.print("Podaj długość pokoju nr2: ");
        int dlugosc2 = scanner.nextInt();
        System.out.print("Podaj szerokość pokoju nr2: ");
        int szerokosc2 = scanner.nextInt();

        System.out.print("Podaj długość pokoju nr3: ");
        int dlugosc3 = scanner.nextInt();
        System.out.print("Podaj szerokość pokoju nr3: ");
        int szerokosc3 = scanner.nextInt();

        System.out.print("Podaj długość pokoju nr4: ");
        int dlugosc4 = scanner.nextInt();
        System.out.print("Podaj szerokość pokoju nr4: ");
        int szerokosc4 = scanner.nextInt();


        int powierzchnia1 = dlugosc1 * szerokosc1;
        int powierzchnia2 = dlugosc2 * szerokosc2;
        int powierzchnia3 = dlugosc3 * szerokosc3;
        int powierzchnia4 = dlugosc4 * szerokosc4;


        int powierzchniaCalkowita = powierzchnia1 + powierzchnia2 + powierzchnia3 + powierzchnia4;


        System.out.println("Powierzchnia pokoj nr1: " + powierzchnia1 + " m2");
        System.out.println("Powierzchnia pokoj nr2: " + powierzchnia2 + " m2");
        System.out.println("Powierzchnia pokoj nr3: " + powierzchnia3 + " m2");
        System.out.println("Powierzchnia pokoj nr4: " + powierzchnia4 + " m2");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaCalkowita + " m2");

        scanner.close();
    }
}
