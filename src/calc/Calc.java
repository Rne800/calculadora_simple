/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;

/**
 *
 * @author Rene
 */

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;

public class Calc extends JFrame {

 private Button bt1;
 private Button bt2;
 private Button bt3;   
 private Button bt4;
 private Button bt5;
 private Button bt6;
 private Button bt7;
 private Button bt8;
 private Button bt9;
 private Button bt0;
 private Button btadd; 
 private Button btmin;
 private Button btmul;
 private Button btdiv;
 private Button btequ;
 private Button btdel;
 private JTextField screen;
 private ListenButton listenButton;
 public String opera;
 public float primero;
 public float segundo;
 
 public Calc() {
     setTitle("Mi Calculadora");
     setSize(360, 430);
     setLocationRelativeTo(null);
     getContentPane().setLayout(null);
     
     bt1 = new Button("1");
     bt1.setBounds(5,55,80,80);
     bt2 = new Button("2");
     bt2.setBounds(90,55,80,80);
     bt3 = new Button("3");
     bt3.setBounds(175,55,80,80);
     bt4 = new Button("4");
     bt4.setBounds(5,140,80,80);
     bt5 = new Button("5");
     bt5.setBounds(90,140,80,80);
     bt6 = new Button("6");
     bt6.setBounds(175,140,80,80);
     bt7 = new Button("7");
     bt7.setBounds(5,225,80,80);
     bt8 = new Button("8");
     bt8.setBounds(90,225,80,80);
     bt9 = new Button("9");
     bt9.setBounds(175,225,80,80);
     bt0 = new Button("0");
     bt0.setBounds(90,310,80,80);
     btadd = new Button("+");
     btadd.setBounds(260,55,80,80);
     btmin = new Button("-");
     btmin.setBounds(260,140,80,80);
     btmul = new Button("*");
     btmul.setBounds(260,225,80,80);
     btdiv = new Button("/");
     btdiv.setBounds(260,310,80,80);
     btequ = new Button("=");
     btequ.setBounds(175,310,80,80);
     btdel = new Button("C");
     btdel.setBounds(5,310,80,80);
     screen = new JTextField();
     screen.setBounds(5,5,335,50);
     
     getContentPane().add(bt1);
     getContentPane().add(bt2);
     getContentPane().add(bt3);
     getContentPane().add(bt4);
     getContentPane().add(bt5);
     getContentPane().add(bt6);
     getContentPane().add(bt7);
     getContentPane().add(bt8);
     getContentPane().add(bt9);
     getContentPane().add(bt0);
     getContentPane().add(btadd);
     getContentPane().add(btmin);
     getContentPane().add(btmul);
     getContentPane().add(btdiv);
     getContentPane().add(btequ);
     getContentPane().add(btdel);
     getContentPane().add(screen);
     
     listenButton = new ListenButton();
     
     bt1.addActionListener(listenButton);
     bt2.addActionListener(listenButton);
     bt3.addActionListener(listenButton);
     bt4.addActionListener(listenButton);
     bt5.addActionListener(listenButton);
     bt6.addActionListener(listenButton);
     bt7.addActionListener(listenButton);
     bt8.addActionListener(listenButton);
     bt9.addActionListener(listenButton);
     bt0.addActionListener(listenButton);
     btadd.addActionListener(listenButton);
     btmin.addActionListener(listenButton);
     btmul.addActionListener(listenButton);
     btdiv.addActionListener(listenButton);
     btequ.addActionListener(listenButton);
     btdel.addActionListener(listenButton);
     
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setVisible(true);
 }
 
    public static void main(String[] args) {
        Calc calc = new Calc();
    }
    
    public class ListenButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bt1) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"1");
            }
            if (e.getSource() == bt2) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"2");
            }
            if (e.getSource() == bt3) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"3");
            }
            if (e.getSource() == bt4) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"4");
            }
            if (e.getSource() == bt5) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"5");
            }
            if (e.getSource() == bt6) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"6");
            }
            if (e.getSource() == bt7) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"7");
            }
            if (e.getSource() == bt8) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"8");
            }
            if (e.getSource() == bt9) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"9");
            }
            if (e.getSource() == bt0) {
                if (screen.getText().equals(opera)) {
                    screen.setText(""); }
                screen.setText(screen.getText()+"0");
            }
            if (e.getSource() == btadd) {
                primero = Float.parseFloat(screen.getText());
                opera = "+";
                screen.setText("+");
            }
            if (e.getSource() == btmin) {
                primero = Float.parseFloat(screen.getText());
                opera = "-";
                screen.setText("-");
            }
            if (e.getSource() == btmul) {
                primero = Float.parseFloat(screen.getText());
                opera = "*";
                screen.setText("*");
            }
            if (e.getSource() == btdiv) {
                primero = Float.parseFloat(screen.getText());
                opera = "/";
                screen.setText("/");
            }
            if (e.getSource() == btdel) {
                screen.setText("");
            }
            if (e.getSource() == btequ) {
                
                segundo = Float.parseFloat(screen.getText());
                
               switch (opera) {
                   case"+":screen.setText(Float.toString(primero+segundo)); break;
                   case"-":screen.setText(Float.toString(primero-segundo)); break;
                   case"*":screen.setText(Float.toString(primero*segundo)); break;
                   case"/":screen.setText(Float.toString(primero/segundo)); break;
               }
            }
        }
    }
}
