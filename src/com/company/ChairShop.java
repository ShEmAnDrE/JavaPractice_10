package com.company;

import java.util.Scanner;

public class ChairShop {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client1 = new Client(); //посетитель
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Добро пожаловать в наш мебельный магазин!");
        boolean f = true;
        while (f) {
            System.out.println("\nУ нас стулья на любой вкус! Можете присеть на любой:");
            System.out.println("1 - Викторианский стул");
            System.out.println("2 - Многофункциональный стул");
            System.out.println("3 - Магический стул");
            System.out.println("Любая другая клвавиша - выход из нашего чудеснейшего магазина");
            switch (sc.nextInt()) {
                case 1:
                    VictorianChair victorianChair = chairFactory.createVictorianChair();
                    System.out.println(victorianChair);
                    System.out.println("Пожалуйста, присаживайтесь!");
                    client1.setChair(victorianChair);
                    client1.sit();
                    break;
                case 2:
                    FunctionalChair functionalChair = chairFactory.createFunctionalChair();
                    System.out.println(functionalChair);
                    System.out.println("Пожалуйста, присаживайтесь!");
                    client1.setChair(functionalChair);
                    client1.sit();
                    System.out.println("Это умный стул! Он может скадывать числа, просто введите их на панельке сбоку");
                    System.out.println("Результат вычислений : " + functionalChair.sum(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    MagicChair magicChair = chairFactory.createMagicanChair();
                    System.out.println(magicChair);
                    System.out.println("Пожалуйста присаживайтесь!");
                    client1.setChair(magicChair);
                    client1.sit();
                    System.out.println("Это магический стул! Просто хлопните в ладоши!");
                    magicChair.doMagic();
                    break;
                default:
                    f = false;
                    break;
            }
        }
        System.out.println("До свидания! Приходите еще!");
    }
}