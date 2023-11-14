/* 
 * upcasting의 사례에서 UpcastindEx class는 Student class를 호출하고 
 이는 다시 Person class를 호출하는 합성 합성로 볼수있다.
 *조상클래스의 참조변수로로 자손클래스의 멤버를 참조할 수 있는것으로 서브클래스가 슈퍼클래스 타입으로 
 변환하는 것을 말한다.
 */
package inheritance;
class Person{
    String name;
    String id;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;
    String depart;

    public Student(String name){
        super(name);//조상클래스 생성자 호출
    }
}

public class Ex03_upcasting {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");
        p = s;
        System.out.println("당신의 이름은 = " + p.name);
    }
}
