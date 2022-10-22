package chapter04.ex;

public class ex06 {
    public static void main(String[] args) {

        //refactoring
        int price = 187000;
        int oman = price / 50000;
        int ilman = (price % 50000) / 10000;
        int ochun = (price-50000*oman-10000*ilman)/5000;
        int ilchun = (price-50000*oman-10000*ilman-5000*ochun)/1000;

        System.out.println("5만원권 : "+oman+"장");
        System.out.println("1만원권 : "+ilman+"장");
        System.out.println("5천원권 : "+ochun+"장");
        System.out.println("1천원권 : "+ilchun+"장");
    }
}
