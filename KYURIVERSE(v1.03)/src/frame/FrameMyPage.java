package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import busVO.Bus;
import busVO.CompanyDAO;
import busVO.MyBus;
import busVO.BookDAO;

public class FrameMyPage extends JPanel {
	ArrayList<String> revNum = new ArrayList<String>();
	
	public FrameMyPage(Bus bus, MyBus myBus) {
		String startPoint="Soldesk(본원)";
		
		setBackground(new Color(255,255,255)); 
		setLayout(null);
		setSize(600, 800);
		
////////////////top 패널 구성///////////////////////////////
		JPanel top = new JPanel();
		top.setBackground(new Color(255,255,255));//배널 배경을 바꾸면... 허접스리
		top.setLayout(new GridLayout(2,1));
		top.setSize(600, 120);
		top.setLocation(20, 0);
		
		JPanel jCenter = new JPanel();
		jCenter.setLayout(null);
		jCenter.setSize(600, 480);
		jCenter.setLocation(0, 140);
		jCenter.setBackground(new Color(26,28,32));//센터 배경색(240, 165, 0)
		
		JLabel name = new JLabel("예매 내역");
		name.setBackground(new Color(255,255,255));
		name.setFont(new Font("배달의민족 주아", Font.BOLD, 32));
		name.setSize(500,40);
		name.setLocation(30, 30);
		name.setVisible(true);
		top.add(name);
		
		JLabel jblChoice = new JLabel();
		jblChoice.setSize(500,20);
		jblChoice.setLocation(30, 170);
		jblChoice.setBackground(new Color(26,28,32));
		
		Choice choice = new Choice();
		choice.setSize(500,100);
		choice.setVisible(true);
		choice.setLocation(30, 0);
		
		revNum = BookDAO.getBookingNum();
		
		//초이스에 담길 예약번호 어레이리스트
		//리스트에 예약번호 담기
		
		
			for(int i= 0; i<BookDAO.getReserveList().size(); i++) {
				BookDAO.getReserveList().get(i).getBookingNum();
			}
					
		revNum.forEach(
				item -> choice.add(item));
		
		choice.addItemListener(new ItemListener() { 
			public void itemStateChanged(ItemEvent e) { 
				Choice choice = (Choice)e.getSource(); 
				
				if(revNum.contains(choice.getSelectedItem())) {
						int index = choice.getSelectedIndex();
						
						if(index == 0) {
							
							jCenter.removeAll();
							TextArea myPage = new TextArea("예매내역을 선택하세요");
							myPage.setSize(530,400);
							myPage.setLocation(15,15);
							myPage.setBackground(Color.WHITE);
							myPage.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
							myPage.setEditable(false);
							myPage.setVisible(true);
							jCenter.add(myPage);
							
						} else {
						
						jCenter.removeAll();
						TextArea myPage = new TextArea(
								"◎예  약  번  호 : " + BookDAO.getReserveList().get(index).getBookingNum() + "\n\n"
								+"◎ 탑 승  일 자 : " + BookDAO.getReserveList().get(index).getDate() + "\n\n"
								+"◎ 출   발   지 : " + startPoint+ "\n"
								+"◎ 도   착   지 : " + BookDAO.getReserveList().get(index).getGoal() + "\n\n"
								+"◎ 예상 소요 시간 : " + CompanyDAO.searchCompany(BookDAO.getReserveList().get(index).getGoal()).getTime() + "\n\n"
								+"◎ 예  매  좌  석 : " + BookDAO.getReserveList().get(index).getSeatNum() + "\n\n"
								+"◎ 최종 결제 금액 : " + BookDAO.getReserveList().get(index).getNprice()
								,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
						
						myPage.setSize(530,400);
						myPage.setLocation(15,15);
						myPage.setBackground(Color.WHITE);
						myPage.setFont(new Font("나눔고딕코딩", Font.BOLD, 20));
						myPage.setEditable(false);
						myPage.setVisible(true);
						jCenter.add(myPage);
						}
					}//if 
			}
		});
		add(jCenter);
		jblChoice.add(choice);
		top.add(jblChoice);
		
		add(top);
		
////////////////top 패널 구성 마침///////////////////////////////

		
		/* 재배치 작업 중
		center.setLayout(new BorderLayout());
		
		JLabel bNum = new JLabel("◎예  약  번  호 \n" + m.getBookingNum());
		bNum.setBackground(Color.WHITE);
		bNum.setBounds(15,300,500,30);
		bNum.setVisible(true);
		center.add(bNum,north);
		
		JLabel sPoint = new JLabel("◎ 출   발   지 \n" + startPoint);
		sPoint.setBackground(Color.Pink);
		sPoint.setVisible(true);
		center.add(sPoint,west);
		
		JLabel aPoint = new JLabel(""◎ 도   착   지 \n" + m.getGoal());
		sPoint.setBackground(Color.Yellow);
		sPoint.setVisible(true);
		center.add(sPoint,center);
		
		
		*/
////// 아무것도 생성되어 있지 않을때!/////
		
				
//////////////////////// center textarea 작업 ///////////////////////////////////
		JPanel bottomSet = new JPanel();
		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setBackground(new Color(255,255,255));
		bottomSet.setLayout(null);
		
		JButton btnHome = new JButton("메인으로");
		btnHome.setSize(183, 87);
		btnHome.setLocation(10, 0);
		btnHome.setFont(new Font("배달의민족 주아", Font.BOLD, 22));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(new Color(26, 28, 32));
		btnHome.setVisible(true);
		bottomSet.add(btnHome);
   
		JButton btnExit = new JButton("종료하기");
		btnExit.setSize(183, 87);
		btnExit.setLocation(203, 0);
		btnExit.setFont(new Font("배달의민족 주아", Font.BOLD, 22));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(26, 28, 32));
		bottomSet.add(btnExit);
		btnExit.setVisible(true);
   
		JButton btnSave = new JButton("저장하기");
		btnSave.setSize(183, 87);
		btnSave.setLocation(396, 0);
		btnSave.setFont(new Font("배달의민족 주아", Font.BOLD, 22));
		btnSave.setForeground(Color.WHITE);
		btnSave.setBackground(new Color(26, 28, 32));
		bottomSet.add(btnSave);
		btnSave.setVisible(true);

		add(bottomSet);
		
		//액션 처음으로!
		btnHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			FrameBase.getInstance(new FrameMenu());
			}
		});
		
		//액션 종료!
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//액션 뭐시기여 그거 텍스트파일로 저장!
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				File file = new File("CheckMyReservation.txt");
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
						
						writer.append("-------------------------\n");
						writer.append("예매 확인서\n");
					    writer.append("-------------------------\n");
					    writer.append("예매번호 : " + myBus.getBookingNum()+"\n");
					    System.out.println(myBus.getBookingNum());
					    writer.append("-------------------------\n");
					    System.out.println(myBus.getDate());
					    writer.append("출발일자 : " + myBus.getDate()+"\n");
					    writer.append("도착지 : " + bus.getBusName()+"\n");
					    writer.append("-------------------------\n");
					    writer.append("버스가격 : " + bus.getBusPrice()+"\n");
					    
					    writer.close();
					} catch (IOException i) {
					    i.printStackTrace();
					}
			}
		});
		
//////////////////////// 센터 텍스트 필드 내용////////////////////////////////
	}
}
