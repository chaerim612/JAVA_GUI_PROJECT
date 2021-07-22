package frame;


import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import busVO.BookDAO;
import busVO.Bus;
import busVO.MyBus;

public class FrameMenu extends JPanel{
	
	public FrameMenu() {
		setBackground(new Color(244, 244, 244));
		setLayout(null);
		setSize(600, 800);
		
		Bus b = new Bus();
		MyBus m = new MyBus();
		
			//하단 버튼 세팅
			JPanel bottomSet = new JPanel();
			bottomSet.setBounds(0, 660, 600, 100);
			bottomSet.setBackground(new Color(244, 244, 244));
			bottomSet.setLayout(null);
			
			JButton btnBook = new JButton("수강신청");
			btnBook.setBackground(new Color(26, 28, 32));
			btnBook.setForeground(new Color(255,255,255));
			btnBook.setSize(183, 87);
			btnBook.setLocation(10, 0);
			btnBook.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			btnBook.setVisible(true);
			bottomSet.add(btnBook);
	   
			JButton btnCheck = new JButton("신청강의확인");
			btnCheck.setBackground(new Color(26, 28, 32));
			btnCheck.setForeground(new Color(255,255,255));
			
			btnCheck.setSize(183, 87);
			btnCheck.setLocation(203, 0);
			btnCheck.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			bottomSet.add(btnCheck);
			btnCheck.setVisible(true);
	   
			JButton btnSol = new JButton("취업지원처");
			btnSol.setBackground(new Color(26, 28, 32));
			btnSol.setForeground(new Color(255,255,255));
			
			btnSol.setSize(183, 87);
			btnSol.setLocation(396, 0);
			btnSol.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			bottomSet.add(btnSol);
			btnSol.setVisible(true);
	
			add(bottomSet);

		TextArea story = new TextArea("                          코스 등록시 주의사항\n\n\n"
				+ "1.신청한 취업 플랜은 변경과 환불이 어려울 수 있습니다.\n\n"
				+ "2.강사 및 매니저에게 폭언과 폭행시 법적조치를 취할수 있습니다.\n\n"
				+ "3.본 취업플랜은 중도탈출시 6개월간 본 플랜에 등록할수없습니다.\n\n"
				+ "4.본 취업플랜의 비용은 현금으로만 결제가능합니다\n\n"
				+ "5.건물에서 음주와 흡연적발시 경고없이 추방조치합니다.\n\n"
				+ "6. 10일이상 출석및 지각시 제적처리됩니다.\n\n"
				+ "7.건물안에서 기물파손시 솔데스크측에서 배상을 요구할수있습니다.\n\n"
				+ "8.강사님들에게 주는 적극적인 수업태도는 큰도움이 됩니다.\n\n"
				+ "9.자세한 사항은 하단의 고객상담소에 연락바랍니다."+"\n\n\n"
				+ "Otofl"+"\n"+"학원사업자번호: 101-86-50485"+"\n"+"통신판매업신고번호: 제2009-서울종로-1141호"+"\n"+"대표이사: 강재민서울특별시 종로구 종로12길 15, 5층(관철동 13-13)"+"\n"+"대표전화: 1544-0714"+"\n"+"교육담당: 전형후"
				,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY
				
   	 	);
		story.setEditable(false);
		story.setBounds(17, 40, 555, 590);
		story.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
		story.setVisible(true);
		add(story);
   
		btnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
   		
		BookDAO.getReserveList();
		
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FrameBase.getInstance(new FrameMyPage(b, m));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "취업플랜 신청 내용이 존재하지 않습니다.");
				}
			}
		});
		
		btnSol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase2.getInstance(new FrameStartPoint());
				
			}
		});
   
	}
}