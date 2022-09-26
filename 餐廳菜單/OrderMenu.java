import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

public class OrderMenu extends JFrame {
    private JPanel jpnN = new JPanel(new BorderLayout(3 , 3));
    private JPanel jpn2 = new JPanel(new GridLayout(15, 5, 3, 3));
    private JPanel jpn4 = new JPanel(new GridLayout(1, 3, 3, 3));
    private JButton jbtOk = new JButton("OK");
    private JButton jbtExit = new JButton("EXIT");
    private JButton jbtClean = new JButton("Clean");

    private JCheckBox jcb1 = new JCheckBox("牛肉蛋花麵$110");
    private JComboBox jcbB1 = new JComboBox<String>(); 
    private JRadioButton jrb11 = new JRadioButton("小辣");
    private JRadioButton jrb12 = new JRadioButton("中辣");
    private JRadioButton jrb13 = new JRadioButton("大辣");
    private ButtonGroup bg1 = new ButtonGroup();

    private JCheckBox jcb2 = new JCheckBox("牛肉麵$100");
    private JComboBox jcbB2 = new JComboBox<String>(); 
    private JRadioButton jrb21 = new JRadioButton("小辣");
    private JRadioButton jrb22 = new JRadioButton("中辣");
    private JRadioButton jrb23 = new JRadioButton("大辣"); 
    private ButtonGroup bg2 = new ButtonGroup();

    private JCheckBox jcb3 = new JCheckBox("牛肉湯麵$55");
    private JComboBox jcbB3 = new JComboBox<String>(); 
    private JRadioButton jrb31 = new JRadioButton("小辣");
    private JRadioButton jrb32 = new JRadioButton("中辣");
    private JRadioButton jrb33 = new JRadioButton("大辣"); 
    private ButtonGroup bg3 = new ButtonGroup();

    private JCheckBox jcb4 = new JCheckBox("牛肉湯蛋花麵$65");
    private JComboBox jcbB4 = new JComboBox<String>(); 
    private JRadioButton jrb41 = new JRadioButton("小辣");
    private JRadioButton jrb42 = new JRadioButton("中辣");
    private JRadioButton jrb43 = new JRadioButton("大辣"); 
    private ButtonGroup bg4 = new ButtonGroup();

    private JCheckBox jcb5 = new JCheckBox("榨菜肉絲麵$55");
    private JComboBox jcbB5 = new JComboBox<String>(); 
    private JRadioButton jrb51 = new JRadioButton("小辣");
    private JRadioButton jrb52 = new JRadioButton("中辣");
    private JRadioButton jrb53 = new JRadioButton("大辣"); 
    private ButtonGroup bg5 = new ButtonGroup();

    private JCheckBox jcb6 = new JCheckBox("餛飩麵$55");
    private JComboBox jcbB6 = new JComboBox<String>(); 
    private JRadioButton jrb61 = new JRadioButton("小辣");
    private JRadioButton jrb62 = new JRadioButton("中辣");
    private JRadioButton jrb63 = new JRadioButton("大辣"); 
    private ButtonGroup bg6 = new ButtonGroup();

    private JCheckBox jcb7 = new JCheckBox("貢丸麵$55");
    private JComboBox jcbB7 = new JComboBox<String>(); 
    private JRadioButton jrb71 = new JRadioButton("小辣");
    private JRadioButton jrb72 = new JRadioButton("中辣");
    private JRadioButton jrb73 = new JRadioButton("大辣"); 
    private ButtonGroup bg7 = new ButtonGroup();

    private JCheckBox jcb8 = new JCheckBox("陽春湯麵$35");
    private JComboBox jcbB8 = new JComboBox<String>(); 
    private JRadioButton jrb81 = new JRadioButton("小辣");
    private JRadioButton jrb82 = new JRadioButton("中辣");
    private JRadioButton jrb83 = new JRadioButton("大辣"); 
    private ButtonGroup bg8 = new ButtonGroup();

