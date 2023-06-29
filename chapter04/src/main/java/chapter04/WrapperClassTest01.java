package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// deprecated
		Integer i = new Integer(10);
		
		// Auto Boxing
		Integer i2 = 10;
		Long l = 10L;

		System.out.println(i2.equals(10)); // 10이 기본 정수가 아닌데도 오토박싱덕분에 가능
		
		// Auto Unboxing
		System.out.println(i2 == 10); // 객체의 동일성을 검사하게되야 하는데 int형의 비교와 똑같이 됨, 오토 언박싱 덕분에
		// System.out.println(i2.intValue() == 10); d원래 이게맞긴함
		
		int m = i2 + 10; // 이것도 안되는게 맞는데 오토언박싱으로 해줌
		// int m = i2.intValue() + 10; 오토 언박싱 아니면 이렇게 해야함
		
	}

}
