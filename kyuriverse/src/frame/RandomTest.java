package frame;

import java.util.ArrayList;

import busVO.MyBus;

public class RandomTest {
	
	MyBus b=new MyBus();
	public RandomTest() {
		int[] list= new int[10];
		int v=(int)Math.random()*9+1;
		for(int i=0;i<list.length;i++) {
			list[i]=v;
			list[i];
		}
	}
}


