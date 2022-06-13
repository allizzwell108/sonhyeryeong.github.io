
public class Melon extends Food{
	private String from;

	public Melon(String from) {
		super();
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	public String toString() {
		return super.toString() +"\n농원: "+from;
	}
}
