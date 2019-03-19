import java.util.Scanner;

public class Exercise18 {
    // US	postal	barcodes

    public static void main(String[] args) {
        System.out.println("Podaj kod pocztowy:");
        String code;
        try (Scanner sc = new Scanner(System.in)) {
            code = sc.next();
        }

        printCode(code);

    }

    public static void zero() {
        System.out.println("*****\n*****\n**\n**\n**");
    }

    public static void one() {
        System.out.println("**\n**\n**\n*****\n*****");
    }

    public static void two() {
        System.out.println("***\n**\n*****\n**\n*****");
    }

    public static void three() {
        System.out.println("**\n**\n*****\n*****\n**");
    }

    public static void four() {
        System.out.println("**\n*****\n**\n**\n*****");
    }

    public static void five() {
        System.out.println("**\n*****\n**\n*****\n**");
    }

    public static void six() {
        System.out.println("**\n*****\n*****\n**\n**");
    }

    public static void seven() {
        System.out.println("*****\n**\n**\n**\n*****");
    }

    public static void eight() {
        System.out.println("*****\n**\n**\n*****\n**");
    }

    public static void nine() {
        System.out.println("*****\n**\n*****\n**\n**");
    }

    public static void printStartEnd() {
        System.out.println("*****");
    }

    public static void printCode(String s) {
        char[] chars = s.toCharArray();
        printStartEnd();
        int sum = 0;
        for (char c : chars) {
            sum = sum + c - '0';
            printSingleCode(c);
        }
        sum = sum % 10;
        printSingleCode((char) (sum + 48));
        printStartEnd();
    }

    private static void printSingleCode(char aChar) {
        switch (aChar) {
            case '0':
                zero();
                break;
            case '1':
                one();
                break;
            case '2':
                two();
                break;
            case '3':
                three();
                break;
            case '4':
                four();
                break;
            case '5':
                five();
                break;
            case '6':
                six();
                break;
            case '7':
                seven();
                break;
            case '8':
                eight();
                break;
            case '9':
                nine();
                break;
        }
    }
}
