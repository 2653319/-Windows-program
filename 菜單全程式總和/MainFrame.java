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


    private Label Lb1 = new Label("ID : ");
    private Label Lb2 = new Label("Pw : ");
    private JTextField Ffd = new JTextField();
    static JPasswordField Pwf = new JPasswordField();
    private JButton jbtExit = new JButton("Exit"); 
    private JButton jbtVKeyboard = new JButton("KeyBorad"); 
    private JButton jbtLogin = new JButton("Login"); 
    private Container cp;
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();
    private JPanel jpl3 = new JPanel();
    public MainFrame(){
        init();
    }


    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jpl1.setLayout(new GridLayout(2,1,5,5));
        jpl2.setLayout(new GridLayout(2,1,5,5));
        jpl3.setLayout(new GridLayout(1,3,5,5));
        jpl1.add(Ffd);
        jpl1.add(Pwf);
        jpl2.add(Lb1);
        jpl2.add(Lb2);
        jpl3.add(jbtExit);
        jpl3.add(jbtVKeyboard);
        jpl3.add(jbtLogin);
        cp.add(jpl1,BorderLayout.CENTER);
        cp.add(jpl2,BorderLayout.WEST);
        cp.add(jpl3,BorderLayout.SOUTH);

        jbtExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Exit){
                System.exit(0);
            }
        });

        jbtLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Login){
                if(Ffd.getText().equals("h304") && Pwf.getText().equals("csie#1723") ){
                    System.out.println(jbtLogin.getText());
                    MeanFrame mean = new MeanFrame();
                    mean.setVisible(true);
            }else{
                System.out.println("error");
                }
            }
        });
        jbtVKeyboard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Keyboard){
                MainFrame4 mfr4 = new MainFrame4();
                mfr4.setVisible(true);
            }
        });
    }

}
