import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvent extends JFrame {
    private JCheckBox[] fruits; // 체크박스 배열
    private String[] names = { "사과", "배", "체리" }; // 체크박스 문자열로 사용할 문자열 배열
    private JLabel sumLabel;

    public CheckBoxItemEvent() {
        super("체크박스 연습하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));

        fruits = new JCheckBox[3]; // fruits 배열 초기화

        class MyItemListener implements ItemListener {
            private int sum = 0;

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (e.getItem() == fruits[0])
                        sum += 100;
                    else if (e.getItem() == fruits[1])
                        sum += 500;
                    else if (e.getItem() == fruits[2])
                        sum += 2000;
                } else {
                    if (e.getItem() == fruits[0])
                        sum -= 100;
                    else if (e.getItem() == fruits[1])
                        sum -= 500;
                    else if (e.getItem() == fruits[2])
                        sum -= 2000;
                }
                sumLabel.setText("현재 금액의 합계는 " + sum + "원입니다");
            }
        }

        // 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, item 리스너 등록
        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener); // 체크박스에 리스너 등록함
        }

        sumLabel = new JLabel("현재 0원입니다");
        c.add(sumLabel);

        c.setSize(300, 300);
        c.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxItemEvent();
    }
}
