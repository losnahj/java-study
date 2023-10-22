package ch05.sec04;

public class NullPointExceptionExample {
    public static void main(String[] args) {

        String str1 = null;

        // null 참조를 하는 참조 타입은 매서드를 호출할 수 없다.
        // str1.length() -> NullPointException Error

        String str2 = "hello";
        System.out.println(str2.length());

    }
}
