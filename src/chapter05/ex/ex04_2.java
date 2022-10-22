package chapter05.ex;

public class ex04_2 {
    public static void main(String[] args) {

        char AS=65;

        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                if(i>=j) System.out.print(AS);

            }
            AS++;
            System.out.println();
        }
    }
}
