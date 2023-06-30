package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one"); // auto unboxing
		int j = m.get("two");
		System.out.println(i + ":" + j);
		
		m.put("three", 3333); // 새로 넣으면 바뀜 -> 객체가 바뀌는건지, 객체속의 값이 바뀌는건지?
		System.out.println(m.get("three"));
		
		//순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
		}
		
	}

}
