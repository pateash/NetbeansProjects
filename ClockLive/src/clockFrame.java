
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashish_patel
 */
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
public class clockFrame extends javax.swing.JFrame {
    /**
     * Creates new form clockFrame
     */
    private int hour,minute,second;
    public clockFrame() {
          initComponents();
          this.setTitle("Clock");
          
          this.setIconImage(Toolkit.getDefaultToolkit().getImage("clock.png"));
          this.setResizable(false);
          Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
          this.setLocation(d.width/4, d.height/4);
      }
    void makeClock(){
       while(true)
       {
         String []time=new Date().toString().split(" ");
         String s[]=time[3].split(":");
        hour=Integer.parseInt(s[0]);
        minute=Integer.parseInt(s[1]);
        second=Integer.parseInt(s[2]);
           try {
               // System.out.println("After doing all things "+hour+":"+minute+":"+second);
               // System.out.println("Hello");
               Thread.currentThread().sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(clockFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
       repaint();
             this.setVisible(true);
        
         //  System.out.println("Hello Again");
       }
    }
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        g.setColor(Color.PINK);
         Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(2));
              //  g2.draw(new Line2D.Float(250,250,(int)x,(int)y));
       
        g.drawOval(100,100,300,300);
        double x=0,y=0;
         g.setColor(Color.blue);
        int rangle=(30*hour);
        if(rangle==0)
            rangle=0;

        else if(rangle >270);
        {
            int temp=rangle-270;
            rangle=270-temp;
        }
            
        double angle=Math.toRadians(rangle);


        x=(int)(80*Math.sin(angle))+250;
        y=(int)(80*Math.cos(angle))+250;  
      
       // System.out.println("The value of x and y "+x+"\t"+y);
                g2.setStroke(new BasicStroke(10));
                g2.draw(new Line2D.Float(250,250,(int)x,(int)y));
              
       // g.drawLine(250,250,(int)x,(int)y);
         
        
    //for minute
         rangle=(minute*6);
        if(rangle==0)
            rangle=0;
        else if(rangle >270);
        {
            int temp=rangle-270;
            rangle=270-temp;
        }
            
         angle=Math.toRadians(rangle);


        x=(int)(100*Math.sin(angle))+250;
        y=(int)(100*Math.cos(angle))+250;  
        
      
       // System.out.println("The value of x and y "+x+"\t"+y);
       g.setColor(Color.red);
                g2.setStroke(new BasicStroke(5));
                g2.draw(new Line2D.Float(250,250,(int)x,(int)y));
         
     // for second
         rangle=(second*6);
        if(rangle==0)
            rangle=0;
         else if(rangle >270);
        {
            int temp=rangle-270;
            rangle=270-temp;
        }
            
         angle=Math.toRadians(rangle);


        x=(int)(120*Math.sin(angle))+250;
        y=(int)(120*Math.cos(angle))+250;  
        
      
       // System.out.println("The value of x and y "+x+"\t"+y);
       g.setColor(Color.black);
                g2.setStroke(new BasicStroke(3));
                g2.draw(new Line2D.Float(250,250,(int)x,(int)y));
     
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          clockFrame fr=new clockFrame();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        fr.makeClock();    
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}