package frame;

import java.util.ArrayList;

public class Review {
	
	static ArrayList<String> s=new ArrayList<String>();
	
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
		str="";
		s.add(test);
	}
	
}
	

		
		