    private JCheckBox jcb9 = new JCheckBox("牛肉蛋花湯$100");
    private JComboBox jcbB9 = new JComboBox<String>(); 
    private JLabel jlb11 = new JLabel("");
    private JLabel jlb12 = new JLabel("");
    private JLabel jlb13 = new JLabel("");

    private JCheckBox jcb10 = new JCheckBox("牛肉湯$90");
    private JComboBox jcbB10 = new JComboBox<String>(); 
    private JLabel jlb21 = new JLabel("");
    private JLabel jlb22 = new JLabel("");
    private JLabel jlb23 = new JLabel("");

    private JCheckBox jcb11 = new JCheckBox("牛肉清湯加蛋花$35");
    private JComboBox jcbB11 = new JComboBox<String>(); 
    private JLabel jlb31 = new JLabel("");
    private JLabel jlb32 = new JLabel("");
    private JLabel jlb33 = new JLabel("");

    private JCheckBox jcb12 = new JCheckBox("餛飩湯$40");
    private JComboBox jcbB12 = new JComboBox<String>(); 
    private JLabel jlb41 = new JLabel("");
    private JLabel jlb42 = new JLabel("");
    private JLabel jlb43 = new JLabel("");

    private JCheckBox jcb13 = new JCheckBox("貢丸湯$35");
    private JComboBox jcbB13 = new JComboBox<String>(); 
    private JLabel jlb51 = new JLabel("");
    private JLabel jlb52 = new JLabel("");
    private JLabel jlb53 = new JLabel("");

    private JCheckBox jcb14 = new JCheckBox("蛋花湯$30");
    private JComboBox jcbB14 = new JComboBox<String>(); 
    private JLabel jlb61 = new JLabel("");
    private JLabel jlb62 = new JLabel("");
    private JLabel jlb63 = new JLabel("");

    private JCheckBox jcb15 = new JCheckBox("青菜湯$25");
    private JComboBox jcbB15 = new JComboBox<String>(); 
    private JLabel jlb71 = new JLabel("");
    private JLabel jlb72 = new JLabel("");
    private JLabel jlb73 = new JLabel("");
    
    private Container cp;
    private JTextArea jta = new JTextArea();   
    private JScrollPane jsp = new JScrollPane(jta);

    public OrderMenu(){
        init();
    }
    private void init(){
        this.setBounds(200, 100, 500, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3 , 3));
        cp.add(jpnN, BorderLayout.NORTH);
        cp.add(jsp, BorderLayout.CENTER);

        jpnN.add(jpn2, BorderLayout.CENTER);
        jcbB1.addItem("1");
        jcbB1.addItem("2");
        jcbB1.addItem("3");
        jcbB1.addItem("4");
        jcbB1.addItem("5");  
        jpn2.add(jcb1);
        jpn2.add(jcbB1); 
        jpn2.add(jrb11);
        jpn2.add(jrb12);
        jpn2.add(jrb13);
        bg1.add(jrb11);
        bg1.add(jrb13);
        bg1.add(jrb12);
/*         jrb11.setSelected(true); */
         
        jcbB2.addItem("1");
        jcbB2.addItem("2");
        jcbB2.addItem("3");
        jcbB2.addItem("4");
        jcbB2.addItem("5");  
        jpn2.add(jcb2);
        jpn2.add(jcbB2); 
        jpn2.add(jrb21);
        jpn2.add(jrb22);
        jpn2.add(jrb23); 
        bg2.add(jrb21);
        bg2.add(jrb23);
        bg2.add(jrb22);
        jrb21.setSelected(true);

        jcbB3.addItem("1");
        jcbB3.addItem("2");
        jcbB3.addItem("3");
        jcbB3.addItem("4");
        jcbB3.addItem("5");  
        jpn2.add(jcb3);
        jpn2.add(jcbB3); 
        jpn2.add(jrb31);
        jpn2.add(jrb32);
        jpn2.add(jrb33); 
        bg3.add(jrb31);
        bg3.add(jrb33);
        bg3.add(jrb32);
        jrb31.setSelected(true);

