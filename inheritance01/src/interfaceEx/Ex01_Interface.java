package interfaceEx;

interface Phone{
    public final static int TIMEOUT = 1000;//public final static 생략 가능함
    public abstract void sendCall();//public abstract 샐략
    public abstract void receiveCall();//public abstract생략
    public default void printLogo(){
        System.out.println("**phone**");
    }
}

class Sphone implements Phone{
    @Override
   public void sendCall(){
        System.out.println("여보세요~~~~");
    }
    public String toString(){
        return "방가워요";
    }
    @Override
    public void receiveCall(){
        System.out.println("안녕하세요~~~");
    }
    public void flash(){
        System.out.println("전화왔어요~~~");
       
    }
}

public class Ex01_Interface {
    public static void main(String[] args){
        Sphone phone = new Sphone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
        System.out.println(phone.getClass().getName());//사용하고있는 클래스명 출력
        System.out.println(phone.toString());//현 객체의 문자열
        System.out.println(phone);
        System.out.println(phone.toString());
       
    }
}
