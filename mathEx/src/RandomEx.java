public class RandomEx {
    public static void main(String[] args){
        System.out.println("이번주의 행운번호는?");
        for(int i=0; i<5; i++){
            System.out.print((int)(Math.random()*45 + 1) + " ");
        }
        System.out.println();
        System.out.println(Math.sin(30));//사인 30도의 값
        System.out.println(Math.exp(1));//지수 ex의 값 = 2.718181
        System.out.println(Math.round(3.1412));//소수 첫째자리에서 반올림해서 정수로 표현
    }
}
/* 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * 이러한 오류는 package 입력 누락임.
 */