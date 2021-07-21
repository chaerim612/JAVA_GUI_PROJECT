package busVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookDAO {
	private static ArrayList<MyBus> reserveList;
	
	public BookDAO() {
		if (reserveList == null) {
			reserveList = new ArrayList<MyBus>();
			reserveList.add(0, new MyBus("","","","","----------",0));
		}
		
	}
	
	//예매 내역에 방금 예매한 정보를 등록
	public static void addReserveInfo(MyBus myBus) {
		reserveList.add(new MyBus(myBus.getGoal(), 
				myBus.getDate(),
				myBus.getBusTime(),
				myBus.getSeatNum(),
				myBus.getBookingNum(),
				myBus.getNprice()));
	}
	
	public static ArrayList<MyBus> getReserveList() {
		return reserveList;
	}
	
	//예매번호로 예매 정보를 찾는 메서드
	public static MyBus searchBus(String bookingNum) {
		for (int i = 0; i < reserveList.size(); i++) {
			
			if (reserveList.get(i).getBookingNum().equals(bookingNum)) {
				return reserveList.get(i);
			}
		}
		return null;
	}
	
	//이미 예매된 정보인지 검색
	public static boolean dupSeat(String name, String time, String seat) {
		for (int i = 0; i < reserveList.size(); i++) {
			if (((reserveList.get(i).getGoal().equals(name)) 
					&& (reserveList.get(i).getBusTime().equals(time)))
					&& (reserveList.get(i).getSeatNum().equals(seat))) {
				return true;
			}
		}
		return false;
	}
	
	public static String searchBNum(String num) {
		for (int i =0;  i < reserveList.size(); i++) {

			if (reserveList.get(i).getBookingNum().equals(num)) {
				return reserveList.get(i).getBookingNum();
			}
		}
		return null;
	}

	public static ArrayList<String> getBookingNum() {
		ArrayList<String> bookingNum = new ArrayList<>();
		
		reserveList.forEach(
				mybusArray -> bookingNum.add(mybusArray.bookingNum)
				);
		
		return bookingNum;
	}
}
