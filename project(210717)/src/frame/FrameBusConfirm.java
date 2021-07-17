package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import busVO.BookDAO;
import busVO.Bus;
import busVO.BusDAO;
import busVO.MyBus;

public class FrameBusConfirm extends JPanel {
	
	BookDAO bd=new BookDAO();
	
	public FrameBusConfirm(Bus b, MyBus m) {
		// JPanel 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);
		
		//예매번호 랜덤지정
		m.setBookingNum((int)(Math.random()*9+1));
		m.toString();

		// 예매 정보 확인 창
		TextArea busInfo = new TextArea(
				"◎ 예 매 번 호 : " + m.getBookingNum() + "\n\n" 
				+ "◎ 탑  승  일 : " + b.getBusDate()+ "\n\n" 
				+ "◎ 목  적  지 : " + b.getBusName() + "\n\n" 
				+ "◎ 좌     석 : " + m.getSeatNum() + "\n\n"
				+ "◎ 결 제 금 액 : " + b.getBusPrice() + "원", 0, 0, TextArea.SCROLLBARS_NONE);

		busInfo.setSize(580, 280);
		busInfo.setLocation(0, 375);
		busInfo.setBackground(new Color(0xFFFFFF));
		busInfo.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		add(busInfo);
		
		// 하단의 버튼
		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setLayout(null);
		bottomSet.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("뒤로가기");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBack);
		
		JButton btnBuy = new JButton("결제하기");

		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBuy);

		// 결제하기 버튼 클릭
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				// 결제를 마치고 마이페이지로 이동
				FrameBase.getInstance(new FrameMyPage(b,m));
			}
		});
		add(bottomSet, BorderLayout.SOUTH);
	}// 생성자

}
