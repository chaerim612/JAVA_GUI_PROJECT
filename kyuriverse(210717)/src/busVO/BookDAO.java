package busVO;

import java.util.ArrayList;

import busVO.MyBus;
import busVO.MyBus;

public class BookDAO {
	private static ArrayList<MyBus> reserveList;
	
	public BookDAO() {
		if (reserveList == null) {
			reserveList = new ArrayList<MyBus>();
		}
	}
	
	//예매 내역에 방금 예애한 정보를 등록
	public void addReserveInfo(MyBus e) {
		reserveList.add(new MyBus(e.getGoal(),e.getBusTime(),e.getSeatNum()));
	}
	
	//이미 예애된 정보인지 검색
	public boolean dupSeat(String name, String time, String seat) {

		for (int i = 0; i < reserveList.size(); i++) {
			if (((reserveList.get(i).getGoal().equals(name)) && (reserveList.get(i).getBusTime().equals(time)))
					&& (reserveList.get(i).getSeatNum().equals(seat))) {
				return true;
			}
		}
		return false;
	}
	
}
