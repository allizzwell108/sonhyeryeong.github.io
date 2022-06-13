
public class Student extends Person {
	private int score;
	
	public Student(String name, int age,int score) {
//		this.name=name;this는 지금 이 클래스를 참조하는 것. person 클래스에 정의된 것이기 때문에 this 는 사용할 수 없다!
		super(name,age);//생성자의 첫 문장이어야 한다. 부모 생성자 호출
		this.score=score;
	}
//	public int getAge() {
//		return age; getage 가 안되는 것이 아니라 person 클래스에서 age가 private 으로 설정되어 있기 때문이다. 
//	}
	
	
	public int getScore() {
		return score;
	}

}
