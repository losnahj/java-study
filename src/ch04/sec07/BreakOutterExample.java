package ch04.sec07;

public class BreakOutterExample {
    public static void main(String[] args) {

        Outter:for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (int i = 1; i <= 5; i++) {
                if (ch == 'B' && i == 3) {
                    break Outter;
                }
                System.out.println("ch : " + ch + ", i : " + i);
            }
        }
    }
}
