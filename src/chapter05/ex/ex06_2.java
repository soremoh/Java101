package chapter05.ex;

public class ex06_2 {
    public static void main(String[] args) {
        for (int i = 1;i<=3;i++){
            for (int j = 1;j<=3-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j <= i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2;i>=1;i--){
            for (int j = 1;j<=3-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j <= i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
