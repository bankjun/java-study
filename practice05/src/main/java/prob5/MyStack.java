package prob5;

public class MyStack {
	private String[] buffer = null;
	private int top = 0;
	
	public MyStack(int size) {
		buffer = new String [size];
		
	}
	
	public void push(String s) {
		// 만약 스택이꽉차면 늘려줘야하지 
		if(isFull()) {
			String[] temp = new String[buffer.length + 3];
			for(int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = new String [buffer.length + 3]; // 버퍼변수에새로운 String 배열을 참조하게 만듦 
			for(int i =0; i < buffer.length; i++) {
				buffer[i] = temp[i];
			}
		}
		buffer[top++] = s;
		
	}
	
	public String pop() {
		if(isEmpty()) {
			System.out.println("prob5.MyStackException: stack is empty");
		}
		return buffer[top--];
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {// 스택이 꽉차는 경우 
		if(top == (buffer.length-1)) {
			return true;
		}else {
			return false;
		}
	}
	
}