        jcbB4.addItem("1");
        jcbB4.addItem("2");
        jcbB4.addItem("3");
        jcbB4.addItem("4");
        jcbB4.addItem("5");  
        jpn2.add(jcb4);
        jpn2.add(jcbB4); 
        jpn2.add(jrb41);
        jpn2.add(jrb42);
        jpn2.add(jrb43); 
        bg4.add(jrb41);
        bg4.add(jrb43);
        bg4.add(jrb42);
        jrb41.setSelected(true);

        jcbB5.addItem("1");
        jcbB5.addItem("2");
        jcbB5.addItem("3");
        jcbB5.addItem("4");
        jcbB5.addItem("5");  
        jpn2.add(jcb5);
        jpn2.add(jcbB5); 
        jpn2.add(jrb51);
        jpn2.add(jrb52);
        jpn2.add(jrb53); 
        bg5.add(jrb51);
        bg5.add(jrb53);
        bg5.add(jrb52);
        jrb51.setSelected(true);

        jcbB6.addItem("1");
        jcbB6.addItem("2");
        jcbB6.addItem("3");
        jcbB6.addItem("4");
        jcbB6.addItem("5");  
        jpn2.add(jcb6);
        jpn2.add(jcbB6); 
        jpn2.add(jrb61);
        jpn2.add(jrb62);
        jpn2.add(jrb63); 
        bg6.add(jrb61);
        bg6.add(jrb63);
        bg6.add(jrb62);
        jrb61.setSelected(true);

        jcbB7.addItem("1");
        jcbB7.addItem("2");
        jcbB7.addItem("3");
        jcbB7.addItem("4");
        jcbB7.addItem("5");  
        jpn2.add(jcb7);
        jpn2.add(jcbB7); 
        jpn2.add(jrb71);
        jpn2.add(jrb72);
        jpn2.add(jrb73); 
        bg7.add(jrb71);
        bg7.add(jrb73);
        bg7.add(jrb72);
        jrb71.setSelected(true);

        jcbB8.addItem("1");
        jcbB8.addItem("2");
        jcbB8.addItem("3");
        jcbB8.addItem("4");
        jcbB8.addItem("5");  
        jpn2.add(jcb8);
        jpn2.add(jcbB8); 
        jpn2.add(jrb81);
        jpn2.add(jrb82);
        jpn2.add(jrb83); 
        bg8.add(jrb81);
        bg8.add(jrb83);
        bg8.add(jrb82);
        jrb81.setSelected(true);

        jcbB9.addItem("1");
        jcbB9.addItem("2");
        jcbB9.addItem("3");
        jcbB9.addItem("4");
        jcbB9.addItem("5");
        jpn2.add(jcb9);
        jpn2.add(jcbB9); 
        jpn2.add(jlb11);
        jpn2.add(jlb12);
        jpn2.add(jlb13); 

        jcbB10.addItem("1");
        jcbB10.addItem("2");
        jcbB10.addItem("3");
        jcbB10.addItem("4");
        jcbB10.addItem("5");
        jpn2.add(jcb10);
        jpn2.add(jcbB10); 
        jpn2.add(jlb21);
        jpn2.add(jlb22);
        jpn2.add(jlb23); 

        jcbB11.addItem("1");
        jcbB11.addItem("2");
        jcbB11.addItem("3");
        jcbB11.addItem("4");
        jcbB11.addItem("5");
        jpn2.add(jcb11);
        jpn2.add(jcbB11); 
        jpn2.add(jlb31);
        jpn2.add(jlb32);
        jpn2.add(jlb33); 

