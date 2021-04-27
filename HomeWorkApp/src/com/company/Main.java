package com.company;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 30;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 70;
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value & value <= 100){
            System.out.println("Желтый");
        } else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 100;
        int b = 500;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println( "a < b");
        }

    }
}