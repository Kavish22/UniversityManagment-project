package university.managment.system;

// Necessary imports
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
        
    Thread t;
    
    Splash() { // constructor 

            
            
         // to add image 
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         
         add(image);
         
          t = new Thread(this);
          t.start(); 
         
        // to set Frame location manully we are setting x and y axis with this method
           setLocation(150, 50);
        // to set height width and length it takes as a parameter
        setSize(1200, 720);
        // to set frames visibility cause it's by default hidden
        setVisible(true);

    }
   public void run(){
        try{
           
            // next login frame
            
                new Login();
            
        }catch (Exception e) {
            
        }
   } 

    public static void main(String[] args) {
        new Splash();
    }
}
