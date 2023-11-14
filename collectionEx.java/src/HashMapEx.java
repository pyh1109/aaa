

import java.util.*;


import java.util.Iterator;

public class HashMapEx {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        // 데이터 입력하기
        dic.put("apple", "사과");
        dic.put("pencil", "연필");
        dic.put("baby", "아기");

        // dic 해시맵에 들어있는 모든 쌍을 출력
        Set<String> keys = dic.keySet(); // 모든 키을 저장함
        Iterator<String> it = keys.iterator();//컬렉션에 있는 모든 대이터를 반복적으로 검색
        while (it.hasNext()) { 
            String key = it.next();//키를 저장
            String value = dic.get(key);//키에 해당하은 값을 저장함
            System.out.println(key + "," + value);
        }
        //사용자로부터 영어 단어를 입력 받고 한글 단어 검색
        Scanner sc = new Scanner(System.in);
            for(int i=0; i<dic.size();i++){
                System.out.print("찾고 싶은 단어는?");
                String eng = sc.next();//토콘단위로 검색함
                String kor = dic.get(eng);//찾고자하는 영어단어의 값을 저장함.
                if(kor == null)//해당 영어가 없으면 null표시함
                    System.out.println(eng+"는 없는 단어입니다");
                else
                    System.out.println(kor);//값이 있으면 해당 값을 출력함
            }
            sc.close();
        }
       
    }
