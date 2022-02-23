package com.si;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int enterScan;
        String[] menuItem = {"Exit", "Car", "Bicycle", "Mono"};
        for (int i = 1; i < menuItem.length; i++) {
            System.out.println((i) + "-" + menuItem[i]);
        }
        System.out.println((0) + "-" + menuItem[0]);
        System.out.println("выбрать пунк меню :");

        Scanner scanner = new Scanner(System.in);
        enterScan = scanner.nextInt();

        while (enterScan > 0 ) {
            switch ( enterScan) {
                case 1:
//                    Cars
                    Scanner scanner1 = new Scanner(System.in);
                    Car cars = new Car();
                    Transport transport = new Transport();
                    System.out.println("Enter name cars");
                    cars.setNameTransport(scanner1.nextLine());
                    transport.dry();
                    cars.infoCar(cars.getNameTransport());
                    break;
                case 2:
//                    Bicycle
                    Scanner scanner2 = new Scanner(System.in);
                    Bicycle bicycle = new Bicycle();
                    Transport transport1 = new Transport();
                    System.out.println("Enter name Bicycle");
                    bicycle.setNameTransport(scanner2.nextLine());
                    transport1.dry();
                    bicycle.infoCar(bicycle.getNameTransport());
                    break;
                case 3:
//                    Mono
                    Scanner scanner3 = new Scanner(System.in);
                    Mono mono = new Mono();
                    Transport transport2 = new Transport();
                    System.out.println("Enter name mono");
                    mono.setNameTransport(scanner3.nextLine());
                    transport2.dry();
                    mono.infoCar(mono.getNameTransport());
                    break;
                default:
                    break;
            }
                if (enterScan > menuItem.length) {
                    System.out.println("Select correct menu item :");
                    enterScan = scanner.nextInt();
                } else {
                    System.out.println(" 1-Enter Car \n 2-Enter Bicycle\n 3-Enter Mono\n 0-Exit\n Select menu item : ");
                    enterScan = scanner.nextInt();
                }
                if (enterScan == 0) {
                    break;
                }
                System.out.println("\n Enter menu item :");
                enterScan = scanner.nextInt();
            }
        }
    }
