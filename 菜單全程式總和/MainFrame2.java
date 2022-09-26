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


    private Label Lb1 = new Label("ID : ");
    private Label Lb2 = new Label("Pw : ");
    private JTextField Ffd = new JTextField();
    //private JPasswordField Pwf = new JPasswordField();
    private JButton jbtExit = new JButton("Exit"); 
    private JButton jbtVKeyboard = new JButton("KeyBorad"); 
    private JButton jbtLogin = new JButton("Login"); 
    private Container cp;
    private JPanel jpl1 = new JPanel();

    public MainFrame2(){
        init();
    }


    public void init(){


    }

}