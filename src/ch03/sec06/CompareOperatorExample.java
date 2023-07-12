package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        String str1 = "AA";
        String str2 = "AA";

        String str3 = new String("AA");
        String str4 = new String("AA");

        System.out.println(str1 == str2);
        System.out.println(str4 == str3);
        System.out.println(str3.equals(str1));
    }
}
