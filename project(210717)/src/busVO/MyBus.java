package busVO;

public class MyBus {
	// 예매정보(예약번호, 버스 이름, 예상 소요 시간, 좌석, 금액)
	
			int bookingNum;//예약번호
			String date;//버스 출발일, 예매일자, 내가 탈 일자
			String busTime;//버스출발시간
			String seatNum;//좌석번호
			int busPrice;
			String goal;//목적지(+예매내역 확인

			public MyBus() {
			}
			
			
			public MyBus(int bookingNum) {
				this.bookingNum = bookingNum;
			}
			
			public MyBus(String date, String busTime) {
				this.date = date;
				this.busTime = busTime;
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
				return Integer.toString(bookingNum);
			}

			public void setBookingNum(int bookingNum) {
				this.bookingNum = bookingNum;
			} // 버튼 액션에서 setbookingNum하고 중복이면 다시 set하기.

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
				// TODO Auto-generated method stub
				return "예약번호 : " + this.bookingNum; 
			}
}
	/*
		public MyBus(String busName, String busTime, String seatNum) {
			this.busName = busName;
			this.busTime = busTime;
			this.seatNum = seatNum;
		}
		
		public MyBus(int bookingNum, String busName, int leadTime, String seatNum, int busPrice) {
			this.bookingNum = bookingNum;
			this.busName = busName;
			this.leadTime = leadTime;
			this.seatNum = seatNum;
			this.busPrice = busPrice;
		}
	 */