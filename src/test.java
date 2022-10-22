import chapter07.Student;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int[] abc = new int[3];

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println(3 / 0);
            Integer.parseInt("a");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위 초과");
        } catch (Exception are) {
            System.out.println("error!");
        }finally {
            System.out.println("종료!");
        }
        System.out.println("hi");
    }
}
