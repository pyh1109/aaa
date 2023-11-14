import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
    JLabel ja = new JLabel("hello");
    public MouseAdapterEx(){
        super("마우스어댑터 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        java.awt.Container c = getContentPane();
        c.setLayout(null);
        ja.setSize(30,30);
        ja.setLocation(100,100);
        c.add(ja);
        c.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = getX();
                int y = getY();
                ja.setLocation(x, y);
            }
        });
        
        setSize(300,300);
        setVisible(true);
    
    
    }
    public static void main(String[] args) {
        new MouseAdapterEx();
    }
}
