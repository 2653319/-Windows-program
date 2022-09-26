import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;


public class MainFrame extends JFrame{
    private JButton Jbt11 = new JButton("7");
    private JButton Jbt12 = new JButton("8");
    private JButton Jbt13 = new JButton("9");
    private JButton Jbt21 = new JButton("4");
    private JButton Jbt22 = new JButton("5");
    private JButton Jbt23 = new JButton("6");
    private JButton Jbt31 = new JButton("1");
    private JButton Jbt32 = new JButton("2");
    private JButton Jbt33 = new JButton("3");
    private JButton Jbt41 = new JButton("0");
    private JButton JbtC = new JButton("C");
    private JButton JbtEq = new JButton("=");
    private JButton JbtSub = new JButton("-");
    private JButton JbtMu = new JButton("*");
    private JButton JbtDuv = new JButton("/");
    private JButton JbtAdd = new JButton("+");
    private JButton JbtPoint = new JButton(".");
    private JButton JbtOne = new JButton("---");
    private JButton JbtTwo = new JButton("===");
    private JLabel Lbl = new JLabel("");
    private JLabel Lbl2 = new JLabel("");
    private JPanel Jpl = new JPanel();
    private String str  = "" , str2 = "" , str3 = "";
    private Boolean add = false , duv = false , mul = false ,sub = false;
    private Double v1,v2;


    private Container cp;

    public MainFrame(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        this.setBounds(100,200,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        cp.add(Lbl,BorderLayout.NORTH);
        cp.add(Lbl2,BorderLayout.SOUTH);

        Jpl.setLayout(new GridLayout(5,4,3,3));
        cp.add(Jpl, BorderLayout.CENTER);
        Lbl.setHorizontalAlignment(JLabel.RIGHT);

        Jpl.add(Jbt11);
        Jpl.add(Jbt12);
        Jpl.add(Jbt13);
        Jpl.add(JbtSub);
        Jpl.add(Jbt21);
        Jpl.add(Jbt22);
        Jpl.add(Jbt23);
        Jpl.add(JbtMu);
        Jpl.add(Jbt31);
        Jpl.add(Jbt32);
        Jpl.add(Jbt33);
        Jpl.add(JbtAdd);
        Jpl.add(Jbt41);
        Jpl.add(JbtC);
        Jpl.add(JbtEq);
        Jpl.add(JbtDuv);
        Jpl.add(JbtPoint);
        Jpl.add(JbtOne);
        Jpl.add(JbtTwo);



        Jbt11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                str = str + "7";
                Lbl.setText(str);
            }
        });

        Jbt12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                str = str + "8";
                Lbl.setText(str);
            }
        });

        Jbt13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent nine){
                str = str + "8";
                Lbl.setText(str);
            }
        });


        Jbt21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent four){
               str = str + "4";
               Lbl.setText(str);
            }
        });

        Jbt22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent five){
                str = str + "5";
                Lbl.setText(str);
            }
        });

        Jbt23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent six){
                str = str + "6";
                Lbl.setText(str);
            }
        });

        Jbt31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent one){
                str = str + "1";
                Lbl.setText(str);
            }
        });

        Jbt32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent two){
                str = str + "2";
                Lbl.setText(str);
            }
        });

        Jbt33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent three){
               str = str + "3";
               Lbl.setText(str);
            }
        });

        Jbt41.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent zero){
                str = str + "0";
                Lbl.setText(str);
            }
        });

        JbtPoint.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent point){
                str = str + ".";
                Lbl.setText(str);
            }
        });

        JbtC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent point){
                str = "";
                str2 = "";
                add = false ; 
                duv = false ;
                mul = false ;
                sub = false ;
                Lbl.setText(str);
                Lbl2.setText(str2);
            }
        });

        JbtAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Add){
                str3 = str + "+" ;
                Lbl2.setText(str3);
                add = true;
                fun1();
            }
        });

        JbtSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Sub){
                str3 = str + "-" ;
                Lbl2.setText(str3);
                sub = true;
                fun1();
            }
        });

        JbtMu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Mul){
                str3 = str + "*" ;
                Lbl2.setText(str3);
                mul = true;
                fun1();
            }
        });

        JbtDuv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent Duv){
                str3 = str + "/" ;
                Lbl2.setText(str3);
                duv = true;
                fun1();
            }
        });

        JbtEq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent equal){
                str3 = str3 + str ;
                Lbl2.setText(str3);
                v1 = Double.parseDouble(str2);
                v2 = Double.parseDouble(str);
                if(add == true){
                    add = false;
                    str = Double.toString(v1 + v2);
                    Lbl.setText(str);
                }else if(sub == true){
                    sub = false;
                    str = Double.toString(v1 - v2);
                    Lbl.setText(str);
                }else if(mul == true){
                    mul = false;
                    str = Double.toString(v1 * v2);
                    System.out.print(str);
                    Lbl.setText(str);
                }else if(duv == true){
                    duv = false;
                    str = Double.toString(v1 / v2);
                    Lbl.setText(str);
                }
            }
        }); 
    }
    public void fun1(){
        str2 = str;
        str = "";
        Lbl.setText(str);
    }
}

