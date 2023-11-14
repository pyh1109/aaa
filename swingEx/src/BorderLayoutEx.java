
import java.awt.Container;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout 연습");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new java.awt.BorderLayout(20, 30));

        contentPane.add(new JButton("calculator"),BorderLayout.CENTER);
        contentPane.add(new JButton("calculator"),BorderLayout.NORTH);
        contentPane.add(new JButton("calculator"),BorderLayout.SOUTH);
        contentPane.add(new JButton("calculator"),BorderLayout.WEST);

        setSize(300, 400);
        setVisible(true);
        
    }
    public static void main(String[] args){
        new BorderLayoutEx();
    }
    }
    

