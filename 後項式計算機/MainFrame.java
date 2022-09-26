import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;

public class MainFrame extends JFrame {
    Container cp;
    JPanel jpn = new JPanel();
    JPanel jpn2 = new JPanel();
    JTextField jtf = new JTextField("0");
    JLabel jlb2 = new JLabel(" ");
    JLabel jlb3 = new JLabel(" ");

    JButton jbtns[] = new JButton[20];

    String labels[] = { "(", ")", "^", "Back", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/", };
    String arr[];
    String str = "";

    public MainFrame() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        this.setBounds(10, 10, 800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout());
        jpn.setLayout(new GridLayout(5, 4, 5, 5));
        jpn2.setLayout(new GridLayout(3, 1, 5, 5));
        cp.add(jpn, BorderLayout.CENTER);
        cp.add(jpn2, BorderLayout.NORTH);
        jpn2.add(jtf);
        jpn2.add(jlb2);
        jpn2.add(jlb3);

        jtf.setFont(new Font("Times New Roman", Font.BOLD, 22));    //設定字體大小
        jtf.setHorizontalAlignment(4);          //把字體向右對其
        jtf.setBackground(new Color(250, 250, 250));  //背景顏色
        jtf.setOpaque(true);                    //透明度
        jlb2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        jlb2.setHorizontalAlignment(4);
        jlb2.setBackground(new Color(225, 225, 225));
        jlb2.setOpaque(true);
        jlb3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        jlb3.setHorizontalAlignment(4);
        jlb3.setBackground(new Color(200, 200, 200));
        jlb3.setOpaque(true);

        for (int i = 0; i < jbtns.length; i++) {   //把全部按鈕給new出來並設置傾聽器
            jbtns[i] = new JButton(labels[i]);      //new 出來
            jbtns[i].setFont(new Font("Times New Roman", Font.BOLD, 22));  //設定字的大小
            jbtns[i].addActionListener(new ActionListener() {   //把每個btn設置傾聽器
                public void actionPerformed(ActionEvent ae) {
                    JButton jbtn_tmp = (JButton) ae.getSource();  //獲取事件
                    keyin(jbtn_tmp.getText());          //判斷現在這個按鈕是甚麼
                }
            });
            jpn.add(jbtns[i]);
        }
    }

    private void keyin(String key) {
        switch (key) {
            case "Back":   //退後
                String tmp = "";
                for (int i = 0; i < str.length() - 1; i++) {  //這個迴圈只會取到最後一個數的前一個   
                    tmp += str.charAt(i);   // 把到最後一個以外的東西 全部放入tmp
                }
                str = tmp;   //把字串tmp 放入 str
                jtf.setText(str);   //更改目前的str
                break;
            case "=":
                jlb2.setText("");   //先將第二個設為空
                arr = infixToPostfix(toSplit(jtf.getText()));  //進行排列   出來已經切割完成
                for (int i = 0; i < arr.length; i++) {
                    jlb2.setText(jlb2.getText() + arr[i] + " "); //一個一個放入jlb2
                }
                str = calculate();  //答案
                jtf.setText(str);  //set在jtf
                break;
            default:
                str += key;   //把字串增加目前點的數字
                jtf.setText(str);  //設定jtf
                break;
        }
    }

