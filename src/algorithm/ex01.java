package algorithm;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {


        //유저한테 입력받는 방법
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        //n개의 배열의 정수를 선언하는 방법
        int[] num = new int[range];
        int sum = 0;
        float average;
        //n개의 배열을 채우는 방법
        for (int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        //배열의 총합을 구하는 방법
        for (int i = 0; i< num.length; i++ )  sum += num[i];
        //배열의 평균을 구하는 방법
        average = sum / num.length;
        //답을 구하는 방법
        for (int i =0; i<num.length;i++) if(num[i]>average) System.out.print(num[i]+" ");


    }
}
