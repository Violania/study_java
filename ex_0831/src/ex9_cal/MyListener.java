package ex9_cal;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{
    private String num1 = "";
    private String num2 = "";
    private String op = "";
    private int res1 = 0;// 결과
    private float res2 = 0;// 나누기 결과
    private int phase = 0;
    
    private Label lb;
    public void setLb(Label lb) {
        this.lb = lb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "+":
            case "-":
            case "*":
            case "/":
                phase = 1;
                op = e.getActionCommand();
                lb.setText(num1+" "+op+" ");
                break;         
            
            case "=":
                phase = 0;
                switch (op) {
                    case "+":
                        res1 = Integer.parseInt(num1) + Integer.parseInt(num2);
                        lb.setText(""+res1);
                        break;
                    case "-":
                        res1 = Integer.parseInt(num1) - Integer.parseInt(num2);
                        lb.setText(""+res1);
                        break;
                    case "*":
                        res1 = Integer.parseInt(num1) * Integer.parseInt(num2);
                        lb.setText(""+res1);
                        break;
                    case "/":
                        res2 = Float.parseFloat(num1) / Float.parseFloat(num2);
                        lb.setText(""+res2);
                        break;
                
                    default:
                        break;
                }

                //결과출력 
                if(op.equals("/")){
                    lb.setText(""+res2);
                }else{
                    lb.setText(""+res1);
                }
                break;

            case "C":
                num1 = "";
                num2 = "";
                op = "";
                res1 = 0;
                res2 = 0;
                phase = 0;
                lb.setText("0");
                break;

            default: //숫자버튼 클릭 감지
                if(phase == 0){
                    num1 += e.getActionCommand();
                    lb.setText(num1);
                }else{
                    num2 += e.getActionCommand();
                    lb.setText(num1+" "+op+" "+num2);
                }
                break;
        }
}
}
