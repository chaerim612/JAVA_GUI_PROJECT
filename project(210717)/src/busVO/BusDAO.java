package busVO;

import java.util.ArrayList;

import busVO.Bus;
import busVO.MyBus;

public class BusDAO {
	//목적지정보 리스트, 예매 정보 리스트
		//private static ArrayList<Bus> list;
		private static ArrayList<MyBus> reserveList;

		//MovieDAO 기본생성자
		public BusDAO() {
			if(reserveList == null){
				
			}
		}

		//예매 정보 리스트에 방금 예매한 정보를 등록
		public void name() {
			
		}
		
		//이미 예매된 정보인지 검색
		public boolean dupSeat(String name,String time,String seat){
			
			for (int i = 0; i < reserveList.size(); i++) {
				if (((reserveList.get(i).getGoal().equals(name)) && 
						(reserveList.get(i).getBusTime().equals(time))) && 
						(reserveList.get(i).getSeatNum().equals(seat))) {
					return true;
				}
			}
			 return false;
		}
	}//class end