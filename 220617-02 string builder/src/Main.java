
public class Main {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("원본");
		sb.append(",One=")
			.append(1)
			.append(",DoubleValue=")
			.append(255.0);
		//sb.reverse();
		StringBuffer sbuffer;//
		
		
//		sb.setCharAt(0,'Q');
//		sb.replace(start,end,str);
		sb.insert(0, "시작");
		
		
		String result =sb.toString();
		System.out.println(result);
		
		
		
//		String str = "원본 문자열";
//		String other ="다른 문자열";
////		String origin = "원본 문자열";
//		
//		String concat = str+other;
//		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열"==concat);
		
//		System.out.println(str ==origin);//이건 true 나옴 
		
	}
}
