import java.util.Scanner;

public class Exercise11 {
    //average acceleration

    public static void main(String[] args) {
        double v0, v1, t;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj prędkość początkową v0[m/s]: ");
            v0 = sc.nextDouble();
            System.out.println("Podaj prędkość końcową v1[m/s]: ");
            v1 = sc.nextDouble();
            System.out.println("Podaj czas przyśpieszania t[s]: ");
            t = sc.nextDouble();
        }
        System.out.println("Średnie przyspiesznie wynosi a = " + (v1 - v0) / t + " m/s^2");
    }
}