        jcbB12.addItem("1");
        jcbB12.addItem("2");
        jcbB12.addItem("3");
        jcbB12.addItem("4");
        jcbB12.addItem("5");
        jpn2.add(jcb12);
        jpn2.add(jcbB12); 
        jpn2.add(jlb41);
        jpn2.add(jlb42);
        jpn2.add(jlb43); 

        jcbB13.addItem("1");
        jcbB13.addItem("2");
        jcbB13.addItem("3");
        jcbB13.addItem("4");
        jcbB13.addItem("5");
        jpn2.add(jcb13);
        jpn2.add(jcbB13); 
        jpn2.add(jlb51);
        jpn2.add(jlb52);
        jpn2.add(jlb53); 

        jcbB14.addItem("1");
        jcbB14.addItem("2");
        jcbB14.addItem("3");
        jcbB14.addItem("4");
        jcbB14.addItem("5");
        jpn2.add(jcb14);
        jpn2.add(jcbB14); 
        jpn2.add(jlb61);
        jpn2.add(jlb62);
        jpn2.add(jlb63); 

        jcbB15.addItem("1");
        jcbB15.addItem("2");
        jcbB15.addItem("3");
        jcbB15.addItem("4");
        jcbB15.addItem("5");
        jpn2.add(jcb15);
        jpn2.add(jcbB15); 
        jpn2.add(jlb71);
        jpn2.add(jlb72);
        jpn2.add(jlb73); 

        jpnN.add(jpn4, BorderLayout.SOUTH); 
        jpn4.add(jbtOk);
        jpn4.add(jbtClean);
        jpn4.add(jbtExit);

        jta.setEditable(false);

        jbtExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                System.exit(0);
            }
        });

        jbtClean.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                jta.setText("");
            }
        });

        jbtOk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                jta.setText("");
                int a1 = 0;
                int total = 0 , val1 = 0, val2 = 0, val3 = 0, val4 = 0, val5 = 0, val6 = 0, val7 = 0, val8 = 0,
                val9 = 0, val10 = 0, val11 = 0, val12 = 0, val13 = 0, val14 = 0, val15 = 0; 
                jta.append("Order \n");
                if(jcb1.isSelected()){
                    jta.append("蛋花牛肉麵  ");
                    if(jrb11.isSelected()){
                        jta.append("小辣");
                    }else if(jrb12.isSelected()){
                        jta.append("中辣");
                    }else if(jrb13.isSelected()){
                        jta.append("大辣");
                    }else{
                        jta.append("不辣");
                    }
                    switch(jcbB1.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val1 = 110 * a1;
                    jta.append("  \t 小計 : " + val1 + "   份量 : " + a1 + "\n");
                }

                if(jcb2.isSelected()){
                    jta.append("牛肉麵  ");
                    if(jrb21.isSelected()){
                        jta.append("小辣");
                    }else if(jrb22.isSelected()){
                        jta.append("中辣");
                    }else if(jrb23.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB2.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val2 = 100 * a1;
                    jta.append("  \t 小計 : " + val2 +"   份量 : " + a1 + "\n");
                }

                if(jcb3.isSelected()){
                    jta.append("牛肉湯麵  ");
                    if(jrb31.isSelected()){
                        jta.append("小辣");
                    }else if(jrb32.isSelected()){
                        jta.append("中辣");
                    }else if(jrb33.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB3.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val3 = 55 * a1;
                    jta.append("  \t 小計 : " + val3 +"   份量 : " + a1 + "\n");
                }

                if(jcb4.isSelected()){
                    jta.append("牛肉湯蛋花麵  ");
                    if(jrb41.isSelected()){
                        jta.append("小辣");
                    }else if(jrb42.isSelected()){
                        jta.append("中辣");
                    }else if(jrb43.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB4.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val4 = 65 * a1;
                    jta.append("  \t 小計 : " + val4 +"   份量 : " + a1 + "\n");
                }
                
                if(jcb5.isSelected()){
                    jta.append("榨菜肉絲麵  ");
                    if(jrb51.isSelected()){
                        jta.append("小辣");
                    }else if(jrb52.isSelected()){
                        jta.append("中辣");
                    }else if(jrb53.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB5.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val5 = 55 * a1;
                    jta.append("  \t 小計 : " + val5 +"   份量 : " + a1 + "\n");
                }

                if(jcb6.isSelected()){
                    jta.append("餛飩麵  ");
                    if(jrb61.isSelected()){
                        jta.append("小辣");
                    }else if(jrb62.isSelected()){
                        jta.append("中辣");
                    }else if(jrb63.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB6.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val6 = 55 * a1;
                    jta.append("  \t 小計 : " + val6 +"   份量 : " + a1 + "\n");
                }

                if(jcb7.isSelected()){
                    jta.append("貢丸麵  ");
                    if(jrb71.isSelected()){
                        jta.append("小辣");
                    }else if(jrb72.isSelected()){
                        jta.append("中辣");
                    }else if(jrb73.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB7.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val7 = 55 * a1;
                    jta.append("  \t 小計 : " + val7 +"   份量 : " + a1 + "\n");
                }

                if(jcb8.isSelected()){
                    jta.append("陽春湯麵  ");
                    if(jrb81.isSelected()){
                        jta.append("小辣");
                    }else if(jrb82.isSelected()){
                        jta.append("中辣");
                    }else if(jrb83.isSelected()){
                        jta.append("大辣");
                    }
                    switch(jcbB8.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val8 = 35 * a1;
                    jta.append("  \t 小計 : " + val8 +"   份量 : " + a1 + "\n");
                }
                if(jcb9.isSelected()){
                    jta.append("牛肉蛋花湯  ");
                    switch(jcbB9.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val9 = 100 * a1;
                    jta.append("  \t 小計 : " + val9 +"   份量 : " + a1 + "\n");
                }

                if(jcb10.isSelected()){
                    jta.append("牛肉湯  ");
                    switch(jcbB10.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val10 = 90 * a1;
                    jta.append("  \t 小計 : " + val10 +"   份量 : " + a1 + "\n");
                }
                if(jcb11.isSelected()){
                    jta.append("牛肉清湯加蛋花  ");
                    switch(jcbB11.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val11 = 35 * a1;
                    jta.append("  \t 小計 : " + val11 +"   份量 : " + a1 + "\n");
                }

                if(jcb12.isSelected()){
                    jta.append("餛飩湯  ");
                    switch(jcbB12.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val12 = 40 * a1;
                    jta.append("  \t 小計 : " + val12 +"   份量 : " + a1 + "\n");
                }
                if(jcb13.isSelected()){
                    jta.append("貢丸湯  ");
                    switch(jcbB13.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val13 = 35 * a1;
                    jta.append("  \t 小計 : " + val13 +"   份量 : " + a1 + "\n");
                }
                if(jcb14.isSelected()){
                    jta.append("蛋花湯  ");
                    switch(jcbB14.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val14 = 30 * a1;
                    jta.append("  \t 小計 : " + val14 +"   份量 : " + a1 + "\n");
                }
                if(jcb15.isSelected()){
                    jta.append("青菜湯  ");
                    switch(jcbB15.getSelectedIndex()){
                        case 0:
                            a1 = 1;
                            break;
                        case 1:
                            a1 = 2;
                            break;
                        case 2:
                            a1 = 3;
                            break;
                        case 3:
                            a1 = 4;
                            break;
                        case 4:
                            a1 = 5;
                            break;
                    }
                    val15 = 25 * a1;
                    jta.append("  \t 小計 : " + val15 +"   份量 : " + a1 + "\n");
                }
                total = val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8 + val9 + val10 + val11 + val12 + val13 + val14 + val15;
                jta.append("total : " + total + "\n");
            }
        });
    }

}