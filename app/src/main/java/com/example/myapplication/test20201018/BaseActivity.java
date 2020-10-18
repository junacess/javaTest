package com.example.myapplication.test20201018;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

   public String name="jack";
   protected int number=4567889;
   public abstract void github();
   public void setName(){
       name="join";
   }
   public void setName(String name){
       this.name=name;
   }
   protected void setNumber(){
   }
}
