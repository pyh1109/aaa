import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
    JButton jb1 = new JButton("칼라버튼");
    JButton jb2 = new JButton("비활성화 버튼");
    JButton jb3 = new JButton("컴포넌트 좌표값");

    public JComponentEx(){
        super("JComponent의 공통 메소드 연습하기");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);

        jb1.setBackground(Color.BLUE);
        jb1.setForeground(Color.CYAN);
        jb1.setFont(new Font("Gothic", Font.ITALIC, 20));
        jb2.setEnabled(false);

        jb3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JButton btn = (JButton)e.getSource();
            setTitle(btn.getX()+","+btn.getY());
    }
});
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new JComponentEx();
    }
}
