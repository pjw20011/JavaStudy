package com.example.javastudy.java.SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        HelloProgrammer helloProgrammer = new HelloProgrammer();
        helloProgrammer.hi(new JavaProgrammer());
        helloProgrammer.hi(new CppProgrammer());
        helloProgrammer.hi(new PythonProgrammer());
    }
}
