import java.util.Scanner;

public class Exercise17 {
    //day of the week

    public static void main(String[] args) {
        int year, month, day;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj rok:");
            year = sc.nextInt();
            System.out.println("Podaj nr miesiąca:");
            month = sc.nextInt();
            System.out.println("Podaj dzień miesiąca:");
            day = sc.nextInt();
        }

        if (month == 1) {
            month = 13;
            year = year - 1;
        }
        if (month == 2) {
            month = 14;
            year = year - 1;
        }

        switch (dayNumber(year, month, day)) {
            case 0:
                System.out.println("Sobota");
                break;
            case 1:
                System.out.println("Niedziela");
                break;
            case 2:
                System.out.println("Poniedziałek");
                break;
            case 3:
                System.out.println("Wtorek");
                break;
            case 4:
                System.out.println("Środa");
                break;
            case 5:
                System.out.println("Czwartek");
                break;
            case 6:
                System.out.println("Piątek");
                break;
        }
    }

    public static int dayNumber(int year, int month, int day) {
        int h;
        int yearOfCentury = year % 100;
        int century = year / 100;
        h = (day + (26 * (month + 1)) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;

        return h;
    }
}
