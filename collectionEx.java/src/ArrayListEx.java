

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayCollection 객체 생성
        ArrayList<String> a = new ArrayList<String>();

        //키보드로부터 4개의 데이터를 입력 받아 ArrayCollection에 삽입하기 위한 객체생성
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4;i++){
            System.out.println("이름을 입력하시오");
            String s = sc.next();//키보드로 부터 이름을 입력함
            a.add(s);//컬렉션에 삽입함
        }

        //컬렉션에 있는 모든 데이터를 출력함
        for(int i=0; i<a.size();i++){
            String str = a.get(i);
            System.out.println(str+" ");
    }
    //가장 긴이름 출력
    int longestIndex=0;
    for(int i=0;i<a.size();i++){
        if(a.get(longestIndex).length()<a.get(i).length())//최대 길이 알고리즘
            longestIndex = i;
    }
    System.out.println("최대 길이명 =" + a.get(longestIndex)+"\n"+"최대 길이=" + a.get(longestIndex).length());
            sc.close();
    }
}
