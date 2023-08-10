package ch05.sec07;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {

        // 2 X 3 배열에서 [1][2] 의 값을 안넣어주면 ArrayIndexOutOfBoundsException 또는 0 ?

        int[][] arr = {
                {0,1,2},
                {3,4}
        };

        for (int[] i : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        // 직사각형으로 배열이 생성 되어 2 X 3 의 배열이 생성될 줄 알았는데 [1][2]에 접근할 수 없다.
        // System.out.println(arr[1][2]);
    }
}
