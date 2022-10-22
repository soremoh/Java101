package Theater;

public class theaterTest {
    public static void main(String[] args) {


        Theater A_Theater = new Theater();
        A_Theater.makeReservation(30,2);
        A_Theater.showSeats();
        A_Theater.makeReservation(7,13);
        A_Theater.showSeats();

        Imax i1 = new Imax();
        Object ob = i1;
        Imax i2 = (Imax) ob;
    }
}
