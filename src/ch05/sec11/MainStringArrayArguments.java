package ch05.sec11;

import ch06.sec02.Car;

public class MainStringArrayArguments {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("덧셈을 위해선 두 개의 인자가 필요합니다.");
        }

        Car car = new Car();
    }

}
