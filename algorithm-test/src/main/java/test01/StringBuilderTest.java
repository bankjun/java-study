package test01;

public class StringBuilderTest {
	public static void main(String[] args) {
    	long start = System.nanoTime();
    	
    	StringBuilder sb = new StringBuilder("이렇게 16자가 넘으면 안되는 것인가나다라마바사아자차카타파하");
    	
    	sb.append("가나다");
    	sb.append("ABC");
    	
    	System.out.println(sb);
    	
    	System.out.println(print("프린트1"));
    	
    	System.out.println(print2("+매개변수str"));
    	
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
        
        
    }
    
    public static String print (String str) { 
    	StringBuilder sb = new StringBuilder();
    	
    	sb.append(str);
    	
    	return sb.toString();
    }
    public static StringBuilder print2 (String str) {
    	StringBuilder sb = new StringBuilder("프린트2");
    	
    	sb.append(str);
    	
    	return sb;
    }
}
