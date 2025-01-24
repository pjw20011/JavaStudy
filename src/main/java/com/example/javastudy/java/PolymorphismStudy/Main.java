package com.example.javastudy.java.PolymorphismStudy;

import org.springframework.aop.scope.ScopedProxyUtils;

public class Main {
    public static void main(String[] args){
        CProgrammer c = new CProgrammer();
        JavaProgrammer java = new JavaProgrammer();
        PythonProgrammer python = new PythonProgrammer();

        writeCode(c);

    }

    static void writeCode(Programmer programmer){
        programmer.writeCode();
    }
}
