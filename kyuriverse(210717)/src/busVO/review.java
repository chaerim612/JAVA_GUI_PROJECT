package busVO;

import java.util.ArrayList;

import frame.FrameStartingPoint;

public class review {
	static ArrayList<String> s=new ArrayList<String>();
	FrameStartingPoint ss=new FrameStartingPoint();
	static int i;
	static String str;
	public static String getTest() {
		
		for(i=0;i<s.size();i++) {
			System.out.println(s.get(i));
			str+=s.get(i);
		}
		
		return str;
	
		
	}
	public static void setTest(String test) {
		
		s.add(test);
	}
}