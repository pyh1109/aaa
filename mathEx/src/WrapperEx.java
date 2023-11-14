
public class WrapperEx {
    public static void main(String[] args) {
        // character 사용
        System.out.println(Character.toLowerCase('A'));
        char c1 = '4', c2 = 'F';
        if (Character.isDigit(c1)) {
            System.out.println(c1 + "는 문자");
        }
        if (Character.isAlphabetic(c2)) {
            System.out.println(c2 + "는 영문자");
        }

        // 아스키 코드값 변환하기
        char num = '0';
        System.out.println("문자 0을 아스키코드값으로 변환하면=" + (int) num);
        int num1 = 48;
        System.out.println("숫자 48을 아스키코드값으로 변환하면=" + (char) num1);

        /*
        * char c = '0';
        * int asciiValue = (int) c;
        * System.out.println(asciiValue);
        */

        //Integer 사용
        System.out.println(Integer.parseInt("48"));//문자열 28을 10진수로 변환
        System.out.println(Integer.toString(48));//정수28을 2진수 문자열로 변환
        System.out.println(Integer.toBinaryString(48));//십진수48을 16진수 문자열로 변환
        System.out.println(Integer.bitCount(48));//48에 대한 2진수의 1의 개수
        
        Integer i = Integer.valueOf(48);
        System.out.println(i.doubleValue());//정수 48을 double형으로 변환

        //Doble사용
        Double d = Double.valueOf(3.14);
        System.out.println(d.toString());//Double형 숫자를 문자열 3.14로 변환
        System.out.println(Double.parseDouble("3.14"));//문자열 실수 3.14로 변환

        //Boolean사용
        Boolean b = 4>3;
        System.out.println(Boolean.toString(b));//문자열 true로 변환
        System.out.println(Boolean.parseBoolean("false"));//문자열을 false로 변환





    }
}
