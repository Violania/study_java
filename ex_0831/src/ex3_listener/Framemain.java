package ex3_listener;

import java.awt.*;
import java.awt.event.WindowListener;
public class Framemain { 
    public static void main(String[] args) {
        Frame f = new Frame();
        // f.setSize(300,300);
        // f.setLocation(500,200);
        f.setBounds(500,200,300,300);

        //우상단 x버튼 감지
        f.addWindowListener(new MyEvent());

        f.setVisible(true);
    }
}
