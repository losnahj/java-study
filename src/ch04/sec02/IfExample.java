package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {

        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90 점 보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90 점 보다 작습니다.");
            // 조건문 블록 안에 포함 되어 있지 않기 때문에 밑에 라인이 실행된다.
            System.out.println("등급은 B입니다.");
    }
}
