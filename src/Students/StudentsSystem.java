package Students;

import java.util.Scanner;

public class StudentsSystem {

    static int location = 0;
    static String name = null;
    static int score = 0;




    void locate(){
        Scanner sc = new Scanner(System.in);
        this.location = sc.nextInt();
    }
    void setName(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
    void setScore(){
        Scanner sc = new Scanner(System.in);
        this.score = sc.nextInt();
    }
    void initLocate(){
        this.location =0;
    }


}
