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
			
			JButton btnBook = new JButton("예매하기");
			btnBook.setBackground(new Color(26, 28, 32));
			btnBook.setForeground(new Color(255,255,255));
			btnBook.setSize(183, 87);
			btnBook.setLocation(10, 0);
			btnBook.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			btnBook.setVisible(true);
			bottomSet.add(btnBook);
	   
			JButton btnCheck = new JButton("예매확인");
			btnCheck.setBackground(new Color(26, 28, 32));
			btnCheck.setForeground(new Color(255,255,255));
			
			btnCheck.setSize(183, 87);
			btnCheck.setLocation(203, 0);
			btnCheck.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			bottomSet.add(btnCheck);
			btnCheck.setVisible(true);
	   
			JButton btnSol = new JButton("출발지정보");
			btnSol.setBackground(new Color(26, 28, 32));
			btnSol.setForeground(new Color(255,255,255));
			
			btnSol.setSize(183, 87);
			btnSol.setLocation(396, 0);
			btnSol.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			bottomSet.add(btnSol);
			btnSol.setVisible(true);
	
			add(bottomSet);

		TextArea story = new TextArea("                          버스 예매시 주의사항\n\n"+
				"1.한번 예매한 좌석은 변경과 환불이 어려울수 있습니다.\n\n"+"2.버스기사에게 대들시 소지하신 귤을 뺏길수 있습니다.\n\n"
				+ "3.본 버스는 휴게소 이용이 불가능합니다.\n\n" +"4.본 버스의 승차비용은 오직 귤로만 결제할수있습니다.\n\n"
				+"5.버스에서 음주와 흡연적발시 경고없이 추방조치합니다.\n\n"+"6.버스안에서의 과도한 수면은 목적지 도착이 어려워질수 있습니다.\n\n"
				+ "7.버스에서 기물파손시 솔데스크측에서 배상을 요구할수있습니다.\n\n"+"8.기사님에게 주는 사랑은 목적지 도착이 빨라질수 있습니다.\n\n" 
				+"9.자세한 사항은 개발팀에게 물어봐도 알려주지 않습니다.",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY
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
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "예매내역이 없습니다.");
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
