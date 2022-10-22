package chapter05;

import java.util.Scanner;

public class condSwitch {
    public static void main(String[] args) {

        System.out.println("Insert your score.");
        Scanner lulu = new Scanner(System.in);
        int score = lulu.nextInt();
        String grade ="";
        // 0~100 score
        switch (score/10){
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            case 5 : grade = "E"; break;
            default: grade = "no human";
        }
        System.out.println("your score is"+ grade);
    }
}
