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
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;


public class MainFrame5 extends JFrame  {
    private JButton jbtAdd = new JButton("ADD");
    private JButton jbte = new JButton("ADDe");
    private Container cp;
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();
    private int i = 0;
    ArrayList<Thread> als = new ArrayList<Thread>();
    ArrayList<JLabel> als_2 = new ArrayList<JLabel>();

    public MainFrame5(){
        init();
    }


    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());

        jpl1.add(jbtAdd);
        jpl1.add(jbte);


        cp.add(jpl1,BorderLayout.NORTH);
        cp.add(jpl2,BorderLayout.CENTER);
        


        jbtAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent add){
                Bee be = new Bee();
                Thread be_1 = new Thread(be);
                jpl2.add(be);
                als.add(be_1);
                als_2.add(be);
                be_1.start();
            }
        });

        jbte.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent dd){
                als.get(i).stop();
                als_2.get(i).setEnabled(false);
                i++;
            }
        });
    }
}