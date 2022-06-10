import java.util.Arrays;
import java.util.Random;

public class Main4 {
	public static int[][] randomArray(){// 이중 배열을 난수로 만들어주는 메소드
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				array[i][j]= random.nextInt(10);
			}
		}
		return array;
	}
	
	public static void print2D(int[][] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
	}
	
	public static int sum(int[] array) {
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		return sum;
	}
	
	public static int[] col(int[][] array,int col) {
		int[] columnArray = new int[array.length];
		for(int i=0; i<array.length; i++) {
			columnArray[i] = array[i][col];
		}
		
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count =0;
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				if(array[i][j]==target) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		//System.out.println(Arrays.deepToString(randomArray));
		//각 행의 합
		//각 열의 합
		//숫자 7의 개수
		//예)[[5, 8, 8, 8, 0], [5, 8, 0, 7, 1], [4, 0, 4, 7, 7], [9, 0, 6, 2, 4], [1, 1, 0, 9, 2]]
		
		print2D(randomArray);
		System.out.println(sum(col(randomArray,1)));// 뒤에 적은 숫자의 행 합
		System.out.println("00의 갯수: "+ count(randomArray,3));//뒤에 적은 숫자의 갯수
	
		
///////////////////////////////////내가 푼거
		//각 행의 합
		int[] sumRow= new int[randomArray.length];
		for(int j=0; j<randomArray.length; j++) {
			for(int i=0; i<randomArray[j].length; i++) {
				sumRow[j] +=randomArray[j][i];
			}
		}
		System.out.println("각 행의 합: "+Arrays.toString(sumRow));
		
		
		
		//각 열의 합
		//0의 0 
		//1의 0 
		//2의 0 
		//3의 0 
		//4의 0
		int[] sumColumn= new int[randomArray.length];
		for(int j=0; j<randomArray.length; j++) {
			for(int i=0; i<randomArray[j].length; i++) {
				sumColumn[j] +=randomArray[i][j];
			}
		}
		System.out.println("각 열의 합: "+Arrays.toString(sumColumn));
		
		
		
		//숫자 7의 개수
		int count=0;
		for(int j=0; j<randomArray.length; j++) {
			for(int i=0; i<randomArray[j].length; i++) {
				if(randomArray[j][i] == 7) {
					count++;
				}
			}
		}
		
		System.out.println("7의 갯수: "+count);
///////////////////////////////////////////////////////	
		

		
		
		
		

	}

}
