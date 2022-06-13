//p.264 4번 문제 
// book & magazine문제
public class Book {
	private String title;
	private int pageNumber;
	private String author;
	
	public Book() {}
	
	
	public Book(String title, int pageNumber, String author) {
		this.title = title;
		this.pageNumber = pageNumber;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String toString() {
		return "제목: "+title+"\n페이지수: "+pageNumber+"\n저자: "+author;
	}
	
}
