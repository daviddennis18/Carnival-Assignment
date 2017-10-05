/*
 * David Dennis 
 * Oct 04 2017
 * To draw a Bullseye
 */

package draw.bullseye;
import javax.swing.JFrame;
/**
 * David Dennis
 * Oct 04 2017
 * This class creates a panel and draws a Bullseye
 */
public class DrawBullseye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bullseye panel = new Bullseye();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);      
        application.setVisible(true);
    }
    
}
