package busVO;

public class MyBus {
////////////////////////////////////////////////////////////////////////	
		String bookingNum;//예약번호
		String date;//버스 출발일, 예매일자, 내가 탈 일자
		String busTime;//버스출발시간
		String seatNum;//좌석번호
		int oPrice;//할인전가격 (Bus클래스 busPrice 필드랑 필드명이 동일해서 변경했어요!)
		String startPoint;//출발지
		String goal;//목적지(+예매내역 확인
		int disPrice; //얼만큼 할인율 ex) 10000원의 30%할인이면 3000원
		int nPrice;// 최종
		
		public MyBus() {
			// TODO Auto-generated constructor stub
		}
		//가격정보 (할인 전 가격, 할인받은 가격, 할인된 가격)
		
		// 예매정보(버스 이름, 날짜, 출발 시간, 좌석, 예약번호)
		public MyBus(String goal,String date, String busTime,String seatNum,String bookingNum, int oPrice, int nPrice) {
			this.goal=goal;
			this.date=date;
			this.busTime=busTime;
			this.seatNum=seatNum;
			this.bookingNum=bookingNum;
			this.oPrice=oPrice;
			this.nPrice = nPrice;
		}
		
		public int getDisprice() {
			return disPrice;
		}

		public void setDisprice(int disPrice) {
			this.disPrice = disPrice;
		}

		public int getNprice() {
			return nPrice;
		}

		public void setNprice(int nPrice) {
			this.nPrice = nPrice;
		}

		public MyBus(String seatNum) {
			this.seatNum = seatNum;
		}
		
		public String getGoal() {
			return goal;
		}

		public void setGoal(String goal) {
			this.goal = goal;
		}
		
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getBusTime() {
			return busTime;
		}
		
		public void setBusTime(String busTime) {
			this.busTime = busTime;
		}
		
		public String getBookingNum() {
			return bookingNum;
		}

		public void setBookingNum(String bookingNum) {
			this.bookingNum = bookingNum;
		} // 버튼 액션에서 setbookingNum하고 중복이면 다시 set하기.

		public String getSeatNum() {
			return seatNum;
		}

		public void setSeatNum(String seatNum) {
			this.seatNum = seatNum;
		}

		public int getoPrice() {
			return oPrice;
		}

		public void setoPrice(int oPrice) {
			this.oPrice = oPrice;
		}
			
}