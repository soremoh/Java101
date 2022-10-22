package BlackJack;

public class Game implements PlayingGame{
    int computerSum;
    int userSum;
    @Override
    public void addComputer() {
        computerSum = computer1 + computer2;
        System.out.println(computerSum);
    }

    @Override
    public void addUser() {
        userSum = user1 + user2;
        System.out.println(userSum);
    }

    @Override
    public void game() {
        if (computerSum > userSum) System.out.println("computers Win");
        else System.out.println("users Win");

    }
}
