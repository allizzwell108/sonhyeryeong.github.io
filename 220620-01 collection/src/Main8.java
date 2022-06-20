import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,23,35,11,23,57,79));
		//합,평균
		
		
		//인덱스 번호로 접근하는 방법이므로 , 특정 값을 삭제하는 용도로는 부적절하다. 
//		for(int i =0; i<list.size(); i++) {
//			list.remove(i);
//		}
		
		//하나씩 지우는 방법으로는 iterator가 적절하다. 
//		Iterator<Integer> iter= list.iterator();
//		while(iter.hasNext()) {
//			iter.next();
//		}
		
		
		 
		int sum=0;
		for(int i =0; i<list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("합은: "+sum);
		System.out.println("평균은 :"+ (sum/list.size()));
		
		
		
		//정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		System.out.println(list.contains(57));
		System.out.println("정수 57의 인덱스 번호는: "+ list.indexOf(57));
		
		// 정수 23의 갯수
		int x=0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i)==23) {
				x++;
			}
		}
		System.out.println("정수 23의 갯수는: "+ x);
		
		
		//중복되는 원소 23을 하나 삭제하기. 
//		list.remove(Integer.valueOf(23));이렇게 하면 인덱스 번호가 아닌 원소값을 넣어도 가능
		list.remove(list.indexOf(23));
		System.out.println("원소23 삭제한 리스트:"+list);
		
		//역순으로
		list.remove(list.lastIndexOf(23));
		System.out.println(list);
		
	}

}
