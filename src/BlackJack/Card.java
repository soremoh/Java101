package BlackJack;

public class Card implements TrumpCard{

    int Kind;
    int Number;
//      [kind,Number]

    Card(){
        this.Kind = (int)(Math.random()*KIND_MAX)+KIND_MIN;
        this.Number =  (int)(Math.random()*NUM_MAX)+ NUM_MIN;
    }

}
