package busVO;

import java.util.ArrayList;

public class BookDAO {
	//예약번호 받아서 초이스에 넣기위한 컬랙션
	private static ArrayList<MyBus> reserve;
	//?
	private static ArrayList<String> reserveNum;

	public BookDAO() {
		
		if(reserve == null) {
			reserve = new ArrayList<MyBus>();
		}
	}
	//생성자 호출
	public void init() {
		reserveNum = new ArrayList<String>();
	}
	
	////////////////////////////////////////////////////////////////
	
	//bookingNum을 reserve 에 담아!
	public void addBookingNum(MyBus b) {
		reserveNum = new ArrayList<String>();
		b.getBookingNum();
		reserveNum.add(b.toString());
	}
	
	public String setBookNum() {
		MyBus b = new MyBus();
		for (int i=0; i < reserveNum.size(); i++) {
			if(reserveNum.get(i).contains(b.getBookingNum())); 
			return reserveNum.get(i);
		}
		return "예매내역이 없습니다.";
	}
	
	////////////////////////////////////////////////////////////////
	/*
	//예매정보인지 검색
	public boolean dupSeat(String name,String time,String seat){
		
		for (int i = 0; i < reserveNum.size(); i++) {
			if (((reserve.get(i).getBusName().equals(name)) && 
					(reserve.get(i).getBusTime().equals(time))) && 
					(reserve.get(i).getSeatNum().equals(seat))) {
				return true; 
			}
		}
		 return false;
	}
	
	public MyBus searchBookingNum(int bookingNum) {
		
		for(int i=0; i<reserveNum.size(); i++) {
			
		}
		return reserveNum.get(i);
	}
	*/
}
