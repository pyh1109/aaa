import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerEx extends JFrame implements MouseListener, MouseMotionListener {
    JLabel jb = new JLabel("Hello");

    public MouseListenerEx() {
        super("마우스리스너 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        java.awt.Container c = getContentPane();

        //인터페이스가 두개이므로 두개 모두 MouseListener와 MouseMotionListener을 등록해야 한다
        c.addMouseListener(this); // 현재 클래스의 인스턴스를 ActionListener로 등록합니다
//this는 MouseEventEx객체 자신을 가르키며, 여기서 생성된 이벤트객체의 소스, 종류, 위치등을 확인하고  
//MouseListener 인터페이스 객체를 오버라이딩하여 메소드를 구현해서 contntpane에 등록하게 함.
/* 
 * 또다른 방법으로 c.addMouseListener(new MoseListener(){
 * MosueLisetener()메소드 5개를 모두 구현하여도 된다. 하지만 this를 사용하면 간략하게
 * 처리할 수 있다.
 * })
 */
        c.addMouseMotionListener(this); // MouseMotionListener를 등록합니다.
        c.setLayout(null);
        c.add(jb);

        jb.setSize(100,20);
        jb.setLocation(100,50);
        
        //pack();
        setSize(400,400);
        setVisible(true);
    }

    // MouseListener interface methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
        jb.setLocation(e.getX(), e.getY());
        setTitle("mousePress("+e.getX()+","+e.getY()+")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
        setTitle("mousePress("+e.getX()+","+e.getY()+")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        Component comp = (Component)e.getSource();
        comp.setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
        Component comp = (Component)e.getSource();
        comp.setBackground(Color.YELLOW);
        setTitle("mouseExited("+e.getX()+","+e.getY()+")");
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("MouseDragged");
        setTitle("mouseDragged("+e.getX()+","+e.getY()+")");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("MouseMoved");
        setTitle("MouseMoved("+e.getX()+","+e.getY()+")");
    }

    public static void main(String[] args) {
        new MouseListenerEx(); 
    }
}

