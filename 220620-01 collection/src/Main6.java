import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7,3,2,8,9,1));
		//정렬
		Collections.sort(list);
		System.out.println(list);
		
		int index =Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: "+index);
		
		//반대로
		Collections.reverse(list);
		System.out.println(list);
		
		//섞기
		Collections.shuffle(list);
		System.out.println(list);
		
		//최댓값최솟값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		//길이값은 그대로 유지하면서, 안의 원소값을 전부 바꿔준다
		Collections.fill(list, 33);
		System.out.println(list);
		
		//값을 찾아서 그 값을 새로 입력한 값으로 바꿈. 
		Collections.replaceAll(list,33,77);
		System.out.println(list);
		//배열 복사해서 다른 배열 넣기 (앞으로 삽입된다)
//		list.clear();
		List<Integer> target = new ArrayList<>(Arrays.asList(90,80,70));
		Collections.copy(list, target);
		System.out.println(list);
		
	}

}
