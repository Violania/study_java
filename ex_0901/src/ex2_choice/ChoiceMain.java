package ex2_choice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 100, 400, 300);
        f.setLayout(null);


        Choice local = new Choice();
        local.add("지역선택");
        local.add("서울");
        local.add("인천");
        local.add("광주");
        local.add("대구");
        local.add("대전");
        local.add("부산");
        local.add("경기");

        local.setBounds(50, 50, 120, 0);

        Label lb = new Label();
        lb.setBounds(250, 150, 150, 200);

        // choice의 변경을 감지하는 감지자
        local.addItemListener(new ChoiceListener(lb));

        f.add(local);
        f.add(lb);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
