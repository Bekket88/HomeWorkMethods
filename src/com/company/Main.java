package com.company;

public class Main {

    public static void main(String[] args) {
        defineLeapYear(2022); // задача 1
        suggestApp(0, 2000); // задача 2
        calculateDeliveryTime(75); // задача 3
        checkRepetitions("abccddefgghiijjkk"); // задача 4
        reverseArray(new int[]{3, 2, 1, 6, 5}); // задача 5
    }
    // задача 1
    public static void defineLeapYear (int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear)
        {
            System.out.println(year + " — високосный год");
        } else
            System.out.println(year + " — не високосный год.");
    }
    // задача 2
    public static void suggestApp (int osVersion, int deviceYear) {
        if (osVersion == 0 && deviceYear >= 2015) {
                System.out.println("Пожалуйста установите наше новое приложение для iOS");
            }
        else if (osVersion == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        else if (osVersion == 1 && deviceYear >= 2015) {
                System.out.println("Пожалуйста установите наше новое приложение для Android");
            }
        else if (osVersion == 1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        else {
            System.out.println("Пожалуйста введите 0 или 1");
        }
    }
    // задача 3
    public static void calculateDeliveryTime (int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется 1 день на доставку карты.");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня на доставку карты.");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня на доставку карты.");
        }
        else {
            System.out.println("Пожалуйста, посетите наш офис, чтобы получить карту.");
        }
    }
    // задача 4
    public static void checkRepetitions (String str) {
        for (int i = 1; i <= str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                System.out.print(str.charAt(i) + " - последний дублированный симовол. \n");
                break;
            }
        }
    }
    // задача 5
    public static void reverseArray (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}