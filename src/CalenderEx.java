import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderEx {
    public static void main(String[] args) {

        int nowYear;
        int nowMonth;
        int nowDay;

        int exYear;
        int exMonth;
        int exDay;

        Scanner sc = new Scanner(System.in);
        nowYear = sc.nextInt();



        Calendar today =Calendar.getInstance();
        Calendar ex = Calendar.getInstance();
        ex.set(exYear,exMonth+1,exDay);

        long diffSec = (today.getTimeInMillis() - ex.getTimeInMillis())/1000;

        long diffDay = diffSec / (24*60*60);

        System.out.println(diffDay + "일 경과");
    }
}
