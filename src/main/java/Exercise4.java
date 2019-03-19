import java.util.Scanner;

public class Exercise4 {
    //Napisz program, który dla podanego 𝑛 ∈ ℕ wyliczy	wartość	wyrażenia:	𝑛 + 𝑛𝑛 + 𝑛𝑛𝑛

    public static void main(String[] args) {
        System.out.println("Podaj liczbę naturalną:");
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            str = sc.next();
        }

        int number1 = Integer.parseInt(str);
        int number2 = Integer.parseInt(str + str);
        int number3 = Integer.parseInt(str + str + str);

        System.out.println("n + nn+ nnn wynosi: " + (number1 + number2 + number3));
    }
}
