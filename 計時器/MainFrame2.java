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


public class MainFrame2 extends JFrame  {

    private JLabel lab1 = new JLabel("");
    private JLabel lab2 = new JLabel("");
    private JLabel lab3 = new JLabel("");
    private JLabel lab4 = new JLabel("");
    private JLabel lab5 = new JLabel("");
    private JLabel lab6 = new JLabel("");
    private JLabel lab7 = new JLabel(":");
    private JLabel lab8 = new JLabel(":");
    private ImageIcon icon0 = new ImageIcon("0.jpg");
    private ImageIcon icon1 = new ImageIcon("1.jpg");
    private ImageIcon icon2 = new ImageIcon("2.jpg");
    private ImageIcon icon3 = new ImageIcon("3.jpg");
    private ImageIcon icon4 = new ImageIcon("4.jpg");
    private ImageIcon icon5 = new ImageIcon("5.jpg");
    private ImageIcon icon6 = new ImageIcon("6.jpg");
    private ImageIcon icon7 = new ImageIcon("7.jpg");
    private ImageIcon icon8 = new ImageIcon("8.jpg");
    private ImageIcon icon9 = new ImageIcon("9.jpg");
    private ImageIcon icon10 = new ImageIcon("9.jpg");
    private ImageIcon[] aa= {icon0,icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10};
    private JButton jbtRaset = new JButton("Raset");
    private JButton jbtPause = new JButton("Pause");
    private JButton jbtGo = new JButton("Go");
    private JButton jbtExit = new JButton("Exit");
    private JPanel jpl1 = new JPanel();
    private Container cp;
    private Timer t1;
    private int x = 0, y = 0 , a = 0 , b = 0 , c = 0 , d = 0 , f = 0;

    public MainFrame2() {
        init();
    }

    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(null);

        cp.setBackground(new Color(0,0,0));
        
        lab1.setBounds(50,50,50,50);
        lab2.setBounds(110,50,50,50);
        lab7.setBounds(140,50,10,50);
        lab3.setBounds(170,50,50,50);
        lab4.setBounds(230,50,50,50);
        lab8.setBounds(260,50,10,50);
        lab5.setBounds(290,50,50,50);
        lab6.setBounds(350,50,50,50);

        jbtRaset.setBounds(50,200,100,50);
        jbtPause.setBounds(160,200,100,50);
        jbtGo.setBounds(270,200,100,50);
        jbtExit.setBounds(380,200,100,50);
        //lab1.addMouseListener(frm);




/*         lab1.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab2.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab3.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab4.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab5.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab6.setFont(new Font("Tahoma",Font.PLAIN,40));
        lab7.setFont(new Font("Tahoma",Font.PLAIN,20));
        lab8.setFont(new Font("Tahoma",Font.PLAIN,20)); */
        lab1.setIcon(aa[0]);
        lab2.setIcon(aa[0]);
        lab3.setIcon(aa[0]);
        lab4.setIcon(aa[0]);
        lab5.setIcon(aa[0]);
        lab6.setIcon(aa[0]);
        




        lab1.setOpaque(true);
        cp.add(lab1);
        cp.add(lab2);
        cp.add(lab3);
        cp.add(lab4);
        cp.add(lab5);
        cp.add(lab6);
        cp.add(lab7);
        cp.add(lab8);
        cp.add(jbtRaset);
        cp.add(jbtPause);
        cp.add(jbtGo);
        cp.add(jbtExit);

        /* t1 = new Timer(1, new ActionListener() {
            public void actionPerformed(ActionEvent aea){
                x++;
                lab6.setText(Integer.toString(x));
                if(x == 10){
                    x = 0 ;
                    lab6.setText(Integer.toString(x));
                    y++;
                    lab5.setText(Integer.toString(y));
                    if(y == 6){
                        y = 0;
                        lab5.setText(Integer.toString(y));
                        a++;
                        lab4.setText(Integer.toString(a));
                        if(a == 10){
                            a = 0 ;
                            lab4.setText(Integer.toString(a));
                            b++;
                            lab3.setText(Integer.toString(b));
                            if( b ==  6){
                                b = 0 ;
                                lab3.setText(Integer.toString(b));
                                c++;
                                lab2.setText(Integer.toString(c));
                                if(c == 10){
                                    c = 0;
                                    lab2.setText(Integer.toString(c));
                                    d++;
                                    lab1.setText(Integer.toString(d));
                                    if(d == 10){
                                        t1.stop();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }); */
        
        t1 = new Timer(1, new ActionListener() {
            public void actionPerformed(ActionEvent aea){
                x++;
                lab6.setIcon(aa[x]);
                if(x == 10){
                    x = 0 ;
                    lab6.setIcon(aa[x]);
                    y++;
                    lab5.setIcon(aa[y]);
                    if(y == 6){
                        y = 0;
                        lab5.setIcon(aa[y]);
                        a++;
                        lab4.setIcon(aa[a]);
                        if(a == 10){
                            a = 0 ;
                            lab4.setIcon(aa[a]);
                            b++;
                            lab3.setIcon(aa[b]);
                            if( b ==  6){
                                b = 0 ;
                                lab3.setIcon(aa[b]);
                                c++;
                                lab2.setIcon(aa[b]);
                                if(c == 10){
                                    c = 0;
                                    lab2.setIcon(aa[c]);
                                    d++;
                                    lab1.setIcon(aa[d]);
                                    if(d == 10){
                                        t1.stop();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });




        jbtGo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent start){
                t1.start();
            }
        });

        jbtPause.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent stop){
                t1.stop();
            }
        });
        jbtExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent stop){
                System.exit(0);
            }
        });
        jbtRaset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent stop){
                t1.stop();
                x = 0;
                y = 0;
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                lab1.setIcon(aa[d]);
                lab2.setIcon(aa[d]);
                lab3.setIcon(aa[d]);
                lab4.setIcon(aa[d]);
                lab5.setIcon(aa[d]);
                lab6.setIcon(aa[d]);

            }
        });
        
    }
}