package com.spandan;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chooseBurger, i;
        boolean mainSelection, hasNextInt, UI = true;

        Hamburger hamburger = new Hamburger();
        HealthyBurger healthyBurger = new HealthyBurger();
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();

        while(UI) {
            System.out.println();
            System.out.println("==================================WELCOME===================================\n");
            System.out.println("====================================TO======================================\n");
            System.out.println("===============================BILL'S BURGER================================\n");
            //            System.out.print("You are at: ");
            System.out.println("                            Burgers Available: \n");
            System.out.println("                1. Regular Hamburger \n");
            System.out.println("                2. Healthy Burger \n");
            System.out.println("                3. Deluxe Hamburger \n");
            System.out.println("\n \n    Press corresponding numbers to view Menu of Respective Package \n");
            System.out.println("    Press 0 to exit \n");

            mainSelection = scanner.hasNextInt();
            if (mainSelection) {
                chooseBurger = scanner.nextInt();
                switch(chooseBurger) {
                    case 1: {
                        hamburger.displayMenu();
                        System.out.println("\n Press 1 to Order a Regular Hamburger and select add ons.");
                        System.out.println(" Press 0 to back to main menu.");
                        hasNextInt = scanner.hasNextInt();
                        if(hasNextInt) {
                            i = scanner.nextInt();
                            if(i == 1) {
                                hamburger.addons();
                                System.out.println("Want to Order more? (Press 1)");
                                hasNextInt = scanner.hasNextInt();
                                if(hasNextInt) {
                                    i = scanner.nextInt();
                                    if( i != 1)
                                        UI = false;
                                }
                            } else
                                continue;
                        } else
                            continue;
                        break;
                    }

                    case 2: {
                        healthyBurger.displayMenu();
                        System.out.println("\n Press 1 to Order a Healthy Burger and select add ons.");
                        System.out.println(" Press 0 to back to main menu.");
                        hasNextInt = scanner.hasNextInt();
                        if(hasNextInt) {
                            i = scanner.nextInt();
                            if(i == 1) {
                                healthyBurger.addons();
                                System.out.println("Want to Order more? (Press 1)");
                                hasNextInt = scanner.hasNextInt();
                                if(hasNextInt) {
                                    i = scanner.nextInt();
                                    if( i != 1)
                                        UI = false;
                                }
                            } else
                                continue;
                        } else
                            continue;
                        break;
                    }

                    case 3: {
                        deluxeHamburger.displayMenu();
                        System.out.println("\n Press 1 to Order a Deluxe Hamburger.");
                        System.out.println(" Press 0 to back to main menu.");
                        hasNextInt = scanner.hasNextInt();
                        if(hasNextInt) {
                            i = scanner.nextInt();
                            if(i == 1) {
                                System.out.println("Order Successful");
                                System.out.println("Order placed: " + deluxeHamburger.getName() + " \n" +
                                        "Grand Total: " + deluxeHamburger.getPrice());
                                System.out.println("Want to Order more? (Press 1)");
                                hasNextInt = scanner.hasNextInt();
                                if(hasNextInt) {
                                    i = scanner.nextInt();
                                    if( i != 1)
                                        UI = false;
                                }
                            }else
                                continue;
                        } else
                            continue;
                        break;
                    }

                    case 0: {

                        UI = false;
                        break;
                    }
                }
            }

        }

        System.out.println("Thanks for visiting our store! \n");
        System.out.println("Have a great day! \n \nRegards, \nBill's Burger.");
    }
}
