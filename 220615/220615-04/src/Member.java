import java.util.Scanner;

public class Member implements Comparable {
	Scanner scan = new Scanner(System.in);
	private String name;
	private double m;
	private double kg;
	private double bmi;
	
	
	
	public Member() {}


	public void inputMember() {
		System.out.println("회원 정보를 등록합니다.");
		System.out.println("이름을 입력하세요: ");
		name=scan.nextLine();
		System.out.println("키를 입력하세요:");
		m=scan.nextDouble();
		System.out.println("몸무게를 입력하세요: ");
		kg=scan.nextDouble();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			return name.equals(((Member)obj).name) && m ==((Member)obj).m && kg==((Member)obj).kg;
		}else 
			return false;
	}
	

	public double  BMI() {
		bmi =kg/(m*m);
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
	
	//키 정렬하기 
	@Override
	public int compareTo(Object o) {
		Member other =(Member)o;
		if(m<other.m) 
			return -1;
		else if(m>other.m)
			return 1;
		else return 0;
	}

	@Override
	public String toString() {
		return  "name=" + name + ", m=" + m + ", kg=" + kg + ", bmi=" + bmi + "]";
	}

/////getter setter//////////////
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getM() {
		return m;
	}


	public void setM(double m) {
		this.m = m;
	}


	public double getKg() {
		return kg;
	}


	public void setKg(double kg) {
		this.kg = kg;
	}


	public double getBmi() {
		return bmi;
	}


	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	
	
///////////////////////////////////	
	
	
}



