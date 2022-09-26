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
import java.awt.Image;
import java.awt.event.*;
import java.sql.Date;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.Graphics;



public class MazeFrame extends JFrame{
    private JButton jbt1 = new JButton("up");
    private JButton jbt2 = new JButton("down");
    private JButton jbt3 = new JButton("left");
    private JButton jbt4 = new JButton("right");
    private JButton jbtExit = new JButton();
    private JPanel jpl2 = new JPanel();
    private ImageIcon icon = new ImageIcon("paku2.jpg");
    private ImageIcon icon2 = new ImageIcon("774004.jpg");
    private ImageIcon icon3 = new ImageIcon("75993815.jpg");
    private ImageIcon icon4 = new ImageIcon("buff.JPG");
    private JLabel jlb = new JLabel();
    private ImagePanel jpl1 ;
    private boolean contiune = true , xyadd = true; 
    private int totle = 0 , i = 1 , j = 1 , b;
    //private JLabel jlb2 = new JLabel();
    private Container cp;
    private int y = 15 , x = 5 , z = 30 , f = 30;
    int[][] rig = new int[][]  {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //0
                                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1}, //1
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1}, //2
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1}, //3
                                {1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,0,1}, //4
                                {1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1}, //5
                                {1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1}, //6
                                {1,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,1}, //7
                                {1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1}, //8
                                {1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1}, //9                
                                {1,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1}, //10
                                {1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1}, //11
                                {1,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1}, //12
                                {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1}, //13
                                {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1}, //14
                                {1,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1}, //15
                                {1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1}, //16
                                {1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1}, //17
                                {1,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1}, //18
                                {1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1}, //19
                                {1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1}, //20
                                {1,0,1,1,0,0,0,0,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,1}, //21
                                {1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1}, //22
                                {1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1}, //23
                                {1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, //24
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};//25
                              // 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6    


        public MazeFrame(){
            init();
        }

        private void init(){
            cp = this.getContentPane();
            this.setBounds(100,200,500,500);
            this.setTitle("0");
            //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            cp.setLayout(new BorderLayout());

            Image img2 = icon2.getImage();
            Image newImg2 = img2.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            icon2 = new ImageIcon(newImg2);
            jpl1 = new ImagePanel(icon2.getImage());


            jpl1.setLayout(null);
            jpl2.setLayout(new GridLayout(1,5,0,0));

            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImg);


            Image img3 = icon3.getImage();
            Image newImg3 = img3.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            icon3 = new ImageIcon(newImg3);

            Image img4 = icon4.getImage();
            Image newImg4 = img4.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            icon4 = new ImageIcon(newImg4);

            jlb.setBounds(x,y,z,f);
            jlb.setBackground(new Color(100,100,100));
            jlb.setOpaque(true);
            //jlb2.setBounds(0,0,400,400);
            jbt1.setSize(100,100);
            jbt2.setSize(100,100);
            jbt3.setSize(100,100);
            jbt4.setSize(100,100);
            jlb.setIcon(icon);
            //jlb2.setIcon(icon2);

            cp.add(jpl1,BorderLayout.CENTER);
            cp.add(jpl2,BorderLayout.SOUTH);

            jpl1.add(jlb);
            jpl2.add(jbt1);
            jpl2.add(jbt2);
            jpl2.add(jbt3);
            jpl2.add(jbt4);
            jpl2.add(jbtExit);
            //jpl1.add(jlb2);

            jbt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent up){
                    i--;
                    b = rig[i][j];
                    if(b == 1){
                        i++;   
                    }else{
                    y-=15;
                    xyadd = false;
                    }
                    totle++;
                    if(totle >= 300){
                        jlb.setIcon(icon3);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                        if(xyadd = false){
                        y+=15;
                        }
                    }
                    if(i == 24 && j == 22 ){
                        jlb.setIcon(icon4);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                    } 
                    fun();
                }
            });

            jbt2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent down){
                    i++;
                    b = rig[i][j];
                    if(b == 1){
                        i--;   
                    }else{
                    y+=15;
                    xyadd = false;
                    }
                    totle++;
                    if(totle >= 300){
                        jlb.setIcon(icon3);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                        if(xyadd = false){
                        y-=15;
                        }
                    }
                    if(i == 24 && j == 22 ){
                        jlb.setIcon(icon4);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                    } 
                    fun();
                }
            });
            jbt3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent left){
                    j--;
                    b = rig[i][j];
                    if(b == 1){
                        j++;   
                    }else{
                    x-=15;
                    xyadd = false;
                    }
                    totle++;
                    if(totle >= 300){
                        jlb.setIcon(icon3);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                        if(xyadd = false){
                        x+=15;
                        }
                    }
                    if(i == 24 && j == 22 ){
                        jlb.setIcon(icon4);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                    } 
                    fun();
                }
            });
            jbt4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent right){
                    j++;
                    b = rig[i][j];
                    if(b == 1){
                        j--;   
                    }else{
                    x+=15;
                    xyadd = false;
                    }
                    totle++;
                    if(totle >= 300){
                        jlb.setIcon(icon3);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                        if(xyadd = false){
                        x-=15;
                        }
                    }
                    if(i == 24 && j == 22 ){
                        jlb.setIcon(icon4);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                    } 
                    fun();
                }
            });

            this.addKeyListener(new KeyListener(){
                public void keyPressed(KeyEvent e){
                    int a = e.getKeyCode();
                    totle++;
                    if(totle >= 300){
                        jlb.setIcon(icon3);
                        jlb.setSize(400,400);
                        jlb.setLocation(0,0);
                        contiune = false;
                    }
                    fun2(a);
                }
                public void keyReleased(KeyEvent e){

                }
                public void keyTyped(KeyEvent e) {
                }
            });
            this.setFocusable(true);
            this.setFocusTraversalKeysEnabled(false);
        }

        public void fun(){
            if(contiune){
                this.setTitle(Integer.toString(totle));
            if(x <= 0 && y <= 0){
                x = 0; y = 0;
            }else if(x + z >= 400 && y + f >= 400){
                x = 400 - z ; y = 400 - f ;
            }
            if(x + z >= 400){
                x = 400 - z;
            }else if(y + f >= 400){
                y = 400 - f;
            }else if(x <= 0){
                x = 0;
            }else if(y <= 0){
                y = 0;
            }
            jlb.setBounds(x,y,z,f);
            }
            
        }
        public void fun2(int a ){
                if(contiune){
                    this.setTitle(Integer.toString(totle));
                if( a == 38){
                    i--;
                    b = rig[i][j];
                    if(b == 1){
                        i++;   
                    }else{
                    y-=15;
                    }
                }else if( a == 40){
                    i++;
                    b = rig[i][j];
                    if(b == 1){
                        i--;   
                    }else{
                    y+=15;
                    }
                }else if( a == 39){
                    j++;
                    b = rig[i][j];
                    if(b == 1){
                        j--;   
                    }else{
                    x+=15;
                    }
                }else if( a == 37){
                    j--;
                    b = rig[i][j];
                    if(b == 1){
                        j++;   
                    }else{
                    x-=15;
                    }
                }else if( a == 61){
                    z += 3;
                    f += 3;
                }else if( a == 45){
                    z -= 3;
                    f -= 3;
                }
                if(x + z >= 400){
                    x = 400 - z;
                }else if(x <= 0){
                    x = 0;
                }
                if(y + f>= 400){
                    y = 400 - f;
                }else if(y <= 0){
                    y = 0;
                }
                if(x <= 0 && y <= 0){
                    x = 0; y = 0;
                }else if(x + z >= 400 && y + f >= 400){
                    x = 400 - z ; y = 400 - f ;
                }
                if(x + z >= 400 && y + f >= 400){
                    z = 400 - x;
                    f = 400 - y;
                }
                if( z >= 400 ){
                    z = 400;
                }else if( z <= 0 ){
                    z = 0;
                }
                jlb.setBounds(x,y,z,f);
            }
        if(i == 24 && j == 22 ){
            jlb.setIcon(icon4);
            jlb.setSize(400,400);
            jlb.setLocation(0,0);
            contiune = false;
        }    
    }
}
class ImagePanel extends JPanel{
    private Image img;
    public ImagePanel(Image img1){
        img = img1;
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
