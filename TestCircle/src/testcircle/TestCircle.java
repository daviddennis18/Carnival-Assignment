/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcircle;

/**
 *
 * @author daden2468
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle spot = new Circle();
        
        spot.setRadius(5);
        
        
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle area: " + spot.area());
        System.out.println("Circle circumference: " + spot.circumference());
    }
    
}
