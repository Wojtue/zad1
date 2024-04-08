package zadania1;
import java.util.Scanner;
public class zad16 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.print("Proszę wprowadzić nazwę ulubionego miasta: ");
    String miasto = scanner.nextLine();


    System.out.println("Liczba znaków w nazwie miasta: " + miasto.length());
    System.out.println("Nazwa miasta zapisana wielkimi literami: " + miasto.toUpperCase());
    System.out.println("Nazwa miasta zapisana małymi literami: " + miasto.toLowerCase());
    System.out.println("Pierwszy znak nazwy miasta: " + miasto.charAt(0));

    scanner.close();
}
}
