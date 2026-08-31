package ex9_cal;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
    public static void main(String[] args) {
        // 계산기

        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(300, 100, 400, 400);

        Font font = new Font("궁서체", Font.BOLD, 9);

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
            } else if (i >= 5 && i < 10) {
                buttons[i].setBounds(50 + ((i - 5) * 60), 180, 50, 50);
            } else {
                buttons[i].setBounds(50 + ((i - 10) * 60), 240, 50, 50);
            }
           

            f.add(buttons[i]);
        }
        // for (int i = 0; i < 16; i++) {
        // Button bi = new Button();

        // for (int j = 0; j <10; j++) {
        // bj = Button(j);
        // }
        // bi.setFont(font);
        // f.add(bi);

        // }

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    };

}
