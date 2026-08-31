package ex7_frame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 100, 700, 300);

        Font font = new Font("궁서체", Font.BOLD, 30);

        Label q1 = new Label("1.관심 분야는 무엇입니까?");
        q1.setFont(font);
        q1.setBackground(Color.YELLOW);
        q1.setBounds(50, 95, 400, 30);

        // checkbox 생성
        Checkbox news = new Checkbox("뉴스");
        news.setBounds(50, 65, 100, 30);

        Checkbox sports = new Checkbox("스포츠");
        sports.setBounds(160, 65, 100, 30);

        // checkbox 선택여부 판단
        ItemListener item = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // e.getItem();
                String cb = (String) e.getItem();
                String res = "";

                switch (cb) {
                    case "뉴스":
                        res = e.getStateChange() == 1 ? "뉴스선택" : "뉴스선택 해제";
                        break;
                    case "스포츠":
                        res = e.getStateChange() == 1 ? "스포츠선택" : "스포츠선택 해제";
                        break;
                
                    default:
                        break;
                }
                System.out.println(res);
            }
        };

        news.addItemListener(item);
        sports.addItemListener(item);

        //질문2
        Label q2 = new Label("메일 수신 여부");
        q2.setFont(font);
        q2.setBounds(50, 130, 400, 30);

        //라디오버튼
        CheckboxGroup group = new CheckboxGroup();
        Checkbox yes = new Checkbox("y",group,true);
        Checkbox no = new Checkbox("n",group,false);

        yes.setBounds(50,165,100,30);
        no.setBounds(160,165,100,30);

        //라디오버튼 이벤트 감지자
        ItemListener itemRadio = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
              //  System.out.println((String)e.getItem());
              switch ((String)e.getItem()) {
                case "y":
                    System.out.println("메일 수신함");
                    break;
                case "n":
                    System.out.println("메일 수신 안함");
                    break;
              
              
              }
            }
        };

        yes.addItemListener(itemRadio);
        no.addItemListener(itemRadio);



        // 프레임에 컴포넌트 추가
        f.add(q1);
        f.add(news);
        f.add(sports);
        f.add(q2);
        f.add(yes);
        f.add(no);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
