package algorithm;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range =sc.nextInt();
        int[][] num = new int[range][range];
        int sum =0;

        for (int i =0; i<num.length; i++){
            for (int j=0; j<num[i].length;j++){
                num[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i< num.length;i++){
            for (int j=0; j<num[i].length;j++){
                if (i==j) sum+= num[i][j];
            }
        }
        System.out.println(sum);
    }
}
