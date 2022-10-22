package chapter04.Theory;

public class first {
    public static void main(String[] args) {
        /*
        //대입 연산 가독성 차이
        int num = 10;
        num = num + 10;
        num =+ 10;

        //산술 연산
        //나눗셈 연산자/ 외 나머지 연산자% 차이

        int a = 5;
        int b = 2;
        System.out.println(a / b); //몫
        System.out.println(a % b); //나머지


        int a =10;
        int b = ++a;

        System.out.println("전위연산 결과 : "+b);

        int x = 10;
        int y = x++;

        System.out.println("후위연산 결과 : "+y);
        System.out.println("x : "+x);


        //비교연산
        int a = 1;
        int b = 2;
        boolean c = a==b;
        System.out.println(c);
    */
        //논리 연산
        int a = 10;
        int b = 5;

        // and  &&
        System.out.println(a > b && a == 10); // true && true => true

        // 드모르간 법칙
        System.out.println(a <= b || a == 10); // true && true => true
        //수학을 배우는 이유 -> 일반적인 자연 현상의 어떠한 관계를 정립한 이론

        // or ||
        System.out.println(a > b || a == b); // true || false => true

        // xor 연산
        System.out.println(a > b ^ a == 10);// true ^ true => false
        System.out.println(a < b ^ a == 10);// false ^ true => true
        System.out.println(a < b); //false
        System.out.println(!(a < b)); // true
        System.out.println(a>=b);    //clean code!

        //비트연산
        //pass

        //삼항연산 ternary operator

        //조건식 (결과값) ? 값1(true) : 값2 (false)

        int abc = 70 > 60 ? 10 : 20;
        int abc1 = true ? 10 : 20;

        System.out.println(abc);
        System.out.println(abc1);

        // 문자열 연산 +

        String a1 = "hello";
        String a2 = "world";

        System.out.println(""+a1+""+a2);
    }

}
