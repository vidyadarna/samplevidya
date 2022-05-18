package OverloadingOverriding;

import java.util.concurrent.Callable;

public class MainOverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();


      Car car = new Car();
        car . run();
    }
}
