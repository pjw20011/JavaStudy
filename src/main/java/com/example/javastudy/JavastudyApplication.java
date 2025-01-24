package com.example.javastudy;

import com.example.javastudy.java.InterfaceStudy.Car;
import com.example.javastudy.java.InterfaceStudy.MotorCycle;
import com.example.javastudy.java.InterfaceStudy.Vehicle;
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
