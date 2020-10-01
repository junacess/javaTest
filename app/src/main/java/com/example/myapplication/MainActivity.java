package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity {
    public static void main(String[] args) {
        int m = 1000;
        int n = 495;

        for (int s = 2; s < 1000; s++) {
            if (m % s == 0 && n % s == 0) {
                System.out.println(s);
            }
        }


        //阿姆斯壯數
          /*
          找出所有三位數之數
           */
        int a, b, c;
        int abc = 0;
        int my_name_is_jack;
        long yy = 123;
        int xx = 123;
        long zz = (long) xx;
        String name = "123你好";
        //強破型態轉換
//          int uu = Integer.parseInt(name);
//          System.out.println(uu);
        for (int i = 100; i <= 1000; i++) {
            a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if ((a * a * a) + (b * b * b) + (c * c * c) == i) {

            }

        }
        char space = '\u0020';
        String name123 = "好喔989";
        String bb = null;
        int bbb = 12345699;
        //強制型態轉換
        long vvv = (long) bbb;
        int ccc = (int) vvv;
        //if else 判斷簡寫
        boolean uuu = true;
        String tyy = uuu ? "rrr" : "pppp";
        System.out.println(tyy);

        String g=new String("kkk");
        System.out.println(g);


        //break 用法
        //int d = 5;
//          while (true){
//              if (d==7){
//                  continue;
//              }
//
//              System.out.println(d + "\t");
//              d++;
//          }


//          for (int f=0;f<10;f++){
//              if (f==4)
//                  continue;
//              System.out.print(f + "\t");
//          }

        Breakfast breakfast = new Breakfast();
        breakfast.setPrice(100);
        breakfast.setHot(50);
//        System.out.println("breakfast price -> " +breakfast.getWeater());
        breakfast.priceAndHot();
        System.out.println("priceAndHot  -> " + breakfast.getPrice());
    }

   static class Breakfast {

        int price;
        int hot;
        String humbrage;
        String eag;
        String weater;
        String beef;

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public String getHumbrage() {
            return humbrage;
        }

        public void setHumbrage(String humbrage) {
            this.humbrage = humbrage;
        }

        public String getEag() {
            return eag;
        }

        public void setEag(String eag) {
            this.eag = eag;
        }

        public String getWeater() {
            return weater;
        }

        public void setWeater(String weater) {
            this.weater = weater;
        }

        public String getBeef() {
            return beef;
        }

        public void setBeef(String beef) {
            this.beef = beef;
        }

        public boolean isPriceHave() {
            boolean isTrue = price >0;
            return isTrue;
        }

        public void priceAndHot() {
          price += hot;
        }
    }


}

