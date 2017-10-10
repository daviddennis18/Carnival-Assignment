/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.rolling.pkg7.pkg17;

import java.security.SecureRandom;
import java.util.*;

/**
 *
 * @author daden2468
 */
public class DiceRolling717 {

    private static final SecureRandom randomNumbers = new SecureRandom();
    static int counter = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] c = new int[13];
        for (int i = 0; i < 36000000; i++) {
            int check = rollDice();
            switch (check) {
                case 2:
                    c[2]++;
                    break;
                case 3:
                    c[3]++;
                    break;
                case 4:
                    c[4]++;
                    break;
                case 5:
                    c[5]++;
                    break;
                case 6:
                    c[6]++;
                    break;
                case 7:
                    c[7]++;
                    break;
                case 8:
                    c[8]++;
                    break;
                case 9:
                    c[9]++;
                    break;
                case 10:
                    c[10]++;
                    break;
                case 11:
                    c[11]++;
                    break;
                case 12:
                    c[12]++;
                    break;

            }

        }
        System.out.println("2's: " + c[2]);
        System.out.println("3's: " + c[3]);
        System.out.println("4's: " + c[4]);
        System.out.println("5's: " + c[5]);
        System.out.println("6's: " + c[6]);
        System.out.println("7's: " + c[7]);
        System.out.println("8's: " + c[8]);
        System.out.println("9's: " + c[9]);
        System.out.println("10's: " + c[10]);
        System.out.println("11's: " + c[11]);
        System.out.println("12's: " + c[12]);

    }

    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values
        return (sum);
    }
}
