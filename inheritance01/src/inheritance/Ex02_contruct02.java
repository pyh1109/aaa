/* 
 * 상속관계에서 서브클래스에서 매개변수가 있는 생성자 호출시 슈퍼클래스에서는 기본생성자가 받지만 
 * super(매개변수)로 지정하면 매개변수가 있는 생성자가 받는다.
 */
package inheritance;
class Point{
    private int x, y;
    public Point(){
        this.x = this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("("+ x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;
    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}

public class Ex02_contruct02  {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(6,7,"blue");
        cp.showColorPoint();
    }
}
