import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
    public InnerClassListener(){
        super("내부클래스 연습하디");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        con.add(btn);
        
        setSize(300,300);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
           if( b.getText().equals("Action"))
            b.setText("액션");
           else
            b.setText("Action");

            InnerClassListener.this.setTitle(b.getText());//프레임 타이틀에 버튼 문자열을 출력한다.
        }
    }
    public static void main(String[] args) {
        new InnerClassListener();        
    }
}
