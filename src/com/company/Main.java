package com.company;

public class Main {

    public static void main(String[] args) {


        // Задача 1

        int i = 1;
        while (i<= 10) {
            System.out.print(i++ + " ");
        }
        System.out.print("\n");
        for (i = 10;i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        // Задача 2

        int friday = 3;
        for (; friday < 31; friday = friday +7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3

        int a = 1817;
        for (; a <= 2117; a = a + 79) {
            if (a > 1817)
            System.out.println(a);
        }


    }
}
