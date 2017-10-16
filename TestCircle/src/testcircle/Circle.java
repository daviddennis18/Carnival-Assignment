/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcircle;

/**
 * Circle Class
 */
public class Circle {
    private final double PI = 3.14;
    private double radius;
    
    /**
     * Constructor
     * pre: none
     * post: a Circle object is created, its radius is initialized to 1
     */
    public Circle(){
        radius = 1;     //Default radius
    }
    
    /**
     * Sets the radius to a double value
     * pre: a double variable is entered.
     * post:the radius is set to a double value
     */
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    /**
     * Returns the value of the area of the circle 
     * pre: none
     * post: the value of the area of the circle is returned 
     */
    public double area(){
        double circleArea;
        
        circleArea = PI*radius*radius;
        return(circleArea);
    }
    /**
     * calculates the circumference
     * pre: none
     * post: returns the circumference
     */
    public double circumference(){
        double circum = 2*PI*radius;
        return(circum);
    }
    
    
    /**
     * Returns the radius of the circle
     * pre: none
     * post: returns the radius of the circle
     */
    public double getRadius(){
        return(radius);
    }
    
    
    
    
}
