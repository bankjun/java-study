package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s1 = "aBcABCabcAbc";
		
		System.out.println(s1.length());		//
		System.out.println(s1.charAt(2));		//
		System.out.println(s1.indexOf("abc"));	//
		System.out.println(s1.indexOf("abc",7));//
		System.out.println(s1.substring(3));	//
		System.out.println(s1.substring(3,5));	// 시작인덱스 - 끝인덱스(바로전까지)
		
		String s2 = "   ab   cd   ";
		String s3 = "dfg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim()+ "----"); // 문자열 앞뒤의 공백 제거(가지치기)
		System.out.println("----" + s2.replaceAll(" ","")+ "----");
		
		String[] tokens = s3.split(",");
		for(String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
	}

}
