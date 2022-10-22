package chapter05.ex;

public class ex06 {
    public static void main(String[] args) {
        for (int i=4; i>=0; i--){
            for (int j = 0; j<9; j++){
                if(j >= i && j<9-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
