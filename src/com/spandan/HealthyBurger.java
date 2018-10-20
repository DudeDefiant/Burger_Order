package com.spandan;

import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    private boolean avocado;
    private boolean sautedSpinach;

    public HealthyBurger() {
        this.avocado = false;
        this.sautedSpinach = false;
        setName("Healthy Burger");
        setBreadRoll("Brown Rye");
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMenu() {
        super.displayMenu();
        System.out.println(getName() + " special add ons:");
        System.out.println();
        System.out.println("Avocado                  ---------------           50.00");
        System.out.println("Sauted Spinach           ---------------           40.00");
        System.out.println();
        System.out.println("Grand Total              ---------------          285.00");
        System.out.println();
    }

    private void addAvocado() {
        avocado = true;
        addPrice(50.00);
    }

    private void addSautedSpinach() {
        sautedSpinach = true;
        addPrice(40.00);
    }

    @Override
    public void addons() {
        int review = 0;
        do {
            super.addons();
            boolean hasNextSpecial;
            int i;
            System.out.println();
            System.out.println(getName() + " special additions: ");
            System.out.println();

            System.out.println("Do you want Avocado in your " + getName() + " ?( 50.00)");
            System.out.println("Enter 1 to add Avocado, 0 to move on.");
            hasNextSpecial = scanner.hasNextInt();
            if (hasNextSpecial) {
                i = scanner.nextInt();
                if (i == 1) {
                    addAvocado();
                    System.out.println("Avocado was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.");
            }

            System.out.println("Do you want Sauted Spinach in your " + getName() + " ?( 40.00)");
            System.out.println("Enter 1 to add Sauted Spinach, 0 to move on.");
            hasNextSpecial = scanner.hasNextInt();
            if (hasNextSpecial) {
                i = scanner.nextInt();
                if (i == 1) {
                    addSautedSpinach();
                    System.out.println("Sauted Spinach was added to your " + getName() + ".\n");
                }
            } else {
                System.out.println("Invalid option! Choosing to skip your addition.\n");
            }

            System.out.println("Special additions:");
            if (avocado)
                System.out.println("Avocado");
            if (sautedSpinach)
                System.out.println("Sauted Spinach");
            System.out.println();
            System.out.println("Sub Total: " + getPrice());

            System.out.println("Enter 1 to change your addons, 0 to continue");
            hasNextSpecial = scanner.hasNextInt();
            if (hasNextSpecial) {
                review = scanner.nextInt();
                if(review == 1) {
                    reset();
                    avocado = false;
                    sautedSpinach = false;
                }
            }
        } while (review == 1);
        System.out.println("Order Successful");
        System.out.println("Order placed: " + getName() + " \nGrand Total: " + getPrice());
    }

}
