package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println();
                continue;
            }

            System.out.println(i);
        }
    }
}
