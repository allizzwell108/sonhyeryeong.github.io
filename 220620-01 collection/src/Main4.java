import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		Iterator<String> iterator=list.iterator();//리스트의 원소를 하나하나 볼 수 있게 하는 메소드
		while(iterator.hasNext()) {//원소가 있는지 확인하는  hasNext()
			//System.out.println(iterator.next());//원소가 없으면 컴파일 에러가 남.
			
			String str = iterator.next();//원소를 하나씩 가져옴
			if(str.length()==5) {
				iterator.remove();
			}//순환 중 원소를 삭제하려면 iterator필수!!
		}
		System.out.println(list);
		
		
		
		
		
		
//		//equals로 동등 비교를 하고 있음. 
//		//참조가 다른데 true를 반환하는 이유
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");
//		
//		System.out.println(list);
		
		//위의 리스트에서 5글자 문자열만 찾아서 지우기
//		for(String s:list) {//이거 안됨!!for-each는나열이랑 확인 용도만 가능해서
//			if(s.length()==5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		

	}

}
