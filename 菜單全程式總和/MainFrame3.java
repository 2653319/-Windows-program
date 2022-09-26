import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.crypto.Data;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.Date;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;


public class MainFrame3 extends JFrame{
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private boolean chan = false;
    private boolean changeReal = false;
    private boolean Upper2 = false;
    private String jbtns2 = "";
    private String clechan = "";
    private String ok ;
    private String str ;
    private String str2;
    private JButton jbtns[] = new JButton[50];
    private String btnLable[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","Exit","Clear","Change","Ok","Upper","@","#","$","%","^","&","*","(",")"};
    private JLabel Lbl = new JLabel(" ");
    private Container cp ;
    private JPanel Jpl = new JPanel();
    private MainFrame loginFrm;

    public MainFrame3(){
        init();
    }
    public void test(){
        System.out.println(clechan);
        //System.out.println(clechan);
/*         if(clechan == "Change" && changeReal == false){
            chan = true;
            changeReal = true;
        }else if(clechan == "Change" && changeReal == true){
            chan = false;
            changeReal = false;
        } */
        if(clechan != "Clear" && clechan != "Change" && clechan != "Ok" && clechan != "Exit" && clechan != "Upper" && clechan != "UPPER"){
        while(b < 50){
            int random = (int) (Math.random()*50);
            jbtns2 = btnLable[random];
             for(int l = 0 ; l < b ; l++){
                if(jbtns2 == jbtns[l].getText()){
                    break;
                }else if(l == b-1){
                    jbtns[b].setText(btnLable[random]);
                    b++;
                    break;
                }
            } 
            if(a == 0){
                jbtns[b].setText(btnLable[random]);
                b++;
                a++;
            } 
        } 
    }else if(clechan == "Clear"){
        str = "";
        str2 = "";
        Lbl.setText(str); 
    }else if(clechan == "Change" && changeReal == false){
        chan = true;
        str = "";
        str2 = "";
        Lbl.setText(str);
        changeReal = true;
    }else if(clechan == "Change" && changeReal == true){
        chan = false;
        str = "";
        str2 = "";
        Lbl.setText(str);
        changeReal = false;
    }else if(clechan == "Ok"){
        MainFrame.Pwf.setText(Lbl.getText());
        //JOptionPane.showMessageDialog(this, str);
    }else if(clechan == "Exit"){
        MainFrame3.this.dispose();
    }else if(clechan == "Upper" && Upper2 == false){
        Upper2 = true;
    }else if(clechan == "UPPER" && Upper2 == true){
        System.out.println("aaaz");
        Upper2 = false;
    }
}

    private void init(){
        cp = this.getContentPane();
        this.setBounds(100,200,700,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.add(Lbl,BorderLayout.NORTH);
        Jpl.setLayout(new GridLayout(5,10,3,3));
        cp.add(Jpl, BorderLayout.CENTER);
        Lbl.setHorizontalAlignment(JLabel.RIGHT);


        for(int i = 0 ; i < 50 ; i++){
            jbtns[i] = new JButton(btnLable[i]);
            Jpl.add(jbtns[i]);
        } 
        
         jbtns[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                clechan = jbtns[0].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){         
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        
        jbtns[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                clechan = jbtns[1].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                clechan = jbtns[2].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });


        jbtns[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent vxc){
                clechan = jbtns[3].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eewr){
                clechan = jbtns[4].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }   
        });

        jbtns[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent rt){
                clechan = jbtns[5].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent gft){
                clechan = jbtns[6].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent iy){
                clechan = jbtns[7].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent gh){
                clechan = jbtns[8].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent jp){
                clechan = jbtns[9].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent up){
                clechan = jbtns[10].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[11].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent mu){
                clechan = jbtns[11].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });


        jbtns[12].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent duv){
                clechan = jbtns[12].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[13].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent redu){
                clechan = jbtns[13].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[14].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cc){
                clechan = jbtns[14].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });

        jbtns[15].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clechan = jbtns[15].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[16].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ight){
                clechan = jbtns[16].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[17].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ht){
                clechan = jbtns[17].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[18].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent t){
                clechan = jbtns[18].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[19].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent gt){
                clechan = jbtns[19].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[20].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent qt){
                clechan = jbtns[20].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[21].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent esad){
                clechan = jbtns[21].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[22].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eightd){
                clechan = jbtns[22].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[23].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eightasd){
                clechan = jbtns[23].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[24].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sdai){
                clechan = jbtns[24].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[25].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent two){
                clechan = jbtns[25].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[26].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ef){
                clechan = jbtns[26].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[27].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent yyy){
                clechan = jbtns[27].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str +clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[28].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent qg){
                clechan = jbtns[28].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[29].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent egf){
                clechan = jbtns[29].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[30].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent asv){
                clechan = jbtns[30].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[31].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sad){
                clechan = jbtns[31].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[32].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eias){
                clechan = jbtns[32].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[33].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent es){
                clechan = jbtns[33].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[34].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent tut){
                clechan = jbtns[34].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[35].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eidg){
                clechan = jbtns[35].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[36].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent exit){
                clechan = jbtns[36].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[37].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent clechanaa){
                clechan = jbtns[37].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[38].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent back){
                    clechan = jbtns[38].getText();
                    if(Upper2 == true){
                        clechan = clechan.toUpperCase();
                    }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[39].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[39].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[40].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[40].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[41].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[41].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[42].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[42].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[43].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[43].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[44].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[44].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[45].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[45].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[46].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[46].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[47].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[47].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[48].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[48].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
        jbtns[49].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ok){
                clechan = jbtns[49].getText();
                if(Upper2 == true){
                    clechan = clechan.toUpperCase();
                }
                if(clechan != "Ok" && clechan != "Upper" && clechan != "UPPER"){
                    if(chan == false){
                        str = str + clechan;   
                        Lbl.setText(str);
                    }else{
                        str = str + clechan;   
                        str2 = str2 + "*";
                        Lbl.setText(str2);
                    }
                    test();
                }else{
                    test();
                }
            }
        });
    }
}