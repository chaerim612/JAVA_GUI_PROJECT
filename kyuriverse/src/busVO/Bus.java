package busVO;

public class Bus {

	String busName; //회사(목적지) 이름
	int price; //연봉
	String info; //회사(목적지) 정보
	String time; //이동시간
	String address;	//회사(목적지) 주소

	//생성자
	public Bus() {
		
	}
	
	public Bus(String busName,String address,int price,String time,String info) {
		this.busName=busName;
		this.address=address;
		this.price=price;
		this.time=time;
		this.info=info;
		
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
