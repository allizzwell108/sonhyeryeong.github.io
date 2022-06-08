public class Main {
	public static void main(String[] args) {
		//다음과 같은 정수형 배열이 있을 때 
		int[] arr= {15,32,222,119,534,36,9,1234};
		//2자리 수의 개수와 목록을 콘솔창에 출력해보기
		//개수:00
		//---목록----
		//15
		//32
		//36
		
		int count=0;//2자리 수의 개수를 셀 것.
		for(int i=0; i<arr.length; i++) {
			if((arr[i]/10)>=1 &&(arr[i]/10)<=9) {
				count++;
			}
		}
		System.out.println("2자리 수의 개수: "+count);
		
		
		System.out.println("---목록---");
		for(int i=0; i<arr.length; i++) {
			if((arr[i]>=10) &&(arr[i]<100)) {
				//2자리 수를 충족하는거 저장하기??
				//목록을 저장해서 출력하기.
				System.out.println( arr[i]); 
			}
		}
	
	}
}
