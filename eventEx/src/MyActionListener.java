import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class MyActionListener implements ActionListener {//ActionListener 인터페이스를 구현해야하는데 리스너의 추상
                                                  //메소드가 아래의 코드가 된다.
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton btn = (JButton)e.getSource();
       if(btn.getText().equals("Action"))
        btn.setText("액션");
       else
        btn.setText("Action");

    }


}
