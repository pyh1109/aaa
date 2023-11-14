

//제네릭스택 만들기 예제---String, Integer로 만들기
class GStack<T> {
    int k,i;
    Object stack[]; 

    public GStack() {
        k = 0;
        stack = new Object[10];
    }

    public void set(T item) {
        if (k == 10)
            return;
        stack[k] = item;
        k++;
    }

    public T pop(int i) {
         /* if (k == 0)   //입력의 역순으로 출력하는 코드
            return null;
            k--;  */
        return (T)stack[i];
    }
}

public class MyStack {
    public static void main(String[] args) {
        GStack<String> ss = new GStack<String>();
        ss.set("seoul");
        ss.set("부산");
        ss.set("인천");

        GStack<Integer> is = new GStack<Integer>();
        is.set(10);
        is.set(20);
        is.set(30);

        for (int i = 0; i < 3; i++) {
            
            System.out.print(ss.pop(i) + " ");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(is.pop(i) + " ");
        }
    }
}


