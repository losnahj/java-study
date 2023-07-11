package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {

        byte overflow = 125;

        for (int i = 0; i < 5; i++) {
            overflow++;
            System.out.println("overflow : " + overflow);
        }

        byte underflow = -125;

        for (int i = 0; i < 5; i++) {
            underflow--;
            System.out.println("underflow : " + underflow);
        }
    }
}
