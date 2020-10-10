package com.example.myapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWork {
    public static void main(String[] Account) {

        //小新
        Account account1 = new Account();
        account1.setNumber(1);
        account1.setName("小新");
        account1.setAccountNumber("X5458XA");
        account1.setPassword("amX0922");
        account1.setMoney(35000);
        account1.setItem("出國用");

        //美芽
        Account account2 = new Account();
        account2.setNumber(2);
        account2.setName("美芽");
        account2.setAccountNumber("HBA3S586");
        account2.setPassword("asb678");
        account2.setMoney(47926);
        account2.setItem("家庭用");

        //廣志
        Account account3 = new Account();
        account3.setNumber(3);
        account3.setName("廣志");
        account3.setAccountNumber("GLK48777");
        account3.setPassword("jkl02666");
        account3.setMoney(72536);
        account3.setItem("應酬用");


        //把大家都放入陣列
        List<Account> account = new ArrayList<>();
        account.add(account1);
        account.add(account2);
        account.add(account3);

        List<Integer> richMoney = new ArrayList<>();


        //第一題
        String changePassword = "cTV76299";
        String password = account1.getPassword();
        password = changePassword;
        System.out.println("(1)" + password);

        //第二題
        int wifeMoney = account2.getMoney();
        int husbandMoney = account3.getMoney();
        int provideMoney = 3500;
        wifeMoney -= provideMoney;
        husbandMoney += provideMoney;
        System.out.println("(2)廣志有" + husbandMoney + "美芽剩" + wifeMoney);

        //第三題
        int smallNew = account1.getMoney();
        int cookies = 150;
        int day = 0;
        for (int i = 0; smallNew > cookies; i++) {
            day += 1;
            smallNew -= cookies;
        }
        System.out.println("(3)" + day);

        //第四題
        String password2 = account2.getPassword();
        String newPassword = password2.toUpperCase();
        System.out.println("(4)" + newPassword);


        //第五題
        //先把大家的錢取出來丟進陣列
        for (Account richest : account) {
            int money = richest.getMoney();
            richMoney.add(money);
        }

        //取最大值
        int richest = Collections.max(richMoney);

        //找出誰最有錢
        for (Account person : account) {
            int money = person.getMoney();
            String richestPerson = person.getName();
            if (money == richest) {
                System.out.println("(5)" + richestPerson);
            }
        }

        //第六題
        int xin = account1.getMoney();
        double rate = 0.02;
        double xin2 = xin;
        for (int i = 1; i <= 10; i++) {
            double rate2 = xin * rate;
            xin += rate2;
        }
        System.out.println("(6)" + xin);

        //第七題
        for (Account five : account) {
            String haveFive = five.getAccountNumber();
            String name = five.getName();
            if (haveFive.contains("5")) {
                System.out.println("(7)" + name);
            }
        }

        //第八題
        int melYa = account2.getMoney();
        int zhi = account3.getMoney();
        int tatle = melYa + zhi;
        if (tatle >= 100000) {
            System.out.println("(8)夠");
        } else {
            System.out.println("(8)不夠");
        }

        //第九題
        int dayly = 1;
        int deposit = 250;
        for (int i = 1; deposit < 50000; i++) {
            dayly += 1;
            deposit += 250;
        }
        System.out.println("(9)" + dayly);

        //第十題
        String zhiNumber = account3.getAccountNumber();
        String seven = "7";

        int count = 0;
        int index = 0;

        while ((index = zhiNumber.indexOf(seven)) != -1) {
            index = seven.length() + index;
            count++;
            zhiNumber = zhiNumber.substring(index, zhiNumber.length());
        }

        System.out.println("(10)" + count);

        //第十一題
        for (Account item : account) {
            String allItem = item.getItem();
            System.out.println("(11)" + allItem);
        }


    }

    static class Account {
        int number;
        String name;
        String accountNumber;
        String password;
        int money;
        String item;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

    }

}
