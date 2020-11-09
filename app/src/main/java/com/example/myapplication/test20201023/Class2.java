package com.example.myapplication.test20201023;

public class Class2 implements ClassConstract.Class2 {

    private ClassConstract.Class1 class1;
    private String test;


    public Class2(ClassConstract.Class1 class1,String test) {
        this.class1=class1;
        this.test = test;
    }

    @Override
    public void changeName(String newName) {
        String name=newName;
        name="king";
        class1.setChangeName(name);
    }
}
