package ch03;

public class SignOperatorExample {
    public static void main(String[] args) {
        byte a = 100;

        // - 또는 + 는 연산자 이다.
        // 즉, byte, short, char, int 4가지 타입에 대해서 연산 결과는 무조건 int 이다.
        // 따라서, byte 타입 변수의 - 연산 결과는 int 이기 때문에 컴파일 에러가 발생한다.
        //byte b = -a;
        int c = -a;
    }
}
