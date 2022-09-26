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


public class MainFrame6 extends JFrame {
    private Container cp;
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();
    private JPanel jpl3 = new JPanel();
    private JPanel jpl4 = new JPanel();
    private JLabel ip = new JLabel("IP : ");
    private JTextField jtf1 = new JTextField("127.0.0.1");
    private JTextField jtf2 = new JTextField("1555");
    private JTextArea jta1 = new JTextArea("                                        ");
    private JButton jbtSet = new JButton("Set");
    private JButton jbtStart = new JButton("Start");
    private JButton jbt3 = new JButton("Exit");
    private JScrollPane jsp = new JScrollPane(jta1);

    private JTextField jtf3 = new JTextField();
    private JButton jbtSend = new JButton("Send");
    private ServerSocket svs ;  //server 得要有   
    private Socket socket ;  //server 和 client 兩個都要有
    private PrintStream outStream; //資料丟出去的串留通道
    private BufferedReader inStream; //用來接收另外一端所傳出的訊息
    private Serv sc;
    private ImageIcon icon1 = new ImageIcon("paku2.jpg");
    private ImageIcon icon2 = new ImageIcon("buff.JPG");
    private String st = "";




    public MainFrame6(){ 
        init();   
    }

    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,700,600);
        this.setTitle("server");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jpl1.setLayout(new GridLayout(1,6,0,0));
    
        Image img3 = icon1.getImage();
        Image newImg3 = img3.getScaledInstance(65,62,Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg3);
        Image img4 = icon2.getImage();
        Image newImg4 = img4.getScaledInstance(65,62,Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newImg3);

        jpl1.add(ip);
        jpl1.add(jtf1);
        jpl1.add(jtf2);
        jpl1.add(jbtSet);
        jpl1.add(jbtStart);
        jpl1.add(jbt3); 
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
            public void actionPerformed(ActionEvent set){
                sc = new Serv(MainFrame6.this);
            }
        });
        jbtStart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent start){
                sc.start();
            }
        });
        jbtSend.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent start){
                sc.sendclient(jtf3.getText());
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