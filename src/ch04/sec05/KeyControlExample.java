package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("------------");
            System.out.println("1. 종속 | 2. 감속 | 3. 정지");
            System.out.println("------------");
            System.out.println("선택");

            String nextLine = scanner.nextLine();

            if (nextLine.equals("1")) {
                System.out.println("현재 속도 : " + ++speed);
            } else if (nextLine.equals("2")) {
                System.out.println("현재 속도 : " + --speed);
            } else if (nextLine.equals("3")) {
                run = false;
            }
        }
    }
}
