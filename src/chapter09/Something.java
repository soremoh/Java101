package chapter09;

public class Something implements PlayingCard {

    @Override
    public String getCardNumber() {
        return "abc";
    }

    @Override
    public String getCardKind() {
        return "abc";
    }
}
