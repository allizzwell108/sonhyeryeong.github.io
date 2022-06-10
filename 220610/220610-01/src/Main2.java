
public class Main2 {
	public static void main(String[] args) {
		int number= 22;
		//원시 자료형을 객체로 포장하는 것 
		//Wrapper class
		// 앞 첫 글자를 대문자로 바꾸면 됨. 
//		Byte
//		Short 
//		Integer 
//		Long
//		Float
//		Double
//		Character
//		Boolean
		
		Integer i= new Integer(10);// deprecated
		Integer i2 = Integer.valueOf(500); //Boxing 한다. 
		int primitiveInt =i2.intValue(); // unboxing : int 형으로 변환하는거 
		
		//System.out.println(primitiveInt);
		Integer auto =100; //auto-boxing 대입연산을 하면 자동적으로 참조형으로 변환해준다. 
		int un=auto; // 원시형으로 다시 바꾸는것도 대입연산으로 가능함. 
		
		
		Integer value=Integer.valueOf("5959"); //문자형을 숫자로 만들어 준다고?
		int result =Integer.valueOf("1234");
		
		Integer.parseInt("90");//문자를 int형으로 반환한다. 
		
		
		
	}
}
