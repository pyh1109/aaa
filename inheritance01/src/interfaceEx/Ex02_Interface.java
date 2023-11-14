package interfaceEx;

interface PhoneInterface{
    int TIMEOUT=1000;
    void sendCall();
    void receiveCall();
    public default void printLogo(){
        System.out.println("인터페이스 default입니다");
    }
}
class Calc{
    public int calculate(int x, int y){
        return(x+y);
    };
}

class SmartPhone extends Calc implements PhoneInterface{//상속과 인터페이스 구현하기
    @Override 
    public void sendCall(){//인터페이스 구현
        System.out.println("따르릉~~~");
    }
    @Override
    public void receiveCall(){//인터페이스 구현
        System.out.println("수신합니다");
    }
    
    public void schedule(){//객체 멤버
        System.out.println("토요일날 스케줄이 있나요?");
    }
}

public class Ex02_Interface {
  
public static void main(String[] args){
    SmartPhone p = new SmartPhone();
    p.sendCall();
    p.receiveCall();
    System.out.println("더하기 값"+" " + "="+" "+  p.calculate(4,5));
    p.schedule();
}
    
}
