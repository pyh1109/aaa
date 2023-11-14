/* package abstractEx;

import java.util.Scanner;

abstract class Calculator{
    protected int a, b;
    abstract protected int calc();
    protected void input(){
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
    }
    public void run(){
        input();
        int res = calc();
        System.out.println("계산 결과값=" + res);
    }
}

class Adder extends Calculator {
   
    protected int calc() {
        return a + b;
    }   
}

class Substract extends Calculator {
    
    protected int calc() {
        return a - b;
    }   
}
public class Ex03_Calc {
    public static void main(String[] args) {
        Adder add = new Adder();
        Substract substract = new Substract();
        add.run();
        substract.run();
    }    
}
 */
package abstractEx;
import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	protected void input() {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("정수 2개를 입력하세요>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
	}
	
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
	abstract protected int calc(); // 추상 메소드 
}

class Adder extends Calculator {
	public int calc() {
		return a + b;
	}
	public void run() {
		super.input();
		int res = calc();
		System.out.println("더한 값은 " + res);
	}
}
class Subtracter extends Calculator {
	public int calc() {
		return a - b;
	}
}

public class Ex03_Calc {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		adder.run();
		sub.run();
		
	}


}
