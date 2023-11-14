package src;
public class Ex01_StringBuffer {
    StringBuffer strBuffer;
    
    public Ex01_StringBuffer(String str){
        this.strBuffer = new StringBuffer(str);
    }
    
    public void append(String str){
        this.strBuffer.append(str);
    }
    
    public void replace(int start, int end, String str){
        this.strBuffer.replace(start, end, str);
    }
    
    public void insert(int index, String str, int offset, int len){
        this.strBuffer.insert(index, str, offset, len);
    }
    
    public static void main(String[] args) {
        Ex01_StringBuffer buffer = new Ex01_StringBuffer("this");
        buffer.append(" is my");
        buffer.replace(8,10,"your");
        buffer.insert(12," phone", 0, 6);
        System.out.println(buffer.strBuffer.toString());
    }
}
