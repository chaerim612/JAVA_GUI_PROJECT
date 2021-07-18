package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import busVO.BookDAO;
import busVO.Bus;
import busVO.MyBus;

public class FrameMyPage extends JPanel {
	
	public FrameMyPage(Bus b, MyBus m) {
		String startPoint="Soldesk(본원)";
		
		setBackground(new Color(0xFFD700)); 
		setLayout(null);
		setSize(600, 800);
		
		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700)); 
		top.setLayout(new GridLayout(2, 1));
		top.setSize(550, 150);
		top.setLocation(15, 0);
		
		JPanel center = new JPanel();
		center.setBackground(new Color(255,255,255));
		center.setLayout(null);
		center.setSize(600, 430);
		center.setLocation(0, 200);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700)); 
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 630);
		
//////////////////////// 패널 크기 분할 작업 ///////////////////////////////////
		//top
		//grid 1,1
		JLabel name = new JLabel("예매 내역");
		name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);
		/*
		//grid 2,1
		 */
		Choice choice = new Choice();
		top.add(name);
		//top.add(choice);
		add(top);
		
		m.setBusTime(b.getTime());
		m.setBusPrice(b.getBusPrice());
		
		TextArea myPage = new TextArea("◎예  약  번  호 : " + m.getBookingNum()	+ "\n\n"
				+"◎ 출   발   지 : " + startPoint+ "\n\n"
				+"◎ 도   착   지 : " + m.getGoal() + "\n\n"
				+"◎ 예상 소요 시간 : " + m.getBusTime() + "\n\n"
				+"◎ 예  매  좌  석 : " + m.getSeatNum() + "\n\n"
				+"◎ 결 제   금 액 : " + m.getBusPrice(),0,0,TextArea.SCROLLBARS_NONE);
		myPage.setBounds(0,0, 600, 500);
		myPage.setBackground(Color.WHITE);
		myPage.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
		myPage.setEditable(false);
				
		center.add(myPage);
		add(center);
//////////////////////// 센터 텍스트 필드 내용////////////////////////////////
		
		//하단의 버튼 설정
		JButton btnHome = new JButton("HOME");
		JButton btnExit = new JButton("EXIT");
		JButton btnSave=new JButton("SAVE");

		btnHome.setBackground(new Color(183, 240, 117));
		btnHome.setSize(200, 150);
		btnHome.setLocation(0,0);
		btnHome.setFont(new Font("굴림", Font.BOLD, 26));
		
		btnHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMenu());
			}
		});
		//액션 처음으로!
		
		btnExit.setBackground(new Color(183, 240, 117));
		btnExit.setSize(200, 150);
		btnExit.setLocation(196,0);
		btnExit.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 종료!
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnSave.setBackground(new Color(183, 240, 117));
		btnSave.setSize(200, 150);
		btnSave.setLocation(395,0);
		btnSave.setFont(new Font("굴림", Font.BOLD, 26));
		
		//액션 뭐시기여 그거 텍스트파일로 저장!
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});
		
		//center.add(myPage);
		
		bottom.add(btnHome);
		bottom.add(btnExit);
		bottom.add(btnSave);
		
		add(bottom);
		
//////////////////////// 센터 텍스트 필드 내용////////////////////////////////
	}
}

class ChoiceEventHandler implements ItemListener{
	JPanel _bottomH;
	ChoiceEventHandler(JPanel bottomH) {this._bottomH = bottomH;}
	 
	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice choice = (Choice)e.getSource();
		// 선택된 초이스의 인덱스(순서)를 반환
		// choice.getSelectedIndex()
		// 선택된 초이스의 값을 반
		// choice.getSelectedItem()
		System.out.println("choice Index : " + choice.getSelectedIndex());
		System.out.println("choice Item : " + choice.getSelectedItem());
		
		if (choice.getSelectedItem().equals("N10234567")) {
			_bottomH.removeAll();
			System.out.println("1번 클릭!");
			TextArea j1 = new TextArea("유동근 화이팅!");
			j1.setEditable(false);
			j1.setSize(400,200);
			j1.setLocation(0, 0);
			_bottomH.add(j1);
		} else if (choice.getSelectedItem().equals("G12034567")) {
			_bottomH.removeAll();
			System.out.println("2번 클릭!");
			TextArea j2 = new TextArea("유동근 화이팅!!!");
			j2.setEditable(false);
			j2.setSize(400,200);
			j2.setLocation(0, 0);
			_bottomH.add(j2);
		}
	}
}

