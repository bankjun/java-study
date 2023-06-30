package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		//카라 포인트 - 포인트 처럼 구성하기
		setName(name);
		setSalary(salary);
		this.department = department;
		
	}
	
	public void getInformation() {
		System.out.println("이름:"+ getName() +
						"   연봉:"+ getSalary() +
						"   부서:"+ department);
	}
}
