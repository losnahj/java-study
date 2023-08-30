package ch06.sec02;

import java.time.LocalDateTime;
import java.util.Date;

public class Car {

    String model;
    LocalDateTime  date;

    public Car() {
        // 생성자 호출은 반드시 가장 첫 라인에 존재해야한다.
        this("k3", LocalDateTime.now());
        System.out.println("first line");
    }

    public Car(String model, LocalDateTime date) {

    }
}