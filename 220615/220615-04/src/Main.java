import java.util.Arrays;

//키순으로 멤버 조회하기
//몸무게 순(오름차순)으로 멤버를 조회하기




public class Main {
	public static void main(String[] args) {
		
		
		Member member = new Member();
		Member[] members = new Member[3];
		//만들어진 배열을 생성자로 다시 참조해서 !!!! 아니 이 쉬운걸 왜 생각 못했었지,.,.,,??????
		//개빡쳐,...
		
		
		for(int i=0; i<3;i++) {
			members[i]= new Member();
			members[i].inputMember();
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

		
		
		Arrays.sort(members);
		System.out.println("키 순 정렬(오름차순)");
		for(int i=0; i<3;i++) {
			System.out.println(members[i].toString());
		}
		
		
		
	}
}
