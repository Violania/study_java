package ex2_choice;

import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceListener implements ItemListener {

    Label lb;

    public ChoiceListener(Label lb) {
        this.lb = lb;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String str = (String)e.getItem();

        if (!str.equals("지역선택")) {
            lb.setText(str + "을(를) 선택");
        } else {
            lb.setText("");
        }

    }
}
