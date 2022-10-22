package chapter04.ex;

public class ex04 {
    public static void main(String[] args) {

        // 쓰레기 값 들어가 있음
        int age = 0;
        double height = 0;
        boolean withParent = false;
        boolean hasHeartDisease = false;
                         // 6살 이상일 경우                                        || 6살 미만일 경우
        boolean canHeRide = ((age > 6) && (height > 120) && (!hasHeartDisease)) || (height > 120 && withParent);

        System.out.println(canHeRide);
    }
}
