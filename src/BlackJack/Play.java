package BlackJack;

public class Play {
    boolean comWin;

    void Compare(Com com,User user){
        comWin = com.sum > user.sum ? true  :   false;
    }
    void showResult(Com com,User user){
        System.out.println(com.sum);
        System.out.println(user.sum);
    }
    void WhoWin(){
        if(comWin) System.out.println("Computer Win");
        else System.out.println("User Win");
    }
}
