package chapter05.ex;

public class ex01 {
    public static void main(String[] args) {

        int sum =0;

        //for 문을 이용하여 반복 합계 연산
        for(int i = 0;i<=100;i+=5){
            sum += i;
        }

        System.out.println("5의 배수의 합계는 "+sum);
    }
}
