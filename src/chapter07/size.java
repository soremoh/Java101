package chapter07;
// 잘못된 알고리즘
import java.util.Scanner;

public class size {
    public static void main(String[] args) {



        Param p = new Param();
        p.findMaxMin();
        p.showUntil(true);
        p.showUntil(false);

    }
}

class Param {
    int untilNowMax;
    int untilNowMin;
    //1. 배열을 받는다.
    //2. ...(spread operator)
    private void findMax(int ... x) {

        // 알고리즘 개념
        int max = x[0];
        for(int i:x){
            // 0... i ... n
            if(max <= i) {
                max = i;
                if (untilNowMax <= i){
                    untilNowMax = i;
                }
            }
        }

        System.out.println("최댓값: "+max);

    }

    private void findMin(int ... x){
        int min =x[0];

        for(int i:x){
            // 0... i ... n
            if(min>i) min = i;
            if(untilNowMin >=i) untilNowMin = i;
        }
        System.out.println("최솟값: "+min);
    }
    void findMaxMin(int... x){
        findMax(x);
        findMin(x);
    }
    void showUntil(boolean isMax){
        if(isMax) System.out.println(untilNowMax);
        else System.out.println(untilNowMin);
    }
    void showMath(String cases){
        if(untilNowMax ==0 || untilNowMin==0) System.out.println("숫자를 입력하십시오!");
        switch(cases){
            case "plus":
                System.out.println(untilNowMax+untilNowMin); break;
            case "minus":
                System.out.println(untilNowMax-untilNowMin); break;
            case "multiple":
                System.out.println(untilNowMax*untilNowMin); break;
            case "divide":
                System.out.println(untilNowMax/untilNowMin); break;
            default:
                System.out.println("you input wrong order");
                break;
        }
    }
}
