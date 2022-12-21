/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shachence;
import java.awt.*;    
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;    
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author martinvr
 */
public class Shah {

    
  
JFrame frameObj;    
  
// constructor  
Shah() throws IOException  
{    
frameObj = new JFrame();    
  
URL iconURL = getClass().getResource("Untitled-1(2).png");
  /*    ImageIcon peshka = new ImageIcon(this.getClass().getResource("C:\\Users\\martinvr\\Downloads\\s8XND(2).png")); */
JPanel[][] paneli=new JPanel[8][8];
JToggleButton[][] figuri = new JToggleButton[8][8];
for(int i=0;i<8;i++) {
    for(int j=0;j<8;j++) {
        
      paneli[i][j] = new JPanel();
      frameObj.add(paneli[i][j]);

      if((i%2 == 0 && j%2 != 0) || (i%2 != 0 && j%2==0)) {
          
          paneli[i][j].setBackground(new Color(139, 98, 57));
          
      }
      if((i%2 != 0 && j%2!= 0) || (i%2==0 && j%2==0)) {
          
          paneli[i][j].setBackground(new Color(255, 231, 182));
          
      }
      
    }
    
}
for(int i=0;i<8;i++) {
    for(int j=0;j<8;j++) {
        if(i==0 || i==1 || i==6 || i==7) {
     figuri[i][j] = new JToggleButton(); 
      paneli[i][j].add(figuri[i][j]);  
    }
        if(i==0 || i==1) {
            
            figuri[i][j].setIcon(new ImageIcon(ImageIO.read(getClass().getResource("Untitled-1(2).png"))));

            figuri[i][j].setContentAreaFilled(false);

            
        } 
      
      
    }
    
}


/*
frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);  
frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);  
frameObj.add(btn7); frameObj.add(btn8); frameObj.add(btn9);    
// setting the grid layout   
// a 3 * 3 grid is created with the horizontal gap 20   
// and vertical gap 25
*/
frameObj.setLayout(new GridLayout(8, 8, 0, 0));    
frameObj.setSize(900, 900);    
frameObj.setVisible(true);    
}  
// main method  
public static void main(String argvs[]) throws IOException   
{        
        new Shah();

}    
  
    
}
