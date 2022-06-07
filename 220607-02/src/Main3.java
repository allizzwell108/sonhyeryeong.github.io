public class Main3 {
	public static void main(String[] args) {
		//실수 1.02, 0.03, 4.0 
		
//		double d1=1.02;
//		double d2=0.03;
//		double d3=4.0;
		//이런식으로 해야 했으나 배열을 이용하면, 
		
		double[] myArr ={1.02,0.03,4.0};//선언과 동시에 초기화와 값 전부 셋하기. 
		
		for(int i=0; i<myArr.length;i++) {
			System.out.println(myArr[i]);
		}
		
	}
}
