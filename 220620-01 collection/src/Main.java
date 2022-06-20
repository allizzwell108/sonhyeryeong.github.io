import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//배열의 단점을 좀 더 사용하기 편한 형태로 클래스로 제공을 해준다. 
		//배열처럼 여러가지 자료들을 가지고 있을 수 있는 객체 
		//길이값을 정해주지 않는다. 추가만 하면 됨!!
		//기본형 타입의 값을 넣을 수 없다!! 객체만 다룰 수 있다. 
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		//autoBoxing이 되면서 integer타입으로 변환되어 그 객체가 되는 것이다!!
		
		list.add(500);
		list.add(123.123);
		
		int size= list.size();//몇 개 담겼는지 알아보는거
		System.out.println(size);
		//집어 넣으라고 하면 칸이 하나 생김.<> 배열에서 칸을 정해놓고 만드는 것과 다름!! 
		//인덱스번호가 생김 (이건 배열과 똑같이 0번부터 시작함)
		
		System.out.println(list.get(0));//해당 인덱스 번호의 객체 반환하는 메소드
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
}