    private String calculate() {
        String new_arr[] = new String[arr.length];
        while (arr.length > 1) {
            String tmp = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i + 2].equals("+")) {  //判斷目前這個位子的後面第二個字元是否為加號
                    tmp = Double.toString(Double.parseDouble(arr[i]) + Double.parseDouble(arr[i + 1])); //是的話把前面兩個數字做加減
                    new_arr = new String[arr.length - 2]; //並把new_arr這個字串  設成arr的字串長度減二  
                } else if (arr[i + 2].equals("-")) {
                    tmp = Double.toString(Double.parseDouble(arr[i]) - Double.parseDouble(arr[i + 1]));
                    new_arr = new String[arr.length - 2];
                } else if (arr[i + 2].equals("*")) {
                    tmp = Double.toString(Double.parseDouble(arr[i]) * Double.parseDouble(arr[i + 1]));
                    new_arr = new String[arr.length - 2];
                } else if (arr[i + 2].equals("/")) {
                    tmp = Double.toString(Double.parseDouble(arr[i]) / Double.parseDouble(arr[i + 1]));
                    new_arr = new String[arr.length - 2];
                } else if (arr[i + 2].equals("^")) {
                    tmp = Double.toString(Math.pow(Double.parseDouble(arr[i]), Double.parseDouble(arr[i + 1])));
                    new_arr = new String[arr.length - 2];
                } else {
                    continue;
                }
                if (new_arr.length < arr.length) {
                    for (int j = 0; j < new_arr.length; j++) { //把計算過後的答案放入new_arr裡面
                        if (j < i) {
                            new_arr[j] = arr[j];
                        } else if (j == i) {
                            new_arr[j] = tmp;
                        } else {
                            new_arr[j] = arr[j + 2];
                        }
                    }
                    arr = new_arr;  
                    break;
                }
            }
        }
        System.out.println("arr.l= " + arr.length);

        if(Double.parseDouble(arr[0]) - (int)(Double.parseDouble(arr[0])) == 0){
            arr[0] = Integer.toString((int)(Double.parseDouble(arr[0])));
        }
        return arr[0];  //回傳答案
    }

    private int Prec(char ch) { // 優先順序
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    private String[] infixToPostfix(String[] exp) {
        String result = "";   //空字串

        Stack<String> stack = new Stack<>();  //堆疊

        for (int i = 0; i < exp.length; i++) {   //排列全部的順序  達成先乘除後加減有括號先算
            String str = exp[i];

            if (Character.isLetterOrDigit(str.charAt(0))) {//判斷字元str.charAt(0)是否為數字或者是字母  是的話 為true
                result += str + " ";  //把數字加在result  所以stack裡不會有數字  只會有符號
            } else if (str.charAt(0) == '(') {  
                stack.push(str);  //放入stack
            } else if (str.charAt(0) == ')') { //一個) 配一個(
                while (!stack.isEmpty() && stack.peek().charAt(0) != '(') {//判斷stack是否為空 且 peek 查看最上面的字元 != (
                    result += stack.pop() + " "; //如果符合就把符號一個一個Pop出來
                }
                stack.pop();  //如果是( 就把他pop出來  
            } else {
                while (!stack.isEmpty() && Prec(str.charAt(0)) <= Prec(stack.peek().charAt(0))){ //判斷堆疊是否為空 且 str.charAt(0) <= stack.peek().char(0)  
                    result += stack.pop() + " ";  //如果比較小的話  就把stack最上面的 pop出來放到result
                }
                stack.push(str);  //如果比較大或者是堆疊為空的話 就push進stack     就可以做到先乘除後加減的順序
            }
        }

        while (!stack.isEmpty()) { //如果不為空的話  就代表裡面還有四則符號 
            if (stack.peek().charAt(0) == '(') {  //出錯時回傳的
                String[] tmp = { "Invalid Expression" };
                return tmp;
            }
            result += stack.pop() + " ";  //因為還有四則符號所以pop出來
        }
        return result.split(" ");  //最後用切割回傳
    }

    private String[] toSplit(String str) {//1 + 2-3    將字串切割
        String[] arr;
        str = str.replaceAll(" ", "");//1+2-3   //置換  將第一個傳換成第二個
        str = str.replaceAll("\\-", " - ");//1+2 - 3
        str = str.replaceAll("\\+", " + ");//1 + 2 - 3
        str = str.replaceAll("\\*", " * ");
        str = str.replaceAll("\\/", " / ");
        str = str.replaceAll("\\^", " ^ ");
        str = str.replaceAll("\\(", "( ");
        str = str.replaceAll("\\)", " )");
        arr = str.split(" ");//arr = 1,+,2,-,3   每次有空格就切成一個  放入arr字串陣列

        return arr;
    }
}
