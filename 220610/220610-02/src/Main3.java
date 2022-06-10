import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		//2~5의 제곱수들을 각 원소로 가지는(길이 값 5개)  2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		//2 4 8 16 ...
		//3 9 27 81...
		//.....

		int[][] arr=new int[4][5];
		for(int i=0; i<arr.length;i++) {
			int n =1;
			for(int j=0; j<arr[i].length;j++) {
				n *=2+i;
				arr[i][j]=n;
			}
		}
		
//		System.out.println(Arrays.toString(arr)); 안되는 이유? 배열을 참조하고 있는 배열이라서. 
		System.out.println(Arrays.deepToString(arr));// 이렇게 하면 출력됨. 
		
//		
//		int[] a = {2,4,8,16,32};
//		int[] b = {3,9,27,81,243};
//		int[] c = {4,16,64,256,1024};
//		int[] d = {5,25,125,625,3125};
//		
//		
//		int[][] sumNumber = new int[4][5];
//		
//		for(int i=0; i<sumNumber.length;i++ ) {
//			System.out.println(Arrays.toString(sumNumber[i][]));
//		}
	
		
		
	}

}
