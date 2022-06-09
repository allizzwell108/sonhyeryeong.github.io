import java.util.Arrays;
import java.util.Scanner;

//도서관리 프로그램
//1.목록보기(가격순으로(같을 때는 어떻게?)
//2.장르 선택해 해당 장르만)

//----------------------------------
//1.작별인사						/김영하/복복서가/장편소설/12,600원
//2.불편한 편의점 					/김호연/나무옆의자/장편소설/12,680원
//3.지금 알고 있는 걸 그때도 알았더라면	/류시화/열림원/시집/8,100원
//4.코스모스						/칼세이건/사이언스북스/과학공학/16,650원
//5.여행의 이유						/김영하/문학동네/에세이/ 12,150원

//책 정보를 하나의 생성자(book)로 묶어서 만듬.  
public class Book {
	private BookMethod[] book;
	Scanner scan = new Scanner(System.in);
	
	public Book(BookMethod...book) {//책 개별을 배열로 만들었다. 
		this.book = book;
	}
	
	//1.목록보기(가격순으로(같을 때는 어떻게?)
	
	//가격이 높은-> 낮은 순으로 정렬하고 싶음. 
	//제일 높은거 빼고 그 다음을 어떻게 하지?? 
	
	public void whatIsBig() {//내림차순 정렬 메소드
		int[] arr = new int[5];
		int what;
		for(int i=0; i<5; i++) {// arr배열에 book가격 넣기. 
			arr[i]= book[i].getPrice();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]>arr[i]) {// book [1] book[0] 비교해서  book [1]이 크면
					what=arr[j]; // 변수에 더 큰 값. book[1] 값 저장
					arr[j] =arr[i]; // arr[1] 에 book[0]값 저장
					arr[i]=what; //arr[0]에 book[1]값 저장됨. 
				}
			}
		}
		//이 반복이 끝나면 arr[]배열에 높은 순으로 가격이 정렬되어 있음. 
		//a
		
		//arr[0]과 가격이 일치하는 책부터 프린트해야함. 
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i]==book[j].getPrice()) {
					System.out.print((i+1)+".");
					book[j].printAll();
					System.out.println();
				}
			}
		}
	}
	
	public void whatIsSmall() {//오름차순 정렬 메소드
		int[] arr = new int[5];
		int what;
		for(int i=0; i<5; i++) {// arr배열에 book가격 넣기. 
			arr[i]= book[i].getPrice();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]>arr[i]) {// book [1] book[0] 비교 
					what=arr[j]; // 변수에 book[1] 값 저장
					arr[j] =arr[i]; // book[1] 에 book[0]값 저장
					arr[i]=what;
				}
			}
		}
		//이 반복이 끝나면 arr[]배열에 높은 순으로 가격이 정렬되어 있음. 
		//arr[0]에 제일 높은거 - arr[4]에 제일 낮은거 
		
		//arr[0]과 가격이 일치하는 책부터 프린트해야함. 
		for(int i=4;i>=0;i--) {
			int k=1;
			for(int j=0;j<5;j++) {
				if(arr[i]==book[j].getPrice()) {
					System.out.print(k+".");
					book[j].printAll();
					System.out.println();
				}
			}
			k++;
		}
	}
	
	
	/*
	public int whatIsMax() {//제일 높은 값을 리턴하는 메소드
		
		int one=0;
		for(int i=0; i<4; i++) {
			if(book[i].getPrice() >=book[i+1].getPrice()) {
				one= book[i].getPrice();
			}else {
				one= book[i+1].getPrice();
			}
		}
		return one;
	}
	*/
	
	
	
