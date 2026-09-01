package ex9_cal;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
    public static void main(String[] args) {
        // 계산기

        Frame f = new Frame("계산기");
        f.setLayout(null);
        f.setBounds(300, 100, 400, 400);

        Font font = new Font("궁서체", Font.BOLD, 20);
        Label lb = new Label("0");
        lb.setBounds(50, 50, 290, 50);
        lb.setFont(font);
        f.add(lb);

        //계산기의 모든 버튼이 참조할 감지자
        MyListener listener = new MyListener();
        listener.setLb(lb);
        
        Button[] buttons = new Button[15];

        for (int i = 0; i < 15; i++) {

            if (i < 10) {
                buttons[i] = new Button(String.valueOf(i));
            } else {
                buttons[10] = new Button("+");
                buttons[11] = new Button("-");
                buttons[12] = new Button("*");
                buttons[13] = new Button("/");
                buttons[14] = new Button("=");
            }
            buttons[i].setFont(font);

            if (i < 5) {
                buttons[i].setBounds(50 + (i * 60), 120, 50, 50);
            } else if (i >= 5 && i < 10) {//숫자버튼
                buttons[i].setBounds(50 + ((i - 5) * 60), 180, 50, 50);
            } else {//연산자 버튼
                buttons[i].setBounds(50 + ((i - 10) * 60), 240, 50, 50);
            }

            buttons[i].addActionListener(listener);

            f.add(buttons[i]);
        }

        Button btnC = new Button("C");
        btnC.setBounds(50, 300, 50, 50);
        btnC.setFont(font);
        btnC.addActionListener(listener);
        f.add(btnC);

   
        // for (int i = 0; i < 16; i++) {
        // Button bi = new Button();

        // for (int j = 0; j <10; j++) {
        // bj = Button(j);
        // }
        // bi.setFont(font);
        // f.add(bi);
        // final String[] firstNum = {""};
        // final String[] operator = {""};
        // final String[] secondNum = {""};

        // for (int i = 0; i < buttons.length; i++) {
        //     Button b = buttons[i];
        // }

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }//main

}//class

