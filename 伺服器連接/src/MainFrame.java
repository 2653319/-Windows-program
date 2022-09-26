import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainFrame extends JFrame{
    private Container cp;
    private JButton jbtnExit = new JButton("Exit");
    private JPanel statusPane = new JPanel(new GridLayout(1,5,3,3));
    private JPanel functionPane = new JPanel(new GridLayout(1,5,3,3));
    private ImageIcon icons[] = new ImageIcon[2];
    private JLabel jlbDBStatus = new JLabel();
    private DBConn dbconn;
    private JButton jbtnAll = new JButton("All");
    private JButton jbtnInsert = new JButton("Insert");
    private JButton jbtnUpdate = new JButton("Updata");
    private JButton jbtnDelete = new JButton("Delete");
    private JButton jbtnSearch = new JButton("Search");
    private JButton jbtnDBConnect = new JButton("Connect");
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);


    public MainFrame(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        this.setBounds(100,100,600,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp.add(statusPane, BorderLayout.SOUTH);
        cp.add(functionPane, BorderLayout.NORTH);
        cp.add(jsp, BorderLayout.CENTER);

        jta.setEditable(false);

        icons[0] = new ImageIcon("./src/Red_Ball.png");
        icons[1] = new ImageIcon("./src/Green_Ball.png");

        Image img1 = icons[0].getImage();
        Image img2 = img1.getScaledInstance(32,32, Image.SCALE_SMOOTH);
        icons[0].setImage(img2);
        jlbDBStatus.setIcon(icons[0]);

        img1 = icons[1].getImage();
        img2 = img1.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        icons[1].setImage(img2);

        functionPane.add(jbtnAll);
        functionPane.add(jbtnInsert);
        functionPane.add(jbtnUpdate);
        functionPane.add(jbtnDelete);
        functionPane.add(jbtnSearch);

        statusPane.add(jlbDBStatus);
        statusPane.add(jbtnDBConnect);
        statusPane.add(jbtnExit);

        jbtnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });

        jbtnDBConnect.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                JButton jbtn = (JButton) aa.getSource();
                if(dbconn == null){
                    dbconn = new DBConn();
                    jlbDBStatus.setIcon(icons[1]);
                    jbtn.setText("Off line");
                }else{
                    dbconn.closeDB();
                    dbconn = null;
                    jlbDBStatus.setIcon(icons[0]);
                    jbtn.setText("Connect");
                }
            }
        });

        jbtnAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent acc){
                jta.append(dbconn.showAll());
        }
    });
    }
}
