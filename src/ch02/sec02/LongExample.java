package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;

        // int 값 (-2^32 ~ 2^31 - 1)을 넘어가는 정수에 대해서는 숫자L 표시 필요!
        // long c = 10000000000;

        long d = 10000000000L;

        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);


        Long t = 10L;
        Long k = 10L;

        System.out.println(t == k);
    }
}