/*         for(int i = 0 ; i < 16 ; i++){
            jbtns[i] = new JButton(btnLabel[i]);
            Lbl.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent seven){
                    JButton tmpBtn = (JButton) e.getSource();
                    Lbl.setText(tmpBtn.getText(1));
                }
            });
    }  */






        /* Jbt11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent seven){
                if(Ot && Eq == false){
                    x = 7;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 7;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 7;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });
        Jbt12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 8;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 8;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 8;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 9;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 9;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 9;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });


        Jbt21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 4;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 4;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 4;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 5;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 5;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 5;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 6;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 6;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 6;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 1;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 1;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 1;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 2;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 2;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 2;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 3;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 3;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 3;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        Jbt41.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                if(Ot && Eq == false){
                    x = 0;
                    str = str + Integer.toString(x) ;
                    str3 = str3 + x;
                    Lbl.setText(str);
                    totle1 = Integer.parseInt(str3);
                }else if(Ot == false && Eq == false){
                    y = 0;
                    str = str + Integer.toString(y);
                    str2 = str2 + y;
                    Lbl.setText(str);
                    totle2 = Integer.parseInt(str2);
                    Ot = true;
                }else if(Eq == true){
                    x = 0;
                    str = str + Integer.toString(x) ;
                    str3 = Integer.toString(z) + Integer.toString(x);
                    Lbl.setText(str);
                    z = Integer.parseInt(str3);
                }
            }
        });

        JbtUp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent up){
                Eq = false;
                if(UpOt){
                    str = str + " + " ;
                    Lbl.setText(str);
                    Ot = false;
                    Up = true;
                    UpOt = false;
                }else{
                    UpOt = true;
                    str = str + " + " ;
                    Lbl.setText(str);
                    Up = true;
                }
            }
        });

        JbtMu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent mu){
                Eq = false;
                if(MuOt){
                    str = str + "* " ;
                    Lbl.setText(str);
                    Ot = false;
                    Mu = true;
                    MuOt = false;
                }else{
                    MuOt = true;
                    str = str + " * " ;
                    Lbl.setText(str);
                    Mu = true;
                }
            }
        });


        JbtDuv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent duv){
                Eq = false;
                if(DuvOt){
                    str = str + " - " ;
                    Lbl.setText(str);
                    Ot = false;
                    Duv = true;
                    DuvOt = false;
                }else{
                    DuvOt = true;
                    str = str + " - " ;
                    Lbl.setText(str);
                    Duv = true;
                }
            }
        });

        JbtReDu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent redu){
                Eq = false;
                if(ReDuOt){
                    str = str + " / " ;
                    Lbl.setText(str);
                    Ot = false;
                    ReDu = true;
                    ReDuOt = false;
                }else{
                    ReDuOt = true;
                    str = str + " - " ;
                    Lbl.setText(str);
                    ReDu = true;
                }
            }
        });

        JbtC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cc){
                Ot = true ; Up = false ; Duv = false ; ReDu = false ; Mu = false ; UpOt = true ; Eq = false; DuvOt = true ;MuOt = true ;ReDuOt = true;
                x = 0 ; y = 0 ; z = 0 ; totle1 = 0 ; totle2 = 0 ;
                str  = "" ; str2 = "" ; str3 = "";
                Lbl.setText("0");
            }
        });

        JbtEq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eight){
                Eq = true;
                if(Up){
                    z = z + totle1 + totle2;
                    str = Integer.toString(z); 
                    Lbl.setText(str); 
                    Up = false;
                }
                if(Duv){
                    if(totle1 == 0){
                        z = z + totle1 - totle2;
                    }else{
                        z = z - totle1 + totle2;
                    }
                    str = Integer.toString(z); 
                    Lbl.setText(str); 
                    Duv = false;
                }
                if(Mu){
                    if(z == 0){
                        z = totle1 * totle2;
                    }else if(totle1 == 0){
                        z = z * totle2;
                    }else if(totle2 == 0){
                        z = z * totle1;
                    }
                    str = Integer.toString(z); 
                    Lbl.setText(str); 
                    Mu = false;
                }
                if(ReDu){
                    if(z == 0){
                        z = totle1 / totle2;
                    }else if(totle1 == 0){
                        z = z / totle2;
                    }else if(totle2 == 0){
                        z = z / totle1;
                    }
                    str = Integer.toString(z); 
                    Lbl.setText(str); 
                    ReDu = false;
                }
                totle1 = 0; 
                totle2 = 0;
                str3 = "";
                str2 = "";
            }
        }); */
