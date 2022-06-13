public class Phone{
	private String madeBy;
	private int price;
	private String type;
	
	public Phone() {}
	public Phone(String madeBy, int price, String type) {
		super();
		this.madeBy = madeBy;
		this.price = price;
		this.type = type;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "제조사: "+madeBy+"\n가격: "+price+"\n통신타입: "+type;
	}
}





