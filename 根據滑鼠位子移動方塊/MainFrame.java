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


public class MainFrame extends JFrame  {

    private JLabel lab1 = new JLabel("    ");
    private JPanel jpl1 = new JPanel();
    private Container cp;
    private Boolean a = false;
    private Timer t1;
    private int x = 0, y = 0 , x3 = 0 , y3 = 0;
    private double c , m;

    public MainFrame() {
        init();
    }

    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jpl1.setLayout(null);
        cp.add(jpl1,BorderLayout.CENTER);



        lab1.setBounds(x,y,50,50);
        //lab1.addMouseListener(frm);

        lab1.setBackground(new Color(0,0,0));
        lab1.setOpaque(true);
        jpl1.add(lab1);
        


    lab1.addMouseListener(new MouseListener(){
    public void mouseDragged(MouseEvent c) {
        //System.out.println("Dragged");
    }

    public void mouseMoved(MouseEvent b) {
        //System.out.println("Moved");
    }
    public void mouseClicked(MouseEvent cd){
        System.out.println("Clicked1");
        a = true;
    }
    public void mouseEntered(MouseEvent a){
        //System.out.println("Entered");
    }
    public void mouseExited(MouseEvent a){
        //System.out.println("Exited");
    }
    public void mousePressed(MouseEvent a){
        //System.out.println("Pressed");
    }
    public void mouseReleased(MouseEvent a){
        //System.out.println("Released");
    }
    });



jpl1.addMouseListener(new MouseListener(){
    public void mouseDragged(MouseEvent c) {
        //System.out.println("Dragged");
    }

    public void mouseMoved(MouseEvent b) {
        //System.out.println("Moved");
    }
    public void mouseClicked(MouseEvent dd){
        if(SwingUtilities.isLeftMouseButton(dd)){
            System.out.println("Clicked2");
            System.out.print(a);
            int x2 = dd.getX();
            int y2 = dd.getY();
            System.out.println("y2 = " + y2);
            System.out.println("x2 = " + x2);
        } 
        if( a == true){
            a = false;
            int x2 = dd.getX();
            int y2 = dd.getY();
            System.out.println("Clicked3");
            m = (double)(y2 - y)/(double)(x2 - x);
            System.out.println("y2 = " + y2);
            System.out.println("x2 = " + x2);
            System.out.println("m = " + m);
            t1 = new Timer(100, new ActionListener() {
                public void actionPerformed(ActionEvent aea){
                    if(x2 > x3 && y2 > y3){
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("y2 = " + y2);
                        System.out.println("x2 = " + x2);
                        x+=5;
                        c = (m * (x2 - x) - y2) * - 1 ;
                        y = (int)c;
                        System.out.println("c = " + c);
                        lab1.setBounds(x,y,50,50);
                        if(x >= x2 && y >= y2){
                            x3 = x;
                            y3 = y;
                            t1.stop();
                        }
                    }else if(x2 < x3 && y2 < y3){
                        System.out.println("2");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        x-=5;
                        c = (m * (x2 - x) - y2) * -1 ;
                        y = (int)c;
                        System.out.println("c = " + c);
                        lab1.setBounds(x,y,50,50);
                        if(x <= x2 && y <= y2){
                            x3 = x;
                            y3 = y;
                            t1.stop();
                        }
                    }else if(x2 > x3 && y2 < y3){
                        System.out.println("3");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        x+=5;
                        c = (m * (x2 - x) - y2) * -1 ;
                        /* y-=5;
                        c = ((y2 - y)/m - x2)* -1 ; */
                        y = (int)c;
                        System.out.println("c = " + c);
                        lab1.setBounds(x,y,50,50);
                        if(x >= x2 && y <= y2){
                            x3 = x;
                            y3 = y;
                            t1.stop();
                        }
                    }else if(x2 < x3 && y2 > y3){
                        System.out.println("4");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        x-=5;
                        c = (m * (x2 - x) - y2) * -1 ;
                        y = (int)c;
                        System.out.println("c = " + c);
                        lab1.setBounds(x,y,50,50);
                        if(x <= x2 && y >= y2){
                            x3 = x;
                            y3 = y;
                            t1.stop();
                        }
                    }
                }
            }); 
            t1.start(); 
        }
    }
    public void mouseEntered(MouseEvent cc){
        //System.out.println("Entered");
    }
    public void mouseExited(MouseEvent aa){
        //System.out.println("Exited");
    }
    public void mousePressed(MouseEvent aw){
        //System.out.println("Pressed");
    }
    public void mouseReleased(MouseEvent a){
       // System.out.println("Released");
    }
    });


}

}