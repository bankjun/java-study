package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		String s1 = "Hello " + "World " + "Java " + 17;
	
		String s2 = new StringBuffer("Hello ")
				.append("World ")
				.append("Java ")
				.append(17)
				.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		
		// +연산자를 쓰지 말아야할 경우
		// 아래의 경우, 정수를 + 하는건 정말 빠르지만 
		// new 를 하는경우 메모리에 왔다갔다 하는 시간이 꽤 걸리기 때문에 너무 많은 루프에서 객체생성+ 하는건 안좋음
//		String s2 = "";
//		for(int i = 0; i < 100000; i++) {
//			s2 = s2 + i;
//			// s2 = new StringBuffer(s2).append(i).toString();
//		}
		
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);// 이렇게 메소드만 불러오는 것이 속도가 빠름
		}
		String s3 = sb.toString();
		System.out.println(s3.length());
		
	}

}
