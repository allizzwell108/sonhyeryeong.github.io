import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static boolean isNumberChar(char c) {//char를 전달받아 숫자 범위에 있는가?
		return c>='0' && c<='9';
	}
	
	public static boolean isNumberStr(String s) {
		for(int i=0; i<s.length();i++) {
			if(!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		//위 리스트에서 
		List<String> list = new ArrayList<>(Arrays.asList("apple","banana","carrot","donut","egg"));
		
		//문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		List<String> list4 = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			if(list.get(i).length()==5) {
				list4.add(list.get(i));
			}
		}
		System.out.println(list4);
		//iterator로 푼거 
		List<String> copy = new ArrayList<>(list);
		Iterator<String> iterator =copy.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.length()!=5) {
				iterator.remove();
			}
		}
		System.out.println(copy);
		
		//문자열 중에 'e'문자를 포함하는 리스트 생성
		List<String> listE = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			if(list.get(i).contains("e")) {
				listE.add(list.get(i));
			}
		}
		System.out.println("e를 포함하는 리스트: "+listE);
		
		
		/////////////2번
		List<String> list2 = new ArrayList<>(Arrays.asList("가","1","@","3","나","1000"));
		//"정수 형태의 값"을 가지는 문자열을 찾아
		//해당 원소를 가지는 정수형 리스트 생성
		List<Integer> stringToInteger = new ArrayList<>();
		
		//문자열을 원소로 가지는 문자열 리스트 생성
		List<String> integerToString = new ArrayList<>();
		
		
		for(int i=0; i<list2.size();i++) {
			String str = list2.get(i);
			if(isNumberStr(str)) {//아스키코드로 생각하고 푼 거 (메소드 사용)
				stringToInteger.add(Integer.valueOf(str));
			}
			
			//내가 푼거
//			try {
//				stringToInteger.add(Integer.valueOf(str));
//			}catch(NumberFormatException n) {
//				integerToString.add(str);
//			}
		}
		
		System.out.println("정수형 리스트: "+stringToInteger);
//		System.out.println("문자열 리스트: "+ integerToString);
	}
}
