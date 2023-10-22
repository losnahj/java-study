package ch07.sec10;

public interface Vehicle {
//    public String name1;
    public void drive();

    public void gear();

    public default void fuel() {
        System.out.println("charge fuel!!");
    }
}
