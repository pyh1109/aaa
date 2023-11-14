 
 package inheritance;
 class SuerClass{
    String name;
	public void print(){
       draw();
    }
    public void draw(){ System.out.println("SuperClass");}
}

public class Ex06_methodOverriding02 extends SuerClass {//상속관계 
    public void draw(){
        System.out.println("오버라이딩하면 서버클래스의 메서드가 우선 실행됨:SubClass");
    }
    public static void main(String[] args) {
        SuerClass p = new Ex06_methodOverriding02();
        p.print();       
    }
}
