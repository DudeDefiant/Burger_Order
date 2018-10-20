package com.spandan;

import java.util.Objects;
import java.util.Scanner;

public class Hamburger {


    private String name;
    private String breadRoll;
    boolean meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean ketchup;
    private boolean additionals;
    private int reviewAddons;

    public Hamburger() {
        this.name = "Hamburger";
        this.breadRoll = "Regular";
        this.meat = true;
        this.price = 100.00;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.ketchup = false;
        this.additionals = true;
        this.reviewAddons = 0;

    }

    Scanner scanner = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public double getPrice() {
        return price;
    }

    public void addPrice(double price) {
        this.price += price;
    }

    public String getName() {
        return name;
    }

    private void addLettuce() {
        lettuce = true;
        price += 20.00;
    }

    private void addTomato() {
        tomato = true;
        price += 25.00;
    }

    private void addCarrot() {
        carrot = true;
        price += 40.00;
    }

    private void addKetchup() {
        ketchup = true;
        price += 10.00;
    }

    public void reset() {
        this.price = 100.00;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.ketchup = false;
    }

    public void addons() {
        int i;
        boolean hasNextInt;
        do {

            System.out.println();
            System.out.println("Do you want lettuce in your " + getName() + " ? ( 20.00)");
            System.out.println("Enter 1 to add lettuce, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addLettuce();
                    System.out.println("Lettuce was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want tomato in your " + getName() + " ? ( 25.00)");
            System.out.println("Enter 1 to add tomato, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addTomato();
                    System.out.println("Tomato was added to your " + getName() + ". \n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want Carrot in your " + getName() + " ? ( 40.00)");
            System.out.println("Enter 1 to add Carrot, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addCarrot();
                    System.out.println("Carrot was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want Ketchup in your " + getName() + " ?( 10.00)");
            System.out.println("Enter 1 to add Ketchup, 0 to move on.");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                i = scanner.nextInt();
                if (i == 1) {
                    addKetchup();
                    System.out.println("Ketchup was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.\n");
            }

            System.out.println("You have chosen to add:");
            if (lettuce)
                System.out.println("lettuce");
            if (tomato)
                System.out.println("tomato");
            if (carrot)
                System.out.println("carrot");
            if (ketchup)
                System.out.println("ketchup");
            System.out.println();
            System.out.println("Sub Total: " + getPrice());

            if (Objects.equals(getName(), "Hamburger")) {
                System.out.println("Enter 1 to change your addons, 0 to continue");
                hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    reviewAddons = scanner.nextInt();
                    if(reviewAddons == 1)
                        reset();
                }
            }
        } while (reviewAddons == 1);
        System.out.println();
        if (Objects.equals(getName(), "Hamburger")) {

            System.out.println("Order Successful");
            System.out.println("Order placed: " + getName() + " \nGrand Total: " + getPrice());
        }
    }

    public void displayMenu() {

        System.out.println();
//        System.out.println("==================================WELCOME===================================\n");
//        System.out.println("====================================TO======================================\n");
//        System.out.println("===============================BILL'S BURGER================================\n");
//        System.out.println();
//        System.out.println("====================================MENU====================================");
        System.out.println();
        System.out.println("               You have selected \n               " + getName() + ":");
        System.out.println("Base price:              ---------------          100.00");
        System.out.println("Addons:");
        System.out.println("Lettuce                  ---------------           20.00");
        System.out.println("Tomato                   ---------------           25.00");
        System.out.println("Carrot                   ---------------           40.00");
        System.out.println("Ketchup                  ---------------           10.00");
        System.out.println();
        System.out.println("Total:                   ---------------          195.00");
        System.out.println();
    }
}
