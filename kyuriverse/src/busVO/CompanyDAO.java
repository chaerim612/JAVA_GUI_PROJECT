package busVO;

import java.util.ArrayList;

public class CompanyDAO {
	private static ArrayList<Company> list;
	// private static ArrayList<MyBus> reserveList;

	public CompanyDAO() {
		if (list == null) {
			init();
		}
	}

	private void init() {
		list = new ArrayList<Company>();
		
		list.add(new Company("네이버", "","네이버ㅓㅓ"));
		list.add(new Company("카카오", "","네이버ㅓㅓ"));
		list.add(new Company("마소", "","네이버ㅓㅓ"));
		list.add(new Company("애플", "","네이버ㅓㅓ"));
		list.add(new Company("IBM", "","네이버ㅓㅓ"));
		list.add(new Company("구글", "","네이버ㅓㅓ"));
	}// init()
}
