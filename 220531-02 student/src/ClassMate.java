//학급(반)
//학생
//학생
//학생

//3명의 학생 이름을 콘솔에 출력할 수 있음
//학생 3명의 총 평균을 알려줄 수 있음. 
//평균 점수가 가장 높은 학생(참조-리턴타입이 학생이어야한다)을 알려줄 수 있음.-> 동일점수일 경우  1<2<3 순으로 


public class ClassMate {
	
	private String name;
	private int score;
	
	public ClassMate(String name, int score){
		this.name=name;
		this.score=score;
	}
///////getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
///////
	void printAllname() {
		System.out.println(getName());
	}
	
//	 classmate MaxScoreName(classmate a, classmate b, classmate c) {
//		if(a.getScore()>= b.getScore() && a.getScore()>= c.getScore() ) {
//			return a.getName();
//		}else if(b.getScore()>a.getScore() && b.getScore() >= c.getScore()) {
//			return b.getName();
//		}else {
//			return c.getName();
//		}
//	}
	
	
	
	public static void main(String[] args) {
		ClassMate classmate1 = new ClassMate("차은우",80);
		ClassMate classmate2= new ClassMate("서강준",60);
		ClassMate classmate3= new ClassMate("송강", 70);
		
		classmate1.printAllname();
		classmate2.printAllname();
		classmate3.printAllname();
		
		int score1=classmate1.getScore();
		int score2=classmate2.getScore();
		int score3=classmate3.getScore();
		
		
		int average= (score1+score2+score3)/3;
		
		System.out.println("학생 3명의 점수의 평균은: "+ average);
		
		
	    int scoreMax = Math.max(score1, Math.max(score2, score3));
	    
	    System.out.println("가장 높은 점수는: "+scoreMax);
		
		
//	    System.out.println("가장 높은 점수를 받은 학생은: "+MaxScoreName(classmate1, classmate2,classmate3));
	    	
	    
		
		
		
	}
	
	

	
}	


