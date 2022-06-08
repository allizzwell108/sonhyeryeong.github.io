import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int[] copy=Arrays.copyOf(arr, 3); //Arrays.copyOf(원본 배열,새 길이 값)메소드: 원본 배열에 길이를 더하거나 줄여 줌.
		int[] arr2=arr;
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy));// Arrays.equals(배열,비교 배열) 메소드: 길이값, 각 배열 값 모두 비교함. 
		System.out.println(Arrays.equals(arr, arr2));
	}

}
