import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;


public class BgFrame extends JFrame  {
    private JTextField Ffd1 = new JTextField();
    private JTextField Ffd2 = new JTextField();
    private JTextField Ffd3 = new JTextField();
    private JButton jbtExit = new JButton("Exit"); 
    private JButton jbtLogin = new JButton("Login"); 
    private Container cp;
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();

    public BgFrame(){
        init();
    }


    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,400,100);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        cp.setLayout(new BorderLayout());
        jpl1.setLayout(new GridLayout(1,5,5,5));
        jpl2.setLayout(new GridLayout(1,2,5,5));
        jpl1.add(Ffd1);
        jpl1.add(Ffd2);
        jpl1.add(Ffd3);
        jpl2.add(jbtExit);
        jpl2.add(jbtLogin);

        cp.add(jpl1,BorderLayout.CENTER);
        cp.add(jpl2,BorderLayout.SOUTH);


        jbtExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Exit){
                BgFrame.this.dispose();
            }
        });
        jbtLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Login){
                MeanFrame.cp.setBackground(new Color(Integer.parseInt(Ffd1.getText()),Integer.parseInt(Ffd3.getText()),Integer.parseInt(Ffd3.getText())));
            }
        });
    }

}