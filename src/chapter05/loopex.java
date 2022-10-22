package chapter05;

import java.util.Scanner;

public class loopex {
    public static void main(String[] args) {
        // for 문

        //start; end; 증감식
        Scanner sc = new Scanner(System.in);
        int end =sc.nextInt();
        int sum = 0;

        for(int i=0 ; i<=end; i+=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
