package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {

        int[] arrSize3 = {1, 2, 3};


        int[] arrSize5 = new int[5];
        arrSize5 = arrSize3;

        for (int i : arrSize5) {
            System.out.println(i);
        }

        int[] oldArr = {1,2,3};
        int[] newArr = new int[5];

        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
    }
}
