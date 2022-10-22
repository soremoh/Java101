package chapter06.ex;

public class ex04 {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = new int[10];

        //코드 작성
        for (int j=0; j<num1.length;j++)  num2[j]=num1[j]*num1[j];



        //num2 출력
        for (int b: num2)   System.out.println(b);

    }
}
