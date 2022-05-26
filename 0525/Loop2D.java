public class Loop2D{
	public static void main(String[] args){
		
		
		
		//중첩 루프문
		for(int j=0; j<5; j++){//아우터루프
			for(int i=0; i<5; i++){//이너루프- 중첩루프문의 경우 이너루프 먼저 보기
				System.out.print('*');
			}
			System.out.println();
		}
	}
}