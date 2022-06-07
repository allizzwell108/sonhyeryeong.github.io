//배열:하나의 이름으로 여러공간을 사용 가능함
//내가 몇 개를 사용할지를 알려주면 그 갯수만큼의 공간을 만들어 쥼 
public class Main {
	public static void main(String[] args) {
		int[] aBox;//정수형 배열 변수 선언. 
//		aBox =10; 배열은 정수 여러개를 담을 수 있는 타입이기에 오류가 난다. 
		aBox =new int[4];//길이가 4인(4개의 정수를 가질 수 있는) 배열 초기화. new?객체 
		
		System.out.println("배열의 길이 값: "+aBox.length);
//		aBox.length=10;배열은 초기화할 때 정해둔 길이값을 변경 할 수 없다. (에러남)
		
		aBox[0]=56;// 배열이름[인덱스값]
		aBox[1]=57;
		aBox[2]=58;
		aBox[3]=59;
		
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
