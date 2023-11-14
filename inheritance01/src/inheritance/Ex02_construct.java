/* 
 * 상속관계에서 서브클래스에서 매개변수가 있는 생성자 호출시 슈퍼클래스에서는 기본생성자가 받지만 
 * super(매개변수)로 지정하면 매개변수가 있는 생성자가 받는다.
 */
package inheritance;
public class Ex02_construct {
    public static void main(String[] args) {
        A a = new B();//upcasting
        B b = new B(5);//downcasting
        b=(B)a;
        System.out.println(a instanceof B);
        System.out.println(b);
       
    }
}

class A{
    public A(){
        System.out.println("생성자 A");
    }
    public A(int x){
        System.out.println("매개변수 생성자 A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("생성자 B");
    }
    public B(int x){
        System.out.println("매개변수 생성자 B");
        
    }
}