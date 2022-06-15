import java.util.Scanner;

public class Member {
	Scanner scan = new Scanner(System.in);
	private String name;
	private String m;
	private String kg;
	private double bmi;
	
	public Member() {}


	public void inputMember() {
		System.out.println("회원 정보를 등록합니다.");
		System.out.println("이름을 입력하세요: ");
		name=scan.nextLine();
		System.out.println("키를 입력하세요:");
		m=scan.nextLine();
		System.out.println("몸무게를 입력하세요: ");
		kg=scan.nextLine();
	}
	
	
	public Member[] settingMember() {//배열로 생성한 멤버 개인의 정보를 셋팅하는 메소드. 
		Member[] members = new Member[10];
		for(int i=0; i<10;i++) {
			members[i]= new Member();
			members[i].inputMember();
		}
		return members;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			return name.equals(((Member)obj).name) && m.equals(((Member)obj).m) && kg.equals(((Member)obj).kg);
		}else 
			return false;
	}
	
	public void overlap() {
		
		for(int i=0;i<3;i++) {
			if(members[i].equals(members[i+1])) {
				System.out.println((i+1)+"번째 입력한 사람은 중복입력입니다.다시 입력하세요");
				members[i].inputMember();
			}
		}
	}
	
	
	
	

	public double  BMI() {
		double mm=Double.valueOf(m);
		double kgkg=Double.valueOf(kg);
		bmi =kgkg/(mm*mm);
		return bmi; 
	}
	
	public void printBmi() {
		
		if(bmi>=35.0) {
			System.out.println("BMI: "+bmi);
			System.out.println("고도비만입니다.");
		}else if (bmi>=30.0) {
			System.out.println("BMI: "+bmi);
			System.out.println("2단계 비만 입니다. ");
		}else if (bmi>=25.0) {
			System.out.println("BMI: "+bmi);
			System.out.println("1단계 비만입니다. ");
		}else if (bmi>=23.0) {
			System.out.println("BMI: "+bmi);
			System.out.println("과체중입니다.");
		}else if(bmi>=18.5) {
			System.out.println("BMI: "+bmi);
			System.out.println("정상입니다.");
		}else {
			System.out.println("BMI: "+bmi);
			System.out.println("저체중입니다.");
		}
		
	}
	
	
	
	
	
/////getter setter//////////////

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getM() {
		return m;
	}



	public void setM(String m) {
		this.m = m;
	}



	public String getKg() {
		return kg;
	}



	public void setKg(String kg) {
		this.kg = kg;
	}
	
	
	
	
///////////////////////////////////	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
