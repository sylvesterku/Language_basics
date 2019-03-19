import java.util.Scanner;

public class Exercise3 {
    // Napisz	program,	który	dla	podanego	ciągu	znaków	wypisze,	ile	razy	wystąpiła	spacja

    public static void main(String[] args) {
        System.out.println("Podaj ciąg znaków dla którego policzyć spacje:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        spaceOccurence(str);
    }

    public static void spaceOccurence(String s) {
        int originalLeength = s.length();
        int lengthAfter = s.replace(" ", "").length();

        System.out.println("W podanym ciągu znaków występuje " + (originalLeength - lengthAfter) + " spacji.");
    }
}
