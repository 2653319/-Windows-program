import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

public class MainFrame2 extends JFrame{


    
    private JButton Jbt11 = new JButton();
    private JButton Jbt12 = new JButton();
    private JButton Jbt13 = new JButton();
    private JButton Jbt21 = new JButton();
    private JButton Jbt22 = new JButton();
    private JButton Jbt23 = new JButton();
    private JButton Jbt31 = new JButton();
    private JButton Jbt32 = new JButton();
    private JButton Jbt33 = new JButton();
    private JButton JbtGo = new JButton("GO");
    private JButton JbtExit = new JButton("EXIT");
    private JButton JbtClear = new JButton("CLEAR");
    private Container cp;
    private Boolean c = true;

    public MainFrame2(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        this.setBounds(100,200,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new GridLayout(4,3,3,3));

        cp.add(Jbt11);
        cp.add(Jbt12);
        cp.add(Jbt13);
        cp.add(Jbt21);
        cp.add(Jbt22);
        cp.add(Jbt23);
        cp.add(Jbt31);
        cp.add(Jbt32);
        cp.add(Jbt33);
        cp.add(JbtGo);
        cp.add(JbtExit);
        cp.add(JbtClear);

        JbtExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                System.exit(0);
            }
        });


        JbtClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                ClearText();
            }
        });

        JbtGo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                Enabled();
            }
        });

        Jbt11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt11.setEnabled(false);
            }
        });
        Jbt12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt12.setEnabled(false);
            }
        });
        Jbt13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt13.setEnabled(false);
            }
        });
        Jbt21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt21.setEnabled(false);
            }
        });
        Jbt22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt22.setEnabled(false);
            }
        });
        Jbt23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt23.setEnabled(false);
            }
        });
        Jbt31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt31.setEnabled(false);
            }
        });
        Jbt32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt32.setEnabled(false);
            }
        });
        Jbt33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                JButton tmpBtn = (JButton)a.getSource();
                tmpBtn.setFont(new Font("Time New Roman", Font.BOLD , 22));
                if(c){
                    tmpBtn.setText("O");
                    c = false;
                }else{
                    tmpBtn.setText("X");
                    c = true;
                }
                text();
                Jbt33.setEnabled(false);
            }
        });
    }

    public void text(){
        if(Jbt11.getText().equals(Jbt12.getText())&& Jbt12.getText().equals(Jbt13.getText())){
            if(Jbt11.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt11.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt21.getText().equals(Jbt22.getText())&& Jbt22.getText().equals(Jbt23.getText())){
            if(Jbt21.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt21.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt31.getText().equals(Jbt32.getText())&& Jbt32.getText().equals(Jbt33.getText())){
            if(Jbt31.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt31.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt11.getText().equals(Jbt21.getText())&& Jbt21.getText().equals(Jbt31.getText())){
            if(Jbt11.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt11.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt12.getText().equals(Jbt22.getText())&& Jbt22.getText().equals(Jbt32.getText())){
            if(Jbt12.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt12.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt13.getText().equals(Jbt23.getText())&& Jbt23.getText().equals(Jbt33.getText())){
            if(Jbt13.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt13.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt11.getText().equals(Jbt22.getText())&& Jbt22.getText().equals(Jbt33.getText())){
            if(Jbt11.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt11.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
        if(Jbt13.getText().equals(Jbt22.getText())&& Jbt22.getText().equals(Jbt31.getText())){
            if(Jbt13.getText() == "O"){
                JOptionPane.showMessageDialog(this, "Play1 Win");
                unEnabled();
            }else if(Jbt13.getText() == "X"){
                JOptionPane.showMessageDialog(this, "Play2 Win");
                unEnabled();
            }
        }
    }
    
    public void ClearText(){
        Jbt11.setText("");
        Jbt12.setText("");
        Jbt13.setText("");
        Jbt21.setText("");
        Jbt22.setText("");
        Jbt23.setText("");
        Jbt31.setText("");
        Jbt32.setText("");
        Jbt33.setText("");
    }
    
    public void Enabled(){
        Jbt11.setEnabled(true);
        Jbt12.setEnabled(true);
        Jbt13.setEnabled(true);
        Jbt21.setEnabled(true);
        Jbt22.setEnabled(true);
        Jbt23.setEnabled(true);
        Jbt31.setEnabled(true);
        Jbt32.setEnabled(true);
        Jbt33.setEnabled(true);
    }

    public void unEnabled(){
        Jbt11.setEnabled(false);
        Jbt12.setEnabled(false);
        Jbt13.setEnabled(false);
        Jbt21.setEnabled(false);
        Jbt22.setEnabled(false);
        Jbt23.setEnabled(false);
        Jbt31.setEnabled(false);
        Jbt32.setEnabled(false);
        Jbt33.setEnabled(false);
    }

}