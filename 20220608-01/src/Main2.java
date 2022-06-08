public class Main2 {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		
		int[] copy = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			copy[i]=arr[i]; 
		}
		
		
		 //int[] copy= arr; 이렇게 되면 참조를 복사하는 것이기 때문에 arr의 값이 변하면 copy의 값도 변하게 된다. 
		
		
		 arr[0]=1000; 
		 for(int i=0;i<copy.length;i++) {
		 	System.out.println(copy[i]); 
		 }
	}
}
