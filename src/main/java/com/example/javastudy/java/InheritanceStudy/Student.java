package com.example.javastudy.java.InheritanceStudy;

public class Student extends Human{
    @Override
    void setName(String param) {
        this.name = param;
        System.out.println("setName = " + param);
    }

    void studyPhysics(){
        System.out.println(this.name + " is studying physics");
}

    void studyPhysics(String title){
        System.out.println(this.name + " is studying " + title);
    }

}
