import java.util.Scanner;

public class Exercise15 {
    // Write	a	program	to	find	out	the	Chinese	Zodiac	sign	for	a	given	year

    public static void main(String[] args) {
        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println("Give a year:");
        int year;
        try (Scanner sc = new Scanner(System.in)) {
            year = sc.nextInt();
        }
        switch (year % 12) {
            case 0:
                System.out.println("It's " + zodiacs[0] + " year.");
                break;
            case 1:
                System.out.println("It's " + zodiacs[1] + " year.");
                break;
            case 2:
                System.out.println("It's " + zodiacs[2] + " year.");
                break;
            case 3:
                System.out.println("It's " + zodiacs[3] + " year.");
                break;
            case 4:
                System.out.println("It's " + zodiacs[4] + " year.");
                break;
            case 5:
                System.out.println("It's " + zodiacs[5] + " year.");
                break;
            case 6:
                System.out.println("It's " + zodiacs[6] + " year.");
                break;
            case 7:
                System.out.println("It's " + zodiacs[7] + " year.");
                break;
            case 8:
                System.out.println("It's " + zodiacs[8] + " year.");
                break;
            case 9:
                System.out.println("It's " + zodiacs[9] + " year.");
                break;
            case 10:
                System.out.println("It's " + zodiacs[10] + " year.");
                break;
            case 11:
                System.out.println("It's " + zodiacs[11] + " year.");
                break;
        }
    }
}
