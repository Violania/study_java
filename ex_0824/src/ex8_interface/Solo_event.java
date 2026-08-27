package ex8_interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solo_event {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button btn = new Button("버튼");

        f.setSize(300, 300);
        f.add(btn);
        f.setVisible(true);
        int cnt = 0;

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);// 종료
            }

        });
    }

}