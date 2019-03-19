import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    // Random walker

    public static void main(String[] args) {
        System.out.println("Podaj wymiar tablicy dwuwymiarowej [10-100]: ");
        int dimension;
        try (Scanner sc = new Scanner(System.in)) {
            dimension = sc.nextInt();
        }

        boolean[][] walkerPath = new boolean[dimension][dimension];
        Random random = new Random();
        int iCoordinate = random.nextInt(dimension);
        int jCoordinate = random.nextInt(dimension);
        walkerPath[iCoordinate][jCoordinate] = true;

        int fieldsNumber = dimension * dimension;
        int trueFileds = 1;
        int stepsCount = 0;

        while (trueFileds < fieldsNumber) {
            int stepDirection = random.nextInt(4);
            /*
            0 - lewo
            1 - prawo
            2 - góra
            3 - dół
             */
            switch (stepDirection) {
                case 0:
                    if ((jCoordinate - 1) >= 0) {
                        jCoordinate = jCoordinate - 1;
                        if (!walkerPath[iCoordinate][jCoordinate]) {
                            trueFileds++;
                        }
                        walkerPath[iCoordinate][jCoordinate] = true;
                        stepsCount++;
                    }
                    break;
                case 1:
                    if ((jCoordinate + 1) < walkerPath[0].length) {
                        jCoordinate = jCoordinate + 1;
                        if (!walkerPath[iCoordinate][jCoordinate]) {
                            trueFileds++;
                        }
                        walkerPath[iCoordinate][jCoordinate] = true;
                        stepsCount++;
                    }
                    break;
                case 2:
                    if ((iCoordinate - 1) >= 0) {
                        iCoordinate = iCoordinate - 1;
                        if (!walkerPath[iCoordinate][jCoordinate]) {
                            trueFileds++;
                        }
                        walkerPath[iCoordinate][jCoordinate] = true;
                        stepsCount++;
                    }
                    break;
                case 3:
                    if ((iCoordinate + 1) < walkerPath.length) {
                        iCoordinate = iCoordinate + 1;
                        if (!walkerPath[iCoordinate][jCoordinate]) {
                            trueFileds++;
                        }
                        walkerPath[iCoordinate][jCoordinate] = true;
                        stepsCount++;
                    }
                    break;
                default:
            }
        }
        System.out.println("Walker przeszedł całą tablicę w " + stepsCount + " krokach");
    }
}
