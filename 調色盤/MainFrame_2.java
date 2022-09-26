import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;



/**
 * MainFrame
 */
public class MainFrame_2 extends JFrame{
    private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnApply = new JButton("Apply");
    private JLabel jlbR = new JLabel("red");
    private JLabel jlbG = new JLabel("green");
    private JLabel jlbB = new JLabel("blue");
    private JLabel jlbColor = new JLabel();
    private JTextField jtfAbox = new JTextField();
    private JTextField jtfBbox = new JTextField();
    private JTextField jtfCbox = new JTextField();
    private Container cp;
    //private ImageIcon img = new ImageIcon("29579.jpg"); 
    public MainFrame_2(){
        init();
    }
    public void init(){
        cp = this.getContentPane();
        cp.setLayout(null);
        this.setBounds(100, 150, 500, 400);
        this.setTitle("Bo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jlbR.setBounds(80, 10, 30, 50);
        cp.add(jlbR);
        jlbG.setBounds(180, 10, 50, 50);
        cp.add(jlbG);
        jlbB.setBounds(280, 10, 30, 50);
        cp.add(jlbB);
        jbtnExit.setBounds(380, 10, 100, 30);
        cp.add(jbtnExit);
        jbtnApply.setBounds(380, 60, 100, 30);
        cp.add(jbtnApply);
        jtfAbox.setBounds(50, 60, 80, 30);
        cp.add(jtfAbox);
        jtfBbox.setBounds(160, 60, 80, 30);
        cp.add(jtfBbox);
        jtfCbox.setBounds(270, 60, 80, 30);
        cp.add(jtfCbox);

        jbtnApply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                jlbColor.setBackground(new Color(Integer.parseInt(jtfAbox.getText()),Integer.parseInt(jtfBbox.getText()),Integer.parseInt(jtfCbox.getText()))); 
                jlbColor.setOpaque(true);
                jlbColor.setBounds(20, 100, 430, 230);
                cp.add(jlbColor);  
            }
        });
        jbtnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ea ){
                System.exit(0);
            }
        });
    }
}