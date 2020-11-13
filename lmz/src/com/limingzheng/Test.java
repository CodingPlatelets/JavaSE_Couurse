package com.limingzheng;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
//import java.util.StringTokenizer;

public class Test extends JFrame implements KeyListener {
    private JLabel[] jlArray = {new JLabel("和值"), new JLabel("平均值")};
    private JTextField jSum = new JTextField();
    private JTextField jAverage = new JTextField();
    private JTextArea jText = new JTextArea("", 10, 30);
    private JScrollPane jsp = new JScrollPane(jText);

    public Test() {
        this.setLayout(null);
        jlArray[0].setBounds(20, 10, 50, 25);
        jSum.setBounds(70, 10, 170, 25);
        jlArray[1].setBounds(20, 30, 50, 25);
        jAverage.setBounds(70, 35, 170, 25);
        jsp.setBounds(20, 70, 220, 100);
        jText.setEnabled(true);
        jText.setDisabledTextColor(Color.BLACK);
        this.add(jAverage);
        this.add(jSum);
        this.add(jsp);
        this.add(jlArray[0]);
        this.add(jlArray[1]);
        jText.addKeyListener(this);
        this.setTitle("和与平均值");
        this.setResizable(false);
        this.setBounds(100, 100, 280, 220);
    }

    public void keyTyped(KeyEvent e) {
//        String str = jText.getText();
//        String str1 = str.trim();
//        System.out.println(str);
//        while(str.equals(" ")){
//            str= jText.getText();
//        }
//        str = str.trim();
//        String[] strArray = str.split(" ");
//        double[] douArray = new double[strArray.length];
//        StringTokenizer analyze = new StringTokenizer(str, " ,\n");
//        int all_num = analyze.countTokens();


        try {
            String strings = jText.getText();//获取文本域
            try {
                if (strings.length() != 0) {
                    String number[] = strings.split("\\s+");
                    double[] doubles = new double[number.length];
                    double sum = 0;
                    double average = 0;
                    for (int i = 0; i < number.length; i++) {
                        doubles[i] = Double.valueOf(number[i]);
                        sum += doubles[i];
                        average = (sum / number.length);
                        jSum.setText("" + sum);
                        jAverage.setText("" + average);
                    }
                }
            } catch (NumberFormatException e1) {
                String message = e1.getMessage();
                System.out.println(message);
                e1.printStackTrace();
            }

        } catch (Exception e2) {
            e2.printStackTrace();
        }
//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i] != null) {
//                douArray[i] = Double.parseDouble(strArray[i]);
//                sum += douArray[i];
//            }
//        }

    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        Test frm = new Test();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}