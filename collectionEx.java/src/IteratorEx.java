import java.util.Vector;
import java.util.Iterator;


public class IteratorEx {
    /**
     * @param args
     */
    public static void main(String[] args){
        //정수값만 다루는 제네릭 Vector객체 생성하기
        Vector<Integer> v = new Vector<Integer>();
        //데이터 입력하기
        v.add(4);
        v.add(3);
        v.add(-1);
        v.add(2,100);

        //Iterator를 이용한 자료 검색하기
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            Integer x = it.next();
            System.out.print(x+" ");
        }
        //정수값 더하기
        int sum = 0;
        it = v.iterator();
        /* for(int i=0;i<v.size();i++){
            int n = v.get(i);
            sum += n;
        } */
        //while문으로 작성해서 합계구하기
        while(it.hasNext()){
            Integer n = it.next();
            sum += n;
        }
        System.out.println("벡터 요소의 합계 = "+ sum);
    }
}
