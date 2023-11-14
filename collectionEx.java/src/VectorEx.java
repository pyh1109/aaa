import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) throws Exception {
        Vector<Integer> v = new Vector<Integer>();
        //var v = new Vector<Integer>(); 자바 10부터 진화된 형식
        v.add(3);
        v.add(4);
        v.add(-1);
        //백터 중간에 값 삽입하기
        v.add(2,100);

        System.out.println("백터내에 요소의 개수 :" + v.size());
        System.out.println("백터의 현재 용량 =" + v.capacity());

        //모든 요소 출력하기
        for(int i=0;i<v.size();i++){
            int n=v.get(i);
            System.out.print(n+" ");
        }
        
        //백터의 값 더하기
        int sum = 0;
        for(int i=0; i<v.size();i++){
            int s = v.elementAt(i);//백터의 i번째 정수를 가져옴
            sum += s;
        }
        System.out.println("\n"+"백터의 합계="+sum);
    }
}
