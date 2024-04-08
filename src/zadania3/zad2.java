package zadania3;
import java.util.Scanner;
public class zad2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;

    do {
        System.out.print("Proszę wpisać literę 'T', 't', 'N' lub 'n': ");
        input = scanner.next();
    } while (!input.matches("[TtNn]")); // Używamy wyrażenia regularnego do sprawdzenia

    System.out.println("Podana litera to: " + input);

    scanner.close();
}
}
