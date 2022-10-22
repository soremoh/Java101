package chapter07;

public class Car {

    //필드
    String Color;
    String Company;
    String type;

    //메서드
    void go(){
        for(int i =0; i<100; i++)
            System.out.println("전진하다.");
    }
    void back(){
        System.out.println("후진하다.");
    }
}
