package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        arrayThirdMethod();
        tableMethod();
        arrayOneChange();
        maxAndMinNumber();
        shiftNumber();

        boolean balanceResult = checkBalance(new int[] {1, 1, 1, 3});

        if (balanceResult) {
            System.out.println("Сумма левой и правой частей равны");
        } else {
            System.out.println("Сумма левой и правой частей не равны");
        }
    }

    public static void firstMethod() {
        int[] intArray = new int[]{1, 0, 1, 0};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void secondMethod() {
        int[] intArraySecond = new int[100];
        for (int i = 0; i < intArraySecond.length; i++) {
            intArraySecond[i] = i + 1;
            System.out.print(intArraySecond[i] + " ");
        }
        System.out.println(" ");
    }

    public static void arrayThirdMethod() {
        int[] intArrayThird = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < intArrayThird.length; i++) {
            if (intArrayThird[i] < 6) {
                intArrayThird[i] = intArrayThird[i] * 2;
                System.out.println(intArrayThird[i]);
            } else {
                System.out.println(intArrayThird[i]);
            }
        }
    }

    public static void tableMethod() {
        int[][] table = new int[5][5];

        for (int i = 0; i < 5; i++) {
            int k = table[i].length - 1;

            for (int j = 0; j < 5; j++) {
                if (i == j || (k - j) == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print(table[i][j] + " ");
                }
            }

            System.out.println("");
        }
    }

    public static void arrayOneChange() {
        Scanner lenNum = new Scanner(System.in);
        System.out.println("Выберите длину массива:");
        int len = lenNum.nextInt();
        Scanner value = new Scanner(System.in);
        System.out.println("Каким числом заполнить ячейки?");
        int initialValue = value.nextInt();
        int[] ourArray = new int[len];
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = initialValue;
            System.out.print(ourArray[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }


    public static void maxAndMinNumber() {
        int[] array = new int[]{1, 5, 2, 3, 40, 0};
        int counter = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= counter) {
                counter = array[i];
            }
        }
        System.out.println("Максимальное число будет:" + counter);
        int mincounter = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= mincounter) {
                mincounter = array[i];
            }
        }
        System.out.println("Минимальное число будет:" + mincounter);

    }


    public static void shiftNumber() {
        Scanner num = new Scanner(System.in);
        System.out.println("введите число сдвига");
        int n = num.nextInt();
        if (n == 0) {
            System.out.println("нельзя ввести 0");
            return;
        }
        int[] newArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < abs(n); i++) {
            if (n < 0) {

                //сдвиг влево
                for (int j = 0; j < newArray.length - 1; j++) {
                    int swipe = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = swipe;
                }

            } else if (n > 0) {
                //Сдвиг вправо
                for (int k = newArray.length - 1; k > 0; k--) {
                    int swipe = newArray[k];
                    newArray[k] = newArray[k - 1];
                    newArray[k - 1] = swipe;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean checkBalance(int[] array) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];

            for (int j = i + 1; j < array.length; j++) {
                right += array[j];
            }

            if (left == right) {
                return true;
            }

            right = 0;
        }

        return false;
    }

}



