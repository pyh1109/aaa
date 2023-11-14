package abstractEx;
 abstract class Calculator{
    public abstract int add(int x, int y);
    public abstract int subtract(int x, int y);
    public abstract double average(int[] a);
}
public class Ex01_Calc extends Calculator{
    public int add(int x, int y){
        return x+y;
    }
    public int subtract(int x, int y){
        return x - y;
    }
    @Override
    public double average(int a[]){
        double sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args) {
       Ex01_Calc c = new  Ex01_Calc();
        System.out.println(c.add(3,4));
        System.out.println(c.subtract(10,5));
        System.out.println(c.average(new int[]{3,4,7}));//기본출력:소수15자리 
    }
}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//위의 오류는 package명이 누락되어 main 메소드를 찾을수 없을 때 발생함.
