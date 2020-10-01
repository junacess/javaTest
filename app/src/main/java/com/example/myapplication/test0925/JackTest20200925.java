package com.example.myapplication.test0925;

import java.util.ArrayList;
import java.util.List;

public class JackTest20200925 {
    public static void main(String[] args){
        List<Integer> accumulate =new ArrayList<>();
        for (int i=0;i<10;i++){
            accumulate.add(i);
        }
        int number=0;
        int addnumber=0;
        for (int i=0;i<accumulate.size();i++){
            // Q3 1~10累加
            addnumber+=i;
            // Q1 Array 數目
            number+=1;
            if (number==accumulate.size()){
                // Q2 最後一筆數字
                System.out.println("number " + number);
            }
        }
        System.out.println(number);
        System.out.println(addnumber);

       String chartest="請注意妳的腳步";
       int many=0;
       //計算第幾個位置
       int position=chartest.indexOf("妳");
       for (int i=0;i<chartest.length();i++){
           //字元總數
           many+=1;
       }
       System.out.println(many);
       System.out.println(position);

       String code="Z2782PAB123";
       //最後一個2的位置
       int lastTwo=code.lastIndexOf("2");
       //Ａ的位置
       int aOfPosition=code.indexOf("A");
       //前五個字元
       String firstFive=code.substring(0,5);

       System.out.println(lastTwo);
       System.out.println(aOfPosition);
       System.out.println(firstFive);



    }
}
