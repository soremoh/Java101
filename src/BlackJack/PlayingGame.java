package BlackJack;

public interface PlayingGame {

    int number = (int)(Math.random()*10+1);
    int computer1 = number;
    int computer2 = number;
    int user1 = number;
    int user2 =number;

    void addComputer();
    void addUser();
    void game();
}
