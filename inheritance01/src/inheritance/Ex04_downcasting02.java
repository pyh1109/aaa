package inheritance;
class SuperClass{
    protected String name;  
    public void paint(){
        draw();
    }  
    public void draw(){
        System.out.println(name);
    }
}
public class Ex04_downcasting02 extends SuperClass{
    protected String name;
    public void draw(){
        super.name = "슈퍼클래스";//정적바인딩을 하면 슈퍼클래스의 메소드가 실행되고 하부클래스는 안됨
        super.draw();
        name = "하부클래스";
    }   
    public static void main(String[] args) {
        SuperClass sp = new Ex04_downcasting02(); //upcasting한 다음
        Ex04_downcasting02 dp = (Ex04_downcasting02)  sp;//downcsating 해야한다.
        dp.paint();   
    }
}