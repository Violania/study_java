package ex8_frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(300, 100, 800, 400);

        Font font = new Font("궁서체", Font.BOLD, 20);
        
        //종료버튼x클릭시
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Frame f1 = new Frame();
                f1.setLayout(null);
                f1.setBounds(500, 190, 400, 220);
                f1.setFont(font);
                f1.setBackground(Color.GRAY);

                Label q = new Label("종료할까요?");
                q.setBounds(140, 60, 300, 50);

                Button btn1 = new Button("네");
                btn1.setBounds(60, 130, 110, 50);

                ActionListener act = new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        System.exit(0);
                    }
                    
                };

                // switch (e.getActionCommand()) {
                //     case "네":
                //         System.exit(0);                    
                //         break;
                //     case "아니요":
                //         f1.dispose();
                //         break;
                // }

                Button btn2 = new Button("아니요");
                btn2.setBounds(230, 130, 110, 50);

                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f1.dispose();
                    }
                });

                btn1.addActionListener(act);
                //btn2.addActionListener(act); 이경우 스위치문으로 제어가능 e.getActionCommand()

                

                f1.setVisible(true);

                f1.add(q);
                f1.add(btn1);
                f1.add(btn2);
            }
        });
        f.setVisible(true);
    }
}
