package com.example.myapplication.test20200927;

import java.util.ArrayList;
import java.util.List;

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





        //第三題


        //第四題
            //第一種解法
            if (BadmintonRacket3.getPrice()<BadmintonRacket4.getPrice()){
                System.out.println("第四題答案:"+BadmintonRacket3.getNumber());
            }else {
                System.out.println("第四題答案:"+BadmintonRacket4.getNumber());
            }
            //第二種解法


        //第五題
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
         //第六題
            if (BadmintonRacket1.getCode().startsWith("Y2782C")){
                System.out.println("是");
            }else {
                System.out.println("不是");
            }
         //第七題
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

//            boolean answer1=BadmintonRacket1.getCode().contains("F277");
//            System.out.println(answer1);

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

        public void cheap(){

        }
    }


}
