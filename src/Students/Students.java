package Students;

public class Students {
     String[] OneOne = new String[30];
     int[] scores = new int[] {0,0,0};
     int index = 0;
     public void addName(String name){
         for (int i=0; i<30;i++) {
             OneOne[index] = name;
             index++;
         }
     }

     public void addScore(int score){
        for (int i=0; i<30;i++){
            for (int j = 0; j<3; j++){
                scores[j] = score;
            }
            index++;
        }
     }



}

