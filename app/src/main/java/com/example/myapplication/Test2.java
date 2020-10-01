package com.example.myapplication;

public class Test2 {
    public static void main(String[] args){

        Account breakfast1=new Account();
        breakfast1.setBreakfast(120);
        breakfast1.setLunch(200);
        breakfast1.setIncome(2000);
        breakfast1.setModel(1800);
        breakfast1.setDeposit(0);
        breakfast1.setName("jack");

        //第一題
        if (breakfast1.getBreakfast() > 100){
            System.out.println("太貴了");
        }
        //第二題
        System.out.println(breakfast1.getBreakfast()+breakfast1.getLunch());
        //第二題第二種寫法
        breakfast1.lunchAndBreakfast();
        System.out.println(breakfast1.getLunch());
        //第三題
        System.out.println(breakfast1.getIncome()>breakfast1.getModel() ? "可以" : "沒錢");
        //第四題
        breakfast1.depositAdd();
           System.out.println(breakfast1.getDeposit());
        //第五題
//        while (income1.getIncome()>0){
           // income1.getIncome()-=breakfast1.getBreakfast();
//            income1=income1-breakfast1;
//            day1.getDay()++;
//        }
        breakfast1.incomeLose();
            System.out.println(breakfast1.getDay());
            //第六題
        breakfast1.changeName();
        System.out.println("我的名字是"+breakfast1.getName());

    }
    static class Account{
        int breakfast;
        int lunch;
        int dinner;
        int income;
        int deposit;
        int model;
        int day;
        String name;

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public int getModel() {
            return model;
        }

        public void setModel(int model) {
            this.model = model;
        }

        public int getBreakfast() {
            return breakfast;
        }

        public void setBreakfast(int breakfast) {
            this.breakfast = breakfast;
        }

        public int getLunch() {
            return lunch;
        }

        public void setLunch(int lunch) {
            this.lunch = lunch;
        }

        public int getDinner() {
            return dinner;
        }

        public void setDinner(int dinner) {
            this.dinner = dinner;
        }

        public int getIncome() {
            return income;
        }

        public void setIncome(int income) {
            this.income = income;
        }
        public void depositAdd(){
            for (int i=1;i<=10;i++){
                deposit+=10;
            }
        }
        public void lunchAndBreakfast(){
            lunch+=breakfast;
        }
        public void incomeLose(){
            //用for迴圈
            for (day=0;income>breakfast;day++){
                income=income-breakfast;
            }
            //用while迴圈
//            while (income>breakfast){
//                income=income-breakfast;
//                day++;
//            }
        }
        public void changeName(){
            name="Dainiel";
        }

    }
}
