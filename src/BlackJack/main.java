package BlackJack;

public class main {
    public static void main(String[] args) {
        Com computer = new Com();
        User user = new User();
        Play play = new Play();

        play.Compare(computer,user);
        play.showResult(computer,user);
        play.WhoWin();

    }
}
