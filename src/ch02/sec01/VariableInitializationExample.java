package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {

        // 1. 첫 글자는 무조건 문자여야한다.
        // int 1age (X)

        // 2. 특수 문자는 $만 가능하다
        // String nam$e (O)

        // 3. 변수명은 카멜 케이스로 작성한다
        // int studentNo

        int age;
        age = 15;
        System.out.println(age);


        int value = 20;
        int sum = value + 10;
        System.out.println(sum);

        System.out.println("hello world" + 10);
    }
}
