package chapter05.ex;

import java.util.Scanner;

public class ex06_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int left = mid;
        int right =mid;

        for (int i =0; i<mid-1;i++){
            for (int j = 0; j<mid*2+1; j++){
                if(left<=j && j<=right) System.out.print("*");
                else System.out.print(" ");
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
