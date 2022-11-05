package chapter15;

interface TestEx {
    int sum(int x, int y);


}

public class mainTest {
    public static void main(String[] args){
        TestEx te = (int x, int y)-> x+y+100;
        System.out.println(te.sum(10,10));
    }
}
