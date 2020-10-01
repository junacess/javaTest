package com.example.myapplication.test20200927;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test20200927 {
    public static void main(String[] args){
        String abc = "abc";
        String abc2= "abc";
        boolean answer=abc.equals(abc2);
        System.out.println(answer);

        abc="abcde";
        abc2="abcdef";
        boolean answer2=abc.equals(abc2);
        System.out.println(answer2);

        abc="ABC";
        abc2="abc";
        boolean answer3=abc.equalsIgnoreCase(abc2);
        System.out.println(answer3);

        abc="abcde";
        abc2="c";
        boolean answer4=abc.contains(abc2);
        System.out.println(answer4);

        abc2="A";
        boolean answer5=abc.contains(abc2);
        System.out.println(answer5);

        abc2="b";
        String abc3="f";
        String replaceAbc=abc.replace(abc2,abc3);
        System.out.println(replaceAbc);

        abc="abcdeb";
        String replaceAbc2=abc.replace(abc2,abc3);
        System.out.println(replaceAbc2);

        abc2="abc";
        boolean answer6=abc.startsWith(abc2);
        System.out.println(answer6);

        abc2="deb";
        boolean answer7=abc.startsWith(abc2);
        System.out.println(answer7);

        boolean answer8=abc.endsWith(abc2);
        System.out.println(answer8);

        String toUpperCace=abc.toUpperCase();
        System.out.println(toUpperCace);

        String toLowerCase=toUpperCace.toLowerCase();
        System.out.println(toLowerCase);

        abc="   abc   ";
        String clear=abc.trim();
        System.out.println(clear);

        abc="a b c";
        String replace3=abc.replace(" ","");
        System.out.println(replace3);

        // 變數使用範圍
        for (int i=0;i<10;i++){

            int yellow = 0;

        }


        if (answer8){
            int answer123 =1;

        }

        abc="123";
        int testInt= Integer.parseInt(abc);
        System.out.println(testInt);

        long testLong=Long.parseLong(abc);
        System.out.println(testLong);

        double testDouble= Double.parseDouble(abc);
        System.out.println(testDouble);

        float testFloat=Float.parseFloat(abc);
        System.out.println(testFloat);


        int mathMax=Math.max(123,456);
        System.out.println(mathMax);

        int mathMin=Math.min(234,876);
        System.out.println(mathMin);

        double mathRandom=Math.random();
        System.out.println(mathRandom);

        int mathRandomInt = new Random().nextInt(100);
        System.out.println(mathRandomInt);

        long mathLong=Math.round(4.356);
        System.out.println(mathLong);


    }
}
