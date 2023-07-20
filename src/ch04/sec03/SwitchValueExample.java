package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // 자바 11 이전 문법
        int score = 0;

        switch (grade) {
            case "A" -> score = 100;
            case "B" -> score = 80;
            default -> score = 50;
        }

        System.out.println("score : " + score);
        // 자바 12 부터 문법

        score = switch (grade) {
            case "A" -> 1000;
            case "B" -> 800;
            default -> 500;
        };

        System.out.println("score : " + score);
    }
}
