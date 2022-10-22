package chapter05.ex;

public class ex07 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6)+1 ;
        int count = 0 ;
        boolean insert = true;

        while (true) {

            if (num!=6){
                System.out.println(num);
                count++;
                break;
            }

            if (num == 6) break;
        }
        System.out.println("총 주사위를 굴린 횟수는 : "+count+"회");

    }
}
