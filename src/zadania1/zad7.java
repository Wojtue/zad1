package zadania1;

public class zad7  {
    public static void main(String[] args) {

        double calkowitaSprzedaz = 4_600_000;

        double procentMazowieckie = 0.62;

        double sprzedazMazowieckie = calkowitaSprzedaz * procentMazowieckie;

        System.out.println("Sprzedaż generowana przez region mazowiecki: " + sprzedazMazowieckie + " zł");
    }
}

