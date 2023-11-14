import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventEx extends JFrame {
    private JLabel ja = new JLabel("<enter>키로 배경색 바꾸기");

    public KeyEventEx() {
        super("키이벤트 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        java.awt.Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(ja);
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int r = (int) (Math.random() * 255);
                int g = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);

                switch (e.getKeyChar()) {
                    case '\n': // <enter>키 입력, 외따옴표 주의
                        ja.setText("r="+r+",g="+g+",b="+b);// 레이블 글자 색상값 지정하기
                        //ja.setForeground(new Color(r, g - 100, b - 100));// 레이블 글자색 변경하기
                        getContentPane().setBackground(new Color(r, g, b));// 컨텐트 팬의 배경색 설정
                        break;
                    case 'q':// <q>키 입력, 외따옴표 주의
                        System.exit(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_F5) //키코드값이 F5의 가상 키값과 비교함
                    System.exit(0);
            }

        });
        setSize(300, 300);
        setVisible(true);

        // 다음의 명령어는 반드시 setVisible(true)실행 후 코드 작성해야 함
        c.setFocusable(true);// 포커스 받도록 설정
        c.requestFocus();// 컨텐트팬에 포커스 설정후 키 입력이 가능해 짐
    }

    public static void main(String[] args) {
        new KeyEventEx();
    }
}
