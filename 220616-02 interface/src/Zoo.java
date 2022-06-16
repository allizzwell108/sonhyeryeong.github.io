//동물원 관리

//동물- 종, 나이, 무게

//직원-역할(조련사,경영) 이름
//조련사는 동물들을 담당합니다.




//육식,초식으로 나눠 관리
//주식으로 분류하여 동물 목록을 볼 수 있음.
//조련사 담당에 따라 동물 목록을 볼 수 있음(담당자가 없는 동물도 볼 수 있어ㅏ야 함.)

public class Zoo {
	public static void main(String[] args) {
		//동물 생성
		Tiger tiger=new Tiger("호랑이",3,50,true); 
		Cat cat = new Cat("냐옹이",7,10,true);
		Lion lion = new Lion("사자",2,30,true);
		Cow cow = new Cow("소",5,100,false);
		Penguin penguin = new Penguin("펭귄",1,15,true);
		Eagle Eagle = new Eagle("독수리",3,40,true);
		
		Animal[] all= new Animal[6];
		all[0]= tiger;
		all[1]= cat;
		all[2]= lion;
		all[3]= cow;
		all[4]= penguin;
		all[5]= Eagle;
		
		
		
	
		
		
	}

}


//interface Trainer {// 조련사 인터페이스
//	//육식동물: 조련부 서강준 담당
//	//초식동물: 조련부 박보검 담당 
//	//경영부 차은우- 펭귄, 독수리 
//	default String human(String t, String n) {
//		String type = t;
//		String name = n;
//		return n;
//	};
//	
	
//	default void human(String t, String n) {
//		String type = t;
//		String name = n;
//		System.out.println(name + "담당입니다. ");
//	};
//}
