package prob5;

public class Prob5 {
	// i가 360이면 "360"으로 저장하는 거임
	// char c = 3;
	// c.charAt(0);
	// 해서 만약 "3",6,9 있으면 출력하고 짝 하는거
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {

			String number = String.valueOf(i);
			// i가 10보다 작을 때
			if(i < 10) {
				// 일의자리가 3,6,9 일때
				if(number.charAt(0) == '3' || number.charAt(0) == '6' || number.charAt(0) == '9') {
					System.out.print(i);
					System.out.println("짝");
				}
			}
			// i가 10보다 크거나 같을때
			else {
				// 십의자리가 3,6,9일때
				if(number.charAt(1) == '3' || number.charAt(1) == '6' || number.charAt(1) == '9') {
					System.out.print(i);
					System.out.print("짝");
					//일의 자리가 3,6,9일때
					if(number.charAt(0) == '3' || number.charAt(0) == '6' || number.charAt(0) == '9') {
						System.out.print("짝");
					}
					System.out.println();
				}
			}
		}
	}
}
