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
        super(name);
    }
}

public class Ex04_downcasting {
    public static void main(String[] args) {
        Person p = new Student("이사람");
        Student s;
        s = (Student)p;  //다운캐스팅으로 자손 클래스 참조변수로 조상클래스 멤버를 참조한다.
                        //반드시 자손클래스 타입으로 형 변환를
        System.out.println(s.name);
    }
}
