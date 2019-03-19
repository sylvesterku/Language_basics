public class Exercise20 {
    //Sudoku verifier

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        System.out.println(horizontalVerifier(sudoku));
        System.out.println(verticalVerifier(sudoku));
        System.out.println(blockVerifier(sudoku));
    }

    public static boolean horizontalVerifier(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] temp = array[i];

            singleArrayVerifier(temp);
        }
        return true;
    }

    public static boolean verticalVerifier(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] temp = new int[9];
            for (int l = 0; l < temp.length; l++) {
                temp[l] = array[l][i];
            }

            singleArrayVerifier(temp);
        }
        return true;
    }

    public static boolean blockVerifier(int[][] array) {
        int startColumn = 0;
        while (startColumn < array.length) {
            int startRow = 0;
            while (startRow < array[0].length) {
                int[] temp = new int[9];
                int iterator = 0;
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startColumn; j < startColumn + 3; j++) {
                        temp[iterator] = array[i][j];
                        iterator++;
                    }
                }
                singleArrayVerifier(temp);
                startRow = startRow + 3;
            }
            startColumn = startColumn + 3;
        }
        return true;
    }

    private static boolean singleArrayVerifier(int[] temp) {
        for (int j = 0; j < temp.length; j++) {
            int tempValue = temp[j];
            for (int k = j + 1; k < temp.length; k++) {
                if (tempValue == temp[k]) {
                    return false;
                }
            }
        }
        return true;
    }
}
