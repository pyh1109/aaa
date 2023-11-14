import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
    public IndepClassListener(){
        super("ActionEvent Listener example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(300,200);
        setVisible(true);
    }   
    public static void main(String[] args)  {
       new IndepClassListener();
    }
    
}