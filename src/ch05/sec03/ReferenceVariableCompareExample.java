package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {

        int[] ints1 = new int[] {1,2,1,4};
        int[] ints2 = new int[] {1,2,3,4};
        int[] ints3 = ints2;

        System.out.println("ints1 == ints2 : " + (ints1 == ints2));
        System.out.println("ints2 == ints3 : " + (ints2 == ints3));
        System.out.println(ints1);
        System.out.println(ints1[0] == ints1[2]);
    }
}
