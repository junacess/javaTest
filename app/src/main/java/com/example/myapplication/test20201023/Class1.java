package com.example.myapplication.test20201023;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Class1 extends AppCompatActivity implements ClassConstract.Class1 {

    private String name;
    private ClassConstract.Class2 class2 = null;

    @Override
    public void setChangeName(String setName) {
        Log.d("Class1","setChangeName  "+setName);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name="456";
        class2=new Class2(this,"test");
        class2.changeName(name);
        Log.d("Class1","onCreat  "+name);
    }
}
