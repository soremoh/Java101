package chapter15;

interface minusEx {
    int minus (int x, int y);
}

public class functionEx {
    public static void main(String[] args) {
        minusEx me = (int x, int y) -> x-y;

        System.out.println(me.minus(10,10));
    }
}
