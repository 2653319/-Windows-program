import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MenuDragMouseListener;
import javax.xml.crypto.Data;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.sql.Date;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.io.*;

public class Bee extends JLabel implements Runnable {
    public Timer t1;
    public int f , y , x;
    public ImageIcon iconA = new ImageIcon("fish.png");
    public ImageIcon iconB = new ImageIcon("fish2.png");
    public Boolean flag = true;

    public Bee(){
        init();
    }

    public void init(){
        int random = (int)(Math.random()*10);  //0~9
        f = random ;
        int randomY = (int)(Math.random()*500 + 100);
        y = randomY;
        int randomX = (int)(Math.random()*500);
        x  =randomX;
        Bee.this.setBounds(x,y,50,50);

        Image img = iconA.getImage();
        Image newImg = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        iconA = new ImageIcon(newImg);

        Image img2 = iconB.getImage();
        Image newImg2 = img2.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        iconB = new ImageIcon(newImg2);
        if(f >= 0.5){
            flag = false;
            this.setIcon(iconA);
        }else{
            this.setIcon(iconB);
        }

        t1 = new Timer((int)(Math.random()*1000), new ActionListener(){
            public void actionPerformed(ActionEvent aea){
                if(flag == true){
                    if(x <= 500){
                        x+=5;
                        Bee.this.setLocation(x,y);
                    }else{
                        flag = false;
                        Bee.this.setIcon(iconA);
                    }
                }else{
                    if(x >= 0){
                        x-=5;
                        Bee.this.setLocation(x,y);
                    }else{
                        flag = true;
                        Bee.this.setIcon(iconB);
                    }
                }
            }
        });
    }
    public void run(){
        t1.start();
    } 
}
