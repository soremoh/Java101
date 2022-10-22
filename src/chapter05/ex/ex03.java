package chapter05.ex;

public class ex03 {
    public static void main(String[] args) {

        for ( int x = 1; x<=6; x++){
            for (int y =1; y<=6; y++){
                //코드 작성
                if(x + y ==6){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
