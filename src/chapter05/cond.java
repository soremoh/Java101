package chapter05;

public class cond {
    public static void main(String[] args) {
        //60
        int math = 60;
        int eng = 60;
        int kor = 60;
        /*
        final int PASS_SCORE = 60;
        boolean korPassed = kor > PASS_SCORE;
        boolean engPassed = eng > PASS_SCORE;
        boolean mathPassed = math > PASS_SCORE;

        int passedTestNumber = 0;
        if(korPassed) passedTestNumber++;
        if(engPassed) passedTestNumber++;
        if(mathPassed) passedTestNumber++;

        if(passedTestNumber == 3) System.out.println("Triple A");
        if(passedTestNumber == 2) System.out.println("Double A");
        if(passedTestNumber == 1) System.out.println("Only A");
        if(passedTestNumber == 0) System.out.println("NO Human");
        // 3 - triple a
        // 2 - double a
        // 1 - only a
        // 0 - no human
*/
        if(math>=60){
            if(eng>=60){
                if(kor>=60) System.out.println("triple a");
                else System.out.println("double a");
            }
            else{
                if(kor>=60) System.out.println("double a");
                else System.out.println("only a");
            }
        }
        else{
            if(eng>=60){
                if(kor>=60) System.out.println("double a");
                else System.out.println("only a");
            }
            else{
                if(kor>=60) System.out.println("only a");
                else System.out.println("no human");
            }
        }



    }
}
