import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.plaf.TreeUI;
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

    private Boolean lab1TF = true; 
    private Boolean lab2TF = true; 
    private Boolean lab3TF = true; 
    private Boolean lab4TF = true; 
    private Boolean lab5TF = true; 
    private Boolean lab6TF = true; 
    private Boolean lab7TF = true; 
    private Boolean lab8TF = true; 
    private Boolean lab9TF = true; 
    private Boolean lab10TF = true; 
    private Boolean lab11TF = true; 
    private Boolean lab12TF = true; 
    private Boolean lab13TF = true; 
    private Boolean lab14TF = true; 
    private Boolean lab15TF = true; 
    private Boolean lab16TF = true; 
    private Boolean lab17TF = true; 
    private Boolean lab18TF = true; 
    private Boolean lab19TF = true; 
    private Boolean lab20TF = true; 
    private Boolean lab21TF = true; 
    private Boolean lab22TF = true; 
    private Boolean lab23TF = true; 
    private Boolean lab24TF = true; 
    private Boolean lab25TF = true; 
    private Boolean lab26TF = true; 
    private Boolean lab27TF = true; 
    private Boolean lab28TF = true; 
    private Boolean lab29TF = true; 
    private Boolean lab30TF = true; 
    private Boolean lab31TF = true; 
    private Boolean lab32TF = true; 
    private Boolean lab33TF = true; 
    private Boolean lab34TF = true; 
    private Boolean lab35TF = true; 
    private Boolean lab36TF = true; 
    private Boolean lab37TF = true; 
    private Boolean lab38TF = true; 
    private Boolean lab39TF = true; 
    private Boolean lab40TF = true; 
    private Boolean lab41TF = true; 
    private Boolean lab42TF = true; 
    private Boolean lab43TF = true; 
    private Boolean lab44TF = true; 
    private Boolean lab45TF = true; 
    private Boolean lab46TF = true; 
    private Boolean lab47TF = true; 
    private Boolean lab48TF = true; 
    private Boolean lab49TF = true; 
    private Boolean lab50TF = true; 
    private Boolean lab51TF = true; 
    private Boolean lab52TF = true; 
    private Boolean lab53TF = true; 
    private Boolean lab54TF = true; 
    private Boolean lab55TF = true; 
    private Boolean lab56TF = true; 
    private Boolean lab57TF = true; 
    private Boolean lab58TF = true; 
    private Boolean lab59TF = true; 
    private Boolean lab60TF = true; 
    private Boolean lab61TF = true; 
    private Boolean lab62TF = true; 
    private Boolean lab63TF = true; 
    private Boolean lab64TF = true; 
    private Boolean lab65TF = true; 
    private Boolean lab66TF = true; 
    private Boolean lab67TF = true; 
    private Boolean lab68TF = true; 
    private Boolean lab69TF = true; 
    private Boolean lab70TF = true; 
    private Boolean lab71TF = true; 
    private Boolean lab72TF = true; 
    private Boolean lab73TF = true; 
    private Boolean lab74TF = true; 
    private Boolean lab75TF = true; 
    private Boolean lab76TF = true; 
    private Boolean lab77TF = true; 
    private Boolean lab78TF = true; 
    private Boolean lab79TF = true; 
    private Boolean lab80TF = true; 
    private Boolean lab81TF = true; 
    private Boolean labjpl1HusyouTF = true; 
    private Boolean labjpl1KyousyaTF = true;
    private Boolean labjpl1KeimaTF = true;
    private Boolean labjpl1GinsyouTF = true;
    private Boolean labjpl1KinsyouTF = true;
    private Boolean labjpl1HisyaTF = true;
    private Boolean labjpl1KakugyouTF = true;
    private Boolean labjpl2HusyouTF = true; 
    private Boolean labjpl2KyousyaTF = true;
    private Boolean labjpl2KeimaTF = true;
    private Boolean labjpl2GinsyouTF = true;
    private Boolean labjpl2KinsyouTF = true;
    private Boolean labjpl2HisyaTF = true;
    private Boolean labjpl2KakugyouTF = true;

    private Boolean erabu = false;

    private boolean labTF[][] = {{lab1TF  ,lab2TF  ,lab3TF  ,lab4TF  ,lab5TF  ,lab6TF  ,lab7TF  ,lab8TF  ,lab9TF  },   
                                 {lab10TF ,lab11TF ,lab12TF ,lab13TF ,lab14TF ,lab15TF ,lab16TF ,lab17TF ,lab18TF },       
                                 {lab19TF ,lab20TF ,lab21TF ,lab22TF ,lab23TF ,lab24TF ,lab25TF ,lab26TF ,lab27TF }, 
                                 {lab28TF ,lab29TF ,lab30TF ,lab31TF ,lab32TF ,lab33TF ,lab34TF ,lab35TF ,lab36TF },  
                                 {lab37TF ,lab38TF ,lab39TF ,lab40TF ,lab41TF ,lab42TF ,lab43TF ,lab44TF ,lab45TF },  
                                 {lab46TF ,lab47TF ,lab48TF ,lab49TF ,lab50TF ,lab51TF ,lab52TF ,lab53TF ,lab54TF },  
                                 {lab55TF ,lab56TF ,lab57TF ,lab58TF ,lab59TF ,lab60TF ,lab61TF ,lab62TF ,lab63TF },  
                                 {lab64TF ,lab65TF ,lab66TF ,lab67TF ,lab68TF ,lab69TF ,lab70TF ,lab71TF ,lab72TF },  
                                 {lab73TF ,lab74TF ,lab75TF ,lab76TF ,lab77TF ,lab78TF ,lab79TF ,lab80TF ,lab81TF }};

    private int tf1[] = {4,5,6,7,8,9,14,15,75,76,77,78,79,80};
    private int tf2[] = {24,25,26,27,28,29,34,35,65,66,67,68,69,70};
    private JLabel lab1 = new JLabel();
    private JLabel lab2 = new JLabel();
    private JLabel lab3 = new JLabel();
    private JLabel lab4 = new JLabel();
    private JLabel lab5 = new JLabel();
    private JLabel lab6 = new JLabel();
    private JLabel lab7 = new JLabel();
    private JLabel lab8 = new JLabel();
    private JLabel lab9 = new JLabel();
    private JLabel lab10 = new JLabel();
    private JLabel lab11 = new JLabel();
    private JLabel lab12 = new JLabel();
    private JLabel lab13 = new JLabel();
    private JLabel lab14 = new JLabel();
    private JLabel lab15 = new JLabel();
    private JLabel lab16 = new JLabel();
    private JLabel lab17 = new JLabel();
    private JLabel lab18 = new JLabel();
    private JLabel lab19 = new JLabel();
    private JLabel lab20 = new JLabel();
    private JLabel lab21 = new JLabel();
    private JLabel lab22 = new JLabel();
    private JLabel lab23 = new JLabel();
    private JLabel lab24 = new JLabel();
    private JLabel lab25 = new JLabel();
    private JLabel lab26 = new JLabel();
    private JLabel lab27 = new JLabel();
    private JLabel lab28 = new JLabel();
    private JLabel lab29 = new JLabel();
    private JLabel lab30 = new JLabel();
    private JLabel lab31 = new JLabel();
    private JLabel lab32 = new JLabel();
    private JLabel lab33 = new JLabel();
    private JLabel lab34 = new JLabel();
    private JLabel lab35 = new JLabel();
    private JLabel lab36 = new JLabel();
    private JLabel lab37 = new JLabel();
    private JLabel lab38 = new JLabel();
    private JLabel lab39 = new JLabel();
    private JLabel lab40 = new JLabel();
    private JLabel lab41 = new JLabel();
    private JLabel lab42 = new JLabel();
    private JLabel lab43 = new JLabel();
    private JLabel lab44 = new JLabel();
    private JLabel lab45 = new JLabel();
    private JLabel lab46 = new JLabel();
    private JLabel lab47 = new JLabel();
    private JLabel lab48 = new JLabel();
    private JLabel lab49 = new JLabel();
    private JLabel lab50 = new JLabel();
    private JLabel lab51 = new JLabel();
    private JLabel lab52 = new JLabel();
    private JLabel lab53 = new JLabel();
    private JLabel lab54 = new JLabel();
    private JLabel lab55 = new JLabel();
    private JLabel lab56 = new JLabel();
    private JLabel lab57 = new JLabel();
    private JLabel lab58 = new JLabel();
    private JLabel lab59 = new JLabel();
    private JLabel lab60 = new JLabel();
    private JLabel lab61 = new JLabel();
    private JLabel lab62 = new JLabel();
    private JLabel lab63 = new JLabel();
    private JLabel lab64 = new JLabel();
    private JLabel lab65 = new JLabel();
    private JLabel lab66 = new JLabel();
    private JLabel lab67 = new JLabel();
    private JLabel lab68 = new JLabel();
    private JLabel lab69 = new JLabel();
    private JLabel lab70 = new JLabel();
    private JLabel lab71 = new JLabel();
    private JLabel lab72 = new JLabel();
    private JLabel lab73 = new JLabel();
    private JLabel lab74 = new JLabel();
    private JLabel lab75 = new JLabel();
    private JLabel lab76 = new JLabel();
    private JLabel lab77 = new JLabel();
    private JLabel lab78 = new JLabel();
    private JLabel lab79 = new JLabel();
    private JLabel lab80 = new JLabel();
    private JLabel lab81 = new JLabel();
    private JLabel labjpl1Husyou = new JLabel();
    private JLabel labjpl1Kyousya = new JLabel();
    private JLabel labjpl1Keima = new JLabel();
    private JLabel labjpl1Ginsyou = new JLabel();
    private JLabel labjpl1Kinsyou = new JLabel();
    private JLabel labjpl1Hisya = new JLabel();
    private JLabel labjpl1Kakugyou = new JLabel();
    private JLabel labjplbtn18 = new JLabel();
    private JLabel labjpl1Player = new JLabel("Player 1");

    private JLabel labjpl1HusyouSuu = new JLabel("0");
    private JLabel labjpl1KyousyaSuu = new JLabel("0");
    private JLabel labjpl1KeimaSuu = new JLabel("0");
    private JLabel labjpl1GinsyouSuu = new JLabel("0");
    private JLabel labjpl1KinsyouSuu = new JLabel("0");
    private JLabel labjpl1HisyaSuu = new JLabel("0");
    private JLabel labjpl1KakugyouSuu = new JLabel("0");
    private JLabel labjpl18NaShi = new JLabel();
    private JLabel labjpl1PlayerNaShi = new JLabel();


    private JLabel labjpl2Husyou = new JLabel();
    private JLabel labjpl2Kyousya = new JLabel();
    private JLabel labjpl2Keima = new JLabel();
    private JLabel labjpl2Ginsyou = new JLabel();
    private JLabel labjpl2Kinsyou = new JLabel();
    private JLabel labjpl2Hisya = new JLabel();
    private JLabel labjpl2Kakugyou = new JLabel();
    private JLabel labjplbtn28 = new JLabel();
    private JLabel labjpl2Player = new JLabel("Player 2");

    private JLabel labjpl2HusyouSuu = new JLabel("0");
    private JLabel labjpl2KyousyaSuu = new JLabel("0");
    private JLabel labjpl2KeimaSuu = new JLabel("0");
    private JLabel labjpl2GinsyouSuu = new JLabel("0");
    private JLabel labjpl2KinsyouSuu = new JLabel("0");
    private JLabel labjpl2HisyaSuu = new JLabel("0");
    private JLabel labjpl2KakugyouSuu = new JLabel("0");
    private JLabel labjpl28NaShi = new JLabel();
    private JLabel labjpl2PlayerNaShi = new JLabel();

    private JLabel [][] labAll = {{lab1 ,lab2 ,lab3 ,lab4 ,lab5 ,lab6 ,lab7 ,lab8 ,lab9 },
                                  {lab10,lab11,lab12,lab13,lab14,lab15,lab16,lab17,lab18},
                                  {lab19,lab20,lab21,lab22,lab23,lab24,lab25,lab26,lab27},
                                  {lab28,lab29,lab30,lab31,lab32,lab33,lab34,lab35,lab36},
                                  {lab37,lab38,lab39,lab40,lab41,lab42,lab43,lab44,lab45},
                                  {lab46,lab47,lab48,lab49,lab50,lab51,lab52,lab53,lab54},
                                  {lab55,lab56,lab57,lab58,lab59,lab60,lab61,lab62,lab63},
                                  {lab64,lab65,lab66,lab67,lab68,lab69,lab70,lab71,lab72},
                                  {lab73,lab74,lab75,lab76,lab77,lab78,lab79,lab80,lab81}};
    private JPanel jpl = new JPanel();
    private JPanel jplSyuRui1 = new JPanel();
    private JPanel jplSyuRui2 = new JPanel();
    private JPanel jplLeft = new JPanel();
    private JPanel jplRight = new JPanel();
    private JPanel jplSuu1 = new JPanel();
    private JPanel jplSuu2 = new JPanel();
    private Boolean click = false;    //?????????????????????
    private int number ;            //???????????????????????????????????????????????????
    private int suugaku1 , suugaku2;  //???????????????????????? ????????????????????????????????????????????? 
    private int suugaku3 ;  //?????????????????????????????? 
    private int suugaku5, suugaku4;   //??????????????????????????????   ???????????????????????????????????????????????????????????????
    private boolean hannarukhgk = false;
    private boolean narukhgk = false;

    private ImageIcon frame = new ImageIcon("src/frame.png"); 

    private ImageIcon husyou = new ImageIcon("src/husyou.png");
    private ImageIcon kyousya = new ImageIcon("src/kyousya.png");
    private ImageIcon keima = new ImageIcon("src/keima.png");
    private ImageIcon ginsyou = new ImageIcon("src/ginsyou.png");
    private ImageIcon kinsyou = new ImageIcon("src/kinsyou.png");
    private ImageIcon ousyou = new ImageIcon("src/ousyou.png");
    private ImageIcon kakugyou = new ImageIcon("src/kakugyou.png");
    private ImageIcon hisya = new ImageIcon("src/hisya.png");
    private ImageIcon ryuuma = new ImageIcon("src/ryuuma.png");
    private ImageIcon ryuuou = new ImageIcon("src/ryuuou.png");
    private ImageIcon to = new ImageIcon("src/to.png");
    private ImageIcon hanhusyou = new ImageIcon("src/hanhusyou.png");
    private ImageIcon hankyousya = new ImageIcon("src/hankyousya.png");
    private ImageIcon hankeima = new ImageIcon("src/hankeima.png");
    private ImageIcon hanginsyou = new ImageIcon("src/hanginsyou.png");
    private ImageIcon hankinsyou = new ImageIcon("src/hankinsyou.png");
    private ImageIcon hanousyou = new ImageIcon("src/hanousyou.png");
    private ImageIcon hankakugyou = new ImageIcon("src/hankakugyou.png");
    private ImageIcon hanhisya = new ImageIcon("src/hanhisya.png");
    private ImageIcon hanryuuma = new ImageIcon("src/hanryuuma.png");
    private ImageIcon hanryuuou = new ImageIcon("src/hanryuuou.png");
    private ImageIcon hanto = new ImageIcon("src/hanto.png");

    private ImageIcon husyouErabu = new ImageIcon("src/husyouErabu.png");
    private ImageIcon kyousyaErabu = new ImageIcon("src/kyousyaErabu.png");
    private ImageIcon keimaErabu = new ImageIcon("src/keimaErabu.png");
    private ImageIcon ginsyouErabu = new ImageIcon("src/ginsyouErabu.png");
    private ImageIcon kinsyouErabu = new ImageIcon("src/kinsyouErabu.png");
    private ImageIcon ousyouErabu = new ImageIcon("src/ousyouErabu.png");
    private ImageIcon kakugyouErabu = new ImageIcon("src/kakugyouErabu.png");
    private ImageIcon hisyaErabu = new ImageIcon("src/hisyaErabu.png");
    private ImageIcon ryuumaErabu = new ImageIcon("src/ryuumaErabu.png");
    private ImageIcon ryuuouErabu = new ImageIcon("src/ryuuouErabu.png");
    private ImageIcon toErabu = new ImageIcon("src/toErabu.png");
    private ImageIcon hanhusyouErabu = new ImageIcon("src/hanhusyouErabu.png");
    private ImageIcon hankyousyaErabu = new ImageIcon("src/hankyousyaErabu.png");
    private ImageIcon hankeimaErabu = new ImageIcon("src/hankeimaErabu.png");
    private ImageIcon hanginsyouErabu = new ImageIcon("src/hanginsyouErabu.png");
    private ImageIcon hankinsyouErabu = new ImageIcon("src/hankinsyouErabu.png");
    private ImageIcon hanousyouErabu = new ImageIcon("src/hanousyouErabu.png");
    private ImageIcon hankakugyouErabu = new ImageIcon("src/hankakugyouErabu.png");
    private ImageIcon hanhisyaErabu = new ImageIcon("src/hanhisyaErabu.png");
    private ImageIcon hanryuumaErabu = new ImageIcon("src/hanryuumaErabu.png");
    private ImageIcon hanryuuouErabu = new ImageIcon("src/hanryuuouErabu.png");
    private ImageIcon hantoErabu = new ImageIcon("src/hantoErabu.png");
    private ImageIcon Erabu2 = new ImageIcon("src/Erabu2.png");
    
    private int turn = 0;
    private int mochikomashiyo = 0 ; //???????????????????????????  ??????????????????
    private Boolean mochikomaHandan = false ; //?????????????????????????????????????????????
    private int komanoshiyoImg = 0 ;  //????????????????????????????????????
    private int kuruma = 0;
    private boolean naru = false;
    private boolean hannaru = false;
    private boolean syomennaru = false;
    private boolean Keimanaru = false;
    private boolean HanKeimanaru = false;
    private int ff = 0;  //???????????????????????? ????????????
    private Container cp;

                          //  ?????? ?????? ???  ???  ???  ???  ???
    private int kiryokuP1[] = { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    

                          //  ?????? ?????? ???  ???  ???  ???  ???
    private int kiryokuP2[] = { 0 , 0 , 0 , 0 , 0 , 0 , 0 };


                            // 0  1  2  3  4  5  6  7  8 
    private int syougi[][] = {{5 ,6 ,7 ,8 ,9 ,8 ,7 ,6 ,5 },  //0   4??????    5??????  14?????? 6?????? 7??????  
                              {0 ,14,0 ,0 ,0 ,0 ,0 ,15,0 },  //1    ?????? : 65 ??????  66 ??????  67 ??????->To  68 ??????->To  69 ??????->To  70 ???->To                         
                              {4 ,4 ,4 ,4 ,4 ,4 ,4 ,4 ,4 },  //2    ???          ???????????? : 75 ??????  76 ??????  77 ??????->To  78 ??????->To  79 ??????->To  80 ???->To
                              {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },  //3    ???
                              {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },  //4    ???
                              {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },  //5    ???
                              {24,24,24,24,24,24,24,24,24},  //6   24,25,26,27,28,29,35,34
                              {0 ,35,0 ,0 ,0 ,0 ,0 ,34,0 },  //7       //????????????????????????????????????  ?????????????????????????????????  ????????????????????????   ?????????????????? ??????????????????????????????      
                              {25,26,27,28,29,28,27,26,25}}; //8           ??????????????????????????????????????????
    
    private int dataCT[][] = {{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999},{999,999}};
//???????????????????????????????????????????????? 0          1         2        3         4         5        6           7        8        9          10        11        12        13       14        15          16       17        18        19        20       21        22         23         24        25       26   

    ImageIcon [] img = {hankyousya, hankeima, hanginsyou, hankinsyou, hanousyou, frame, hanhusyou, hankakugyou, hanhisya, kyousya, keima, ginsyou, kinsyou, ousyou, kakugyou, hisya, husyou, hanryuuma, hanryuuou, hanto , ryuuma, ryuuou, to  ,hankyousyaErabu, hankeimaErabu, hanginsyouErabu, hankinsyouErabu, hanousyouErabu, hanhusyouErabu, hankakugyouErabu, hanhisyaErabu, kyousyaErabu, keimaErabu, ginsyouErabu, kinsyouErabu, ousyouErabu, kakugyouErabu, hisyaErabu, husyouErabu, hanryuumaErabu, hanryuuouErabu, hantoErabu, ryuumaErabu, ryuuouErabu, toErabu, Erabu2};
                        //0             1       2                3        4          5       6          7          8           9      10     11       12      13        14       15     16        17        18       19       20       21  22     23                24              25                    26              27              28              29               30             31            32          33          34              35              36          37          38          39          40              41              42          43          44       45     
    public MainFrame2() {
        init();
    }

    public void init(){
        playerTurnF(turn);  //?????????????????????????????????
        cp = this.getContentPane();
        this.setTitle("Ver 1.0.2");
        this.setResizable(false);
        this.setBounds(100,100,765,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jplRight.setLayout(new BorderLayout());
        jplLeft.setLayout(new BorderLayout());
        jpl.setLayout(new GridLayout(9,9,0,0));
        jplSyuRui1.setLayout(new GridLayout(9,1,0,0));
        jplSyuRui2.setLayout(new GridLayout(9,1,0,0));
        jplSuu1.setLayout(new GridLayout(9,1,0,0));
        jplSuu2.setLayout(new GridLayout(9,1,0,0));

        labjpl1HusyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1KyousyaSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1GinsyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1KinsyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1HisyaSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1KakugyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl1KeimaSuu.setFont(new Font("", Font.PLAIN, 25));

        labjpl2HusyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2KyousyaSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2GinsyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2KinsyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2HisyaSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2KakugyouSuu.setFont(new Font("", Font.PLAIN, 25));
        labjpl2KeimaSuu.setFont(new Font("", Font.PLAIN, 25));


            for(int i = 0 ; i < img.length ; i++){   //??????????????????
                Image img1 = img[i].getImage();
                Image newImg1 = img1.getScaledInstance(65,62,Image.SCALE_SMOOTH);
                img[i] = new ImageIcon(newImg1);
            } 
            //??????????????????
            for(int i = 0  ; i < 5 ; i++){
                for(int j = i ; j <= i ; j++){
                    labAll[0][i].setIcon(img[j]);
                    jpl.add(labAll[0][i]);
                }
            }
            int c = 3 ;             //????????????img[c]?????????
            for(int i = 5 ; i < 9 ; i++){       
                labAll[0][i].setIcon(img[c]);
                jpl.add(labAll[0][i]);
                c--;
            }
            for(int gg = 1 ; gg < 8 ; gg++){
            for(int i = 0 ; i < 9 ; i++){    
                if(gg == 1){
                    if(i == 1){
                        labAll[gg][i].setIcon(img[8]);
                    }else if(i == 7){
                        labAll[gg][i].setIcon(img[7]);
                    }else{
                        labAll[gg][i].setIcon(img[5]);
                    }
                }

                if(gg == 2){
                    labAll[gg][i].setIcon(img[6]);
                }
                if(gg == 3){
                    labAll[gg][i].setIcon(img[5]);
                }
                if(gg == 4){
                    labAll[gg][i].setIcon(img[5]);
                }
                if(gg == 5){
                    labAll[gg][i].setIcon(img[5]);
                }
                if(gg == 6){
                    labAll[gg][i].setIcon(img[16]);
                }
                if(gg == 7){
                    if(i == 1){
                        labAll[gg][i].setIcon(img[14]);
                    }else if(i == 7){
                        labAll[gg][i].setIcon(img[15]);
                    }else{
                    labAll[gg][i].setIcon(img[5]);
                    }
                }
                jpl.add(labAll[gg][i]);
            }
        }
            c = 9;
            for(int i = 0 ; i < 5 ; i++){
                labAll[8][i].setIcon(img[c]);  
                jpl.add(labAll[8][i]);
                c++;
            }
            c--;
            for(int i = 5 ; i < 9 ; i++){ 
                c--;
                labAll[8][i].setIcon(img[c]);
                jpl.add(labAll[8][i]);
            }
            //??????????????????

        labjpl1Husyou.setIcon(img[16]);  //???????????????????????????
        labjpl1Kyousya.setIcon(img[9]);
        labjpl1Keima.setIcon(img[10]);
        labjpl1Ginsyou.setIcon(img[11]);
        labjpl1Kinsyou.setIcon(img[12]);
        labjpl1Hisya.setIcon(img[15]);
        labjpl1Kakugyou.setIcon(img[14]);

        labjpl2Husyou.setIcon(img[16]);
        labjpl2Kyousya.setIcon(img[9]);
        labjpl2Keima.setIcon(img[10]);
        labjpl2Ginsyou.setIcon(img[11]);
        labjpl2Kinsyou.setIcon(img[12]);
        labjpl2Hisya.setIcon(img[15]);
        labjpl2Kakugyou.setIcon(img[14]);


        jplSyuRui1.add(labjpl1Husyou);  //???????????????????????????
        jplSyuRui1.add(labjpl1Kyousya);
        jplSyuRui1.add(labjpl1Keima);
        jplSyuRui1.add(labjpl1Ginsyou);
        jplSyuRui1.add(labjpl1Kinsyou);
        jplSyuRui1.add(labjpl1Hisya);
        jplSyuRui1.add(labjpl1Kakugyou);
        jplSyuRui1.add(labjplbtn18);
        jplSyuRui1.add(labjpl1Player);

        jplSuu1.add(labjpl1HusyouSuu); //???????????????????????????
        jplSuu1.add(labjpl1KyousyaSuu);
        jplSuu1.add(labjpl1KeimaSuu);
        jplSuu1.add(labjpl1GinsyouSuu);
        jplSuu1.add(labjpl1KinsyouSuu);
        jplSuu1.add(labjpl1HisyaSuu);
        jplSuu1.add(labjpl1KakugyouSuu);
        jplSuu1.add(labjpl18NaShi);
        jplSuu1.add(labjpl1PlayerNaShi);

        jplSyuRui2.add(labjpl2Player);
        jplSyuRui2.add(labjpl2Husyou);
        jplSyuRui2.add(labjpl2Kyousya);
        jplSyuRui2.add(labjpl2Keima);
        jplSyuRui2.add(labjpl2Ginsyou);
        jplSyuRui2.add(labjpl2Kinsyou);
        jplSyuRui2.add(labjpl2Hisya);
        jplSyuRui2.add(labjpl2Kakugyou);
        jplSyuRui2.add(labjplbtn28);


        jplSuu2.add(labjpl2PlayerNaShi);
        jplSuu2.add(labjpl2HusyouSuu);
        jplSuu2.add(labjpl2KyousyaSuu);
        jplSuu2.add(labjpl2KeimaSuu);
        jplSuu2.add(labjpl2GinsyouSuu);
        jplSuu2.add(labjpl2KinsyouSuu);
        jplSuu2.add(labjpl2HisyaSuu);
        jplSuu2.add(labjpl2KakugyouSuu);
        jplSuu2.add(labjpl28NaShi);
        

        jplLeft.add(jplSuu1,BorderLayout.WEST);
        jplLeft.add(jplSyuRui1,BorderLayout.CENTER);
        jplRight.add(jplSuu2,BorderLayout.EAST);
        jplRight.add(jplSyuRui2,BorderLayout.CENTER);
        cp.add(jplLeft,BorderLayout.WEST);
        cp.add(jpl,BorderLayout.CENTER);
        cp.add(jplRight,BorderLayout.EAST);
        
        labjpl1Husyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();  //????????????????????????????????????  ??????????????????????????????  ????????????????????????  ???????????????????????????
                if(kiryokuP1[4] > 0 ){
                    if(labjpl1HusyouTF == true){
                    if(mochikomaHandan == true){ //???????????????????????????????????????
                        mochikomaHandan = false;  //????????????????????????false
                        mochikomaHandanImg(); //???????????????????????????????????????
                    }else{
                        System.out.println("1 Husyou");
                        labjpl1Husyou.setIcon(img[38]);  
                        mochikomashiyo = 24;  //????????????
                        komanoshiyoImg = 16;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;  //??????????????????????????? ???ckick??????false ???????????????????????????????????????  ???????????????????????????
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Kyousya.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[0] > 0 ){  //?????????????????????
                    if(labjpl1KyousyaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();

                    }else{
                        System.out.println("1 Kyousya");
                        labjpl1Kyousya.setIcon(img[31]);  
                        mochikomashiyo = 25;  //????????????
                        komanoshiyoImg = 9;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Keima.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[1] > 0 ){  //?????????????????????
                    if(labjpl1KeimaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("1 Keima");
                        labjpl1Keima.setIcon(img[32]);  
                        mochikomashiyo = 26;  //????????????
                        komanoshiyoImg = 10;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Ginsyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[2] > 0 ){  //?????????????????????
                    if(labjpl1GinsyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("1 Ginsyou");
                        labjpl1Ginsyou.setIcon(img[33]);  
                        mochikomashiyo = 27;  //????????????
                        komanoshiyoImg = 11;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Kinsyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[3] > 0 ){  //?????????????????????
                    if(labjpl1KinsyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("1 Kinsyou");
                        labjpl1Kinsyou.setIcon(img[34]);  
                        mochikomashiyo = 28;  //????????????
                        komanoshiyoImg = 12;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Kakugyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[6] > 0 ){  //?????????????????????
                    if(labjpl1KakugyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("1 Kakugyou");
                        labjpl1Kakugyou.setIcon(img[36]);  
                        mochikomashiyo = 35;  //????????????
                        komanoshiyoImg = 14;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl1Hisya.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP1[5] > 0 ){  //?????????????????????
                    if(labjpl1HisyaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("1 Hisya");
                        labjpl1Hisya.setIcon(img[37]);  
                        mochikomashiyo = 34;  //????????????
                        komanoshiyoImg = 15;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Husyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[4] > 0 ){
                    if(labjpl2HusyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Husyou");
                        labjpl2Husyou.setIcon(img[38]);  
                        mochikomashiyo = 4;  //????????????
                        komanoshiyoImg = 6;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Kyousya.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[0] > 0 ){  //?????????????????????
                    if(labjpl2KyousyaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Kyousya");
                        labjpl2Kyousya.setIcon(img[31]);  
                        mochikomashiyo = 5;  //????????????
                        komanoshiyoImg = 0;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Keima.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[1] > 0 ){  //?????????????????????
                    if(labjpl2KeimaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Keima");
                        labjpl2Keima.setIcon(img[32]);  
                        mochikomashiyo = 6;  //????????????
                        komanoshiyoImg = 1;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Ginsyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[2] > 0 ){  //?????????????????????
                    if(labjpl2GinsyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Ginsyou");
                        labjpl2Ginsyou.setIcon(img[33]);  
                        mochikomashiyo = 7;  //????????????
                        komanoshiyoImg = 2;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2 );  //???????????????false
                            erabu = false;
                        }
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Kinsyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[3] > 0 ){  //?????????????????????
                    if(labjpl2KinsyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Kinsyou");
                        labjpl2Kinsyou.setIcon(img[34]);  
                        mochikomashiyo = 8;  //????????????
                        komanoshiyoImg = 3;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Kakugyou.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[6] > 0 ){  //?????????????????????
                    if(labjpl2KakugyouTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Kakugyou");
                        labjpl2Kakugyou.setIcon(img[36]);  
                        mochikomashiyo = 15;  //????????????
                        komanoshiyoImg = 7;  //??????
                        mochikomaHandan = true;  //?????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        labjpl2Hisya.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(kiryokuP2[5] > 0 ){  //?????????????????????
                    if(labjpl2HisyaTF == true){
                    if(mochikomaHandan == true){
                        mochikomaHandan = false;
                        mochikomaHandanImg();
                    }else{
                        System.out.println("2 Hisya");
                        labjpl2Hisya.setIcon(img[37]);  
                        mochikomashiyo = 14;  //????????????
                        komanoshiyoImg = 8;  //??????
                        mochikomaHandan = true;  //?????????   mochikomaHandanShiki ???????????????????????????
                        click = false;
                        if(erabu == true){
                            erabuNashi(number , suugaku1 , suugaku2);  //???????????????false
                            erabu = false;
                        }
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        lab1.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse(); //???????????????????????????????????????
                if(labTF[0][0] == true ){ //????????????????????????   ???????????????P1 or P2 
                System.out.println("no.1");
                suugaku1 = 0;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 0;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[0][0];          //???????????????????????????????????????????????????  
                System.out.println("number : " + number); //5
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);      //??????????????????  ????????????
                }else if(click == false){ 
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????  
                    handan(number , suugaku1 , suugaku2); //???????????????????????????????????????  ?????????????????????LAB??????TRUE?????????  ???????????????????????????
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);   //???????????????????????????
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][0]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][0]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab2.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][1] == true){
                System.out.println("no.2");
                suugaku1 = 0;       
                suugaku2 = 1;       
                number = syougi[0][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][1]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][1]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab3.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][2] == true){
                System.out.println("no.3");
                suugaku1 = 0;       
                suugaku2 = 2;       
                number = syougi[0][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][2]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][2]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
                }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab4.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][3] == true){
                System.out.println("no.4");
                suugaku1 = 0;       
                suugaku2 = 3;       
                number = syougi[0][3]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][3]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][3]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab5.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][4] == true){
                System.out.println("no.5");
                suugaku1 = 0;       
                suugaku2 = 4;       
                number = syougi[0][4]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][4]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][4]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab6.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][5] == true){
                System.out.println("no.6");
                suugaku1 = 0;       
                suugaku2 = 5;       
                number = syougi[0][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][5]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][5]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab7.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][6] == true){
                System.out.println("no.7");
                suugaku1 = 0;       
                suugaku2 = 6;       
                number = syougi[0][6]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][6]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][6]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab8.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][7] == true){
                System.out.println("no.8");
                suugaku1 = 0;       
                suugaku2 = 7;       
                number = syougi[0][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][7]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][7]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab9.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[0][8] == true){
                System.out.println("no.9");
                suugaku1 = 0;       
                suugaku2 = 8;       
                number = syougi[0][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(narukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[0][8]; //??????????????????????????????????????????????????? ?????????????????????  ??????????????????????????????
                            narigoma(suugaku1,suugaku2,number);//??????
                        }
                    }else if(syomennaru == true){
                        number = syougi[0][8]; 
                        narigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab10.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][0] == true){
                System.out.println("no.10");
                suugaku1 = 1;       
                suugaku2 = 0;       
                number = syougi[1][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){ //????????????????????????
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){    //??????????????????????????????narigoma?????????????
                            number = syougi[1][0];       
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab11.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][1] == true){
                System.out.println("no.11");
                suugaku1 = 1;       
                suugaku2 = 1;       
                number = syougi[1][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][1]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab12.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][2] == true){
                System.out.println("no.12");
                suugaku1 = 1;       
                suugaku2 = 2;       
                number = syougi[1][2];
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);  
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][2]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab13.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][3] == true){
                System.out.println("no.13");
                suugaku1 = 1;       
                suugaku2 = 3;       
                number = syougi[1][3]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][3]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab14.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][4] == true){
                System.out.println("no.14");
                suugaku1 = 1;       
                suugaku2 = 4;       
                number = syougi[1][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][4]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab15.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][5] == true){
                System.out.println("no.15");
                suugaku1 = 1;       
                suugaku2 = 5;       
                number = syougi[1][5]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][5]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab16.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][6] == true){
                System.out.println("no.16");
                suugaku1 = 1;       
                suugaku2 = 6;       
                number = syougi[1][6]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][6]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab17.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][7] == true){
                System.out.println("no.17");
                suugaku1 = 1;       
                suugaku2 = 7;       
                number = syougi[1][7]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][7]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab18.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[1][8] == true){
                System.out.println("no.18");
                suugaku1 = 1;       
                suugaku2 = 8;       
                number = syougi[1][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        if(Keimanaru == false){
                            option();  //?????????????????????????????????
                        }
                        if(naru == true || Keimanaru == true){
                            number = syougi[1][8]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab19.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][0] == true){
                System.out.println("no.19");
                suugaku1 = 2;       
                suugaku2 = 0;       
                number = syougi[2][0]; 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number); 
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][0]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab20.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][1] == true){
                System.out.println("no.20");
                suugaku1 = 2;       
                suugaku2 = 1;       
                number = syougi[2][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][1]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab21.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][2] == true){
                System.out.println("no.21");
                suugaku1 = 2;       
                suugaku2 = 2;       
                number = syougi[2][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][2]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab22.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][3] == true){
                System.out.println("no.22");
                suugaku1 = 2;       
                suugaku2 = 3;       
                number = syougi[2][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][3]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab23.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][4] == true){
                System.out.println("no.23");
                suugaku1 = 2;       
                suugaku2 = 4;       
                number = syougi[2][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][4]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab24.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][5] == true){
                System.out.println("no.24");
                suugaku1 = 2;       
                suugaku2 = 5;       
                number = syougi[2][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][5]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab25.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][6] == true){
                System.out.println("no.25");
                suugaku1 = 2;       
                suugaku2 = 6;       
                number = syougi[2][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][6]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab26.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][7] == true){
                System.out.println("no.26");
                suugaku1 = 2;       
                suugaku2 = 7;       
                number = syougi[2][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][7]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab27.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[2][8] == true){
                System.out.println("no.27");
                suugaku1 = 2;       
                suugaku2 = 8;       
                number = syougi[2][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    System.out.println("1 syomennaru :" + syomennaru);
                    handanMove(suugaku1 , suugaku2);
                    System.out.println("2 syomennaru :" + syomennaru);
                    if(syomennaru == true){
                        option();
                        if(naru == true){
                            number = syougi[2][8]; 
                            narigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab28.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][0] == true){
                System.out.println("no.28");
                suugaku1 = 3;       
                suugaku2 = 0;       
                number = syougi[3][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab29.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][1] == true){
                System.out.println("no.29");
                suugaku1 = 3;       
                suugaku2 = 1;       
                number = syougi[3][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
        }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab30.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][2] == true){
                System.out.println("no.30");
                suugaku1 = 3;       
                suugaku2 = 2;       
                number = syougi[3][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab31.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][3] == true){
                System.out.println("no.31");
                suugaku1 = 3;       
                suugaku2 = 3;       
                number = syougi[3][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab32.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][4] == true){
                System.out.println("no.32");
                suugaku1 = 3;       
                suugaku2 = 4;       
                number = syougi[3][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab33.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][5] == true){
                System.out.println("no.33");
                suugaku1 = 3;       
                suugaku2 = 5;       
                number = syougi[3][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab34.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][6] == true){
                    
                System.out.println("no.34");
                suugaku1 = 3;       
                suugaku2 = 6;       
                number = syougi[3][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab35.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][7] == true){
                    
                System.out.println("no.35");
                suugaku1 = 3;       
                suugaku2 = 7;       
                number = syougi[3][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    naru = false;
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab36.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[3][8] == true){
                    
                System.out.println("no.36");
                suugaku1 = 3;       
                suugaku2 = 8;       
                number = syougi[3][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab37.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][0] == true){
                System.out.println("no.37");
                suugaku1 = 4;       
                suugaku2 = 0;       
                number = syougi[4][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab38.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][1] == true){
                    
                System.out.println("no.38");
                suugaku1 = 4;       
                suugaku2 = 1;       
                number = syougi[4][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){    
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab39.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][2] == true){
                    
                System.out.println("no.39");
                suugaku1 = 4;       
                suugaku2 = 2;       
                number = syougi[4][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){                 
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab40.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][3] == true){
                    
                System.out.println("no.40");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 3;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][3];          //???????????????????????????????????????????????????       
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab41.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][4] == true){
                System.out.println("no.41");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][4];          //??????????????????????????????????????????????????? 
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab42.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][5] == true){
                    
                System.out.println("no.42");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 5;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][5];          //???????????????????????????????????????????????????       
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab43.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][6] == true){
                    
                System.out.println("no.43");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 6;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][6];          //???????????????????????????????????????????????????       
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
        }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab44.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][7] == true){
                    
                System.out.println("no.44");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 7;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][7];          //???????????????????????????????????????????????????       
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 
        lab45.addMouseListener(new MouseListener(){     
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[4][8] == true){
                    
                System.out.println("no.48");
                suugaku1 = 4;                   //???????????????????????? ????????????????????????????????????????????? 
                suugaku2 = 8;                   //???????????????????????? ????????????????????????????????????????????? 
                number = syougi[4][8];          //???????????????????????????????????????????????????       
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);  //?????????????????????
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        }); 

        lab46.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][0] == true){
                    
                System.out.println("no.46");
                suugaku1 = 5;       
                suugaku2 = 0;       
                number = syougi[5][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab47.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][1] == true){
                System.out.println("no.47");
                suugaku1 = 5;       
                suugaku2 = 1;       
                number = syougi[5][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });

        lab48.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][2] == true){
                    
                System.out.println("no.48");
                suugaku1 = 5;       
                suugaku2 = 2;       
                number = syougi[5][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab49.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][3] == true){
                    
                System.out.println("no.49");
                suugaku1 = 5;       
                suugaku2 = 3;       
                number = syougi[5][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab50.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][4] == true){
                System.out.println("no.50");
                suugaku1 = 5;       
                suugaku2 = 4;       
                number = syougi[5][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab51.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][5] == true){
                System.out.println("no.51");
                suugaku1 = 5;       
                suugaku2 = 5;       
                number = syougi[5][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab52.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][6] == true){
                    
                System.out.println("no.52");
                suugaku1 = 5;       
                suugaku2 = 6;       
                number = syougi[5][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab53.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][7] == true){
                System.out.println("no.53");
                suugaku1 = 5;       
                suugaku2 = 7;       
                number = syougi[5][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab54.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[5][8] == true){
                    
                System.out.println("no.54");
                suugaku1 = 5;       
                suugaku2 = 8;       
                number = syougi[5][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab55.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][0] == true){
                System.out.println("no.55");
                suugaku1 = 6;       
                suugaku2 = 0;       
                number = syougi[6][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][0];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab56.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][1] == true){
                    
                System.out.println("no.56");
                suugaku1 = 6;       
                suugaku2 = 1;       
                number = syougi[6][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][1];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab57.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][2] == true){
                System.out.println("no.57");
                suugaku1 = 6;       
                suugaku2 = 2;       
                number = syougi[6][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][2];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab58.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][3] == true){
                System.out.println("no.58");
                suugaku1 = 6;       
                suugaku2 = 3;       
                number = syougi[6][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][3];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab59.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][4] == true){
                System.out.println("no.59");
                suugaku1 = 6;       
                suugaku2 = 4;       
                number = syougi[6][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][4];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab60.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][5] == true){
                    
                System.out.println("no.60");
                suugaku1 = 6;       
                suugaku2 = 5;       
                number = syougi[6][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][5];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab61.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][6] == true){
                    
                System.out.println("no.61");
                suugaku1 = 6;       
                suugaku2 = 6;       
                number = syougi[6][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][6];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab62.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][7] == true){
                    
                System.out.println("no.62");
                suugaku1 = 6;       
                suugaku2 = 7;       
                number = syougi[6][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][7];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab63.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[6][8] == true){
                    
                System.out.println("no.63");
                suugaku1 = 6;       
                suugaku2 = 8;       
                number = syougi[6][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        option();
                        if(naru == true){
                            number = syougi[6][8];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab64.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][0] == true){
                    
                System.out.println("no.64");
                suugaku1 = 7;       
                suugaku2 = 0;       
                number = syougi[7][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][0];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab65.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][1] == true){
                    
                System.out.println("no.65");
                suugaku1 = 7;       
                suugaku2 = 1;       
                number = syougi[7][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][1];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab66.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][2] == true){
                    
                System.out.println("no.66");
                suugaku1 = 7;       
                suugaku2 = 2;       
                number = syougi[7][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][2];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab67.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][3] == true){
                    
                System.out.println("no.67");
                suugaku1 = 7;       
                suugaku2 = 3;       
                number = syougi[7][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][3];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab68.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][4] == true){
                    
                System.out.println("no.68");
                suugaku1 = 7;       
                suugaku2 = 4;       
                number = syougi[7][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][4];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab69.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][5] == true){
                    
                System.out.println("no.69");
                suugaku1 = 7;       
                suugaku2 = 5;       
                number = syougi[7][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][5];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab70.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][6] == true){
                    
                System.out.println("no.70");
                suugaku1 = 7;       
                suugaku2 = 6;       
                number = syougi[7][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][6];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab71.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][7] == true){
                    
                System.out.println("no.71");
                suugaku1 = 7;       
                suugaku2 = 7;       
                number = syougi[7][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][7];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab72.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[7][8] == true){
                System.out.println("no.72");
                suugaku1 = 7;       
                suugaku2 = 8;       
                number = syougi[7][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannaru == true){
                        if(HanKeimanaru == false){
                            option();
                        }
                        if(naru == true || HanKeimanaru == true){
                            number = syougi[7][8];
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab73.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][0] == true){
                    
                System.out.println("no.73");
                suugaku1 = 8;       
                suugaku2 = 0;       
                number = syougi[8][0];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][0]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][0]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab74.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][1] == true){
                    
                System.out.println("no.74");
                suugaku1 = 8;       
                suugaku2 = 1;       
                number = syougi[8][1];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][1]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][1]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab75.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][2] == true){
                    
                System.out.println("no.75");
                suugaku1 = 8;       
                suugaku2 = 2;       
                number = syougi[8][2];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][2]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][2]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab76.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][3] == true){
                    
                System.out.println("no.76");
                suugaku1 = 8;       
                suugaku2 = 3;       
                number = syougi[8][3];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][3]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][3]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab77.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][4] == true){
                    
                System.out.println("no.77");
                suugaku1 = 8;       
                suugaku2 = 4;       
                number = syougi[8][4];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][4]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][4]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab78.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][5] == true){
                    
                System.out.println("no.78");
                suugaku1 = 8;       
                suugaku2 = 5;       
                number = syougi[8][5];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][5]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][5]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab79.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][6] == true){
                    
                System.out.println("no.79");
                suugaku1 = 8;       
                suugaku2 = 6;       
                number = syougi[8][6];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][6]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][6]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab80.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][7] == true){
                    
                System.out.println("no.80");
                suugaku1 = 8;       
                suugaku2 = 7;       
                number = syougi[8][7];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][7]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][7]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
        lab81.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent cd){
                frameErabuFalse();
                if(labTF[8][8] == true){
                    
                System.out.println("no.81");
                suugaku1 = 8;       
                suugaku2 = 8;       
                number = syougi[8][8];  
                if(mochikomaHandan == true){
                    mochikomaHandanShiki(suugaku1 , suugaku2 , number);
                }else if(click == false){
                    erabu(number , suugaku1 , suugaku2);
                    handan(number , suugaku1 , suugaku2);
                }else if(click == true){
                    handanMove(suugaku1 , suugaku2);
                    if(hannarukhgk == true){
                        option();
                        if(naru == true){
                            number = syougi[8][8]; 
                            hannarigoma(suugaku1,suugaku2,number);
                        }
                    }else if(hannaru == true){
                        number = syougi[8][8]; 
                        hannarigoma(suugaku1,suugaku2,number);
                    }
                }
            }
            }
            public void mouseEntered(MouseEvent a){
            }
            public void mouseExited(MouseEvent a){
            }
            public void mousePressed(MouseEvent a){
            }
            public void mouseReleased(MouseEvent a){
            }
        });
    }
    

    public void handan(int suu ,int suu2 , int suu3){//?????????  suu = ????????????  suu2 ???????????? y  suu3 ???????????? x
        reData();    //???????????????
        naru = false ;  //???????????????
        if(suu != 0 ){  //???????????????????????????  ?????????label??????true ?????????
            playerTurnT();  //?????????LABEL ???????????????
        }
        kuruma = 0;             //?????????????????????????????????  //?????????  ??????int ???????????????
        suugaku4 = suu2;        //?????????????????????   ??????????????????????????????
        suugaku5 = suu3;        //?????????????????????   ??????????????????????????????
        switch(suu){
            case 4:  //?????????   ????????????????????????????????????
                System.out.println("click 4");
                suugaku3 = 4;       //??????????????????????????????   ?????? : 65 ??????  66 ??????  67 ??????->To  68 ??????->To  69 ??????->To  70 ???->To   
                suu2++;             //??????????????????  ???????????? : 75 ??????  76 ??????  77 ??????->To  78 ??????->To  79 ??????->To  80 ???->To
                ff = 0;
                hanmenhakaijyutusshiki(suu2 , suu3);
                break;
            case 5:  //?????????   ????????????????????????????????????
                System.out.println("click 5");
                suugaku3 = 5;
                click = true;
                for(int i = suu2 + 1 ; i < 9 ; i++){  //???for??????????????????????????????????????????????????????????????????  ???????????????????????????
                    if(syougi[i][suu3] == 0 || syougi[i][suu3] == 24 || syougi[i][suu3] == 25 || syougi[i][suu3] == 26 || syougi[i][suu3] == 27 || syougi[i][suu3] == 28 || syougi[i][suu3] == 29 || syougi[i][suu3] == 35 || syougi[i][suu3] == 34 || syougi[i][suu3] == 65 || syougi[i][suu3] == 66 || syougi[i][suu3] == 67 || syougi[i][suu3] == 68|| syougi[i][suu3] == 69 || syougi[i][suu3] == 70){
                        dataCT[kuruma][0] = i;    //????????????If???????????????????????????????????????
                        dataCT[kuruma][1] = suu3;
                        kuruma++;
                        if(syougi[i][suu3] != 0){
                            break;  //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                        }
                    }else{
                        break;
                    }
                }
                break;
            case 14:  //?????????  ????????????????????????????????????
                System.out.println("click 14");
                suugaku3 = 14;
                kuruma = 0;
                click = true;
                int hisyaSu2 = suu2;    //????????????????????????????????????
                int hisyaSu3 = suu3;    //????????????????????????????????????
                while(true){   //??????????????????????????????
                    suu2++;
                    if(suu2 >= 9){    //????????????????????????  ???????????? ????????????????????????????????????
                        break;
                    }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                        dataCT[kuruma][0] = suu2;
                        dataCT[kuruma][1] = suu3;
                        kuruma++;
                        if(syougi[suu2][suu3] != 0){
                            break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                        }
                    }else{
                        break;   //????????????????????????????????????????????????  ??????????????????????????????
                    }
                }
                suu2 = hisyaSu2;
                while(true){
                    suu2--;
                    if(suu2 < 0 ){
                        break;   //????????????????????????  ???????????? ????????????????????????????????????
                    }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                        dataCT[kuruma][0] = suu2;
                        dataCT[kuruma][1] = suu3;
                        kuruma++;
                        if(syougi[suu2][suu3] != 0){
                            break;
                        }
                    }else{
                        break;
                    }
                }
                suu2 = hisyaSu2;
                while(true){
                    suu3++;
                    if(suu3 >= 9){
                        break;
                    }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                        dataCT[kuruma][0] = suu2;
                        dataCT[kuruma][1] = suu3;
                        kuruma++;
                        if(syougi[suu2][suu3] != 0){
                            break;
                        }
                    }else{
                        break;
                    }
                }
                suu3 = hisyaSu3;
                while(true){
                    suu3--;
                    if(suu3 < 0){
                        break;
                    }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                        dataCT[kuruma][0] = suu2;
                        dataCT[kuruma][1] = suu3;
                        kuruma++;
                        if(syougi[suu2][suu3] != 0){
                            break;
                        }
                    }else{
                        break;
                    }
                }
                    break;
                case 6:   //?????????   ????????????????????????????????????
                    System.out.println("click 6");
                    ff = 0;   //??????
                    suugaku3 = 6;       //??????????????????????????????
                    suu2 += 2;
                    suu3 ++;
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2;  //???????????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 7:   //?????????   ????????????????????????????????????
                    System.out.println("click 7");
                    suugaku3 = 7;
                    ff = 0 ; //?????????????????????????????????????????????
                    suu2++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);  //???????????????
                    suu3--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);  
                    suu3+=2;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);  
                    suu2-=2;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3); 
                    suu3-=2;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3); 
                    break;
                case 8 :  //?????????
                    System.out.println("click 8");
                    suugaku3 = 8;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 9 :   //?????????
                    System.out.println("click 9");
                    suugaku3 = 9;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3+=2;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 15:   //?????????
                    System.out.println("click 15");
                    click = true;
                    suugaku3 = 15;       //??????????????????????????????
                    kuruma = 0;        //?????????  ??????int ???????????????
                    int kakugyou2 = suu2; // suu2 = y
                    int kakugyou3 = suu3;  //?????????????????????x??????????????????  y ?????????????????????????????????  ??????????????????suu3
                    while(true){   //??????????????????????????????
                        suu2++;
                        suu3++;
                        if(suu2 >= 9 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou2;   //????????????
                    suu3 = kakugyou3;   //????????????
                    while(true){   //??????????????????????????????
                        suu2++;
                        suu3--;
                        if(suu2 >= 9 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou2;
                    suu3 = kakugyou3;
                    while(true){   //??????????????????????????????
                        suu2--;
                        suu3--;
                        if(suu2 < 0 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou2;
                    suu3 = kakugyou3;
                    while(true){   //??????????????????????????????
                        suu2--;
                        suu3++;
                        if(suu2 < 0 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    break;
                case 75 :  //?????????
                    System.out.println("click 75");
                    suugaku3 = 75;
                    kuruma = 0;
                    ff = 0;
                    click = true;
                    int hisyaSu275 = suu2;    //????????????????????????????????????
                    int hisyaSu375 = suu3;    //????????????????????????????????????
                    while(true){   //??????????????????????????????
                        suu2++;
                        if(suu2 >= 9){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = hisyaSu275;
                    while(true){
                        suu2--;
                        if(suu2 < 0 ){
                            break;   //????????????????????????  ???????????? ????????????????????????????????????
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    suu2 = hisyaSu275;
                    while(true){
                        suu3++;
                        if(suu3 >= 9){
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    suu3 = hisyaSu375;
                    while(true){
                        suu3--;
                        if(suu3 < 0){
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    suu2 = hisyaSu275; //y   ??????????????????????????????????????????????????????????????????
                    suu3 = hisyaSu375;  //x
                    ff = kuruma;
                    suu2++;
                    suu3++;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu3-=2;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu2-=2;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu3+=2;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    break;
                  //???????????? : 75 ??????  76 ??????  77 ??????->To  78 ??????->To  79 ??????->To  80 ???->To
                    //?????? : 65 ??????  66 ??????  67 ??????->To  68 ??????->To  69 ??????->To  70 ???->To
                case 76 : //?????????
                    System.out.println("click 76");
                    click = true;
                    suugaku3 = 76;       //??????????????????????????????
                    kuruma = 0;        //?????????  ??????int ???????????????
                    ff = 0;
                    int kakugyou276 = suu2; // suu2 = y
                    int kakugyou376 = suu3;  //?????????????????????x??????????????????  y ?????????????????????????????????  ??????????????????suu3
                    while(true){   //??????????????????????????????
                        suu2++;
                        suu3++;
                        if(suu2 >= 9 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou276;   //????????????
                    suu3 = kakugyou376;   //????????????
                    while(true){   //??????????????????????????????
                        suu2++;
                        suu3--;
                        if(suu2 >= 9 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou276;
                    suu3 = kakugyou376;
                    while(true){   //??????????????????????????????
                        suu2--;
                        suu3--;
                        if(suu2 < 0 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou276;
                    suu3 = kakugyou376;
                    while(true){   //??????????????????????????????
                        suu2--;
                        suu3++;
                        if(suu2 < 0 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = kakugyou276; // y
                    suu3 = kakugyou376; // x
                    ff = kuruma;
                    suu2++;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu2-=2;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu3++;
                    suu2++;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    suu3-=2;
                    hanmenhakaijyutusshiki(suu2 , suu3);
                    break;
                case 77 : //?????? - > TO
                    System.out.println("click 77");
                    suugaku3 = 77;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 78: //?????? -> TO
                    System.out.println("click 78");
                    suugaku3 = 78;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 79 :  //?????? -> To
                    System.out.println("click 79");
                    suugaku3 = 79;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 80 :  //??? -> to
                    System.out.println("click 80");
                    suugaku3 = 80;
                    ff = 0;
                    suu2--;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3-=2; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu2++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++;  //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    suu3++; //?????????
                    hanmenhakaijyutusshiki(suu2,suu3);
                    break;
                case 24:  //??????   ????????????????????????????????????
                    System.out.println("click 24");
                    suugaku3 = 24;       //??????????????????????????????
                    suu2--;             //??????????????????
                    ff = 0;
                    syoumenhakaijyutusshiki(suu2 , suu3);
                    break;
                case 25:  //??????   ????????????????????????????????????
                    System.out.println("click 25");
                    suugaku3 = 25;
                    click = true;
                    for(int i = suu2 - 1 ; i >= 0 ; i--){  //???for??????????????????????????????????????????????????????????????????  ???????????????????????????
                        if(syougi[i][suu3] == 0 || syougi[i][suu3] == 5 || syougi[i][suu3] == 6 || syougi[i][suu3] == 7 || syougi[i][suu3] == 8 || syougi[i][suu3] == 9 || syougi[i][suu3] == 14 || syougi[i][suu3] == 15 || syougi[i][suu3] == 4 || syougi[i][suu3] == 75 || syougi[i][suu3] == 76 || syougi[i][suu3] == 77 || syougi[i][suu3] == 78 || syougi[i][suu3] == 79 || syougi[i][suu3] == 80){
                            dataCT[kuruma][0] = i;    //????????????If???????????????????????????????????????
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[i][suu3] != 0){
                                break;  //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;
                        }
                    }
                    break;
                case 34:  //??????  ????????????????????????????????????
                    System.out.println("click 34");
                    suugaku3 = 34;
                    kuruma = 0;
                    click = true;
                    int hisyaSu22 = suu2;    //????????????????????????????????????
                    int hisyaSu33 = suu3;    //????????????????????????????????????
                    while(true){   //??????????????????????????????
                        suu2++;
                        if(suu2 >= 9){    //????????????????????????  ???????????? ????????????????????????????????????
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                            }
                        }else{
                            break;   //????????????????????????????????????????????????  ??????????????????????????????
                        }
                    }
                    suu2 = hisyaSu22;
                    while(true){
                        suu2--;
                        if(suu2 < 0 ){
                            break;   //????????????????????????  ???????????? ????????????????????????????????????
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    suu2 = hisyaSu22;
                    while(true){
                        suu3++;
                        if(suu3 >= 9){
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }   
                        }else{
                            break;
                        }
                    }
                    suu3 = hisyaSu33;
                    while(true){
                        suu3--;
                        if(suu3 < 0){
                            break;
                        }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                            dataCT[kuruma][0] = suu2;
                            dataCT[kuruma][1] = suu3;
                            kuruma++;
                            if(syougi[suu2][suu3] != 0){
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                    break;
                    case 26:   //??????   ????????????????????????????????????
                        System.out.println("click 26");
                        suugaku3 = 26;       //??????????????????????????????
                        ff = 0;
                        suu2 -= 2;
                        suu3 ++;
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2;  //???????????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 27:   //??????   ????????????????????????????????????
                        System.out.println("click 27");
                        suugaku3 = 27;
                        ff = 0 ; //?????????????????????????????????????????????
                        suu2--;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);  //???????????????
                        suu3--;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);  
                        suu3+=2;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);  
                        suu2+=2;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3); 
                        suu3-=2;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3); 
                        break;
                    case 28 :  //??????
                        System.out.println("click 28");
                        suugaku3 = 28;
                        ff = 0;
                        suu2++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 29 :   //??????
                        System.out.println("click 29");
                        suugaku3 = 29;
                        ff = 0;
                        suu2--;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3+=2;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3--;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3--;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 35:   //??????
                        System.out.println("click 35");
                        suugaku3 = 35;       //??????????????????????????????
                        kuruma = 0;        //?????????  ??????int ???????????????
                        click = true;
                        int kakugyou22 = suu2; // suu2 = y
                        int kakugyou33 = suu3;  
                        while(true){   //??????????????????????????????
                            suu2++;
                            suu3++;
                            if(suu2 >= 9 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou22;   //????????????
                        suu3 = kakugyou33;   //????????????
                        while(true){   //??????????????????????????????
                            suu2++;
                            suu3--;
                            if(suu2 >= 9 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou22;
                        suu3 = kakugyou33;
                        while(true){   //??????????????????????????????
                            suu2--;
                            suu3--;
                            if(suu2 < 0 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou22;
                        suu3 = kakugyou33;
                        while(true){   //??????????????????????????????
                            suu2--;
                            suu3++;
                            if(suu2 < 0 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        break;
                    case 65:  //?????????
                        System.out.println("click 65");
                        suugaku3 = 65;
                        kuruma = 0;
                        ff = 0;
                        click = true;
                        int hisyaSu225 = suu2;    //????????????????????????????????????
                        int hisyaSu335 = suu3;    //????????????????????????????????????
                        while(true){   //??????????????????????????????
                            suu2++;
                            if(suu2 >= 9){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = hisyaSu225;
                        while(true){
                            suu2--;
                            if(suu2 < 0 ){
                                break;   //????????????????????????  ???????????? ????????????????????????????????????
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;
                                }
                            }else{
                                break;
                            }
                        }
                        suu2 = hisyaSu225;
                        while(true){
                            suu3++;
                            if(suu3 >= 9){
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;
                                }   
                            }else{
                                break;
                            }
                        }
                        suu3 = hisyaSu335;
                        while(true){
                            suu3--;
                            if(suu3 < 0){
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;
                                }
                            }else{
                                break;
                            }
                        }
                        suu2 = hisyaSu225; //y
                        suu3 = hisyaSu335;  //x
                        ff = kuruma;
                        suu2++;
                        suu3++;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu3-=2;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu2-=2;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu3+=2;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        break;
                    case 66:  //?????????
                        System.out.println("click 66");
                        suugaku3 = 66;       //??????????????????????????????
                        kuruma = 0;        //?????????  ??????int ???????????????
                        ff = 0;  //?????????????????????
                        click = true;
                        int kakugyou226 = suu2; // suu2 = y
                        int kakugyou336 = suu3;  
                        while(true){   //??????????????????????????????
                            suu2++;
                            suu3++;
                            if(suu2 >= 9 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou226;   //????????????
                        suu3 = kakugyou336;   //????????????
                        while(true){   //??????????????????????????????
                            suu2++;
                            suu3--;
                            if(suu2 >= 9 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou226;
                        suu3 = kakugyou336;
                        while(true){   //??????????????????????????????
                            suu2--;
                            suu3--;
                            if(suu2 < 0 || suu3 < 0 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou226;
                        suu3 = kakugyou336;
                        while(true){   //??????????????????????????????
                            suu2--;
                            suu3++;
                            if(suu2 < 0 || suu3 >= 9 ){    //????????????????????????  ???????????? ????????????????????????????????????
                                break;
                            }else if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                                dataCT[kuruma][0] = suu2;
                                dataCT[kuruma][1] = suu3;
                                kuruma++;
                                if(syougi[suu2][suu3] != 0){
                                    break;          //????????????If??????????????????????????????  ??????????????????  ??????break ?????????????????????????????????????????????????????????
                                }
                            }else{
                                break;   //????????????????????????????????????????????????  ??????????????????????????????
                            }
                        }
                        suu2 = kakugyou226; //y
                        suu3 = kakugyou336;  //x
                        ff = kuruma;
                        suu2++;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu2-=2;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu3++;
                        suu2++;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        suu3-=2;
                        syoumenhakaijyutusshiki(suu2 , suu3);
                        break;
                    case 67 :  //????????? -> To
                        System.out.println("click 67");
                        suugaku3 = 67;
                        ff = 0;
                        suu2++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 68 : //????????? ->TO
                        System.out.println("click 68");
                        suugaku3 = 68;
                        ff = 0;
                        suu2++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 69 : //????????? -> TO
                        System.out.println("click 69");
                        suugaku3 = 69;
                        ff = 0;
                        suu2++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                    case 70 : //????????? -> To
                        System.out.println("click 70");
                        suugaku3 = 70;
                        ff = 0;
                        suu2++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3-=2; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu2--; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++;  //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        suu3++; //?????????
                        syoumenhakaijyutusshiki(suu2,suu3);
                        break;
                }
                frameErabuTrue(); // ?????????????????????????????????
            }
    
    public void handanMove(int suuMove2 , int suuMove3){  //???????????????????????????
        erabuNashi(suugaku3 , suugaku4 , suugaku5);  //suugaku3 ???????????????????????????  suugaku4 suugaku5????????????????????? 
        Keimanaru = false;  //????????????  
        HanKeimanaru = false;
        hannarukhgk = false;
        narukhgk = false;
        Boolean onajiTF = false;  //?????????????????????????????????  ????????????????????????????????????
        hannaru = false;   //?????????????????????   ????????????????????????????????????????????????
        syomennaru = false;//?????????????????????   ????????????????????????????????????????????????  ???????????????????????????????????????true
        for(int i = 0 ; i < 14 ; i++){  //suuMove2 suuMove3?????????   suugaku4 suugaku5 ????????????   tf1??????  tf2 ???
            if(syougi[suugaku4][suugaku5] == tf1[i] && syougi[suuMove2][suuMove3] == tf1[i]){ //??????????????????   ????????????  ?????????????????????????????????
                if(turn == 0){
                    turn++;  //??????p2??????
                }
                playerTurnF(turn);  //??????????????????????????????
                onajiTF = true;  //???????????????  ????????????true  ????????????????????????
                break;
            }else if(syougi[suugaku4][suugaku5] == tf2[i] && syougi[suuMove2][suuMove3] == tf2[i]){
                if(turn == 1){
                    turn--;//??????p1??????
                }
                playerTurnF(turn);//??????????????????????????????
                onajiTF = true;
                break;
            }
        }
        System.out.println("TURN out:" + turn);  
        switch(suugaku3){    
            case 4:
                if(dataCT[0][0] == suuMove2 && dataCT[0][1] == suuMove3){  //??????
                    labAll[suuMove2][suuMove3].setIcon(img[6]);      
                    labAll[suugaku4][suugaku5].setIcon(img[5]);
                    kiryoku(syougi[suuMove2][suuMove3]);  //???????????????????????????
                    syougi[suuMove2][suuMove3] = 4;
                    syougi[suugaku4][suugaku5] = 0;
                    click = false;
                    hannaru = true;
                    erabu = false;
                    if(onajiTF == false){
                        turnOandT(turn);
                    }
                }
                break;
            case 5:  //?????????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[0]);
                        labAll[suugaku4][suugaku5].setIcon(img[5]);
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 5;
                        syougi[suugaku4][suugaku5] = 0;
                        click = false;
                        hannaru = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 14://?????????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[8]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 14;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        hannaru = true;
                        hannarukhgk = true;
                        erabu = false;  //?????????????????????????????????????????????????????????  ????????????
                        if(onajiTF == false){    //??????????????????????????????  ????????????  ????????????????????? 
                            turnOandT(turn); //???????????????????????????????????????  ???????????????
                        }
                        break; 
                    }
                }
                break; 
            case 6: //?????????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[1]);    //??????????????????????????????1????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 6;    //??????????????????????????????????????????6?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        hannaru = true;
                        HanKeimanaru = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 7:  //?????????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[2]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 7;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        hannaru = true;
                        hannarukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 8:  //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[3]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 8;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        hannaru = true;
                        hannarukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;     
            case 9: //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[4]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 9;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 15: //??????
                System.out.println("15 kaku");
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[7]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 15;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        hannaru = true;
                        hannarukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 24:
                if(dataCT[0][0] == suuMove2 && dataCT[0][1] == suuMove3){  //??????
                    labAll[suuMove2][suuMove3].setIcon(img[16]);      
                    labAll[suugaku4][suugaku5].setIcon(img[5]);
                    kiryoku(syougi[suuMove2][suuMove3]);
                    syougi[suuMove2][suuMove3] = 24;
                    syougi[suugaku4][suugaku5] = 0;
                    click = false;
                    syomennaru = true;
                    erabu = false;
                    if(onajiTF == false){
                        turnOandT(turn);
                    }
                }
                break;
            case 25:
                for(int i = 0 ; i < 27 ; i++){              //??????
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[9]);
                        labAll[suugaku4][suugaku5].setIcon(img[5]);
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 25;
                        syougi[suugaku4][suugaku5] = 0;
                        click = false;
                        syomennaru = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 34:   
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){    //??????
                        labAll[suuMove2][suuMove3].setIcon(img[15]);    //??????????????????????????????15????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 34;    //??????????????????????????????????????????15?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        syomennaru = true;
                        narukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 26:
                for(int i = 0 ; i < 27 ; i++){   //??????
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[10]);    //??????????????????????????????1????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 26;    //??????????????????????????????????????????6?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        syomennaru = true;
                        Keimanaru = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 27:
                for(int i = 0 ; i < 27 ; i++){   //??????
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[11]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 27;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        syomennaru = true;
                        narukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 28:
                for(int i = 0 ; i < 27 ; i++){   //??????
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[12]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 28;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        syomennaru = true;
                        narukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;     
            case 29:  
                for(int i = 0 ; i < 27 ; i++){  //???
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[13]);    //??????????????????????????????3????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 29;    //??????????????????????????????????????????7?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 35: //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[14]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 35;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        syomennaru = true;
                        narukhgk = true;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 65:  //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[21]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 65;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 66:  //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[20]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 66;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 67: //?????? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[22]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 67;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 68:  //??????-> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[22]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 68;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 69: //?????? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[22]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 69;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break;
            case 70:  // ??? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[22]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 70;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 75:  // ?????????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[18]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 75;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 76:  //??????
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[17]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 76;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 77:  // ??? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[19]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 77;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 78:  // ??? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[19]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 78;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 79:  // ??? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[19]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 79;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);
                        }
                        break; 
                    }
                }
                break; 
            case 80:  // ??? -> to
                for(int i = 0 ; i < 27 ; i++){
                    if(dataCT[i][0] == suuMove2 && dataCT[i][1] == suuMove3){
                        labAll[suuMove2][suuMove3].setIcon(img[19]);    //??????????????????????????????14????????????
                        labAll[suugaku4][suugaku5].setIcon(img[5]);  //???????????????????????????????????????????????????
                        kiryoku(syougi[suuMove2][suuMove3]);
                        syougi[suuMove2][suuMove3] = 80;    //??????????????????????????????????????????14?????????????????????
                        syougi[suugaku4][suugaku5] = 0;     //????????????????????????????????????????????????
                        click = false;
                        erabu = false;
                        if(onajiTF == false){  
                            turnOandT(turn);;
                        }
                        break; 
                    }
                }
                break; 
            }
            playerTurnF(turn);
            //?????? : 65 ??????  21 ;   66 ?????? 20 ; 67 ??????->To  68 ??????->To  69 ??????->To  70 ???->To   22
            //???????????? : 75 ?????? 18 ;  76 ?????? 17 ;   77 ??????->To  78 ??????->To  79 ??????->To  80 ???->To  19
            click = false;
            win();
        }

        public void reData(){  //??????
            for(int i = 0 ; i < 27 ; i++){
                dataCT[i][0] = 999;
                dataCT[i][1] = 999;
            }
        }
 
        public void hanmenhakaijyutusshiki(int suu2 , int suu3 ){   //????????????????????? ??????????????? ?????????  ?????? ????????????????????????  suu2 = y  suu3 = x   f = ????????????????????????
            if(suu3 >= 0 && suu3 < 9 && suu2 >= 0 && suu2 < 9){ //?????????????????????
                if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 24 || syougi[suu2][suu3] == 25 || syougi[suu2][suu3] == 26 || syougi[suu2][suu3] == 27 || syougi[suu2][suu3] == 28 || syougi[suu2][suu3] == 29 || syougi[suu2][suu3] == 35 || syougi[suu2][suu3] == 34 || syougi[suu2][suu3] == 65 || syougi[suu2][suu3] == 66 || syougi[suu2][suu3] == 67 || syougi[suu2][suu3] == 68 || syougi[suu2][suu3] == 69 || syougi[suu2][suu3] == 70){
                    dataCT[ff][0]=suu2;   //?????????????????????????????????????????????    ????????????If???????????????????????????????????????
                    dataCT[ff][1]=suu3;   //?????????????????????????????????????????????
                    ff++; //??????????????????  ????????????????????????  ??????if????????????????????????ff????????????????????????dataCT??????????????????  ???????????????data???????????????  ???????????????
                }
            }
            click = true;           //????????????If???????????????????????????????????????
        }

        public void syoumenhakaijyutusshiki(int suu2 , int suu3 ){   //?????????????????????????????????????????????  ?????? ????????????????????????  suu2 = y  suu3 = x   f = ????????????????????????
            if(suu3 >= 0 && suu3 < 9 && suu2 >= 0 && suu2 < 9){ //?????????????????????
                if(syougi[suu2][suu3] == 0 || syougi[suu2][suu3] == 5 || syougi[suu2][suu3] == 6 || syougi[suu2][suu3] == 7 || syougi[suu2][suu3] == 8 || syougi[suu2][suu3] == 9 || syougi[suu2][suu3] == 14 || syougi[suu2][suu3] == 15 || syougi[suu2][suu3] == 4 || syougi[suu2][suu3] == 75 || syougi[suu2][suu3] == 76 || syougi[suu2][suu3] == 77 || syougi[suu2][suu3] == 78 || syougi[suu2][suu3] == 79 || syougi[suu2][suu3] == 80){
                    dataCT[ff][0]=suu2;   //?????????????????????????????????????????????    ????????????If???????????????????????????????????????
                    dataCT[ff][1]=suu3;   //?????????????????????????????????????????????
                    ff++; //??????????????????  ???????????????????????? 
                }
            }
            click = true;           //????????????If???????????????????????????????????????
        }

        public void erabu(int suu, int suu2 , int suu3){  // suu = ????????????  suu2 = ?????????????????? ?????????????????? suu3 = ?????????????????? ??????????????????  ???????????????????????????????????????
            erabu = true;
            switch(suu){
                case 4 :
                    labAll[suu2][suu3].setIcon(img[28]);
                    break;
                case 5 :
                    labAll[suu2][suu3].setIcon(img[23]);
                    break;
                case 6 :
                    labAll[suu2][suu3].setIcon(img[24]);
                    break;
                case 7 :
                    labAll[suu2][suu3].setIcon(img[25]);
                    break;
                case 8 :
                    labAll[suu2][suu3].setIcon(img[26]);
                    break;
                case 9 :
                    labAll[suu2][suu3].setIcon(img[27]);
                    break;
                case 14 :
                    labAll[suu2][suu3].setIcon(img[30]);
                    break;
                case 15 :
                    labAll[suu2][suu3].setIcon(img[29]);
                    break;
                case 24 :
                    labAll[suu2][suu3].setIcon(img[38]);
                    break;
                case 25 :
                    labAll[suu2][suu3].setIcon(img[31]);
                    break;
                case 26 :
                    labAll[suu2][suu3].setIcon(img[32]);
                    break;
                case 27 :
                    labAll[suu2][suu3].setIcon(img[33]);
                    break;
                case 28 :
                    labAll[suu2][suu3].setIcon(img[34]);
                    break;
                case 29 :
                    labAll[suu2][suu3].setIcon(img[35]);
                    break;
                case 34 :
                    labAll[suu2][suu3].setIcon(img[37]);
                    break;
                case 35 :
                    labAll[suu2][suu3].setIcon(img[36]);
                    break;
                case 65 :
                    labAll[suu2][suu3].setIcon(img[43]);
                    break;
                case 66 :
                    labAll[suu2][suu3].setIcon(img[42]);
                    break;
                case 67 :
                    labAll[suu2][suu3].setIcon(img[44]);
                    break;
                case 68 :
                    labAll[suu2][suu3].setIcon(img[44]);
                    break;
                case 69 :
                    labAll[suu2][suu3].setIcon(img[44]);
                    break;
                case 70 :
                    labAll[suu2][suu3].setIcon(img[44]);
                    break;
                case 75 :
                    labAll[suu2][suu3].setIcon(img[40]);
                    break;
                case 76 :
                    labAll[suu2][suu3].setIcon(img[39]);
                    break;
                case 77 :
                    labAll[suu2][suu3].setIcon(img[41]);
                    break;
                case 78 :
                    labAll[suu2][suu3].setIcon(img[41]);
                    break;
                case 79 :
                    labAll[suu2][suu3].setIcon(img[41]);
                    break;
                case 80 :
                    labAll[suu2][suu3].setIcon(img[41]);
                    break;
            }
        }

        public void erabuNashi(int suu , int suu2 , int suu3){  //?????????????????????????????????????????????  ???????????????  ???????????????????????????
            switch(suu){
                case 4 :
                    labAll[suu2][suu3].setIcon(img[6]);
                    break;
                case 5 :
                    labAll[suu2][suu3].setIcon(img[0]);
                    break;
                case 6 :
                    labAll[suu2][suu3].setIcon(img[1]);
                    break;
                case 7 :
                    labAll[suu2][suu3].setIcon(img[2]);
                    break;
                case 8 :
                    labAll[suu2][suu3].setIcon(img[3]);
                    break;
                case 9 :
                    labAll[suu2][suu3].setIcon(img[4]);
                    break;
                case 14 :
                    labAll[suu2][suu3].setIcon(img[8]);
                    break;
                case 15 :
                    labAll[suu2][suu3].setIcon(img[7]);
                    break;
                case 24 :
                    labAll[suu2][suu3].setIcon(img[16]);
                    break;
                case 25 :
                    labAll[suu2][suu3].setIcon(img[9]);
                    break;
                case 26 :
                    labAll[suu2][suu3].setIcon(img[10]);
                    break;
                case 27 :
                    labAll[suu2][suu3].setIcon(img[11]);
                    break;
                case 28 :
                    labAll[suu2][suu3].setIcon(img[12]);
                    break;
                case 29 :
                    labAll[suu2][suu3].setIcon(img[13]);
                    break;
                case 34 :
                    labAll[suu2][suu3].setIcon(img[15]);
                    break;
                case 35 :
                    labAll[suu2][suu3].setIcon(img[14]);
                    break;
                case 65 :
                    labAll[suu2][suu3].setIcon(img[21]);
                    break;
                case 66 :
                    labAll[suu2][suu3].setIcon(img[20]);
                    break;
                case 67 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    break;
                case 68 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    break;
                case 69 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    break;
                case 70 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    break;
                case 75 :
                    labAll[suu2][suu3].setIcon(img[18]);
                    break;
                case 76 :
                    labAll[suu2][suu3].setIcon(img[17]);
                    break;
                case 77 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    break;
                case 78 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    break;
                case 79 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    break;
                case 80 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    break;
            }
        }
        public void narigoma(int suu2 , int suu3 , int suu){ //??????????????????
            System.out.println("syorui : " + suu);
            switch(suu){
                case 24 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    syougi[suu2][suu3] = 67;
                    break;
                case 25 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    syougi[suu2][suu3] = 68;
                    break;
                case 26 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    syougi[suu2][suu3] = 69;
                    break;
                case 27 :
                    labAll[suu2][suu3].setIcon(img[22]);
                    syougi[suu2][suu3] = 70;
                    break;
                case 34 :
                    labAll[suu2][suu3].setIcon(img[21]);
                    syougi[suu2][suu3] = 65;
                    break;
                case 35 :
                    labAll[suu2][suu3].setIcon(img[20]);
                    syougi[suu2][suu3] = 66;
                    break;
            }
        }
        public void hannarigoma(int suu2 , int suu3 , int suu){ //??????????????????
            System.out.println("syorui : " + suu);
            switch(suu){
                case 4 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    syougi[suu2][suu3] = 77;    
                    break;
                case 5 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    syougi[suu2][suu3] = 78; 
                    break;
                case 6 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    syougi[suu2][suu3] = 79; 
                    break;
                case 7 :
                    labAll[suu2][suu3].setIcon(img[19]);
                    syougi[suu2][suu3] = 80; 
                    break;
                case 14 :
                    labAll[suu2][suu3].setIcon(img[18]);
                    syougi[suu2][suu3] = 75; 
                    break;
                case 15 :
                    labAll[suu2][suu3].setIcon(img[17]);
                    syougi[suu2][suu3] = 76; 
                    break;
            }
        }

        public void option(){
            int res=JOptionPane.showConfirmDialog(null, "????????????????", "", JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){ //???yes
            naru = true;
        }else{
            naru = false;
            }
        }

        public void kiryoku(int ki){ //?????????????????????????????????  ??????????????????
            switch(ki){
                case 4 :  //?????????
                    kiryokuP1[4] +=1;
                    labjpl1HusyouSuu.setText(Integer.toString(kiryokuP1[4]));
                    break;
                case 5 :  //?????????
                    kiryokuP1[0] +=1;
                    labjpl1KyousyaSuu.setText(Integer.toString(kiryokuP1[0]));
                    break;
                case 6 :  //?????????
                    kiryokuP1[1] +=1;
                    labjpl1KeimaSuu.setText(Integer.toString(kiryokuP1[1]));
                    break;
                case 7 :  //??????
                    kiryokuP1[2] +=1;
                    labjpl1GinsyouSuu.setText(Integer.toString(kiryokuP1[2]));
                    break;
                case 8 :  //??????
                    kiryokuP1[3] +=1;
                    labjpl1KinsyouSuu.setText(Integer.toString(kiryokuP1[3]));
                    break;
                case 14 : //?????????
                    kiryokuP1[5] +=1;
                    labjpl1HisyaSuu.setText(Integer.toString(kiryokuP1[5]));
                    break;
                case 15 : //?????????
                    kiryokuP1[6] +=1;
                    labjpl1KakugyouSuu.setText(Integer.toString(kiryokuP1[6]));
                    break;
                case 75 : //?????????
                    kiryokuP1[5] +=1;
                    labjpl1HisyaSuu.setText(Integer.toString(kiryokuP1[5]));
                    break;
                case 76 : //?????????
                    kiryokuP1[6] +=1;
                    labjpl1KakugyouSuu.setText(Integer.toString(kiryokuP1[6]));
                    break;
                case 77 : //????????? To
                    kiryokuP1[4] +=1;
                    labjpl1HusyouSuu.setText(Integer.toString(kiryokuP1[4]));
                    break;
                case 78 : //????????? To
                    kiryokuP1[0] +=1;
                    labjpl1KyousyaSuu.setText(Integer.toString(kiryokuP1[0]));
                    break;
                case 79 : //????????? To
                    kiryokuP1[1] +=1;
                    labjpl1KeimaSuu.setText(Integer.toString(kiryokuP1[1]));
                    break;
                case 80 : //?????? To
                    kiryokuP1[2] +=1;
                    labjpl1GinsyouSuu.setText(Integer.toString(kiryokuP1[2]));
                    break;
//===========================================================
                case 24 :  //?????????
                    kiryokuP2[4] +=1;
                    labjpl2HusyouSuu.setText(Integer.toString(kiryokuP2[4]));
                    break;
                case 25 :  //?????????
                    kiryokuP2[0] +=1;
                    labjpl2KyousyaSuu.setText(Integer.toString(kiryokuP2[0]));
                    break;
                case 26 :  //?????????
                    kiryokuP2[1] +=1;
                    labjpl2KeimaSuu.setText(Integer.toString(kiryokuP2[1]));
                    break;
                case 27 :  //??????
                    kiryokuP2[2] +=1;
                    labjpl2GinsyouSuu.setText(Integer.toString(kiryokuP2[2]));
                    break;
                case 28 :  //??????
                    kiryokuP2[3] +=1;
                    labjpl2KinsyouSuu.setText(Integer.toString(kiryokuP2[3]));
                    break;
                case 34 : //?????????
                    kiryokuP2[5] +=1;
                    labjpl2HisyaSuu.setText(Integer.toString(kiryokuP2[5]));
                    break;
                case 35 : //?????????
                    kiryokuP2[6] +=1;
                    labjpl2KakugyouSuu.setText(Integer.toString(kiryokuP2[6]));
                    break;
                case 65 : //?????????
                    kiryokuP2[5] +=1;
                    labjpl2HisyaSuu.setText(Integer.toString(kiryokuP2[5]));
                    break;
                case 66 : //?????????
                    kiryokuP2[6] +=1;
                    labjpl2KakugyouSuu.setText(Integer.toString(kiryokuP2[6]));
                    break;
                case 67 : //????????? To
                    kiryokuP2[4] +=1;
                    labjpl2HusyouSuu.setText(Integer.toString(kiryokuP2[4]));
                    break;
                case 68 : //????????? To
                    kiryokuP2[0] +=1;
                    labjpl2KyousyaSuu.setText(Integer.toString(kiryokuP2[0]));
                    break;
                case 69 : //????????? To
                    kiryokuP2[1] +=1;
                    labjpl1KeimaSuu.setText(Integer.toString(kiryokuP1[1]));
                    break;
                case 70 : //?????? To
                    kiryokuP2[2] +=1;
                    labjpl1GinsyouSuu.setText(Integer.toString(kiryokuP1[2]));
                    break;
                default : 
                    break;
            }
        }
        public void mochikomaHandanShiki(int suu1 ,int suu2 ,int suu3){ //??????
            mochikomaHandanImg(); 
            if(suu3 == 0){//?????????????????????????????????
                switch(mochikomashiyo){
                    case 24:  //??????  ???
                        Boolean hutatus = true; //????????????
                        Boolean mawali = true; //????????????
                        for(int i = 0 ; i < 9 ; i++){
                            if(syougi[i][suu2] == 24){
                                hutatus = false;
                            }
                        }
                        if(syougi[suu1 - 1][suu2] == 9){
                            mawali = false;
                        }
                        if(hutatus == true && mawali == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  //?????????????????????
                            syougi[suu1][suu2] = mochikomashiyo;    //?????????????????????0?????????????????????
                            kiryokuP1[4]--;
                            labjpl1HusyouSuu.setText(Integer.toString(kiryokuP1[4]));
                            turnOandT(turn);
                        }
                        break;
                    case 25://??????  ??????
                        Boolean saigosen = true; //????????????
                        if(suu1 == 0){
                            saigosen = false;
                        }
                        if(saigosen == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]); 
                            syougi[suu1][suu2] = mochikomashiyo;    
                            kiryokuP1[0]--;
                            labjpl1KyousyaSuu.setText(Integer.toString(kiryokuP1[0]));
                            turnOandT(turn);
                        }
                        break;
                    case 26://??????  ??????
                        Boolean saigosenHutatus = true;
                        if(suu1 == 0 || suu1 == 1){
                            saigosenHutatus = false;
                        }
                        if(saigosenHutatus == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]); 
                            syougi[suu1][suu2] = mochikomashiyo;    
                            kiryokuP1[1]--;
                            labjpl1KeimaSuu.setText(Integer.toString(kiryokuP1[1]));
                            turnOandT(turn);
                        }
                        break;
                    case 27://?????? ???
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP1[2]--;
                        labjpl1GinsyouSuu.setText(Integer.toString(kiryokuP1[2]));
                        turnOandT(turn);
                        break;
                    case 28://??????  ???
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP1[3]--;
                        labjpl1KinsyouSuu.setText(Integer.toString(kiryokuP1[3]));
                        turnOandT(turn);
                        break;
                    case 34: //?????? ??????
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP1[5]--;
                        labjpl1HisyaSuu.setText(Integer.toString(kiryokuP1[5]));
                        turnOandT(turn);
                        break;
                    case 35: //?????? ???
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP1[6]--;
                        labjpl1KakugyouSuu.setText(Integer.toString(kiryokuP1[6]));
                        turnOandT(turn);
                        break;
                    case 4:  //??????  ???
                        Boolean hutatus2 = true; //????????????
                        Boolean mawali2 = true; //????????????
                        for(int i = 0 ; i < 9 ; i++){
                            if(syougi[i][suu2] == 4){
                                hutatus2 = false;
                            }
                        }
                        if(syougi[suu1 + 1][suu2] == 29){
                            mawali2 = false;
                        }
                        if(hutatus2 == true && mawali2 == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  //?????????????????????
                            syougi[suu1][suu2] = mochikomashiyo;    //?????????????????????0?????????????????????
                            kiryokuP2[4]--;
                            labjpl2HusyouSuu.setText(Integer.toString(kiryokuP2[4]));
                            turnOandT(turn);
                        }
                        break;        
                    case 5:  //?????? ??????
                        Boolean saigosen2 = true; //????????????
                        if(suu1 == 8){
                            saigosen2 = false;
                        }
                        if(saigosen2 == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]); 
                            syougi[suu1][suu2] = mochikomashiyo;    
                            kiryokuP2[0]--;
                            labjpl2KyousyaSuu.setText(Integer.toString(kiryokuP2[0]));
                            turnOandT(turn);
                        }
                        break;
                    case 6:  //??????  ??????
                        Boolean saigosenHutatus2 = true;
                        if(suu1 == 8 || suu1 == 7){
                            saigosenHutatus2 = false;
                        }
                        if(saigosenHutatus2 == true){
                            labAll[suu1][suu2].setIcon(img[komanoshiyoImg]); 
                            syougi[suu1][suu2] = mochikomashiyo;    
                            kiryokuP2[1]--;
                            labjpl2KeimaSuu.setText(Integer.toString(kiryokuP2[1]));
                            turnOandT(turn);
                        }
                        break;
                    case 7: //??????  ???
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP2[2]--;
                        labjpl2GinsyouSuu.setText(Integer.toString(kiryokuP2[2]));
                        turnOandT(turn);
                        break;
                    case 8: //??????  ???
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP2[3]--;
                        labjpl2KinsyouSuu.setText(Integer.toString(kiryokuP2[3]));
                        turnOandT(turn);
                        break;
                    case 14: //??????  ??????
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP2[5]--;
                        labjpl2HisyaSuu.setText(Integer.toString(kiryokuP2[5]));
                        turnOandT(turn);
                        break;
                    case 15:  //??????  ??????
                        labAll[suu1][suu2].setIcon(img[komanoshiyoImg]);  
                        syougi[suu1][suu2] = mochikomashiyo;    
                        kiryokuP2[6]--;
                        labjpl2KakugyouSuu.setText(Integer.toString(kiryokuP2[6]));
                        turnOandT(turn);
                        break;
                }
            }
            playerTurnF(turn);
            mochikomaHandan = false;
        }

        public void mochikomaHandanImg(){  //?????????????????????Erabu????????????
            labjpl1Husyou.setIcon(img[16]);  
            labjpl1Kyousya.setIcon(img[9]);
            labjpl1Keima.setIcon(img[10]);
            labjpl1Ginsyou.setIcon(img[11]);
            labjpl1Kinsyou.setIcon(img[12]);
            labjpl1Hisya.setIcon(img[15]);
            labjpl1Kakugyou.setIcon(img[14]);

            labjpl2Husyou.setIcon(img[16]);
            labjpl2Kyousya.setIcon(img[9]);
            labjpl2Keima.setIcon(img[10]);
            labjpl2Ginsyou.setIcon(img[11]);
            labjpl2Kinsyou.setIcon(img[12]);
            labjpl2Hisya.setIcon(img[15]);
            labjpl2Kakugyou.setIcon(img[14]);
        }

        public void playerTurnF(int turnout){  //??????????????????  ????????? ???????????????
            if(turnout == 0){  //Player1  ??????????????????
                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 4 || syougi[i][j] == 5 || syougi[i][j] == 6 || syougi[i][j] == 7 || syougi[i][j] == 8 || syougi[i][j] == 9 || syougi[i][j] == 14 || syougi[i][j] == 15 || syougi[i][j] == 75 || syougi[i][j] == 76 || syougi[i][j] == 77 || syougi[i][j] == 78 || syougi[i][j] == 79 || syougi[i][j] == 80 || syougi[i][j] == 0){
                            labTF[i][j] = false;
                        }
                    }
                }

                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 24 || syougi[i][j] == 25 || syougi[i][j] == 26 || syougi[i][j] == 27 || syougi[i][j] == 28 || syougi[i][j] == 29 || syougi[i][j] == 34 || syougi[i][j] == 35 || syougi[i][j] == 65 || syougi[i][j] == 66 || syougi[i][j] == 67 || syougi[i][j] == 68 || syougi[i][j] == 69 || syougi[i][j] == 70 || syougi[i][j] == 0 ){
                            labTF[i][j] = true;
                        }
                    }
                }
                labjpl1HusyouTF = true; 
                labjpl1KyousyaTF = true;
                labjpl1KeimaTF = true;
                labjpl1GinsyouTF = true;
                labjpl1KinsyouTF = true;
                labjpl1HisyaTF = true;
                labjpl1KakugyouTF = true;

                labjpl2HusyouTF = false; 
                labjpl2KyousyaTF = false;
                labjpl2KeimaTF = false;
                labjpl2GinsyouTF = false;
                labjpl2KinsyouTF = false;
                labjpl2HisyaTF = false;
                labjpl2KakugyouTF = false;
                System.out.println("P1");
            }else{ //Player2 ?????????
                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 24 || syougi[i][j] == 25 || syougi[i][j] == 26 || syougi[i][j] == 27 || syougi[i][j] == 28 || syougi[i][j] == 29 || syougi[i][j] == 34 || syougi[i][j] == 35 || syougi[i][j] == 65 || syougi[i][j] == 66 || syougi[i][j] == 67 || syougi[i][j] == 68 || syougi[i][j] == 69 || syougi[i][j] == 70 || syougi[i][j] == 0){
                            labTF[i][j] = false;
                        }
                    }
                }

                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 4 || syougi[i][j] == 5 || syougi[i][j] == 6 || syougi[i][j] == 7 || syougi[i][j] == 8 || syougi[i][j] == 9 || syougi[i][j] == 14 || syougi[i][j] == 15 || syougi[i][j] == 75 || syougi[i][j] == 76 || syougi[i][j] == 77 || syougi[i][j] == 78 || syougi[i][j] == 79 || syougi[i][j] == 80 || syougi[i][j] == 0){
                            labTF[i][j] = true;
                        }
                    }
                }
                labjpl1HusyouTF = false; 
                labjpl1KyousyaTF = false;
                labjpl1KeimaTF = false;
                labjpl1GinsyouTF = false;
                labjpl1KinsyouTF = false;
                labjpl1HisyaTF = false;
                labjpl1KakugyouTF = false;

                labjpl2HusyouTF = true; 
                labjpl2KyousyaTF = true;
                labjpl2KeimaTF = true;
                labjpl2GinsyouTF = true;
                labjpl2KinsyouTF = true;
                labjpl2HisyaTF = true;
                labjpl2KakugyouTF = true;
                System.out.println("P2");
            }
        }

        public void turnOandT(int turn12){  //??????????????????  ?????????????????????????????????????????????  ???????????????????????????
            if(turn12 == 0 ){
                turn++;
            }else if(turn12 == 1){
                turn--;
            }
        } 
        public void playerTurnT(){
            for(int i = 0 ; i < 9 ; i++){
                for(int j = 0 ; j < 9 ; j++){
                        labTF[i][j] = true;
                }
            }
            labjpl1HusyouTF = true; 
            labjpl1KyousyaTF = true;
            labjpl1KeimaTF = true;
            labjpl1GinsyouTF = true;
            labjpl1KinsyouTF = true;
            labjpl1HisyaTF = true;
            labjpl1KakugyouTF = true;
            labjpl2HusyouTF = true; 
            labjpl2KyousyaTF = true;
            labjpl2KeimaTF = true;
            labjpl2GinsyouTF = true;
            labjpl2KinsyouTF = true;
            labjpl2HisyaTF = true;
            labjpl2KakugyouTF = true;
            System.out.println("NO anyone");
        }
 
        public void win(){  //??????????????????
            boolean P1winner = true;
            boolean P2winner = true;
            boolean labfalse = false;
            for(int i = 0 ; i < 9 ; i++){
                for(int f = 0 ; f < 9 ; f++){
                    if(syougi[i][f] == 9){  //????????????????????????P2??????
                        P1winner = false;
                    }else if(syougi[i][f] == 29){//????????????????????????P1??????
                        P2winner = false;
                    }
                }
            }
            if(P1winner == true){
                JOptionPane.showMessageDialog(null, "??????", "??????P1", JOptionPane.ERROR_MESSAGE);
                labfalse = true;
            }else if(P2winner == true){
                JOptionPane.showMessageDialog(null, "??????", "??????P2", JOptionPane.ERROR_MESSAGE);
                labfalse = true;
            }

            if(labfalse == true){
                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 24 || syougi[i][j] == 25 || syougi[i][j] == 26 || syougi[i][j] == 27 || syougi[i][j] == 28 || syougi[i][j] == 29 || syougi[i][j] == 34 || syougi[i][j] == 35 || syougi[i][j] == 65 || syougi[i][j] == 66 || syougi[i][j] == 67 || syougi[i][j] == 68 || syougi[i][j] == 69 || syougi[i][j] == 70 || syougi[i][j] == 0){
                            labTF[i][j] = false;
                        }
                    }
                }

                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        if(syougi[i][j] == 4 || syougi[i][j] == 5 || syougi[i][j] == 6 || syougi[i][j] == 7 || syougi[i][j] == 8 || syougi[i][j] == 9 || syougi[i][j] == 14 || syougi[i][j] == 15 || syougi[i][j] == 75 || syougi[i][j] == 76 || syougi[i][j] == 77 || syougi[i][j] == 78 || syougi[i][j] == 79 || syougi[i][j] == 80 || syougi[i][j] == 0){
                            labTF[i][j] = false;
                        }
                    }
                }
                labjpl1HusyouTF = false; 
                labjpl1KyousyaTF = false;
                labjpl1KeimaTF = false;
                labjpl1GinsyouTF = false;
                labjpl1KinsyouTF = false;
                labjpl1HisyaTF = false;
                labjpl1KakugyouTF = false;

                labjpl2HusyouTF = false; 
                labjpl2KyousyaTF = false;
                labjpl2KeimaTF = false;
                labjpl2GinsyouTF = false;
                labjpl2KinsyouTF = false;
                labjpl2HisyaTF = false;
                labjpl2KakugyouTF = false;
            }
        }
        public void frameErabuTrue(){// ?????????????????????????????????
            int one ;
            int two ;
            for(int i = 0 ; i < dataCT.length ; i++ ){
                    int j = 0;
                    one = dataCT[i][j];
                    j++;
                    two = dataCT[i][j];
                    if(one != 999 && two != 999){
                    switch(syougi[one][two]){
                        case 4 :  //?????????
                            labAll[one][two].setIcon(img[28]);
                            break;
                        case 5 :  //?????????
                            labAll[one][two].setIcon(img[23]);
                            break;
                        case 6 :  //?????????
                            labAll[one][two].setIcon(img[24]);
                            break;
                        case 7 :  //??????
                            labAll[one][two].setIcon(img[25]);
                            break;
                        case 8 :  //??????
                            labAll[one][two].setIcon(img[26]);
                            break;
                        case 9 : //??????
                            labAll[one][two].setIcon(img[27]);
                            break;
                        case 14 : //?????????
                            labAll[one][two].setIcon(img[30]);
                            break;
                        case 15 : //?????????
                            labAll[one][two].setIcon(img[29]);
                            break;
                        case 75 : //?????????
                            labAll[one][two].setIcon(img[40]);
                            break;
                        case 76 : //?????????
                            labAll[one][two].setIcon(img[39]);
                            break;
                        case 77 : //????????? To
                            labAll[one][two].setIcon(img[41]);
                            break;
                        case 78 : //????????? To
                            labAll[one][two].setIcon(img[41]);
                            break;
                        case 79 : //????????? To
                            labAll[one][two].setIcon(img[41]);
                            break;
                        case 80 : //?????? To
                            labAll[one][two].setIcon(img[41]);
                            break;
    //===========================================================
                        case 24 :  //?????????
                            labAll[one][two].setIcon(img[38]);
                            break;
                        case 25 :  //?????????
                            labAll[one][two].setIcon(img[31]);
                            break;
                        case 26 :  //?????????
                            labAll[one][two].setIcon(img[32]);
                            break;
                        case 27 :  //??????
                            labAll[one][two].setIcon(img[33]);
                            break;
                        case 28 :  //??????
                            labAll[one][two].setIcon(img[34]);
                            break;
                        case 29 :  //??????
                            labAll[one][two].setIcon(img[35]);
                            break;
                        case 34 : //?????????
                            labAll[one][two].setIcon(img[37]);
                            break;
                        case 35 : //?????????
                            labAll[one][two].setIcon(img[36]);
                            break;
                        case 65 : //?????????
                            labAll[one][two].setIcon(img[43]);
                            break;
                        case 66 : //?????????
                            labAll[one][two].setIcon(img[42]);
                            break;
                        case 67 : //????????? To
                            labAll[one][two].setIcon(img[44]);
                            break;
                        case 68 : //????????? To
                            labAll[one][two].setIcon(img[44]);
                            break;
                        case 69 : //????????? To
                            labAll[one][two].setIcon(img[44]);
                            break;
                        case 70 : //?????? To
                            labAll[one][two].setIcon(img[44]);
                            break;
                        case 0 : 
                            labAll[one][two].setIcon(img[45]);
                            break;
                    }
                }else{
                    break;
                }
            }
        }
        public void frameErabuFalse(){
            int one;
            int two;
            for(int i = 0 ; i < dataCT.length ; i++ ){
                int j = 0;
                one = dataCT[i][j];
                j++;
                two = dataCT[i][j];
                if(one != 999 && two != 999){
                    switch(syougi[one][two]){
                        case 4 :
                            labAll[one][two].setIcon(img[6]);
                            break;
                        case 5 :
                            labAll[one][two].setIcon(img[0]);
                            break;
                        case 6 :
                            labAll[one][two].setIcon(img[1]);
                            break;
                        case 7 :
                            labAll[one][two].setIcon(img[2]);
                            break;
                        case 8 :
                            labAll[one][two].setIcon(img[3]);
                            break;
                        case 9 :
                            labAll[one][two].setIcon(img[4]);
                            break;
                        case 14 :
                            labAll[one][two].setIcon(img[8]);
                            break;
                        case 15 :
                            labAll[one][two].setIcon(img[7]);
                            break;
                        case 24 :
                            labAll[one][two].setIcon(img[16]);
                            break;
                        case 25 :
                            labAll[one][two].setIcon(img[9]);
                            break;
                        case 26 :
                            labAll[one][two].setIcon(img[10]);
                            break;
                        case 27 :
                            labAll[one][two].setIcon(img[11]);
                            break;
                        case 28 :
                            labAll[one][two].setIcon(img[12]);
                            break;
                        case 29 :
                            labAll[one][two].setIcon(img[13]);
                            break;
                        case 34 :
                            labAll[one][two].setIcon(img[15]);
                            break;
                        case 35 :
                            labAll[one][two].setIcon(img[14]);
                            break;
                        case 65 :
                            labAll[one][two].setIcon(img[21]);
                            break;
                        case 66 :
                            labAll[one][two].setIcon(img[20]);
                            break;
                        case 67 :
                            labAll[one][two].setIcon(img[22]);
                            break;
                        case 68 :
                            labAll[one][two].setIcon(img[22]);
                            break;
                        case 69 :
                            labAll[one][two].setIcon(img[22]);
                            break;
                        case 70 :
                            labAll[one][two].setIcon(img[22]);
                            break;
                        case 75 :
                            labAll[one][two].setIcon(img[18]);
                            break;
                        case 76 :
                            labAll[one][two].setIcon(img[17]);
                            break;
                        case 77 :
                            labAll[one][two].setIcon(img[19]);
                            break;
                        case 78 :
                            labAll[one][two].setIcon(img[19]);
                            break;
                        case 79 :
                            labAll[one][two].setIcon(img[19]);
                            break;
                        case 80 :
                            labAll[one][two].setIcon(img[19]);
                            break;
                        case 0 :
                            labAll[one][two].setIcon(img[5]);
                    }
                }else{
                    break;
                }
            }
        }
}