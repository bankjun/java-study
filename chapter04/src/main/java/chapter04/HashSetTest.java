package chapter04;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Rect> s = new HashSet<>();
		//Set이라는 자료구조는 중복을 허용안함 -> 동일성비교하고 동질성비교도 함
 		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		Rect r3 = new Rect(40, 5);
		

		s.add(r1);
		s.add(r2);
		//foreach
		for(Rect r :s ) {
			System.out.println(r);
		}
		
	}

}
