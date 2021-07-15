package busVO;

public class MyBus {
	// 예매정보(예약번호, 버스 이름, 예상 소요 시간, 좌석, 금액)

	int bookingNum;// 예약번호
	String busName;// 목적지이름
	String busDate;//버스시간
	int leadTime;// 소요시간
	String seatNum;// 좌석번호
	int busPrice;

	public MyBus(int bookingNum, String busName, int leadTime, String seatNum, int busPrice) {
		this.bookingNum = bookingNum;
		this.busName = busName;
		this.leadTime = leadTime;
		this.seatNum = seatNum;
		this.busPrice = busPrice;
	}
	public MyBus() {
		// TODO Auto-generated constructor stub
	}

	public int getBookingNum() {
		return bookingNum;
	}

	public void setBookingNum() {
		//bookingNum = (int) Math.random() * 9;
		//this.bookingNum=bookingNum;
		
	} // 버튼 액션에서 setbookingNum하고 중복이면 다시 set하기.
		//

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(int leadTime) {
		this.leadTime = leadTime;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public int getBusPrice() {
		return busPrice;
	}

	public void setBusPrice(int busPrice) {
		this.busPrice = busPrice;
	}

	@Override
	public String toString() {
		return "예약번호 : "+bookingNum+"\n"+"장소"+busName;
	}

}