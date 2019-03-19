public class Exercise19 {
    //You	are	in	a	locker	room	with	100	open	lockers,	numbered	1	to	100.	Toggle	all	of	the	lockers	that
    //are	even.	By	toggle,	we	mean	close	if	it	is	open,	and	open	if	it	is	closed.	Now	toggle	all	of	the	lockers
    //that	are	multiples	of	three.	Repeat	with	multiples	of	4,	5,	up	to	100.	How	many	lockers	are	open?

    public static void main(String[] args) {
        boolean[] lockerRoom = new boolean[100];
        for (int i = 0; i < lockerRoom.length; i++) {
            lockerRoom[i] = true;
        }

        for (int i = 1; i < lockerRoom.length; i = i + 2) {
            lockerRoom[i] = false;
        }

        for (int i = 2; i < lockerRoom.length; i = i + 3) {
            if (lockerRoom[i]) {
                lockerRoom[i] = false;
            } else {
                lockerRoom[i] = true;
            }
        }

        int i = 3;
        while (i < 100) {
            for (int j = i; j < lockerRoom.length; j = j + i + 1) {
                if (lockerRoom[j]) {
                    lockerRoom[j] = false;
                } else {
                    lockerRoom[j] = true;
                }
            }
            i++;
        }

        int count = 0;
        for (boolean b : lockerRoom) {
            System.out.println(b);
            if (b) {
                count++;
            }
        }
        System.out.println("Liczba otwartych szefek: " + count);
    }
}
