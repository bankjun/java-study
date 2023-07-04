package prob5;

public class MyStack {
	private String[] buffer = null;
	private int top;
	
	public MyStack(int size) {
		buffer = new String [size];
		top = -1;
	}
	
	public void push(String s) {
		// 만약 스택이꽉차면 늘려줘야함 
		if(isFull()) {
			String[] temp = new String[buffer.length + 3];
			for(int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
//			buffer = new String [buffer.length + 3]; // 버퍼변수에새로운 String 배열을 참조하게 만듦 
//			for(int i =0; i < buffer.length; i++) {
//				buffer[i] = temp[i];
//			}
			buffer = temp; // 위처럼 안하고 그냥 임시로 만든 배열 객체를 buffer가 참조하도록 만들면 적용됨 
		}
		buffer[++top] = s;
		//printStack();
	}
	
	public String pop()throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		return buffer[top--];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
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
	
//	public void printStack() {
//		for(int i = 0; i < buffer.length; i++) {
//			System.out.print(buffer[i]);
//		}
//		System.out.println();
//	}
	
}