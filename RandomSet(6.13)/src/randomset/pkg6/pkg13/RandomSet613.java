/*
 * David Dennis
 * 02/10/2017
 * Random Set Choice 6.13
 */
package randomset.pkg6.pkg13;

/**
 * This class Generates random elements from arrays. pre: None post: Three
 * numbers are printed out randomly from the sets
 */
public class RandomSet613 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select;
        //create an array for each set
        int[] set1 = {2, 4, 6, 8, 10};
        int[] set2 = {3, 5, 7, 9, 11};
        int[] set3 = {6, 10, 14, 18, 22};

        //code to chose a number from each array and print it
        select = rand();
        System.out.println("The number from the first set is " + set1[select]);
        select = rand();
        System.out.println("The number from the second set is " + set2[select]);
        select = rand();
        System.out.println("The number from the third set is " + set3[select]);
    }

    //create a method to choose a random number from 0-4
    /**
     * This method chooses a random number between 0 and 4 inclusive pre: none
     * post: The random number is returned
     */
    public static int rand() {
        int x = (int) Math.floor(Math.random() * 5);
        return x;
    }

}
