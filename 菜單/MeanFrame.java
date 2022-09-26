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


public class MeanFrame extends JFrame  {

    private JMenuBar jmb1 = new JMenuBar();
    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Set");
    private JMenu menu3 = new JMenu("Game");
    private JMenu menu4 = new JMenu("Help");
    private JMenu menu5 = new JMenu("Encrypt");
    private JMenuItem mItemBg = new JMenuItem("BackGround");
    private JMenuItem mItemMaze = new JMenuItem("Maze");
    private JMenuItem mItemCt = new JMenuItem("Compute");
    private JMenuItem mItemTl = new JMenuItem("tool");
    private JDesktopPane jdp = new JDesktopPane();
    static Container cp ;
    Jnframe jnf = new Jnframe();

    public MeanFrame(){
        init();
    }
    public void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,700,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setJMenuBar(jmb1);
        menu2.add(mItemBg);
        menu3.add(mItemMaze);
        menu3.add(mItemCt);
        menu5.add(mItemTl);

        jmb1.add(menu1);
        jmb1.add(menu2);
        jmb1.add(menu3);
        jmb1.add(menu4);
        jmb1.add(menu5);

        cp.add(jdp);
        mItemBg.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                BgFrame Bfr = new BgFrame();
                Bfr.setVisible(true);
            }
        });
        mItemMaze.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                MazeFrame mfr = new MazeFrame();
                mfr.setVisible(true);
            }
        });
        mItemCt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                ComputeFrame cfr = new ComputeFrame();
                cfr.setVisible(true);
            }
        });

        mItemTl.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sf){
                jdp.add(jnf);
                jnf.setVisible(true);
            }
        });
    }
}