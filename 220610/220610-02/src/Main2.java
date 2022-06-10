import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10};//2의배수
		int[] arr2 = {3,6,9,12,15};//3의배수
		int[] arr3 = {4,8,12,16,20};//4의배수
		//int배열을 배열로 가지는 배열...?
		//그니까 표처럼 되는거,,,?
		int[][] arr2d = new int [3][5];//앞=[3]이 해당 배열의 길이 뒤=[5]원소 하나하나가 가지는 길이 값
		arr2d[0]=arr1;
		arr2d[1]=arr2;
		arr2d[2]=arr3;
		
//		for(int i=0; i<arr2d.length;i++) {// 이러면 길이값이 3이기 때문에 안됨. 
//			System.out.println(arr2d[0][i]);
//		}
		for(int j=0; j<arr2d.length;j++) {
			for(int i=0; i<arr2d[0].length;i++) {// 배열[0]의 길이값을 넣어야함. 
				System.out.print(arr2d[j][i]+",");
			}System.out.println();
		}
		
		
		
		
//		int[][] arrAnother = {{2,4,6},{3,6,9},{4,8,12}};
//		for(int i=0; i<arrAnother[0].length;i++) {
//			System.out.println(arrAnother[0][i]);
//		}
		
		

	}

}
