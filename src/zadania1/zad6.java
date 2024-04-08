package zadania1;

public class zad6 { public static void main(String[] args) {
    int pokoj1 = 3 * 4;
    int pokoj2 = 3 * 4;
    int pokoj3 = 2 * 3;
    int pokoj4 = 2 * 2;

    int powierzchniaCalkowita = pokoj1 + pokoj2 + pokoj3 + pokoj4;


    int liczbaOsob = 4;


    double powierzchniaNaOsobe = (double) powierzchniaCalkowita / liczbaOsob;


    System.out.println("Powierzchnia pokoj1: " + pokoj1 + " m2");
    System.out.println("Powierzchnia pokoj2: " + pokoj2 + " m2");
    System.out.println("Powierzchnia pokoj3: " + pokoj3 + " m2");
    System.out.println("Powierzchnia pokoj4: " + pokoj4 + " m2");

    System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaCalkowita + " m2");

    System.out.println("Powierzchnia przypadająca na jedną osobę: " + powierzchniaNaOsobe + " m2");
}
}
