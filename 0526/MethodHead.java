public class MethodHead{
	//정수 2개를 전달받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음. 
	//두 수를 비교- 왼쪽이 크면 무슨 값, 오른쪽이 크면 다른값, 같으면 또 다른 값. - 논리값은 2개밖에 없으니까 정수로 반환해야겠지?
	
	// public static int compare(int left,int right){
		// return left - right; // 왼이 크면-
		
	// }
	
	public static char compare(int left,int right){
		if(left>right){
			return 'L';
		}else if (left<right){
			return 'R';
		}else{
			return 'S';
		}
	}
	
	
	
	public static void main(String[] args){
		char result =compare(150,170);
		System.out.println(result);
	}
}