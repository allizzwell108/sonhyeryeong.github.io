//컵라면
//제조사
//이름 
//가격

//생성자,게터세터

//override
//toString
//equals-제조사와 이름이 같으면 
public class Main2 {
	public static void main(String[] args) {
		Noodle n= new Noodle("삼양","육개장", 1000);
		Noodle n2= new Noodle("삼양","육개장",1000);

		System.out.println(n.toString());
		System.out.println(n2.toString());
		
		if(n.equals(n2)) {
			System.out.println("같은 컵라면 입니다.");
		}else {
			System.out.println("다른  컵라면 입니다.");
		}
		
		n2.setName("안성탕면");
		System.out.println(n2.toString());
		if(n.equals(n2)) {
			System.out.println("같은 컵라면 입니다.");
		}else {
			System.out.println("다른  컵라면 입니다.");
		}
	
	}
	//안녕 혜령아 너는 지금 소현이와 같이 향수에 대한 심도 깊은 대화를 나누고 있지..
	//나 없이 너흰 행복하니?
	//나는 행복하지 않아도 행복한 척 할거야
	//약한 모습 너에게 보여줄 수 없어
	//마크제이콥스랑 이솝이랑 또 뭐더라..열심히 공부해서
	//너희와 함께할 날을 기대할게,,
	//앗 그집곱도리탕 먹고싶어
	//맛잇겠다 금요일날 기대됨
	//허억허억 빨리 곱도리탕 줘
	//내놔~~~~~~~~~~~~
}
