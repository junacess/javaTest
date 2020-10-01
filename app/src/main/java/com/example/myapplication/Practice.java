package com.example.myapplication;

import java.sql.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
        System.out.println("hello");
//一維陣列
        int[] yKK=new int[5];
        yKK[0]=23;
        yKK[1]=24;
        yKK[2]=4;
        yKK[3]=3;
        yKK[4]=2;
        System.out.println(Arrays.toString(yKK));
        int[] rK={1,2,3,4,5};
        System.out.println(Arrays.toString(rK));

        int[] array1={1,2,3,4,5};
        int[] array2;
//        array2= (array1,array1.length);
        //數組名.length：數組的長度。Length不是方法，是一個屬性.
        System.out.println(Arrays.toString(array1));


        //一般for迴圈寫法
        int[] u={24,84,73,96,73,64,28};
        for (int y=0;y<u.length;y++){
            System.out.printf("分數：%d %n",u[y]);
        }

        //增強型for迴圈寫法
        int[] g=new int[10];
        for (int scores : g){
            System.out.printf("%2d",scores);
        }

        System.out.println();
        int[] baa=new int[]{1,2,3,4,5,6,7,8};
        int[] haa=baa;
        haa[4]=88;
        System.out.println(baa[4]);

//        二維陣列
        int[][] array={
                {4,5,6},
                {7,8,9}
        };
        for (int p=0;p<array.length;p++){
            for (int o=0;o<array[p].length;o++) {
                System.out.printf("%3d",array[p][o]);
            }
            System.out.println();
        };
        //foreach
        for (int[] row:array){
            for (int value:row){
                System.out.println(value);
            };
        };

    }
}
