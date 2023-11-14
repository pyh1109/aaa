
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
    public GridLayoutEx(){
        setTitle("GridLayout 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1,10));//배치관리자로 1행 10열을 생성함.

        for(int i=0; i<10; i++){
            String text = Integer.toString(i);//정수 i를 문자열로 변환
          // int num = Integer.parseInt(text);//문자열을 정수로 변환하는데 Button 객체는 문자열을 받는다
            JButton button=new JButton(text);
            contentPane.add(button);
        }

        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args){
        new GridLayoutEx();
    }
}
