import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 =new BigInteger("9223372036854775807");//long 수를 문자열 형태로 다룰 수 있게끔 ???
		System.out.println(value1.add(new BigInteger("10")));//value1 의 값이 변한게 아니라 10을 더한 새로운 객체를 생성한 것이다.  
		
		System.out.println(value1);
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);//부정확한 값을 가진 실수라서 
		System.out.println(d);//결과값: 0.1000000000000000055511151231257827021181583404541015625 이 나온다. 
		
		
		
	}
}
