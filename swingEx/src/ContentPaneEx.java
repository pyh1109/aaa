
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
    public ContentPaneEx(){//생성자
        super("ContentPane과 JFrame의 예제");//프레임 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료버튼

        Container contentPane = getContentPane();//contentPane 가져오기
        contentPane.setBackground(Color.ORANGE);//프레임 배경색 넣기
        contentPane.setLayout(new FlowLayout());//프레임의 위치 지정하기

        contentPane.add(new JButton("add"));// 프레임에 버튼 세개 넣기
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));

        setSize(300,300);//프레임 크기 지정하기
        setVisible(true);//프레임을 보이게 하기
    }
    public static void main(String[] args) throws Exception {

        new ContentPaneEx();
    }
}
