package Timer;

public class TimeTest {
    public static void main(String[] args) {

        Timer t = new Timer();
        for(int i=0;i<60;i++) t.plusHour();
        t.timeNow();
        t.minusSecond();
        t.timeNow();

    }
}
