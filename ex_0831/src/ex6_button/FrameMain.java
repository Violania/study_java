package ex6_button;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setBounds(500, 200, 400, 400);
        f.setLayout(null);//자동배치를끈다

        Button btn1 = new Button("확인");
        btn1.setBounds(50,100,100,150);

        Button btn2 = new Button("취소");
        btn2.setBounds(200,100,100,100);

        //프레임에 버튼 추가
        f.add(btn1);
        f.add(btn2);

        //확인 버튼에 이벤트 감지자 추가
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
               
                System.out.println( "확인버튼이 눌림");
            }
   
        };

        //취소버튼에 감지자 추가
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("취소버튼이 눌림");
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        } );

        btn1.addActionListener(act);

        

        f.setVisible(true);
    }
}
