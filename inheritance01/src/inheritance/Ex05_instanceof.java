/* upcasting한 경우 레퍼런스가 가르키는 객체의 진짜 클래스 타입 확인하는 연산자
 * 형식 : A instanceof B : 클래스 A가 클래스 B타입인지를 확인함 :결과(true,false)
 * 예제: Person<-Student, Person<-Researcher<-Pfrofessor 관계를 코딩함
 * Person p = new Professor():
 * if(p instanceof Person) : true
 * if(p instanceof Student) : false
 * if(p instanceof Researcher) : true
 * if(p instandeof Professsor) : true
 */
package inheritance;
  class Person{};
 class Student extends Person{
    public Student(){
        super();
    }
 }   
 class Researcher extends Person{
    public Researcher(){
        super();
    }
}
 class Professor extends Person{
    public Professor(){
        super();
    }
};

public class Ex05_instanceof {  
    static void print(Person p){
        if(p instanceof Person){
            System.out.println("Person");
        }
        if(p instanceof Student){
            System.out.println("Student");
        }
        if(p instanceof Researcher){
            System.out.println("Researcher");
        }
        if(p instanceof Professor){
            System.out.println("Professor");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("new Student()->"); print(new Student());//Person p = new Student();
        System.out.println("new Researcher()->"); print(new Researcher());
        System.out.println("new Professor()->"); print(new Professor());
    }
} 
/* class Person {}
class Student extends Person {
    public Student() {
        super();
    }
}
class Researcher extends Person {
    public Researcher() {
        super();
    }
}
class Professor extends Person {
    public Professor() {
        super();
    }
}

public class Ex05_instanceof {  
    static void print(Person p) {
        if (p instanceof Person) {
            System.out.println("Person");
        }
        if (p instanceof Student) {
            System.out.println("Student");
        }
        if (p instanceof Researcher) {
            System.out.println("Researcher");
        }
        if (p instanceof Professor) {
            System.out.println("Professor");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("new Student()->"); 
        print(new Student());
        System.out.println("new Researcher()->"); 
        print(new Researcher());
        System.out.println("new Professor()->"); 
        print(new Professor());
    }
} */

/* class Person {public Person(){}}
class Student extends Person {
    public Student(){
        super();
    }
}
public class Ex05_instanceof {  
    
public static void main(String[] args) {
    Person p;
    p=new Student();
    System.out.println(p instanceof Student); 
    
    print(new Student());
}} */
/* public class Ex05_instanceof {  
    public static void main(String[] args) {
        double x = 100.0;
        Integer y = (int)x;//downcasting
        String str="java";
        System.out.println(str instanceof String);//객체 클래스에만 사용함
        System.out.println(y instanceof Integer);
    }
} */