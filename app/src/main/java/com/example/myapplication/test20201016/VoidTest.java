package com.example.myapplication.test20201016;

public class VoidTest {
    public static void main(String[] test) {
        system("main", 134);
        String name = getName("junacess", 456);
        System.out.println(name);

        int number = getnumber(10);
        System.out.println(number);

        String text=getText("jain");
        System.out.println(text);

    }

    private static void system(String test, int number) {
        System.out.println(test + number);
    }

    private static String getName(String name, int number) {
        String nameNumber = name + number;
        return nameNumber;
    }

    private static int getnumber(int number) {
        int number2 = number;
        for (int i = 0; i < 5; i++) {
            number2 += 10;
        }
        return number2;
    }

    private static String getText(String text){
         String text2=text;
         return text2;

    }

}
