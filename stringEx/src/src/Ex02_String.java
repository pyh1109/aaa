package src;


public class Ex02_String {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String(" program");
        String str = a.toString();
        String ab = a.concat(b);
        System.out.println(str);
        System.out.println("a 길이는="+a.length());
        System.out.println("a에 j자가 포함되었는가? ="+a.contains("j"));
        System.out.println("두 단어를 연결 = " + a.concat(b));
        System.out.println("두 문자 사이에 공백제거 ="+ ab.trim());//문장 앞뒤의 공백을 제거함
        System.out.println("자바를 파이선으로 바꿈 ="+ab.replace("java","python"));
        String s[] = ab.split(" ");//문자열을 공백으로 분리(','면 ','로 표시함)
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]); //문자로 분리된 글자를 출력함
        }
        String str2 = ab.substring(5);
        System.out.println(str2);
        char c = ab.charAt(1);
        System.out.println("ab 문자열의 2번째 문자는 "+c+"입니다.");
    }
}
