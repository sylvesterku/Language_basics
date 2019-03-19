import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    // Napisz	program,	który	zasymuluje	działanie	sapera

    public static void main(String[] args) {
        int dim1;
        int dim2;
        int percent;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj rozmiar pozimoy tabeli [3-10]:");
            dim1 = sc.nextInt();
            System.out.println("Podaj rozmiar pionowy tabeli [3-10]:");
            dim2 = sc.nextInt();
            System.out.println("Podaj prawdopodobieństwo wystąpienia bomby w procentach [25-75]:");
            percent = sc.nextInt();
        }

        boolean[][] saper = new boolean[dim2][dim1];
        for (int i = 0; i < saper.length; i++) {
            for (int j = 0; j < saper[i].length; j++) {
                Random random = new Random();
                int value = random.nextInt(100);
                if (value <= percent) {
                    saper[i][j] = true;
                }
            }
        }
        String[][] saperResult = new String[dim2][dim1];
        for (int i = 0; i < saperResult.length; i++) {
            for (int j = 0; j < saperResult[i].length; j++) {
                int count = 0;
                if (saper[i][j]) {
                    saperResult[i][j] = "*";
                } else {
                    int iMin = i - 1;
                    int iMax = i + 2;
                    if (iMin < 0) {
                        iMin = 0;
                    }
                    if (iMax > saper.length - 1) {
                        iMax = saper.length;
                    }
                    int jMin = j - 1;
                    int jMax = j + 2;
                    if (jMin < 0) {
                        jMin = 0;
                    }
                    if (jMax > saper[i].length) {
                        jMax = saper[i].length;
                    }

                    for (int i2 = iMin; i2 < iMax; i2++) {
                        for (int j2 = jMin; j2 < jMax; j2++) {
                            if (saper[i2][j2]) {
                                count++;
                            }
                        }
                    }
                    saperResult[i][j] = String.valueOf(count);
                }
            }

        }
        for (int i = 0; i < saper.length; i++) {
            for (int j = 0; j < saper[i].length; j++) {
                System.out.print(saper[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < saperResult.length; i++) {
            for (int j = 0; j < saperResult[i].length; j++) {
                System.out.print(saperResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
