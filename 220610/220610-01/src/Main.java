import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr){
	   for(int index = 1 ; index < arr.length ; index++){

	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp ) ) {

	         arr[aux + 1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
	
	public static void main(String[] args) {
		int[] arr= {50,30,20,60,10};
		
		Arrays.sort(arr);// 오름차순 정렬 메소드
		//정렬을 하면 정보를 찾기 쉬워진다.
		//이진 검색 메소드
		//중복 값이 있을 경우 찾기 힘듬
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("20의 인덱스: "+index);
		
		
		
//		System.out.println(Arrays.toString(arr));
		 
		
		
	}
}
