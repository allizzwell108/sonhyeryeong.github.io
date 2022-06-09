//책 정보 셋업하는 메소드

public class BookMethod {
	private String title;
	private String author;
	private String publisher;
	private String  area;
	private int price;
	
	//생성자로 만들기-배열로?
	public BookMethod(){}
	
//	public BookMethod(String title,String author,String publisher,String  area,int price) {
//		this.title=title;
//		this.author =author;
//		this.publisher=publisher;
//		this.area=area;
//		this.price =price;
//	}
	//제목 , 저자, 출판사, 장르, 가격 순으로 따로 배열을? 만드나. 
	
	public void setAll(String title,String author,String publisher,String  area,int price) {
		this.title=title;
		this.author =author;
		this.area=area;
		this.publisher=publisher;
		this.price =price;
	}
	
	public void printAll() {
		System.out.printf("%s / %s / %s / %s / %d원 ",title,author,publisher,area,price);
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public String getArea() {
		return area;
	}

	
	public int getPrice() {
		return price;
	}


	
}
