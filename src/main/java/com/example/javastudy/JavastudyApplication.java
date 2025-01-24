package com.example.javastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavastudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavastudyApplication.class, args);
        printVehicle(new Car());
        printVehicle(new MotorCycle());
    }
    public static void printVehicle(Vehicle vehicle){
        vehicle.drive();
    }

}
