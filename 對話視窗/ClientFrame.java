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
import java.net.*;
import java.io.*;


public class ClientFrame extends JFrame  {
    private Container cp;
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();
    private JPanel jpl3 = new JPanel();
    private JPanel jpl4 = new JPanel();
    private JLabel ip = new JLabel("IP : ");
    private JTextField jtf1 = new JTextField("127.0.0.1");
    private JTextField jtf2 = new JTextField("1555");
    private JTextArea jta1 = new JTextArea("                                        ");
    private JLabel jbl1 = new JLabel("Port : ");
    private JButton jbtSet = new JButton("Set");
    private JButton jbtConnect = new JButton("Connect");
    private JButton jbtExit = new JButton("Exit");
    private JScrollPane jsp = new JScrollPane(jta1);

    private JTextField jtf3 = new JTextField();
    private JButton jbtSend = new JButton("Send");
    private Clie cl;
    private String st;

    public ClientFrame(){
        init();
    }

    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,700,600);
        this.setTitle("client");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jpl1.setLayout(new GridLayout(1,6,0,0));
    
        jpl1.add(ip);
        jpl1.add(jtf1);
        jpl1.add(jbl1);
        jpl1.add(jtf2);
        jpl1.add(jbtSet);
        jpl1.add(jbtConnect);
        jpl1.add(jbtExit); 
        cp.add(jpl1,BorderLayout.NORTH);
        jpl2.setLayout(new BorderLayout());
        jpl2.add(jpl4,BorderLayout.CENTER);
        jpl2.add(jsp,BorderLayout.EAST);
        cp.add(jpl2,BorderLayout.CENTER);
        jpl3.setLayout(new BorderLayout());
        jpl3.add(jtf3,BorderLayout.CENTER);
        jpl3.add(jbtSend,BorderLayout.EAST);
        cp.add(jpl3,BorderLayout.SOUTH);



        jbtSet.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                cl = new Clie(ClientFrame.this);
            }
        });
        jbtConnect.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                cl.start();
            }
        });

        jbtSend.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent start){
                cl.sendclient(jtf3.getText());
                jta1.append("\n");
                jta1.append(jtf3.getText());
                jtf3.setText("");
            }
        });
    }
    public void addjta(String str){
        jta1.append(str);
    }

}