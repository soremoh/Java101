package vendingMachine.self;

import java.util.Scanner;

public class Machine {

    private int Pocari_Sweat;
    private int Cola;
    private int Sprite;
    private int Welchs;
    private int Vita500;
    private String[] product;



    Machine(){
        this.Pocari_Sweat = 15;
        this.Cola = 15;
        this.Sprite = 15;
        this.Welchs = 15;
        this.Vita500 = 15;
    }

    void viewProducts(){
        System.out.println("------------------------------------");
        System.out.println("700    1000     1000     500     500");
        System.out.println(this.Pocari_Sweat+"/30  "+this.Cola+"/30   "+this.Sprite+"/30   "+this.Welchs+"/30   "+this.Vita500+"/30");
        System.out.println("포카리   콜라   사이다   웰치스   비타500");
        System.out.println("------------------------------------");
    }

    void countProducts(){
        Scanner sc = new Scanner(System.in);



    }



}
