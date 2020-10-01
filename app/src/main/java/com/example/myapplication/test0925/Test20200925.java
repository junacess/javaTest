package com.example.myapplication.test0925;

import java.util.ArrayList;
import java.util.List;

public class Test20200925 {
    public static void main(String[] args){
        List<Integer> numberList=new ArrayList<>();
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.remove(3);
        for (int i=0;i<numberList.size();i++){
            if (i==numberList.size()-1){
                //最後一筆資料
                System.out.println(numberList.get(i));
            }
            if (i==0){
                //第一筆資料
                System.out.println(numberList.get(i));
            }

        }
//        for (int number:numberList){
//            System.out.println(number);
//        }
        List<String> charList=new ArrayList<>();
        charList.add("Hello Word");
        charList.add("command");
        charList.add("GitHub");
        for (String foreach:charList){
            System.out.println(foreach);
        }

        String love="我愛人家人 他愛我嗎";
        int numberLove=0;
        int first=love.indexOf("人");
        int secondHuman=love.indexOf("人",3);
        int lastMe=love.lastIndexOf("我");
        int other=love.lastIndexOf("人家");

        for (int i=0;i<love.length();i++){
            numberLove+=1;
        }
        System.out.println(numberLove);
        System.out.println(first);
        System.out.println(secondHuman);
        System.out.println(lastMe);
        System.out.println(other);

        String str="東西當鋪當東西";
        String answer=str.substring(3);
        System.out.println(answer);
        String newAnswer=str.substring(0,3);
        System.out.println(newAnswer);

    }
}
