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
import java.io.*;

public class Jnframe extends JInternalFrame  {

    private String item[] = {"XOR","Caesor"};

    private JMenuBar mbr1 = new JMenuBar();
    private JMenu menu1 = new JMenu("File");
    private JMenuItem mItem1 = new JMenuItem("open");
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel();
    private JPanel jpl3 = new JPanel();
    
    private JTextArea jta1 = new JTextArea();
    private JTextArea jta2 = new JTextArea();

    private JScrollPane jsp1 = new JScrollPane(jta1); 
    private JScrollPane jsp2 = new JScrollPane(jta2); 


    private JLabel jlb1 = new JLabel("Encrypt Algorithm");
    private JComboBox jcb1 = new JComboBox(item);
    private JLabel jlb2 = new JLabel("Passord");

    private JTextField jtf1 = new JTextField();

    private JButton jbtn1 = new JButton("Go");

    private JLabel jlb3 = new JLabel("Encrypt/Decrypt");

    private JRadioButton jrb1 = new JRadioButton("Encrypt");
    private JRadioButton jrb2 = new JRadioButton("Decrypt");

    private JButton jbtn2 = new JButton("Reset");
    private JButton jbtn3 = new JButton("Exit");

    private JLabel jlb4 = new JLabel("Flie name");
    private JTextField jtf2 = new JTextField();
    private JButton jbtn4 = new JButton("Save");


    private JButton jbtn5 = new JButton("brows");

    private ButtonGroup bgp = new ButtonGroup();

    private JFileChooser jfc = new JFileChooser();

    static Container cp ;


    private String str3 = "";
    private String str5 = "";
    private String str6 = "";
    private String str11 = "";


    private int  qe = 0;            //判斷每個字元有幾個1和0  然後再把每個字元的二進位做分割

    private int  i2 = 0;            //次數紀錄

