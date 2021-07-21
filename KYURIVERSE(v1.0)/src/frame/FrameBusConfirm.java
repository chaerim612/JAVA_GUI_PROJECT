package frame;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import busVO.BookDAO;
import busVO.Bus;
import busVO.CompanyDAO;
import busVO.MyBus;

public class FrameBusConfirm extends JPanel {
	double a = 0.3;
	double b = 0.2;
	double c = 0.1;

	BookDAO bd = new BookDAO();
	
	
	
	
   public FrameBusConfirm(Bus b, MyBus m) {
      // JPanel 구조
	  setBackground(new Color(255,255,255));
      setLayout(null);
      setSize(600, 800);
      
      		//할인 패널 추가
    		JPanel discountInformation= new JPanel();
    		
    		discountInformation.setSize(600,650);
    		discountInformation.setBackground(Color.white);
    		discountInformation.setLayout(null);
    		
    		//TextField st = new TextField(" 할~~~~~~~~인 받고 싶으시죠?? ");
    		JLabel st = new JLabel(" 할인 항목 선택 "); // 테두리때문에 혹시 라벨로는 작업이 어려울까?
    		st.setBackground(Color.white);
    		st.setBounds(0, 0, 450, 40);
    		//st.setEditable(false);
    		st.setFont(new Font("배달의민족 주아", Font.BOLD, 22));
    		st.setLocation(80, 40);
    		discountInformation.add(st);
    		add(discountInformation);
    		
    		//할인 정보 패널
    		JPanel screen = new JPanel();
    		screen.setBackground(new Color(255, 255, 255));
    		screen.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
    		screen.setBounds(70, 150, 450, 600);//70, 150, 450, 600
    		screen.setVisible(true);
    		discountInformation.add(screen);
    		int price =  CompanyDAO.searchCompany(b.getBusName()).getBusPrice();
    		/*
    		TextArea j1 = new TextArea(
    				  "◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
    				+ "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
		            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
		            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
		            + "◎ 결 제 금 액 : " + price + "귤");
			j1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
			j1.setBackground(Color.white);
			j1.setEditable(false);
			
			j1.setBounds(70, 150, 450, 600);

			int nPrice = (int)price;
			m.setNprice(nPrice);
			screen.add(j1);*/
    		
    		
    		
    		//초이스 박스
    		Choice s=new Choice();	
    		s.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
    		s.setSize(600, 100);
    		s.setLocation(100,100);
    		discountInformation.add(s);
    		
    		
    		ArrayList<String> db = new ArrayList<String>();
    		db.add("----------");
    		db.add("해당없음");
    		db.add("우등생할인 30%");
    		db.add("학생 할인 20%");
    		db.add("아픈손가락 할인 10%");
    		
    		/*db.forEach(
    				item -> s.add(item));
    		
    		s.addItemListener(new choice(screen));*/
    		db.forEach(
    				item -> s.add(item));
    		
    		//int price =  CompanyDAO.searchCompany(b.getBusName()).getBusPrice(); // busprice 불러오기...?
    	      
    	      //discount 계산해야됨
    		
	    	
    		
    		//요까지 형주 작업
    		
      
      
	      //예매번호 랜덤지정
	      int revNum = (int)(Math.random()*9);
	      String v = Integer.toString(revNum);
	      m.setBookingNum(v);
	      
	      System.out.println(v);
	      
	      if(m.getBookingNum().equals(v)) {
	         revNum = (int)(Math.random()*9);
	         v = Integer.toString(revNum);
	         m.setBookingNum(v);
	      }
	      
	      m.setDate(b.getBusDate());
	      m.setGoal(b.getBusName());
	      m.setoPrice(b.getBusPrice());
	      m.setNprice(b.getBusPrice());
	    
		
	    	
      
      
      //아예 위에 붙였던거처럼 텍스트파일 하나가 아닌 라벨에 붙이고 지우는 식으로하면 되지 않을까
		 s.addItemListener(new ItemListener() {
				
			public void itemStateChanged(ItemEvent e) { 
			Choice s = (Choice)e.getSource(); 
			int index = s.getSelectedIndex();
			
			TextArea j1 = new TextArea("◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
					    				+ "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
							            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
							            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
							            + "◎ 결 제 금 액 : " + price + "귤");
			j1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
			j1.setForeground(new Color(255, 255, 255));
			j1.setBackground(Color.white);
			j1.setEditable(false);
			setVisible(true);
			j1.setBounds(29, 0, 387, 450);
			
			int nPrice = (int)price;
			m.setNprice(nPrice);
			screen.add(j1);
			
			
			if(db.contains(s.getSelectedItem())) {
				if(index==0) {
					screen.removeAll();
				}
					
				if(index == 1) { //해당없음
				screen.removeAll();
				//s.select(s.getItemCount());
				 j1 = new TextArea("◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
				            				+ "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
								            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
								            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
								            + "◎ 결 제 금 액 : " + price + "귤");
				j1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
				j1.setBackground(Color.white);
				j1.setEditable(false);
				j1.setBounds(29, 0, 387, 450);
				j1.setVisible(true);
				nPrice = (int)price;
				m.setNprice(nPrice);
				screen.add(j1);
				
				}
			}
				if(db.contains(s.getSelectedItem())) {
				
					if(index == 2) { //30%에 관한 버스결제정보 출력
					screen.removeAll();
					
					int disPrice = (int)(price * 0.3);
	    	    	m.setDisprice(disPrice);
					 j1 = new TextArea("◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
					            				+ "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
									            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
									            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
									            + "◎ 결 제 금 액 : " + price + "귤"
									            + "\n\n◎ 할인 된 금 액 : "+m.getDisprice()+"귤" + "\n\n◎" +"결제금액은 "
									            +(price*0.7)+"귤 입니다.");
					j1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
					j1.setBackground(Color.white);
					j1.setEditable(true);
					
					j1.setBounds(29, 0, 387, 450);
					
					nPrice = (int)(price * 0.7);
					m.setNprice(nPrice);
					screen.add(j1);
					}
				}  if(db.contains(s.getSelectedItem())) {
						if(index == 3) { //20% 할인
					//screen.removeAll();
					int disPrice = (int)(price * 0.2);
	    	    	m.setDisprice(disPrice);
					 j1 = new TextArea("◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
									            + "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
									            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
									            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
									            + "◎ 결 제 금 액 : " + price + "귤"
									            + "\n\n◎ 할인 된 금 액 : "+m.getDisprice()+"귤" + "\n\n◎" +"결제금액은 "
									            +(price*0.8)+"귤 입니다.");
					screen.removeAll();
					j1.setFont(new Font("배달의민족 주아", Font.PLAIN,20));
					j1.setBackground(Color.white);
					j1.setEditable(false);
					j1.setBounds(29, 0, 387, 450);
					nPrice = (int)(price * 0.8);
					m.setNprice(nPrice);
					screen.add(j1);
						}
				}//20% 할인 끝
					
					 if(db.contains(s.getSelectedItem())) {
						if(index == 4) { //10% 할인
					int disPrice = (int)(price * 0.1);
	    	    	m.setDisprice(disPrice);
					 j1 = new TextArea("◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
									            + "◎ 탑  승  일 : " +m.getDate() + "\n\n" 
									            + "◎ 목  적  지 : " + m.getGoal() + "\n\n" 
									            + "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
									            + "◎ 결 제 금 액 : " + price + "귤"
									            + "\n\n◎ 할인 된 금 액 : "+m.getDisprice()+"귤" + "\n\n◎" +"결제금액은 "
									            +(price*0.9)+"귤 입니다.");
					screen.removeAll();
					j1.setFont(new Font("배달의민족 주아", Font.PLAIN,20));
					j1.setBackground(Color.white);
					j1.setEditable(false);
					j1.setBounds(29, 0, 387, 450);
					nPrice = (int)(price * 0.9);
					m.setNprice(nPrice);
					screen.add(j1);
				}
				}//10% 할인 끝
				
			}//if(db.contains(s.getSelectedItem())) { 의 끝
			
			}//ItemEvent
			);
  
      
      
     
      
      // 하단의 버튼
		  
	      JPanel bottomSet = new JPanel();

	      bottomSet.setBounds(0, 660, 600, 100);
	      bottomSet.setLayout(null);
	      bottomSet.setBackground(new Color(255,255,255));
	       
	      JButton btnBack = new JButton("뒤로가기");

	      btnBack.setBackground(new Color(26, 28, 32));
	      btnBack.setForeground(new Color(255, 255, 255));
	      btnBack.setSize(183, 87);
	      btnBack.setLocation(5, 0);
	      btnBack.setFont(new Font("배달의민족 주아", Font.BOLD, 32));
	      
	      bottomSet.add(btnBack);
	      
	      JButton btnBuy = new JButton("결제하기");

	      btnBuy.setBackground(new Color(26, 28, 32));
	      btnBuy.setForeground(new Color(255, 255, 255));
	      btnBuy.setSize(183, 87);
	      btnBuy.setLocation(391, 0);
	      btnBuy.setFont(new Font("배달의민족 주아", Font.BOLD, 32));
	     
	      bottomSet.add(btnBuy);

	      
	      // 결제하기 버튼 클릭
	      btnBuy.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent a) {
	            // 결제를 마치고 마이페이지로 이동
	            System.out.println("결제완료");
	            //FrameBase.getInstance(new FrameMyPage(b,m));
	            bd.addReserveInfo(m);
	            FrameBase.getInstance(new FrameMenu());
	         }
	      });
	      add(bottomSet, BorderLayout.SOUTH);
	      
	      btnBack.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 System.out.println("뒤로가기");
				 FrameBase.getInstance(new FrameDate(b));
			}
	    	  
	      });
	   }// 생성자
   
   		
}
	
