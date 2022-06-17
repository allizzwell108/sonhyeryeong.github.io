import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine ="apple banner carrot donut";
		
		
		StringTokenizer st= new StringTokenizer(longLine," ");//왼쪽은 분할하고자 하는 문자열, 오른쪽은 기준이 되는 문자열이다. 
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		
		
		//킹박로 풀이
		String[] arr= new String[4];
		StringBuilder sb= new StringBuilder(longLine);
		for(int i=0; i<3;i++) { 
			int local = sb.indexOf(" ");
			arr[i]=sb.substring(0,local);
			sb.replace(0, local+1, "");
		}
		
		System.out.println(arr[2]);
		
		
		
		
		
		
		
		
		
		
		String[] split=longLine.split(" ");
		System.out.println(split[2]);
		
//		for(int i=0; i<longLine.length();i++) {
//			if(longLine.charAt(i)==' ') {
//				System.out.println(i);
//			}
//		}
		//5,12,19 인덱스에 공백 있음. 
		
		
		
		
		
		
		
	}
}
