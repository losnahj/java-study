package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nextLine;

        do {
            nextLine = scanner.nextLine();
            System.out.println(nextLine);
        } while (!nextLine.equals("q"));
    }
}
