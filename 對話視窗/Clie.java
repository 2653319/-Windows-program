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
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.util.Random;
import java.net.*;
import java.io.*;

public class Clie extends Thread {
    ServerSocket svs; // server 得要有
    Socket soc; // server 和 client 兩個都要有
    InetAddress adr;
    PrintStream outStream;
    BufferedReader inStream;
    ClientFrame clf;

    public Clie(ClientFrame cFrame) {
        clf = cFrame;
    }

    public void run() {
        try {
            soc = new Socket("127.0.0.1",1555);
            outStream = new PrintStream(soc.getOutputStream());
            inStream = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
        String str = "";
        try {
            while (!(str = inStream.readLine()).equals("")) {
                clf.addjta(str);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }

    public void sendclient(String str){
        try{
            if(outStream != null){            
                outStream.println(str);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error");
            }
        }catch(Exception a){
            javax.swing.JOptionPane.showMessageDialog(null, "Error" + a.toString());
        }
    }
}