package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자 입니다.");
        }
    }
}
