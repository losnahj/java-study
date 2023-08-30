package ch06.sec08;

import com.sun.jdi.ClassType;

public class MethodReturnTypeCasting {
    public static void main(String[] args) {
        Cal cal = new Cal();
        int result1 = cal.sum(5, 5);
        double result2 = cal.sumReturnDoubleType(5, 5);
        System.out.println(result1);
        System.out.println(result2);

        int[] nums = new int[]{1, 2, 3, 4, 5};

        cal.sumAll(nums);

    }
}

class Cal {

    int sum(int a, int b) {
        return a + b;
    }

    // 코드 상에선 int 값을 return 하지만, double 타입으로 자동 형 변환 후 반환한다.
    double sumReturnDoubleType(int a, int b) {
        return a + b;
    }

    int sumAll(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }

        return result;
    }
}
