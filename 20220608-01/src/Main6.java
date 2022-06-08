public class Main6 {
	//정수를 전달 받아 합을 구해 반환하는 메소드
	public static int sum(int ... numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum += numbers[i];
		}
		return sum;
	}
	

	
	public static void someMethod(double d,int... arr) {//배열형식 int[] 대신 가변길이 파라미터 ...으로 가능 , 다른 파라미터가 여러개라면 맨 마지막에 위치함. 
		/*
		인덱스 없이 순환하기???
		for-each문  
		한 번 반복할 때마다 배열 안에 있는 것을 하나씩 끄집어 낸다?>? 
		왼쪽부터 오른쪽으로(이 방향은 바꿀 수 없음) 건너뛸 수 없음. 
		!!!!!!!!!!값을 확인하는 용도로 쓴다!!!!!!!!!!
		ex)	for(int number:arr) {
				System.out.println(number);
			}
		 */
		for(int number: arr) {
			System.out.println(number);
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int result =sum(10,20,30,40,50,60);
		System.out.println(result);
		
		//someMethod(40,50,60,70,80);//가변길이 파라미터라 인식함. 
		
////		someMethod(arr);
//		someMethod(new int[] {20,30,40,50,60});
////		someMethod({11,22,33}); 왜 안될까? 배열 선언과초기화를 동시에 할 때 쓰는 표현이라 안됨. 
//		System.out.println("--------");
//		someMethod(new int[] {4,5,6});
//		System.out.println("종료");
		
	}

}
