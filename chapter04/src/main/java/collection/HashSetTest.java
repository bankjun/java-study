package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		//set: 순서가 없음, 내용이 중요, 객체가 달라도 내용이 같으면 나옴
		
		String s1 = new String("둘리");
		String s2 = new String("둘리");
		
		s.add(s2);
		s.add("둘리"); // 둘리를 위에서 이미 넣었기 때문에 새로 추가되지않음, 내용을 기반으로 하기때문
		s.add("마이콜");
		s.add("또치");
		
		System.out.println(s.size());
		System.out.println(s.contains(s1));
		
		s.remove("마이콜");
		
		//순회
		for(String str : s) {
			System.out.println(s);
		}
	}

}
