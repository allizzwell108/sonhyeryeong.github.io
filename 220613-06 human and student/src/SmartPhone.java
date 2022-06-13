
public class SmartPhone extends Phone{
	private String whatType;
	private double version;
	private double memori;
	private String yesNo;
	private String bt;
	public SmartPhone(String whatType, double version, double memori, String yesNo, String bt) {
		super();
		this.whatType = whatType;
		this.version = version;
		this.memori = memori;
		this.yesNo = yesNo;
		this.bt = bt;
	}
	public String getWhatType() {
		return whatType;
	}
	public void setWhatType(String whatType) {
		this.whatType = whatType;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public double getMemori() {
		return memori;
	}
	public void setMemori(double memori) {
		this.memori = memori;
	}
	public String getYesNo() {
		return yesNo;
	}
	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}
	public String getBt() {
		return bt;
	}
	public void setBt(String bt) {
		this.bt = bt;
	}
	
	public String toString() {
		return "운영체제 타입: "+whatType+"\n운영체제 버전: "+version
				+"내부 메모리 크ㄱㅣ: "+memori+"\n카메라장착여부: "+yesNo
				+"\n블루투스 지원 여부: "+bt;
	}
}
