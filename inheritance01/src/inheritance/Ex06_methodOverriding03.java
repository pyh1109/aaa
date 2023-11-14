package inheritance;
class SuperClass {
    protected String name;
    public void paint() {
        draw();//서브에 draw()메소드를 먼저 호출한다
    }
    public void draw() {
        System.out.println(name);
    }
}
public class Ex06_methodOverriding03 extends SuperClass {
    protected String name;
    
    public void draw() {
        name = "서브클래스";       
        super.name = "슈퍼클래스";//정적바인딩
        super.draw();//정적바인딩              
        System.out.println(name);
    }
    public static void main(String[] args) {
        SuperClass sp = new Ex06_methodOverriding03();
        sp.paint();
    }
}
/* 
 * main() 메소드가 시작되고, SuperClass의 객체를 생성합니다. 하지만 이 객체는 Ex06_methodOverriding03 클래스의 인스턴스입니다.

paint() 메소드가 호출됩니다. 이는 SuperClass에 구현된 메소드입니다. paint() 메소드 내부에서 draw() 메소드가 호출됩니다.

그러면, 현재 인스턴스가 Ex06_methodOverriding03 인스턴스임을 고려하면, Ex06_methodOverriding03의 draw() 메소드가 호출됩니다.

draw() 메소드 내부에서, 먼저 name 변수가 슈퍼클래스에서 정의된 것인지, 서브클래스에서 정의된 것인지 확인하기 위해 super 키워드를 사용합니다. 따라서, super.name = "슈퍼클래스" 코드가 먼저 실행됩니다.

이어서, super.draw() 메소드가 호출됩니다. 이 메소드는 슈퍼클래스에서 구현되었으며, 현재 인스턴스가 Ex06_methodOverriding03 인스턴스임에도 불구하고 슈퍼클래스의 draw() 메소드가 호출됩니다. 이것은 정적바인딩(static binding)이 발생하기 때문입니다.

super.draw() 메소드 내부에서, System.out.println(name) 코드가 실행됩니다. 여기서 name 변수는 슈퍼클래스에서 정의된 name 변수를 참조합니다. 따라서, 출력 결과는슈퍼클래스가 됩니다.

다음으로, draw() 메소드 내부에서 name = "서브클래스" 코드가 실행됩니다. 이 코드는 서브클래스에서 정의된 name 변수를 참조합니다.

마지막으로, System.out.println(name) 코드가 실행됩니다. 이 코드는 현재 인스턴스가 Ex06_methodOverriding03 인스턴스임을 고려하여, 서브클래스에서 정의된 name 변수를 참조합니다. 따라서, 출력 결과는 "서브클래스"가 됩니다.

 */