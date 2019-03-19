import java.util.Scanner;

public class Exercise13 {
    // Write	a	program	that	prompts	the	user	to	enter	two	points	(𝑥1, 𝑦1)	and	(𝑥2, 𝑦2)	and	displays	their
    //distance	between	them

    public static void main(String[] args) {
        double x1, y1, x2, y2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj współrzędną x1: ");
            x1 = sc.nextDouble();
            System.out.println("Podaj współrzędną y1: ");
            y1 = sc.nextDouble();
            System.out.println("Podaj współrzędną x2: ");
            x2 = sc.nextDouble();
            System.out.println("Podaj współrzędną y2: ");
            y2 = sc.nextDouble();
        }

        double deltaX = x1 - x2;
        double deltaY = y1 - y2;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("Odległość pomiędzy punktami wynosi: " + distance);
    }
}
