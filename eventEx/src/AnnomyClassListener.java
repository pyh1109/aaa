import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnnomyClassListener extends JFrame{
    public AnnomyClassListener(){
        setTitle("익명 클래스 연습하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new ActionListener(){//익명클래스 작성함
            @Override
            public void actionPerformed(ActionEvent e){//ActionListener클래스의 인터페이스 추상메소드 구현
                JButton b = (JButton)e.getSource();//이벤트소스를 가져옴
                if(b.getText().equals("Action")){//객체이름이 "Action"인지 확인
                    b.setText("액션");
                }else{
                    b.setText("Action");
            }
            setTitle(b.getText());//타이틀에 버튼의 이름을 표시함 
            }
        });
            setSize(300,300);
             setVisible(true);
        
    }
    public static void main(String[] args) {
       new AnnomyClassListener(); 
    }
}
 
/* import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AnnomyClassListener extends JFrame {
    public AnnomyClassListener() {
        setTitle("익명 클래스 연습하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if (b.getText().equals("Action")) {
                    b.setText("액션");
                } else {
                    b.setText("Action");
                }
                setTitle(b.getText());
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnnomyClassListener();
    }
} */
