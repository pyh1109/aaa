
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {//생성자 만들기
        super("FlowLayout예제 연습");//조상클래스 생성자  호출

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        contentPane.add(new Button("add"));
        contentPane.add(new Button("subtract"));
        contentPane.add(new Button("multi"));
        contentPane.add(new Button("division"));

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
