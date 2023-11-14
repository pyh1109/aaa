
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
    /**
     * 
     */
    public NullContainerEx(){
        super("배치관리자가 없이 절대위치에 배치하는 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();//컨테이너의 컨텐터팬을 가져옴

        contentPane.setLayout(null);//배치관리자 제거
 
        JLabel label = new JLabel("배치관리자 없는 컴포넌트 배치하기");
        label.setLocation(200,50);//컴포넌트 시작 위치
        label.setSize(200, 20);//컴포넌트 크기 지정하기
        contentPane.add(label);//컴포넌트 부착
;
        for(int i=1; i<=10; i++){
            JButton button = new JButton(Integer.toString(i));
            button.setLocation(i*10,i*15);
            button.setSize(50,20);
            contentPane.add(button);

            //JLbel을 생성하고 랜덤으로 1~10까지 숫자를 임의로 생성하는 예제
            JLabel jb = new JLabel(Integer.toString(i));
            int x = (int)(Math.random()*200)+30;
            int y = (int)(Math.random()*100)+50;
            jb.setLocation(x,y);//임의의 좌표값을 생성함
            jb.setSize(20,20);//글자의 크기를 지정함
            jb.setForeground(Color.MAGENTA);//글자의 색상을 지정함
            contentPane.add(jb);//panel에 부착함

        }
        setLocation(100,100);//프레임 위치를 지정함
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args){
        new NullContainerEx();
    }
}
