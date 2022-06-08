import java.util.Arrays;

public class Main3 {
	//정수형 배열을 전달 받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy= new int[origin.length];
		
		for (int i=0; i<origin.length; i++) {
			copy[i]= origin[i];
		}
		return copy;
	}
	
	//정수형 배열 2개가 동일한지 (길이와 각 원소값)을 알 수 있는 메소드. 
	public static boolean isThatTrue(int[] left, int[] right) {
		//return left==right;참조형이라서 이건 안됨. 
		
		//배열의 길이가 다르면 배열 각각 비교할 필요 없음!
		//길이값 비교 먼저
		if(left.length !=right.length) {
			return false;
		}
		//길이값 같은것만 내려오니까
		for(int i=0; i<left.length; i++) {
			if(left[i]!=right[i]) {
				return false;
			}
		}
		
		return true;
		
		
		
		
		
		
//		if(left.length==right.length) {
//			for(int i=0; i<left.length-1; i++) {
//				if(left[i]!=right[i]) {
//					return false;
//					break;
//				}
//				
//				
//			}
//			
//			
//			
//		}else
//			return false;
	}
	

	public static void main(String[] args) {
//		int[] test = {50,70,90,110};
//		int[] c =copyArray(test);
//		System.out.println(Arrays.toString(c));
		
		int[] test2 = {10,20,30,40,50};
		int[] test3 = {10,20,30,40};
		
		boolean result=isThatTrue(test2,test3);
		System.out.println("두 배열이 같으면 true, 아니면 false 를 출력합니다.\n:"+result);
		

		
		
		
	}

}
