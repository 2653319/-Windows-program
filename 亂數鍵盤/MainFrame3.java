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
    private String jbtns2 = "";
    private String clechan = "";
    private String ok ;
    private String str ;
    private String str2;
    private JButton jbtns[] = new JButton[40];
    private String btnLable[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","Exit","Clear","Change","Ok"};
    private JLabel Lbl = new JLabel(" ");
    private Container cp ;
    private JPanel Jpl = new JPanel();

    public MainFrame3(){
        init();
    }
    public void test(){
        //System.out.println(clechan);
/*         if(clechan == "Change" && changeReal == false){
            chan = true;
            changeReal = true;
        }else if(clechan == "Change" && changeReal == true){
            chan = false;
            changeReal = false;
        } */
        if(clechan != "Clear" && clechan != "Change" && clechan != "Ok" && clechan != "Exit"){
        while(b < 40){
            int random = (int) (Math.random()*40);
            jbtns2 = btnLable[random];
            int f = 0 ;
             for(int l = 0 ; l < b ; l++){
                if(jbtns2 == jbtns[l].getText()){
                    break;
                }else{
                    f++;
                }
                if(f == b){
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
        a=0;
        b=0; 
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
        JOptionPane.showMessageDialog(this, str);
    }else if(clechan == "Exit"){
        System.exit(0);
    }
}

    private void init(){
        cp = this.getContentPane();
        this.setBounds(100,200,700,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.add(Lbl,BorderLayout.NORTH);
        Jpl.setLayout(new GridLayout(4,10,3,3));
        cp.add(Jpl, BorderLayout.CENTER);
        Lbl.setHorizontalAlignment(JLabel.RIGHT);


        for(int i = 0 ; i < 40 ; i++){
            jbtns[i] = new JButton(btnLable[i]);
            Jpl.add(jbtns[i]);
        } 
        
         jbtns[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                clechan = jbtns[0].getText();
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[0].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[0].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[1].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[1].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[2].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[2].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[3].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[3].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[4].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[4].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[5].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[5].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[6].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[6].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[7].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[7].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[8].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[8].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[9].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[9].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[10].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[10].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[11].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[11].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[12].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[12].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[13].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[13].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[14].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[14].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[15].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[15].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[16].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[16].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[17].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[17].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[18].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[18].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[19].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[19].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[20].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[20].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[21].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[21].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[22].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[22].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[23].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[23].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[24].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[24].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[25].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[25].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[26].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[26].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[27].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[27].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[28].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[28].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[29].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[29].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[30].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[30].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[31].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[31].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[32].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[32].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[33].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[33].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[34].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[34].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[35].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[35].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[36].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[36].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[37].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[37].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[38].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[38].getText();   
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
                if(clechan != "Ok"){
                    if(chan == false){
                        str = str + jbtns[39].getText();   
                        Lbl.setText(str);
                    }else{
                        str = str + jbtns[39].getText();   
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