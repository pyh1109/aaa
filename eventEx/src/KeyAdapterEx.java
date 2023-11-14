import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyAdapterEx extends JFrame {
    JLabel ja = new JLabel("Hello");

    public KeyAdapterEx() {
        super("가상키 코드 연습하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 컨텐트팬 설정하기
        java.awt.Container c = getContentPane();
        c.setLayout(null);
        ja.setLocation(50, 50);
        ja.setSize(100, 20);
        c.add(ja);

        setSize(300, 300);
        setVisible(true);

        ja.setFocusable(true); // 라벨에 포커스 설정
        ja.requestFocus(); // 라벨에 포커스 요청

        ja.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode(); // 방향키는 유니코드가 아니므로 getKeyCode()를 사용함
                /* switch (keyCode) {
                    case KeyEvent.VK_UP:
                       ja.setLocation(ja.getX(), ja.getY() - 10);
                        ja.setText("x="+ja.getX()+",y="+ja.getY());//포커스 좌표값 출력
                        break;
                    case KeyEvent.VK_DOWN:
                        ja.setLocation(ja.getX(), ja.getY() + 10);
                        ja.setText("x="+ja.getX()+",y="+ja.getY());
                        break;
                    case KeyEvent.VK_LEFT:
                        ja.setLocation(ja.getX() - 10, ja.getY());
                        ja.setText("x="+ja.getX()+",y="+ja.getY());
                        break;
                    case KeyEvent.VK_RIGHT:
                        ja.setLocation(ja.getX() + 10, ja.getY());
                        ja.setText("x="+ja.getX()+",y="+ja.getY());
                        break;
                } */
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        ja.setLocation(ja.getX(),ja.getY()-10);break;
                    case KeyEvent.VK_DOWN:
                        ja.setLocation(ja.getX(), ja.getY()+10);break;
                    case KeyEvent.VK_LEFT:
                        ja.setLocation(ja.getX()-10, ja.getY()); break;
                    case KeyEvent.VK_RIGHT:
                        ja.setLocation(ja.getX()+10, ja.getY()); break;
                }
                ja.setText("x="+ja.getX()+",y="+ja.getY());//키의 좌표 설정
            }
        });
    }

    public static void main(String[] args) {
        new KeyAdapterEx();
    }
}

/* import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyAdapterEx extends JFrame{
    JLabel ja = new JLabel("Hello");
    public KeyAdapterEx(){
        super("가상키 코드 연습하기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //컨텐트팬 설정하기
        java.awt.Container c = getContentPane();
        c.setLayout(null);
        ja.setLocation(50,50);
        ja.setSize(100,20);
        c.add(ja);

        setSize(300,300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    
        ja.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                int keyCode = e.getKeyCode();//방향키는 유니코드가 아니므로 getKeyCode()를 사용함
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        ja.setLocation(ja.getX(),ja.getY()-10);break;
                    case KeyEvent.VK_DOWN:
                        ja.setLocation(ja.getX(), ja.getY()+10);break;
                    case KeyEvent.VK_LEFT:
                        ja.setLocation(ja.getX()-10, ja.getY()); break;
                    case KeyEvent.VK_RIGHT:
                        ja.setLocation(ja.getX()+10, ja.getY()); break;
                }

            }
            
        });
    
    }

    public static void main(String[] args) {
        new KeyAdapterEx();
    }
}
 */