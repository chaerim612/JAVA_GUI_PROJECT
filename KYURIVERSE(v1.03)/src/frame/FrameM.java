package frame;


import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import busVO.Bus;
import busVO.LecDAO;
import busVO.Lecture;
import busVO.MyBus;

public class FrameM extends JPanel{
	
	public FrameM(Bus b, MyBus m, Lecture lec) {
		setBackground(new Color(244, 244, 244));
		setLayout(null);
		setSize(600, 800);
		
		JLabel screen1 = new JLabel("   등록시 지원되는 코스");
		screen1.setFont(new Font("배달의민족 주아", Font.BOLD,55));
		screen1.setBounds(40,-10, 500, 110);
		add(screen1);
		
		//전담매니저 사진
		ImageIcon img = new ImageIcon("마동석.jpg");
		JLabel jI = new JLabel(img);
		jI.setBounds(20, 430, 200, 220);
		add(jI);
		
		
			//하단 버튼 세팅
			JPanel bottomSet = new JPanel();
			bottomSet.setBounds(0, 660, 600, 100);
			bottomSet.setBackground(new Color(244, 244, 244));
			bottomSet.setLayout(null);
			
			JButton btnBook = new JButton("이전으로");
			btnBook.setBackground(new Color(26, 28, 32));
			btnBook.setForeground(new Color(255,255,255));
			btnBook.setSize(183, 87);
			btnBook.setLocation(10, 0);
			btnBook.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			btnBook.setVisible(true);
			bottomSet.add(btnBook);

			
			JButton btnSol = new JButton("등록");
			btnSol.setBackground(new Color(26, 28, 32));
			btnSol.setForeground(new Color(255,255,255));
			
			btnSol.setSize(183, 87);
			btnSol.setLocation(396, 0);
			btnSol.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
			bottomSet.add(btnSol);
			btnSol.setVisible(true);
	
			add(bottomSet);
			
			TextArea storyNaver = new TextArea("필수 지원 자격 : 비즈니스 영어회화 가능" + "\n"
					+ "\t\t 리눅스 서버 관련 지식 필수" + "\n"
					+ "\t\t 정보처리기사 자격 소지자" + "\n"
					+ "\t\t 최종학력 학사 이상"+"\n"
					+ "\t\t 기타 요구사항" +"\n\n"
					+ "지원코스" +"\n"
					+ "◆ 영 어 회 화 : " + lec.getEng() + "\n"
					+ "◆ 추가 제공되는 강의 : " + lec.getMinPro() + "\n"
					+ "◆ 자  격  증 : " + lec.getLicense() + "\n"
					+ "◆ 학점 관련 안내 : " + lec.getDegree() + "\n"
					+ "◆ 기타 제공 강의 : " + lec.getCodingTest()
					,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY
					);
						
			TextArea storyGoogle = new TextArea("필수 지원 자격 : 비즈니스 영어회화 가능" + "\n"
					+ "\t\t 협업 경험 2회 이상" + "\n"
					+ "\t\t 관련 분야 자격증 2개 이상" + "\n"
					+ "\t\t 코딩테스트 진행"+"\n"
					+ "\t\t 최종학력 학사 이상"+"\n\n"
					+ "지원코스" +"\n"
					+ "◆ 영 어 회 화 : " + lec.getEng() + "\n"
					+ "◆ 프 로 젝 트 : " + lec.getMinPro() + "\n"
					+ "◆ 자  격  증 : " + lec.getLicense() + "\n"
					+ "◆ 코딩테스트 준비 : " + lec.getCodingTest() + "\n"
					+ "◆ 학점 관련 안내 : " + lec.getDegree()
					,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY
					);
			
			if(lec.getLecName().equals("네이버")){
				
				storyNaver.setEditable(false);
				storyNaver.setBounds(17, 100, 555, 320);
				storyNaver.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
				storyNaver.setVisible(true);
				add(storyNaver);
				
			}
			
			if(lec.getLecName().equals("구글")){
				
				storyGoogle.setEditable(false);
				storyGoogle.setBounds(17, 100, 555, 320);
				storyGoogle.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
				storyGoogle.setVisible(true);
				add(storyGoogle);
				
			}
			
		TextArea story1 = new TextArea("-마동석-\n\n◆스팩 모든 지원자 원하는 스펙 \n만들었음(단, 생존자만)\n제74주년 경찰의 날 명예경찰\n\n◆매니저의 말\n무조건 책임지고 당신이 원하는 곳으로 데려다 드리겠습니다.\n그곳이 저승이라 할지라도..\n\n◆교육필수\n참가 제한물리적인 고통에 능히 참을 수 있는 사람"
				,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY
   	 	);
		story1.setEditable(false);
		story1.setBounds(240, 430, 330, 220);
		story1.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		story1.setVisible(true);
		add(story1);
   
		btnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				FrameBase.getInstance(new FrameBusConfirm(b, m));
				
			}
		});
   		
		
		
		
		
		btnSol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"(최규리) 등록 클래스 이름에 등록되었습니다");
				FrameBase.getInstance(new FrameMenu());
				
			}
		});
   
	}
}
