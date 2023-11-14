
import java.util.Vector;

class Point{
        private int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return"("+ x +  "," + y + ")";
        }      
    }

public class VectorEx01 {
        public static void main(String[] args){
        Vector<Point> v = new Vector<Point>();
        //3개의 데이터를 Point객체에 삽입
        v.add(new Point(2,3));
        v.add(new Point(-5,20));
        v.add(new Point(30,-8));

        v.remove(1);//인덱스 1번의 값 삭제
        //백터객체의 모든 데이터를 검색하여 출력함
        for(int i = 0; i<v.size(); i++){
           Point p = v.get(i);//백터 i번째 Point 객체 알아내기
           System.out.println(p+" ");
        }
    }
}
