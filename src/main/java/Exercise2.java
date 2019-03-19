import java.util.Scanner;

public class Exercise2 {
    /*
        Na	podstawie	podanej	przez	użytkownika	długości	boku	𝑎	sześciokąta	foremnego	napisz	program,
        który	 policzy:	 pole	 powierzchni,	 obwód,	 dłuższą	 i	 krótszą	 przekątną	 oraz	 promień	 okręgu
        wpisanego.	 Postaraj	 się,	 aby	 każda	 z	 wyliczanych	 wartości	 została	 policzona	 w	 specjalnie
        przygotowanej	do	tego	funkcji.
     */

    public static void main(String[] args) {
        System.out.println("Podaj długość boku sześciokąta foremnego:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        hexagonArea(a);
        hexagonPeriphery(a);
        hexagonLongDiagonal(a);
        hexagonShortDiagonal(a);
        hexagonInscribedCircleRadius(a);

    }

    public static void hexagonArea(int a) {
        double area = (3 * a * a * Math.sqrt(3)) / 2;
        System.out.println("Pole sześciokąta wynosi: " + area);
    }

    public static void hexagonPeriphery(int a) {
        System.out.println("Obwód sześciokąta wynosi: " + 6 * a);
    }

    public static void hexagonLongDiagonal(int a) {
        System.out.println("Dłuższa przekątna sześciokąta wynosi: " + 2 * a);
    }

    public static void hexagonShortDiagonal(int a) {
        System.out.println("Krótsza przekątna sześciokąta wynosi: " + a * Math.sqrt(3));
    }

    public static void hexagonInscribedCircleRadius(int a) {
        System.out.println("Promień okręgu wpisanego wynosi: " + (a * Math.sqrt(3)) / 2);
    }

}
