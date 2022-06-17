import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",","[","]");//쉼표로 구분해주게ㅆ다.[] 로 시작하고 끝내겠다.
		sj.add("1");
		sj.add("2");
		sj.add("3");
		
		System.out.println(sj+"asdf");
		
		String result = sj.toString();
		System.out.println(result);
		
	}
}
