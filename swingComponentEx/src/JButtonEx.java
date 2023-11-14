import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEx extends JFrame{
    public JButtonEx(){
        super("JButton연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        //3개의 이미지를 불러들임
        ImageIcon normalIcon = new ImageIcon("image/dog1.png");
        ImageIcon rolloverIcon = new ImageIcon("image/dog2.png");
        ImageIcon pressedIcon = new ImageIcon("image/dream1.png");

        //개의 아이콘 컴포넌트를 가진 버튼 컴포넌트를 생성함
        JButton btn = new JButton("call",normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);
        c.add(btn);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JButtonEx();
    }
}
