package busVO;

public class Bus {

	String busName; //회사(목적지) 이름
	int price; //연봉
	String info; //회사(목적지) 정보
	String time; //이동시간
	String address;	//회사(목적지) 주소
	String busTime;//FrameDate용 매개변수 버스 출발시간
	int busPrice;//버스가격
	String busDate;//탑승일자

	//생성자
	public Bus(String busName,String address,int price,String time,String info,int busPrice,String busDate) {
		this.busName=busName;
		this.address=address;
		this.price=price;
		this.time=time;
		this.info=info;
		this.busPrice=busPrice;
		this.busDate=busDate;
	}
	
	public String getBusDate() {
		return busDate;
	}

	public void setBusDate(String busDate) {
		this.busDate = busDate;
	}
	
	public int getBusPrice() {
		return busPrice;
	}

	public void setBusPrice(int busPrice) {
		this.busPrice = busPrice;
	}

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
