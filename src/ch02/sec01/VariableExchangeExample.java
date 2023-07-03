package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {

        // 변수 a, b 값 바꾸기
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("a : " + a + " b : " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + " b : " + b);
    }
}
