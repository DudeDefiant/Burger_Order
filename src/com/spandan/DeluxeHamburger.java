package com.spandan;

public class DeluxeHamburger extends Hamburger {

    private boolean chips = true;
    private boolean drinks = true;

    public DeluxeHamburger() {

        setName("Deluxe Hamburger");
        addPrice(110.00);
    }

    @Override
    public void displayMenu() {

        System.out.println();
//        System.out.println("==================================WELCOME===================================\n");
//        System.out.println("====================================TO======================================\n");
//        System.out.println("===============================BILL'S BURGER================================\n");
//        System.out.println();
//        System.out.println("====================================MENU====================================");
        System.out.println();
        System.out.println("               You have selected \n               " + getName() + ":");
        System.out.println("Regular Hamburger:       ---------------          100.00");
        System.out.println("Chips:  (included)       ---------------           45.00");
        System.out.println("Drinks: (included)       ---------------           65.00");
        System.out.println();
        System.out.println("Grand Total:             ---------------          210.00");
        System.out.println();
    }


}
