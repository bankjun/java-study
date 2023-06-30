package chapter04;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// 추상메소드라서 new로 객체를 생성하지 못함
		Calendar cal = Calendar.getInstance(); //펙토리 메소드 : 코드상에서 직접new하지않고 불러오는 메소드
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11); // 12 (month-1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2021, 8, 26); // 2021/09/26
		cal.add(Calendar.DATE, 700);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); //0~11, +1
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); //1(일) ~ 7(토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "-" +
				(month+1) + "-" +
				date + " " + 
				DAYS[day-1] + "요일 " +
				hour + ":" +
				minute + ":" +
				second
				);
	}

}
