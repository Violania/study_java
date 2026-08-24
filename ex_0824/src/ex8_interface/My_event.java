package ex8_interface;

import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class My_event {
    public static void main(String[] args) {
        
        
        Frame f = new Frame();
        Button btn = new Button("버튼");
        
        f.setSize(300,300);
        f.add(btn);
        f.setVisible(true);

        
        //버튼클릭을 감지하는 익명 내부클래스인
        //ActionLisener()라닌 이름의 interface
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // System.out.println("안녕하세요");

                // for (int i = 0; i < 3; i++) {
                //     System.out.println(i);
                // }
                System.exit(0);//종료
            }

        });
    }
    
}
