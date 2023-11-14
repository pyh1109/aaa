/* import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEx extends JFrame{
    private JCheckBox[] fruits; // 체크박스 배열
    private String[] names = { "사과", "배", "체리" }; // 체크박스 문자열로 사용할 문자열 배열
    private JLabel sumLabel;
    
    public CheckBoxEx(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));

        MyItemListener listener = new MyItemListener();

         // 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, item 리스너 등록
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener); // 체크박스에 리스너 등록함
        }
        sumLabel = new JLabel("현재 0원입니다");
        c.add(sumLabel);

        setSize(300,200);
        setVisible(true);
    }

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

    

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
 */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEx extends JFrame {
    private String[] names = { "사과", "배", "체리" }; // 체크박스 문자열로 사용할 문자열 배열
    private JCheckBox[] fruits = new JCheckBox[names.length];; // 체크박스 배열선언과 초기화
    private JLabel sumLabel;

    public CheckBoxEx() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));

        MyItemListener listener = new MyItemListener();

       // fruits = new JCheckBox[names.length]; // Initialize the fruits array

        // 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, item 리스너 등록
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener); // 체크박스에 리스너 등록함
        }
        sumLabel = new JLabel("현재 0원입니다");
        c.add(sumLabel);

        setSize(300, 200);
        setVisible(true);
    }

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

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
