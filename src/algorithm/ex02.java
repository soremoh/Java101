package algorithm;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        int[] count = {0,0,0,0,0,0,0,0,0,0,0};

        for (int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i<num.length; i++) {
            switch (num[i]) {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
                default:
                    System.out.println("숫자가 아닙니다.");
                    break;
            }
        }
        for (int j = 0;j<num.length;j++){
            System.out.print(" ");
            System.out.print( j+":");
            for (int k=0;k<count[j];k++) System.out.print("*");

        }
    }
}
