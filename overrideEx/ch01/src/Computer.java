public class Computer extends Calculate{
    int r;
    @Override
    double circleArea(int r){
        System.out.println("자손 클래스가 실행됨");
        return Math.PI * r * r;
    }
}
