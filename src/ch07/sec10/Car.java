package ch07.sec10;

public class Car implements Vehicle {
    @Override
    public void drive() {

    }

    @Override
    public void gear() {

    }

    public void back() {

    }

    @Override
    public void fuel() {
//        Vehicle.super.fuel();
        System.out.println("Charge Car fuel");
    }
}
