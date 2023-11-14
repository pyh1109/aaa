
public class Boxing {
    public static void main(String[] args) {
        
        //Boxing과 UnBoxing하는 코드
        Integer x = Integer.valueOf(10);//Boxing
        System.out.println(x);

        int i = (Integer) x;//정수
        System.out.println(i);//unBoxing

        //Wrapper클래스 객체 생성하기:문자의 객체화
        System.out.println("문자의 객체화");
        Character c = Character.valueOf('s');
        char c2=c.charValue();//문자타입 알아보기
        System.out.println("객체 타입은 =:"+c2);

        System.out.println("불린의 객체화");
        Boolean b = Boolean.valueOf(true);
        System.out.println(b);

        //객체의 타입 알아내기
        System.out.println("Wrapper객체에 들어있는 기본타입 값 알아내기");
        Integer i1 = Integer.valueOf(20);
        int i2= i1.intValue();
        System.out.print("i값의 타입은? = "+ i2);


        //문자열을 기본타입으로 변환하기
        System.out.println("문자열을 기본 타입으로 변환");
        int f1 = Integer.parseInt("123");//parseInt()는 static타입이므로 클래스이름으로 바로 호출가능
        System.out.println("기본타입 =" + f1);
        double d = Double.parseDouble("3.141592");
        System.out.println("기본타입 = " + d);

        //기본타입을 문자열로 변환하기
        System.out.println("기본 타입을 문자열로 변환");
        String s1 = Integer.toString(123);//정수
        System.out.println("문자열 =" + s1);

        String d1 = Double.toString(3.14);//실수
        System.out.println("문자열 ="+d1);

        String c1 = Character.toString('p');//문자'p'를 문자열로 변환
        System.out.println("문자열="+c1);

    }

}
