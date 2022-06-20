import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		//2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> twoList = new ArrayList<>();
		for(int i=2; i<=10;i=i+2) {
			twoList.add(i);
		}
		System.out.println(twoList);
		
		//7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
		List<Integer> sevenList = new ArrayList<>();
		for(int i=7; i<=35;i=i+7) {
			sevenList.add(i);
		}
		System.out.println(sevenList);
		
		//위의 리스트의 원소들을 모두 다 가지는 리스트
		List<Integer> sumList = new ArrayList<>(sevenList);
		//System.out.println(sumList);//7배열 복사 됨!!
		sumList.addAll(twoList);
		System.out.println(sumList);
		
		//리스트를 오름차순으로 정렬해서 그 원소를 복사한 리스트
		Collections.sort(sumList);
		System.out.println(sumList);
		
		
		//(Random 객체 사용) 0~10사이 난수를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		Random random = new Random();
		List<Integer> randomList = new ArrayList<>();
		while(randomList.size()<6) {
			int result = random.nextInt(11);
			if(!randomList.contains(result)) {
				randomList.add(result);
			}
			
		}
		System.out.println(randomList);
	}
}
