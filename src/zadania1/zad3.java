package zadania1;

public class zad3 {public static void main(String[] args) {

    for (int i = 1; i <= 7; i += 2) {
        for (int j = 0; j < (7 - i) / 2; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    for (int i = 5; i >= 1; i -= 2) {
        for (int j = 0; j < (7 - i) / 2; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
