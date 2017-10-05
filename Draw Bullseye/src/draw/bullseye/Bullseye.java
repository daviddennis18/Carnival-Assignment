package draw.bullseye;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;




public class Bullseye extends JPanel {
    Random rand = new Random();
    public final int C1 = rand.nextInt(256);
    public final int C2 = rand.nextInt(256);
    public final int C3 = rand.nextInt(256);
    
    public void paintComponent(Graphics g){
        
        
        super.paintComponent(g);
        
        
        
        g.setColor(new Color(C1,C2,C3));
        g.fillOval(10, 10, 200, 200);
        
        g.setColor(new Color(C2,C1,C3));
        g.fillOval(30, 30, 160, 160);
        
        g.setColor(new Color(C1,C3,C2));
        g.fillOval(50, 50, 120, 120);
        
        g.setColor(new Color(C2,C3,C1));
        g.fillOval(70, 70, 80, 80);
        
        g.setColor(new Color(C3,C1,C2));
        g.fillOval(90, 90, 40, 40);
        
        
        
        
        
        
        
        
        
    }
}
