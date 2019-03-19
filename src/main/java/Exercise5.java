public class Exercise5 {
    //  Napisz	program,	który	dla	liczb	z	zakresu	[1	…	100]	wypisze:	liczby	podzielne	przez	3,	podzielne
    //przez	5,	podzielne	przez	3	i	5

    public static void main(String[] args) {
        divisible(3);
        divisible(5);
        divisible(3, 5);

    }

    public static void divisible(int number) {
        System.out.println("Liczby podzielne przez " + number + " to: ");
        for (int i = 1; i <= 100; i++) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void divisible(int number1, int number2) {
        System.out.println("Liczby podzielne przez " + number1 + " i " + number2 + " to: ");
        for (int i = 1; i <= 100; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
