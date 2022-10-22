import java.util.Scanner;

public class ex {
    public static void main(String[] args) {

        //정수 5개 배열 선언
        int num[] = new int[5];
        int temp;
        //유저한테 입력받는 행위
        Scanner sc = new Scanner(System.in);

        //정수 n개 입력 받는 행위
        for(int i=0;i<5;i++){
            num[i] = sc.nextInt();
        }

        //bubble sort로 내림차순 정리
        for(int i =0;i<num.length-1; i++){
            for(int j=0; j<num.length-1; j++){
                if(num[j]<num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }

        }

        for(int i =0 ;i<5;i++) System.out.print(num[i]+" ");
        System.out.println();
        System.out.println(num[0]);
        System.out.println(num[1]);


    }
}
