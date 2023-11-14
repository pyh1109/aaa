package inheritance;
class Shape{
    public void draw(){
    System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){//동적바인딩으로 조상클래스보다 우선해서 메서드를 실행한다
        System.out.println(this.getClass());
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
public class Ex06_mehodOverriding {
    static void print(Shape p){ //슈퍼클래스의 참조변수로 선언함. Shape p = new Line(); 수퍼클래스 참조변수 p로 다형성 표현함
        p.draw();//동적바인딩으로 자손클래스의 메서드가 우선 실행됨       
    }
    public static void main(String[] args) {
        Line line = new Line();
        print(line);//호출방법 1

        print(new Shape());
        print(new Line());//호출 방법2
        print(new Rect());
        print(new Circle());
    }
}