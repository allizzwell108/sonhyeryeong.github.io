
public class Human {
	private String name;
	private int age;
	private String profession;
	
//상속되는 부모 클래스를 수정하면 (필드 추가 등) 다른 자식 클래스에도 수정이 필요함. 
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "이름: "+name+" , "+"나이: "+age;
	}
	
	
}
