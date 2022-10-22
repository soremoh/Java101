package chapter06.ex;

public class ex03 {
    public static void main(String[] args) {

        int[] score ={ 90, 80, 60, 100};

        int totalScore = 0;
        double avgScore = 0;

        for (int n:score){
            totalScore += n;
        }

        avgScore = totalScore/score.length ;


        System.out.println("합계 점수 : "+totalScore);
        System.out.println("평균 점수 : "+avgScore);
    }
}
