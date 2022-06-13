public class Magazine extends Book{
	private String publishDay;

	public Magazine() {
		super();
	}

	public Magazine(String title, int pageNumber, String author,String publishDay) {
		super(title, pageNumber, author);
		this.publishDay = publishDay;
	}

	public String getPublishDay() {
		return publishDay;
	}

	public void setPublishDay(String publishDay) {
		this.publishDay = publishDay;
	}
	
	public String toString() {
		return super.toString()+ "\n발매일: "+publishDay;
	}
	
	
}
