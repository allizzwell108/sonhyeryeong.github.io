//회원관리프로그램
//회원을 콘솔 입력으로 등록할 수 있게. 최대 10명
//중복등록이 되면 안 됨 (이름,키,몸무게가 동일하면 중복입니다)
//기준에 따라 집계를 해서 목록을 보여줘야 합니다. 


//회원
//이름
//키
//몸무게

//BMI지수
//BMI = 몸무게(kg)/키^2(m)



//콘솔 입력 등록>최대 10명
// 배열? 길이가 10명으로? 





public class Main {
	public static void main(String[] args) {
		Member member = new Member();
		member.settingMember();
		member.overlap();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Member member = new Member();
		Member[] members = new Member[10];
		
		
		for(int i=0; i<3;i++) {
			members[i]= new Member();
			members[i].inputMember();
			
			//여기서 하면 당연히 안도ㅐ지 바보야.... 아직 members[i+1]이 생성이 안됐는데,,,,
			//그럼 어캐하지...? 중복 입력하면 바로 반복에서 하나 빼고 다시 입력을 해야 하는데,,,
//			if(members[i].equals(members[i+1])) {
//				System.out.println("중복입력입니다.다시 입력하세요");
//				i -=1;
//			}
		}
		for(int i=0;i<3;i++) {
			if(members[i].equals(members[i+1])) {
				System.out.println((i+1)+"번째 입력한 사람은 중복입력입니다.다시 입력하세요");
				members[i].inputMember();
			}
		}
		
		//bmi지수 확인하기 
		
		for(int i=0; i<3;i++) {
			members[i].BMI();
		}
		
		for(int i=0; i<3;i++) {
			System.out.println(members[i].getName());
			members[i].printBmi();
		}
		
		
		*/
	}
}
