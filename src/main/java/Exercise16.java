public class Exercise16 {
    //	Given	a	2-D	array,	write	a	program	to	print	it	out	in	spiral	order

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int startColumnIndex = 0;
        int startRowIndex = 0;
        int endColumnIndex = array[0].length - 1;
        int endRowIndex = array.length - 1;

        while (startRowIndex <= endRowIndex && startColumnIndex <= endColumnIndex) {

            for (int i = startRowIndex; i <= endColumnIndex; i++) {
                System.out.print(array[startRowIndex][i] + " ");
            }

            for (int j = startRowIndex + 1; j <= endRowIndex; j++) {
                System.out.print(array[j][endColumnIndex] + " ");
            }

            if (startRowIndex + 1 <= endRowIndex) {
                for (int k = endColumnIndex - 1; k >= startColumnIndex; k--) {
                    System.out.print(array[endRowIndex][k] + " ");
                }
            }

            if (startColumnIndex + 1 <= endColumnIndex) {
                for (int k = endRowIndex - 1; k > startRowIndex; k--) {
                    System.out.print(array[k][startColumnIndex] + " ");
                }
            }
            startRowIndex++;
            endRowIndex--;
            startColumnIndex++;
            endColumnIndex--;
        }
    }
}
