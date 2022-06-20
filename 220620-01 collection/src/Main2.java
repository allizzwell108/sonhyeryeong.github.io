import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		//<제네릭으로 타입을 정해줌> 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
//		list.add("asdf");//제네릭으로 타입을 정해줬기 때문에 컴파일 에러가 난다.
		
		//왜 안될까?? 객체라서!
		//제네릭으로 정해주면 가능!!
		int sum =0;
		for(int i=0; i<list.size();i++) {
			sum +=list.get(i);
		}
		System.out.println(sum);
		
	}
}
