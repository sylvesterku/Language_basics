public class Exercise1 {
    // Napisz	program,	który	wypisze	na	konsoli	amerykańską	flagę

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                printOne("*", "=");
            } else {
                printTwo("*", "=");
            }
        }
        for (int i = 0; i < 6; i++) {
            printThree("=");
        }

    }

    public static void printOne(String s1, String s2) {
        for (int i = 0; i < 6; i++) {
            System.out.print(s1 + " ");
        }
        for (int i = 0; i < 34; i++) {
            System.out.print(s2);
        }
        System.out.println();
    }

    public static void printTwo(String s1, String s2) {
        System.out.print(" ");
        for (int i = 0; i < 5; i++) {
            System.out.print(s1 + " ");
        }
        System.out.print(" ");
        for (int i = 0; i < 34; i++) {
            System.out.print(s2);
        }
        System.out.println();
    }

    public static void printThree(String s) {
        for (int i = 0; i < 46; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

}
