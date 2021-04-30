package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkNum(10, 1));
        System.out.println("----------");
        checkOnePositiveNum();
        System.out.println("----------");
        System.out.println(myMethodNegative(10));
        System.out.println("----------");
        methodStringAndNumber();
        System.out.println("----------");
        System.out.println(checkYear(1988));
    }

    public static boolean checkNum(int num1, int num2) {
        if ((num1 + num2) >= 10 && (num1 + num2) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkOnePositiveNum() {
        int a = -6;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean myMethodNegative(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void methodStringAndNumber() {
        int count = 5;
        String word = "конфеточки";
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
    public static boolean checkYear(int year){
        if (!(year % 4 == 0) || (year % 100 == 0) && !(year % 400 == 0) ){
            return false;
        }
        return true;
    }

}
