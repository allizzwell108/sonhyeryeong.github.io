
public class Main2 {

	public static void main(String[] args) {
		//길이가 5인 정수(int)형 배열을 선언 초기화하고
		//모든 원소(element)의 값을 100으로 설정해 보세요. 
		
		int[] bBox = new int[5];
		
		for(int i=0;i<bBox.length;i++) {
			bBox[i]=100;
		}
		
		
//		bBox[0]=100;
//		bBox[1]=100;
//		bBox[2]=100;
//		bBox[3]=100;
//		bBox[4]=100;
//		bBox[4]=100; 배열의 길이가 5이기 때문에 실행할 때 오류가 생긴다.
		
		
		for(int i=0;i<bBox.length;i++) {
			 System.out.println( i+ "번째 index의 원소값: "+ bBox[i]);
		}
		
		System.out.println("프로그램 종료");
	}

}
