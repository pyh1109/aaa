import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
    

    public LabelEx(){
        super("레이블 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //텍스트레이블 생성하기
        JLabel textLabel = new JLabel("문자열 레이블 생성하기");
        c.add(textLabel);
        
        
        //이미지 레이블 생성하기
        ImageIcon img = new ImageIcon("image/dog1.png");
        JLabel imgLabel = new JLabel(img);
        c.add(imgLabel);

        //문자열과 이미지  모두를 가진 레이블 생성
        ImageIcon icon = new ImageIcon("image/dream1.png");
        Image image = icon.getImage();
        Image imageScale = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon = new ImageIcon(imageScale);

        JLabel label = new JLabel("안녕하세요~~~~~~~~~~~~~~",icon, SwingConstants.LEFT);
        c.add(label);

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LabelEx();
    }
}
