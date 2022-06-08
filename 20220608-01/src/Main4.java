import java.util.Arrays;

public class Main4 {
	//1.두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	//예) [1,2,3] [10,11,12,13,14]
	// [1,2,3,10,11,12,13,14]
	
	public static int[] combination(int[] left, int[] right) {
		int num=left.length+right.length;
		int[] cob = new int[num];
		for(int i=0; i<left.length; i++ ) {
			cob[i]=left[i];
		}
		int j=0;
		for(int i=left.length ; i<num;i++) {
			cob[i]=right[j];
			j++;
		}
		return cob;
	}
	
	
	//2.두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	//예) [1,2,3] [10,11,12,13,14]
	// [11,13,15,13,14]
	
	public static int[] sumArray(int[] left, int[] right) {
		if(left.length>right.length) {
			int[] plusCombi = new int[left.length];
			for(int i=0; i<left.length;i++) {
				plusCombi[i]= left[i]+right[i];
			}
			return plusCombi;
		}else {
			int[] plusCombi = new int[right.length];
			for(int i=0; i<right.length;i++) {
				plusCombi[i] =left[i]+right[i];
			}
			return plusCombi;
		}
	
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		int[] test = {1,2,3};//3
		int[] test2= {10,11,12,13,14};//5
		
		
		//System.out.println(Arrays.toString(combination(test,test2)));//1번 ok!
		
		
		System.out.println(Arrays.toString(sumArray(test,test2)));
		
		
		
		/*
		int[] arr = {10,20,30};
		//배열의 칸을 늘리려면? 기존 배열에 새로운 배열을 붙여야함. 
		int[] larger = new int[arr.length +2];
		for(int i=0; i<arr.length; i++) {
			larger[i]=arr[i];
		}
		System.out.println(Arrays.toString(larger));
		
		
		//전부 0이 나온다. (정수형 기본값이 0이라서)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		 */
	}

}
