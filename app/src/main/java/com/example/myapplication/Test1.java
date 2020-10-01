package com.example.myapplication;

public class Test1 {
    public static void main(String[] args){
        int a=120;
        int b=200;
        int c;
        int d=2000;
        int e=1800;


        //第一題
        if (a>100){
            System.out.println("太貴了");
        }
        //第二題
        System.out.println(a+b);
        //第三題
        if (e<d){
            System.out.println("可以");
        }else {
            System.out.println("沒錢");
        }
        //第四題
        int m=0;
        for (int i=1;i<=10;i++){
            m=m+10;
        }
            System.out.println(m);

//        //第五題
        for (int p=1;d>a;p++){
                d-=a;
               if (d<a){
                   System.out.println(p);
               }
           }
        int day = 0;
        while (d >0) {
            d = d - a;
            day++;
            System.out.println("day" + day);

        }

        //第六題
        String name="jack";
        name = "Daniel";
        System.out.println("name="+name);
        }


    }

