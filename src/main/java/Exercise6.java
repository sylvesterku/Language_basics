import java.util.Scanner;

public class Exercise6 {
    // Napisz program, który pobierze od użytkownika liczbę sekund, a następnie wyświetli godzinę w formacie HH:MM:SS

    public static void main(String[] args) {
        System.out.println("Podaj liczbę sekund:");
        int seconds;
        try (Scanner sc = new Scanner(System.in)) {
            seconds = sc.nextInt();
        }

        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println("Godzina: " + hours + ":" + minutes + ":" + seconds);
    }
}