    //private int[] qq = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  //存放次數qe   之後取出來用來判斷次數
    //private int[] ff22 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public Jnframe(){
        init();
    }
    public void init(){
        cp = this.getContentPane();
        this.setBounds(10,10,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setJMenuBar(mbr1);
        cp.setLayout(new BorderLayout());
        jpl1.setLayout(new GridLayout(2,5,0,0));
        jpl2.setLayout(new GridLayout(1,2,0,0));
        jpl3.setLayout(new GridLayout(1,4,0,0));
        cp.add(jpl1,BorderLayout.NORTH);
        cp.add(jpl2,BorderLayout.CENTER);
        cp.add(jpl3,BorderLayout.SOUTH);

        



        menu1.add(mItem1);
        mbr1.add(menu1);

        bgp.add(jrb1);
        bgp.add(jrb2);
        jpl1.add(jlb1);
        jpl1.add(jcb1);
        jpl1.add(jlb2);
        jpl1.add(jtf1);
        jpl1.add(jbtn1);
        jpl1.add(jlb3);
        jpl1.add(jrb1);
        jpl1.add(jrb2);
        jpl1.add(jbtn2);
        jpl1.add(jbtn3);
        jpl2.add(jsp1);
        jpl2.add(jsp2);

        jpl3.add(jlb4);
        jpl3.add(jtf2);
        jpl3.add(jbtn5); 
        jpl3.add(jbtn4); 



        jbtn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                String a = (String)jcb1.getSelectedItem();
                if(a == "XOR" && jrb1.isSelected() == true ){
                    jta2.setText("");
                    enPassword();
                }else if(a == "XOR" && jrb2.isSelected() == true ){
                    dePassword();
                }else if(a == "Caesor" && jrb1.isSelected() == true ){
                    CenPassword();
                }else if(a == "Caesor" && jrb2.isSelected() == true ){
                    CdePassword();
                }
            }
        });

        jbtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent save){

            }
        });

        jbtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent brown){
                int val = jfc.showOpenDialog(Jnframe.this);
                if(val==JFileChooser.APPROVE_OPTION){
                    File saveFile = jfc.getSelectedFile();

                }
            }
        });

        mItem1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aac){
                int val = jfc.showOpenDialog(Jnframe.this);
        if(val==JFileChooser.APPROVE_OPTION){
            try{
              File selectFile = jfc.getSelectedFile();
              FileReader fr = new FileReader(selectFile.getPath());
              BufferedReader bfr = new BufferedReader(fr);
              String str = "";
              String loadstr = "";
              if(jrb1.isSelected()){
                while((str = bfr.readLine()) != null){
                  loadstr+=str+"\n";
                }
                jta1.append(loadstr);
              }else{
                while((str = bfr.readLine()) != null){
                  loadstr += str;
                }
                jta2.append(loadstr);
              }
              bfr.close();
              fr.close();
            } catch(IOException ioe){
              JOptionPane.showMessageDialog(Jnframe.this, "Open file error!!");
            }
          }
            }   
        });

        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aaA){
                str3 = "";
                str5 = "";
                str6 = "";
                jtf1.setText("");
                jta1.setText("");
                jta2.setText("");
                qe = 0;
                i2 = 0;
                str11 = "";
            }
        });
    }


    public void enPassword(){
        char data[] = jta1.getText().toCharArray();   //5   3   
        char pw[] = jtf1.getText().toCharArray();   //3    5
        char newData[] = new char[data.length];    //5    3
        for(int i = 0 ; i < data.length ; i++){
            newData[i] = (char)((int)data[i] ^ (int)(pw[i % pw.length]));  //
        }
        jta2.setText(new String(newData)); 

        /* String str1 = jtf1.getText();   //原數據  5   3
        char ac[] = str1.toCharArray();     //把字串切割放入char
        str5 = "";
        str6 = "";

        for(int i = 0 ; i < str1.length() ; i++){
            int a = ac[i];                      //從字元轉ascii
            int a2 = a;
            while(true){
                a2 = a % 2;
                a = a/2;
                str5 = a2 + str5;
                if(a == 1){
                    str5 = "1" + str5;
                    break;
                }
            }
            str6 = str6 + str5;
            str5 = "";
        }
        char ac2[] = str6.toCharArray();

        String str2 = jta1.getText();   //密鑰 
        char c[] = str2.toCharArray();
        str5 = "";
        str6 = "";

        for(int i = 0 ; i < str2.length() ; i++){
            int a = c[i];                      //從字元轉ascii
            int a2 = a;
            while(true){
                a2 = a % 2;
                a = a/2;
                str5 = a2 + str5;
                if(a == 1){
                    str5 = "1" + str5;
                    break;
                }
            }
            str6 = str6 + str5;
            str5 = "";
        }
        char c2[] = str6.toCharArray(); 
        

        int j = 0;
        for(int i = 0 ; i < ac2.length; i++) { // str2 = 密鑰 str1 = 原數據 比較長 
            if(j == c2.length){
                j = 0;
            }
            if(ac2[i] == c2[j]){
                str3 = "0";
            }else{
                str3 = "1";
            }
            j++;
            jta2.setText(jta2.getText() + str3);
        }   */
    }



    public void dePassword(){

        char pw[] = jtf1.getText().toCharArray();
        char data[] = jta1.getText().toCharArray();
        char newData[] = new char[data.length];    //5    3
        for(int i = 0 ; i < data.length ; i++){
            newData[i] = (char)((int)data[i] ^ (int)(pw[i % pw.length]));  //
        }
        jta2.setText(new String(newData)); 

        /* if(jta1.getText().length() < jtf1.getText().length()){
        jta2.setText(jta2.getText() + "\n");
        String str2 = jta1.getText();   //金鑰  
        char c[] = str2.toCharArray();
        jta1.setText("");
        str5 = "";
        str6 = "";
        int qq[]=new int[str2.length() + 1];
        for(int i = 0 ; i < str2.length() ; i++){
            int a = c[i];                      //從字元轉ascii
            int a2 = a;
            while(true){
                a2 = a % 2;
                a = a/2;
                str5 = a2 + str5;
                qe++;
                if(a == 1){
                    str5 = "1" + str5;
                    qe++;
                    break;
                }
            }
            str6 = str6 + str5;
            str5 = "";
            qq[i] = qe;
            qe = 0;
        }
        char c2[] = str6.toCharArray();     //金鑰轉ascii

        String str7 = jta2.getText();    
        char cf[] = str7.toCharArray();  //把jta2放到ch[]
        int j = 0 ;
        int ads = 0;
        int fff = 0;
        int ff22[] =new int[qq.length];
        for(int i = 0 ; i < cf.length - 1; i++) { 
            ads++;
            if(j == c2.length){
                j = 0;
            }
            if(cf[i] == c2[j]){
                str3 = "0";
            }else{
                str3 = "1";
            }
            j++;
            jta2.setText(jta2.getText() + str3);
            str11 = str11 + str3;
            if(ads == qq[i2]){//ads  紀錄做了幾次   每當到達qq[i2]的次數時  就代表一個字元的1和0的長度 然後做轉換
                ff22[fff] = Integer.parseInt(str11);
                str11 = "";
                fff++;
                ads = 0;
                i2++;
            }
        }
        ff22[fff] = Integer.parseInt(str11); 
        for(int cad = 0 ; cad < ff22.length; cad++) {
            String str111 = Integer.valueOf(Integer.toString(ff22[cad]), 2).toString();  //二進位轉十進位
            int aaaaa = Integer.parseInt(str111);    //字串轉INT
            char ch3 = (char)aaaaa;         //INT轉CHAR
            jta1.setText(jta1.getText() + String.valueOf(ch3));             //輸出
            }
        }else{
            jta2.setText(jta2.getText() + "\n");
            String str2 = jta1.getText();   //金鑰  
            char c[] = str2.toCharArray();
            jta1.setText("");
            str5 = "";
            str6 = "";
            int qq[]=new int[str2.length() + 1];
            for(int i = 0 ; i < str2.length() ; i++){
                int a = c[i];                      //從字元轉ascii
                int a2 = a;
                while(true){
                    a2 = a % 2;
                    a = a/2;
                    str5 = a2 + str5;
                    qe++;
                    if(a == 1){
                        str5 = "1" + str5;
                        qe++;
                        break;
                    }
                }
                str6 = str6 + str5;
                str5 = "";
                qq[i] = qe;
                qe = 0;
            }
            char c2[] = str6.toCharArray();     //金鑰轉ascii
    
            String str7 = jta2.getText();    
            char cf[] = str7.toCharArray();  //把jta2放到ch[]
            int j = 0 ;
            int ads = 0;
            int fff = 0;
            int ff22[] =new int[qq.length];
            for(int i = 0 ; i < cf.length; i++) { 
                ads++;
                if(j == c2.length){
                    j = 0;
                }
                if(cf[i] == c2[j]){
                    str3 = "0";
                }else{
                    str3 = "1";
                }
                j++;
                jta2.setText(jta2.getText() + str3);
                str11 = str11 + str3;
                if(ads == qq[i2]){//ads  紀錄做了幾次   每當到達qq[i2]的次數時  就代表一個字元的1和0的長度 然後做轉換
                    ff22[fff] = Integer.parseInt(str11);
                    str11 = "";
                    fff++;
                    ads = 0;
                    i2++;
                }
            }
            System.out.println(str11);
            ff22[fff] = Integer.parseInt(str11); 
            for(int cad = 0 ; cad < ff22.length; cad++) {
                String str111 = Integer.valueOf(Integer.toString(ff22[cad]), 2).toString();  //二進位轉十進位
                int aaaaa = Integer.parseInt(str111);    //字串轉INT
                char ch3 = (char)aaaaa;         //INT轉CHAR
                jta1.setText(jta1.getText() + String.valueOf(ch3));             //輸出
                }
        } */
    }

    public void CenPassword(){

        int un = Integer.parseInt(jtf1.getText());

        String str2 = jta1.getText();   //金鑰  
        char c[] = str2.toCharArray();
        str5 = "";
        str6 = "";

        for(int i = 0 ; i < str2.length() ; i++){
            int a = c[i];                      //從字元轉ascii
            a = a + un;
            c[i] = (char)a;
            str6 = str6 + c[i];
        }
        jta1.setText("");
        jta2.setText(str6);
    }

    public void CdePassword(){
        int un = Integer.parseInt(jtf1.getText());

        String str2 = jta2.getText();   //金鑰  
        char c[] = str2.toCharArray();
        str5 = "";
        str6 = "";

        for(int i = 0 ; i < str2.length() ; i++){
            int a = c[i];                      //從字元轉ascii
            a = a - un;
            c[i] = (char)a;
            str6 = str6 + c[i];
        }
        jta1.setText(str6);
    }
}