package org.example;

public class TestProgrammers {
    public static void main(String[] args) {
        // Create two Programmer objects and assign values to instance variables
        Programmer programmer1 = new Programmer("John", 28, true);
        Programmer programmer2 = new Programmer("Sarah", 35, false);

        // Call methods for the first Programmer object
        programmer1.drinkCoffee();
        programmer1.printDetails();

        // Call methods for the second Programmer object
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
