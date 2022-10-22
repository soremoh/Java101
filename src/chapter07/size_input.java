package chapter07;

import java.util.Scanner;

public class size_input {
    public static void main(String[] args) {


        int num[] =new int[5];
        maxAndMin m = new maxAndMin();

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            num[i] = sc.nextInt();
        }

        m.compareNum(num);

    }
}

class maxAndMin {

    //1. 배열을 받는다.
    //2. ...(spread operator)
    void compareNum(int ... x) {
        // 알고리즘 개념
        int Max = x[0];
        int Min = x[0];

        for(int i=0; i<x.length; i++){
            // 0... i ... n
            if(Max < x[i]) Max = x[i];
            if(Min > x[i]) Min = x[i];
        }
        System.out.println(Max);
        System.out.println(Min);
    }
}
