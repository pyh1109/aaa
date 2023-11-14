public class CalculateExam {
     //메소드 오버라이딩은 반드시 자손클래스의 메소드가 실행된다.
     
    public static void main(String[] args) {
        int r = 10;
        //조상클래스가 실행됨
        Calculate calculate = new Calculate();
        System.out.println("원넓이="+ calculate.circleArea(r));

        //자손클래스가 실행됨
        Computer computer = new Computer();
        System.out.println("원넓이="+computer.circleArea(r));
    }
}