//	2.장르 선택해 해당 장르만
	public void area() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 장르를 입력하세요 (예: 장편소설, 시집, 과학공학, 에세이)");
		String userArea = scan.nextLine();
		
		
		if(userArea.equals("장편소설") || userArea.equals("시집") || userArea.equals("과학소설") || userArea.equals("에세이")) {
			for(int i=0; i<book.length; i++) {
				if(userArea.equals(book[i].getArea())) {
					System.out.println("검색 결과 입니다.");
					book[i].printAll();
					System.out.println();
				}
			}
		}else {
			System.out.println("해당 분야의 책이 없습니다. ");
		}
		
	}
	
	
	//4.도서 정보 수정
	public void resetBook() {
		System.out.println("어떤 책의 정보를 수정하시겠습니까?");
		for(int i=0; i<5;i++) {
			System.out.print((i+1)+".");
			book[i].printAll();
			System.out.println();
		}
		int whatNumber = scan.nextInt()-1; 
		System.out.println("어떤 정보를 수정하시겠습니까?\n"
				+ "1.책 제목 2.저자 3.출판사 4.분야 5.가격");
		int whatNumber2 = scan.nextInt();
		scan.nextLine();
		if(whatNumber2 ==1) {
			System.out.println("제목을 입력하시오: ");
			String reTitle= scan.nextLine();
			book[whatNumber].setTitle(reTitle);
			
		}else if(whatNumber2 ==2) {
			System.out.println("저자를 입력하시오: ");
			String reAuthor= scan.nextLine();
			book[whatNumber].setAuthor(reAuthor);
		}else if(whatNumber2 ==3) {
			System.out.println("출판사를 입력하시오: ");
			String rePublisher= scan.nextLine();
			book[whatNumber].setPublisher(rePublisher);
		}else if(whatNumber2 ==4) {
			System.out.println("분야를 입력하시오: ");
			String reArea= scan.nextLine();
			book[whatNumber].setArea(reArea);
		}else if(whatNumber2 ==5) {
			System.out.println("가격을 입력하시오: ");
			int rePrice= scan.nextInt();
			book[whatNumber].setPrice(rePrice);
		}else {
			System.out.println("유효한 입력이 아닙니다.");
			 
		}
	
		System.out.println("수정된 정보입니다. ");
		book[whatNumber].printAll();
	
	}
	
	//5.도서 정보 추가
	public void plusBook() {
		
		System.out.println("몇 개의 도서를 추가할 지 입력하시오 :");
		int plus = scan.nextInt();
		BookMethod[] plusBook=Arrays.copyOf(book,book.length+plus);
		for(int i=book.length;i<plusBook.length;i++) {
			System.out.println("책 제목,저자,출판사,분야,가격 순으로 입력하세요");
			String newtitle =scan.nextLine();
			String newauthor =scan.nextLine();
			String newpublisher =scan.nextLine();
			String  newarea =scan.nextLine();
			scan.nextLine();
			int newprice =scan.nextInt();
			
			plusBook[i].setAll(newtitle, newauthor, newpublisher, newarea,newprice);
		}
		
		System.out.println("모든 책 정보입니다. ");
		for(int i=0; i<plusBook.length;i++) {
			plusBook[i].printAll();
			System.out.println();
		}
		
		//book =plusBook;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
	
		//책 정보 셋팅
		BookMethod book1 = new BookMethod();
		book1.setAll("작별인사", "김영하", "복복서가", "장편소설", 12600);
		BookMethod book2 = new BookMethod();
		book2.setAll("불편한 편의점","김호연","나무옆의자","장편소설",12680);
		BookMethod book3 = new BookMethod();
		book3.setAll("지금 알고 있는 걸 그때도 알았더라면","류시화","열림원","시집",8100);
		BookMethod book4 = new BookMethod();
		book4.setAll("코스모스","칼세이건","사이언스북스","과학공학",16650);
		BookMethod book5 = new BookMethod();
		book5.setAll("여행의 이유","김영하","문학동네", "에세이", 12150);
		//책 개별을 배열로 만든다!	
		//생성자를 통해
		Book book = new Book(book1,book2,book3,book4,book5);
		
		
		book.plusBook();
		//book.resetBook();
		
		
		
		
		
		
		
		
		/*
		//사용자가 선택하게 하는거
		
		System.out.println("원하는 정렬 번호를 선택하세요\n"
				+ "1.가격순으로 내림차순 2.분야 입력하여 검색하기 3.상세보기");
		int whatUserWant = scan.nextInt();
		
		if(whatUserWant==1) {
			System.out.println("가격이 높은 순으로 : 1번 \n가격이 낮은 순으로 :2번");
			int a= scan.nextInt();
			if(a==1) {
				book.whatIsBig();//내림차순 정렬 메소드
			}else if(a==2) {
				book.whatIsSmall();//오름차순 정렬 메소드
			}
			
		}else if(whatUserWant==2) {
			book.area();//분야 입력
		}
		else if(whatUserWant==3) {
			for(int i=0; i<5;i++) {
				book.book[i].printAll();
				System.out.println();
			}
		}else if (whatUserWant==4){
			book.resetBook();
		}
		
		
		*/
		
		
		
		
	

	}

}
