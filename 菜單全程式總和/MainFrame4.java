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


public class MainFrame4 extends JFrame  {
    private int b = 0;
    private boolean Upper = false;
    private String jbtns2 = "";
    private String str = "";
    private String login ;
    private JButton jbtns[] = new JButton[50];
    private String btnLable[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","Exit","Clear","=","Submit","Upper","@","#","$","%","^","&","*","(",")"};
                                //0                                                                                                  25                                            36      37    38    39      40      
    private JLabel Lbl = new JLabel(" ");
    private Container cp ;
    private JPanel Jpl = new JPanel();

    public MainFrame4(){
        init();
    }

    public void fun(String a){
        switch (a){  //判斷get的按鈕是啥
            case "Exit":
                MainFrame4.this.dispose();
                break;
            case "Submit":
                MainFrame.Pwf.setText(Lbl.getText());    
                break;
            case "Clear":
                Lbl.setText("");
                str = "";
                break;
            case "Upper":
                if(Upper == false){
                    Upper = true;
                }else{
                    Upper = false;
                }
                break;
            default :
                if(Upper == true){
                    str = str + a.toUpperCase();
                }else{
                    str = str + a;
                }
        }
        Lbl.setText(str);
    }    


    public void init(){
        cp = this.getContentPane();
        this.setBounds(100,200,500,400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.add(Lbl,BorderLayout.NORTH);
        Jpl.setLayout(new GridLayout(5,10,3,3));

        for(int i = 0 ; i < 50 ; i++){  //先新增按鈕
            jbtns[i] = new JButton(btnLable[i]);
            Jpl.add(jbtns[i]);
        } 

        while(b < 50){  //隨機排列
            int random = (int)(Math.random()*50);
            jbtns2 = btnLable[random];
             for(int l = 0 ; l < b ; l++){   //判斷有沒有重複的
                if(jbtns2 == jbtns[l].getText()){
                    break;
                 }else if(l == b-1){
                    jbtns[b].setText(btnLable[random]);
                    b++;
                    break;
                }
            } 
            if(b == 0){         //第一次不用判斷
                jbtns[b].setText(btnLable[random]);
                b++;
            }
        } 

        cp.add(Jpl, BorderLayout.CENTER);
        Lbl.setHorizontalAlignment(JLabel.RIGHT);

        jbtns[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[0].getText());
                }
        });
        jbtns[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[1].getText());
                }
        });

        jbtns[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[2].getText());
                }
        });
        jbtns[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[3].getText());
                }
        });
        jbtns[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[4].getText());
                }
        });
        jbtns[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[5].getText());
                }
        });
        jbtns[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[6].getText());
                }
        });
        jbtns[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[7].getText());
                }
        });
        jbtns[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[8].getText());
                }
        });
        jbtns[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[9].getText());
                }
        });
        jbtns[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[10].getText());
                }
        });
        jbtns[11].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[11].getText());
                }
        });
        jbtns[12].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[12].getText());
                }
        });
        jbtns[13].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[13].getText());
                }
        });
        jbtns[14].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[14].getText());
                }
        });
        jbtns[15].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[15].getText());
                }
        });
        jbtns[16].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[16].getText());
                }
        });
        jbtns[17].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[17].getText());
                }
        });
        jbtns[18].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[18].getText());
                }
        });
        jbtns[19].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[19].getText());
                }
        });

        jbtns[20].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[20].getText());
                }
        });
        jbtns[21].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[21].getText());
                }
        });
        jbtns[22].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[22].getText());
                }
        });
        jbtns[23].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[23].getText());
                }
        });
        jbtns[24].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[24].getText());
                }
        });
        jbtns[25].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[25].getText());
                }
        });

        jbtns[26].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[26].getText());
                }
        });
        jbtns[27].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[27].getText());
                }
        });
        jbtns[28].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[28].getText());
                }
        });
        jbtns[29].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[29].getText());
                }
        });
        jbtns[30].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[30].getText());
                }
        });
        jbtns[31].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[31].getText());
                }
        });
        jbtns[32].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[32].getText());
                }
        });
        jbtns[33].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[33].getText());
                }
        });
        jbtns[34].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[34].getText());
                }
        });
        jbtns[35].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[35].getText());
                }
        });
        jbtns[36].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[36].getText());
                }
        });
        jbtns[37].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[37].getText());
                }
        });
        jbtns[38].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[38].getText());
                }
        });
        jbtns[38].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[38].getText());
                }
        });
        jbtns[39].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[39].getText());
                }
        });
        jbtns[40].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[40].getText());
                }
        });
        jbtns[41].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[41].getText());
                }
        });
        jbtns[42].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[42].getText());
                }
        });
        jbtns[43].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[43].getText());
                }
        });
        jbtns[44].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[44].getText());
                }
        });
        jbtns[45].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[45].getText());
                }
        });
        jbtns[46].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[46].getText());
                }
        });
        jbtns[47].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[47].getText());
                }
        });
        jbtns[48].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[48].getText());
                }
        });
        jbtns[49].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                    fun(jbtns[49].getText());
                }
        });
    }
}