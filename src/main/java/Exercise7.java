import java.util.Scanner;

public class Exercise7 {
    // Napisz	 program,	 który	 pobierze	 od	 użytkownika	 liczbę	 𝑛 ∈ [1, 10],	 a	 następnie	 wygeneruje	 i
    //wypełni	tablicę	dwuwymiarową	zgodnie	ze	wzorem

    public static void main(String[] args) {
        System.out.println("Podaj rozmiar tablicy dwuwymiarowej [1-10]:");
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            number = sc.nextInt();
        }

        int[][] table = new int[number][number];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                int temp = 1 + i + j;
                if ((1 + i + j) > table[i].length) {
                    temp = temp - table[i].length;
                }
                table[i][j] = temp;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
