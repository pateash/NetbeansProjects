/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scaredbutton;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author ashish_patel
 */
public class ScaredButton {
  JFrame fr;
  JButton b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new ScaredButton().showButton();    
    }
    void showButton(){
        fr=new JFrame("Scared Button");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      try {
          UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      } catch (Exception e) {
          System.out.println("some exception occured");
      }
      SwingUtilities.updateComponentTreeUI(fr);
        
        fr.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        fr.setBounds(d.width/4, d.height/4,750  , 650);
        b=new JButton("Click me");
        fr.setResizable(false);
        fr.setLayout(new FlowLayout());
         fr.add(b);
        b.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e){
               int x=(int)(Math.random()*680);
                    int y=(int)(Math.random()*580);
                    b.setLocation(x,y);
           }
           
      });
        
        
        
        
        
    }
    
}
