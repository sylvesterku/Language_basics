import java.util.Scanner;

public class Exercise12 {
    // Write	a	program	that	calculates	the	energy	needed	to	heat	water	from	an	initial	temperature	to	a
    //final	temperature

    public static void main(String[] args) {
        double waterWeight, temp0, temp1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj masę wody [kg]: ");
            waterWeight = sc.nextDouble();
            System.out.println("Podaj temperaturę początkową [st. C]: ");
            temp0 = sc.nextDouble();
            System.out.println("Podaj temperaturę końcową [st. C]: ");
            temp1 = sc.nextDouble();
        }
        double energy = 4200 * waterWeight * (temp1 - temp0);
        System.out.printf("Do ogrzania %.2f kg wody o %.2f st. celsjusza, należy użyć %.2f J energii.", waterWeight, temp1 - temp0, energy);
    }
}
