import java.util.Random;
import java.util.Scanner;

public class Exercise14 {
    // two-digit number lottery

    public static void main(String[] args) {
        String number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj liczbę dwucyfrową lub pojedynczą cyfrę (traktowaną jako 0n)");
            number = sc.next();
            if (number.length() == 1) {
                number = 0 + number;
            }
        }

        Random random = new Random();
        int luckyNumber = random.nextInt(100);
        System.out.println("Szczęśliwy numer to: " + luckyNumber);

        if (luckyNumber == Integer.parseInt(number)) {
            System.out.println("Wygrałeś główną nagrodę $10,000");
        } else if (String.valueOf(luckyNumber).contains(number.substring(0, 1)) &&
                String.valueOf(luckyNumber).contains(number.substring(1))) {
            System.out.println("Wygrałeś nagrodę $3,000");
        } else if (String.valueOf(luckyNumber).contains(number.substring(0, 1)) ||
                String.valueOf(luckyNumber).contains(number.substring(1))) {
            System.out.println("Wygrałeś nagrodę $1,000");
        } else {
            System.out.println("Próbuj następnym razem");
        }
    }
}
