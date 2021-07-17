package frame;

import java.awt.Choice;

import busVO.BookDAO;
import busVO.MyBus;

public class c1teset {
	
	public static void main(String[] args) {
		
		BookDAO bd = new BookDAO();
		bd.init();
		
		MyBus b = new MyBus();
		b.setBookingNum((int)(Math.random()*9));
		b.toString();
		System.out.println(b);
		
		bd.addBookingNum(b);
		
		Choice choice = new Choice();
		
		bd.forEach(
				item -> choice.add(item));
		
		
	}

}
