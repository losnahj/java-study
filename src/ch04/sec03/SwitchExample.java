package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6 + 1);

        switch (num) {
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            default:
                System.out.println(num + "번");
        }
    }
}
