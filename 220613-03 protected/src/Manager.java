
public class Manager extends Employee {
	private int bonus;
	

	
	public Manager() {
		super();//부모클래스에 기본 생성자가 없으면 컴파일 에러가 난다.
	}
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}

	public void printSalary() {
		System.out.println(name+"("+address+")"+(salary+bonus));
	}
	
	public void printRRN() {
//		System.out.println(RRN);//직원 클래스에 private으로 정의되어 있어 컴파일 에러가 난다. 
	}

}
