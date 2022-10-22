package chapter06;

public class Lotto {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int temp;


        int idx = 0;
        while (true){
            //Math.random()*45 = 0~44
            //Math.random()*45 + 1 = 1~45
            int number = (int)(Math.random()*45)+1;

            boolean insert = true ;
            for (int i=0; i<=idx;i++){
                if(lotto[i] == number){
                    insert = false ;
                    break;
                }
            }
            if (insert){
                lotto[idx] = number;
                idx++;
            }

            if(idx==6) break;
        }

        for (int j=0;j<lotto.length-1; j++){
            for (int k=0; k<lotto.length-1;k++){
                if (lotto[k]>lotto[k+1]){
                    temp = lotto[k];
                    lotto[k]= lotto[k+1];
                    lotto[k+1]=temp;
                }
            }
        }

        for (int i=0; i<lotto.length;i++){
            System.out.println(lotto[i]);
        }
    }
}
