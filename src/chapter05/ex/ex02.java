package chapter05.ex;

public class ex02 {
    public static void main(String[] args) {

        int evenSum = 0;
        int oddSum = 0;


        // for 문을 이용하여 반복 합계 연산
        for(int i = 1; i <= 100; i++){
            //코드 작성

            if(i%2 == 1) oddSum += i;
            else evenSum += i;
        }
        System.out.println("짝수의 합계는 "+evenSum);
        System.out.println("홀수의 합계는 "+oddSum);
    }
}
