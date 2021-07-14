package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import busVO.Bus;

public class FrameMyPage extends JPanel {
	
	public FrameMyPage() {
		setBackground(new Color(0xFFD700)); 
		setLayout(null);
		setSize(600, 800);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700)); 
		top.setLayout(new GridLayout(2, 1));
		top.setSize(600, 150);
		top.setLocation(0, 0);
		
		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700)); 
		center.setSize(600, 450);
		center.setLocation(0, 150);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700)); 
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 630);
		
		//예매내역 문구 출력
		JLabel name = new JLabel("예매 내역");
		name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);
		
		//예매번호 받아서 콤보박스로 출력!
		Choice choice = new Choice();
		choice.add("N1234567");//예매번호 겟해서 어레이리스트로 받으면 리스트로 보여줄 수 있나...?
		choice.add("G1023456");
		choice.select(0); //초기 선택 값(자리) 지정
		
		choice.setSize(100,50);
		choice.setLocation(100, 70);
		
		//예매내역 출력 >> txt박스 크기 조정중...ㅠㅠ
		TextArea myPage = new TextArea(
				"◎예약번호 : N1234567" + "\n\n"
				+"\n◎ 출발지 : 솔데스크(본원)"
				+ "\n◎ 도착지 : " + "카카오" + "\n\n" //Bus b.getComp매개변수로 받아서 get도착지정보 
				+ "◎ 예상 소요 시간 : N분" + "\n\n" //기업정보 만들면 그안에 출발지로부터 소요시간 변수도 넣어서 불러올 예정
				+ "◎ 좌     석 : " + "A5" + "\n\n" //b.getSeat좌석정보
				+ "◎ 금     액 : " + "376,000 귤 (한화 112,800,000 원)", 0, 0,
				TextArea.SCROLLBARS_NONE);
		
		myPage.setSize(470, 700);
		myPage.setLocation(70, 0);
		myPage.setBackground(new Color(255,255,255));
		myPage.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

		//하단의 버튼 설정
		JButton btnHome = new JButton("HOME");
		JButton btnExit = new JButton("EXIT");
		JButton btnSave=new JButton("SAVE");

		btnHome.setBackground(new Color(183, 240, 117));
		btnHome.setSize(200, 150);
		btnHome.setLocation(0,0);
		btnHome.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 처음으로!
		

		btnExit.setBackground(new Color(183, 240, 117));
		btnExit.setSize(200, 150);
		btnExit.setLocation(196,0);
		btnExit.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 종료!
		
		
		btnSave.setBackground(new Color(183, 240, 117));
		btnSave.setSize(200, 150);
		btnSave.setLocation(395,0);
		btnSave.setFont(new Font("굴림", Font.BOLD, 26));
		//액션 뭐시기여 그거 텍스트파일로 저장!
		
		
		top.add(name);
		top.add(choice);
		
		center.add(myPage);
		
		bottom.add(btnHome);
		bottom.add(btnExit);
		bottom.add(btnSave);
		
		add(top);
		add(center);
		add(bottom);
		
	}
}

//myPage.append(b.getReview());//날짜, 목적지, 매수
/*
//예매내역 불러오기
Frame fr= new Frame();
fr.setTitle("의 예매내역");
fr.setSize(800, 300);
fr.setLocation(700, 200);
//fr.add(review);
fr.setVisible(false);

//리뷰창의 x를 눌렀을 때 System.exit(0)를 하면 예매프로그램 자체가 종료되므로
//dispose()를 통해 서브 프레임만 종료해줘야 한다.
fr.addWindowListener(new WindowAdapter() {
   @Override
   public void windowClosing(WindowEvent e) {
      fr.setVisible(false);
      fr.dispose();//창하나만 닫은것!
   }
});
*/