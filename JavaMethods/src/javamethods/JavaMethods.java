/*
 * David Dennis
 * 28 sept 2017
 * Method testing
 */
package javamethods;

import java.util.Scanner;

/**
 * Method Testing
 *
 * @author daden2468
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int select = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from the following:");
        System.out.println("1. Select 1 to draw a roof.");
        System.out.println("2. Select 2 to draw a base.");
        System.out.println("3. Select 3 to draw a walk.");

        select = input.nextInt();
        if (select == 1) {
            addRoof();
        } else if (select == 2) {
            addBase();
        } else {
            addWalk();
        }
    }

    /**
     * This method prints out the roof pre: none post: The roof shape is printed
     * out
     */
    public static void addRoof() {
        System.out.println("   \u002F\\  ");
        System.out.println("  \u002F  \\  ");
        System.out.println(" \u002F    \\  ");
        System.out.println("\u002F      \\  ");
    }

    /**
     * This method prints out the base pre: none post: The base shape is printed
     * out
     */
    public static void addBase() {
        System.out.println("_______");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("-------");
    }

    /**
     * This method prints out the walk pre: none post: The walk shape is printed
     * out
     */
    public static void addWalk() {
        System.out.println("  **  ");
        System.out.println("  **************");
    }

}
