package operator.ex;

public class ex05_2 {
    public static void main(String[] args) {

        int year = 2020;

        boolean isFourDivided = year % 4 ==0;
        boolean isHundredDivided = year % 100 == 0;
        boolean isFourHundredDivided = year % 400 == 0;

        boolean leapYear = (isFourDivided && !isHundredDivided ) || isFourHundredDivided;
        System.out.println("this is "+ (leapYear ? "leapYear" : "not leapYear"));
    }
}
