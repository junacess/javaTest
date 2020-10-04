package com.example.myapplication.test20200927;

import android.util.ArraySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Jacktest20200927 {
    public static void main(String[] args){

        //第一隻球拍
        BadmintonRacket BadmintonRacket1=new BadmintonRacket();
        BadmintonRacket1.setNumber("001");
        BadmintonRacket1.setPrice(2000);
        BadmintonRacket1.setBrand("尤尼克斯");
        BadmintonRacket1.setWeight(83.5);
        BadmintonRacket1.setCode("Y2782PAA003");

        //第二隻球拍
        BadmintonRacket BadmintonRacket2=new BadmintonRacket();
        BadmintonRacket2.setNumber("002");
        BadmintonRacket2.setPrice(1980);
        BadmintonRacket2.setBrand("威克多");
        BadmintonRacket2.setWeight(91.0);
        BadmintonRacket2.setCode("V2882PBB003");

        //第三支球拍
        BadmintonRacket BadmintonRacket3=new BadmintonRacket();
        BadmintonRacket3.setNumber("003");
        BadmintonRacket3.setPrice(2500);
        BadmintonRacket3.setBrand("富利特");
        BadmintonRacket3.setWeight(78.5);
        BadmintonRacket3.setCode("F277PCC996");

        //第四支球拍
        BadmintonRacket BadmintonRacket4=new BadmintonRacket();
        BadmintonRacket4.setNumber("004");
        BadmintonRacket4.setPrice(3800);
        BadmintonRacket4.setBrand("富利特");
        BadmintonRacket4.setWeight(69.8);
        BadmintonRacket4.setCode("F277PAA998");

        List<BadmintonRacket> badmintonRackets=new ArrayList<>();
        badmintonRackets.add(BadmintonRacket1);
        badmintonRackets.add(BadmintonRacket2);
        badmintonRackets.add(BadmintonRacket3);
        badmintonRackets.add(BadmintonRacket4);

        List<Integer> priceList=new ArrayList<>();
        List<Integer> cheapPriceList=new ArrayList<>();
        List<Double> heaviestList =new ArrayList<>();

        //第一題
            for (BadmintonRacket badmintonRacket:badmintonRackets){
                int price2=badmintonRacket.getPrice();
                cheapPriceList.add(price2);
            }
            int cheapper=Collections.min(cheapPriceList);

            for (BadmintonRacket badmintonRacket:badmintonRackets){
                int price=badmintonRacket.getPrice();
                String number=badmintonRacket.getNumber();
    //            cheapPriceList.add(price);
    //            int cheapper=Collections.min(cheapPriceList);
                if (price==cheapper){
                    System.out.println("第一題答案是："+number);
                }
            }


        //第二題
            for (BadmintonRacket badmintonRacket:badmintonRackets){
                double weight =badmintonRacket.getWeight();
                String number=badmintonRacket.getNumber();
                heaviestList.add(weight);
                double heaviest=Collections.max(heaviestList);
                if (weight==heaviest){
                    System.out.println("第二題答案是："+number);
                }
            }

        //第三題
            //把相同值去掉的語法
            Set<String> brandList=new HashSet<>();
            for (BadmintonRacket badmintonRacket:badmintonRackets){
                String brand=badmintonRacket.getBrand();
                brandList.add(brand);
            }
            int brandSize=brandList.size();
            System.out.println("第三題答案是："+brandSize+"種");


        //第四題
            //第一種解法
            if (BadmintonRacket3.getPrice()<BadmintonRacket4.getPrice()){
                System.out.println(BadmintonRacket3.getNumber());
            }else {
                System.out.println(BadmintonRacket4.getNumber());
            }

            //第二種解法
            for (BadmintonRacket badmintonRacket:badmintonRackets){
                    String feet = "富利特";
                    int price=badmintonRacket.getPrice();
                    String brand = badmintonRacket.getBrand();
                    if (brand.equals(feet)) {
                        priceList.add(price);
                        int cheapPrice = Collections.min(priceList);
                        if (price == cheapPrice) {
                            System.out.println("第四題答案:" + badmintonRacket.getNumber());
                        }
                    }
            }


        //第五題
          //第一種解法
            if (BadmintonRacket1.getCode().contains("F277")){
                System.out.println(BadmintonRacket1.getNumber());
            }
            if (BadmintonRacket2.getCode().contains("F277")){
            System.out.println(BadmintonRacket2.getNumber());
            }
            if (BadmintonRacket3.getCode().contains("F277")){
                System.out.println(BadmintonRacket3.getNumber());
            }
            if (BadmintonRacket4.getCode().contains("F277")){
            System.out.println(BadmintonRacket4.getNumber());
            }
            //第二種解法
            for (BadmintonRacket badmintonRacketCode:badmintonRackets){
                if (badmintonRacketCode.getCode().contains("F277")){
                    System.out.println("第五題答案是:"+badmintonRacketCode.getNumber());
                }
            }
         //第六題
            //第一種解法
            if (BadmintonRacket1.getCode().startsWith("Y2782C")){
                System.out.println("是");
            }else {
                System.out.println("不是");
            }
            //第二種解法

            for (BadmintonRacket codeStart:badmintonRackets) {
                String code=codeStart.getCode();
                String number=codeStart.getNumber();
                String brand=codeStart.getBrand();
                if (brand.equals("尤尼克斯")){
                    if (code.startsWith("Y2782C")){
                        System.out.println("第六題答案是："+number+"是正版");
                    }else{
                        System.out.println("第六題答案是：都不是");
                    }
                }
            }

            //第七題
                //第一種解法
                if (BadmintonRacket1.getCode().endsWith("003")){
                    System.out.println(BadmintonRacket1.getCode());
                }
                if (BadmintonRacket2.getCode().endsWith("003")) {
                    System.out.println(BadmintonRacket2.getCode());
                }
                if (BadmintonRacket3.getCode().endsWith("003")){
                    System.out.println(BadmintonRacket3.getCode());
                }
                if (BadmintonRacket4.getCode().endsWith("003")){
                    System.out.println(BadmintonRacket4.getCode());
                }
                //第二種解法
                for (BadmintonRacket codeEnd:badmintonRackets){
                    String code=codeEnd.getCode();
                    if (code.endsWith("003")){
                        System.out.println("第七題答案是："+code);
                    }
                }

            //第八題
                int sum=BadmintonRacket3.getPrice()+BadmintonRacket4.getPrice();
                int budget=6500;
                if (budget>sum){
                    System.out.println("第八題答案是:夠");
                }else {
                    System.out.println("第八題答案是:不夠");
                }
                int average=sum/2;
                System.out.println("第八題答案是:"+average);

            //第九題
                int price1=BadmintonRacket1.getPrice();
                int price2=BadmintonRacket2.getPrice();
                if (price1 > price2) {
                    System.out.println("第九題答案是："+BadmintonRacket1.getNumber()+"比較貴");
                }else {
                    System.out.println("第九題答案是："+BadmintonRacket2.getNumber()+"比較貴");
                }

            //第十題
                Double weight=BadmintonRacket4.getWeight();
                long number=Math.round(weight);
                System.out.println("第十題答案是："+number);

            //第十一題
                int figure=new Random().nextInt(10);
                System.out.println("第十一題答案是："+figure);


             // i am jacks
            String sentence=" i am jacks ";
                //（1）
                String toBig=sentence.toUpperCase();
                System.out.println("(1)"+toBig);
                //（2）
                String tosmall=sentence.toLowerCase();
                System.out.println("(2)"+tosmall);
                //(3)
                String clearVain=sentence.trim();
                System.out.println("(3)"+clearVain);
                //(4)
                String clearAll=sentence.replaceAll(" ","");
                System.out.println("(4)"+clearAll);
                //(5)
                String changeName=sentence.replace("jacks","Daniels");
                System.out.println("(5)"+changeName);

    }
    static class BadmintonRacket{
        String number;
        int price;
        String brand;
        double weight;
        String code;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    }


}
