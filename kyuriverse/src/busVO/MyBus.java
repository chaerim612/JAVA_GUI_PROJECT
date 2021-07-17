package busVO;

public class MyBus {
	// 예매정보(예약번호, 버스 이름, 예상 소요 시간, 좌석, 금액)

	int bookingNum;// 예약번호
	String busName;// 목적지이름
	String busDate;//날짜
	String seatNum;// 좌석번호
	int leadTime;//소요시간
	int busPrice;//가격

	public MyBus(int bookingNum, String busName, String busDate,int leadTime, String seatNum, int busPrice) {
		this.bookingNum = bookingNum;
		this.busName = busName;
		this.busDate = busDate;
		this.leadTime=leadTime;
		this.seatNum = seatNum;
		this.busPrice = busPrice;
	}
	
	

	public int getBookingNum() {
		return bookingNum;
	}



	public void setBookingNum(int bookingNum) {
		this.bookingNum = bookingNum;
	}



	public String getBusName() {
		return busName;
	}



	public void setBusName(String busName) {
		this.busName = busName;
	}



	public String getBusDate() {
		return busDate;
	}



	public void setBusDate(String busDate) {
		this.busDate = busDate;
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

	public int getLeadTime() {
		return leadTime;
	}



	public void setLeadTime(int leadTime) {
		this.leadTime = leadTime;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "예약번호 : " + bookingNum + "\n\n"
			+ "예약일자 : " + busDate + "\n\n"
			+ "목적지 : " + busName + "\n\n" 
			+ "좌석번호 : " + seatNum + "\n\n"
			+ "소요시간 : " + leadTime + "\n\n"
			+ "결제금액 : " + busPrice; // 할인받은 금액
	}

}