package busVO;

import java.util.ArrayList;

public class CompanyDAO {
	private static ArrayList<Bus> list;
	// private static ArrayList<MyBus> reserveList;

	public CompanyDAO() {
		if (list == null) {
			init();
		}
	}

	private void init() {
		list = new ArrayList<Bus>();
		// 버스 가격 넣어주세요. > bus 클래스에서 가격도 겟셋해주세요.
		list.add(new Bus("네이버", "경기도 성남시 분당구 불정로 6 네이버그린팩토리", 5000, "1시간", "대기업 / 포털 및 기타 인터넷 정보 매개 서비스업", 30000, ""));
		list.add(new Bus("카카오", "경기도 성남시 분당구 삼평동 681번지 에이치스퀘어 N동", 4200, "40분", "대기업/데이타베이스업, 인터넷관련소프트웨어 등", 40000, ""));
		list.add(new Bus("마이크로소프트", "서울 강남구 대치4동 892 포스코센터 서관6층", 2912, "36분", "중견기업/ 소프트웨어자문, 개발무역", 50000, ""));
		list.add(new Bus("애플", "서울 강남구 봉은사로 524", 2183, "36분", "중소기업/백화점,유통,도소매", 60000, ""));
		list.add(new Bus("IBM", "서울 영등포구 여의도동 국제금융로 10 서울국제금융센터", 2172, "31분", "중견기업 / 전산기및전산기부품수출 등", 70000, ""));
		list.add(new Bus("구글", "서울 강남구 테헤란로 152 강남파이낸스센터", 3231, "24분", "중소기업/인터넷검색, 광고/무역, 전자상거래", 80000, ""));

	}// init()

	public Bus searchCompany(String name) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getBusName().equals(name)) {

				return list.get(i);

			}
		}
		return null;
	}
}
