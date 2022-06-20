import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		//List 는 인터페이스!!
		
		List<Integer> list = new ArrayList<>();// 제네릭은 좌측만 선언하고 우측은 생략 가능!!!!
		//위의 리스트에 10,20,30,40
		for(int i =1; i<=4; i++) {
			list.add(i*10);
		}
		//모든 원소들을 출력해보세요
		System.out.println(list.toString());
		list.set(1, 15);//좌측에 인덱스 번호, 우측에 바꾸고자 하는 값
		System.out.println(list);
		
		// 해당 값이 포함되어 있는지?
		System.out.println(list.contains(20));//true,false로 알려줌
		System.out.println(list.indexOf(20));//없으면 -1 
		System.out.println(list.indexOf(30));//인덱스 번호 값 반환
		
		list.remove(2);//해당 인덱스 값의 원소를 제거해줌
		System.out.println(list);
		
		list.add(0,0);
		System.out.println(list);
		
		list.clear();
//		for(int i=0; i<list.size();i++) {
//			list.remove(i);
//		}
		System.out.println("지운결과: "+list);
		System.out.println(list.size()==0);
		System.out.println(list.isEmpty());
		
		
		
	}

}
