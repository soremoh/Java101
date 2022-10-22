package BlackJack;

public class GameTest {
    public static void main(String[] args) {

        Game game = new Game();
        game.addComputer();
        game.addUser();
        game.game();
    }
}
