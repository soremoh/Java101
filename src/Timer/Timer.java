package Timer;

public class Timer {

    private int second;
    private int minute;
    private int hour;

    Timer(){
        this.second=00;
        this.minute=00;
        this.hour=00;
    }

    void timeNow(){
        System.out.println(this.hour+"시간 "+this.minute+"분 "+this.second+"초");
    }

    void plusSecond(){
        if (this.second == 59) {
            this.second=0;
            plusMinute();
        }
        else this.second++;
    }

    void minusSecond(){
        if(this.second == 0){
            if(this.hour==0&&this.minute==0) System.out.println("time is zero");
            else {
                this.second = 59;

                minusMinute();
            }
        }
        else this.second--;
    }

    void plusMinute(){
        if (this.minute == 59) {
            this.minute=0;
            plusHour();
        }
        else this.minute++;
    }

    void minusMinute(){
        if(this.minute == 0){
            if(this.hour==0) System.out.println("time is under hour");
            else{
                this.second = 59;
                this.minute = 59;
                minusHour();
            }
        }
        else this.minute--;
    }

    void plusHour(){
        if(this.hour ==59){
            this.hour =59;
            System.out.println("Hour is Max!");
        }
        else this.hour++;
    }

    void minusHour(){
        if (this.hour==0){
            System.out.println("Hour is Zero");
        }
        else this.hour--;
    }


}
