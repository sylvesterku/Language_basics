public class Exercise10 {
    /*
    10.  Translate	the	following	algorithm	into	Java	code:
        1:	Declare	a double variable named	 miles	with initial value 100.
        2:	Declare	a double constant named KILOMETERS_PER_MILE with value	1.609.
        3:	Declare	a double variable named	 kilometers, multiply miles	 and KILOMETERS_PER_MILE, and
        assign	the	result to kilometers.
        4:	Display	kilometers to the console.
     */

    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
    }
}
