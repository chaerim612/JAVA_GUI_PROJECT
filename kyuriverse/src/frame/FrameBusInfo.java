package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import busVO.Bus;

//각 영화를 클릭했을 때 보여지는 상세 페이지
public class FrameBusInfo extends JPanel{

	public FrameBusInfo(Bus m) {

		//JPanel 구조
		setBackground(new Color(250,244,192));
		setLayout(null);
		setSize(600, 800);
		
		final int busNum = 6;
		int busflag = 0;
		String[] busurl = { 
			"라라랜드2.png", "말할수없는비밀2.jpg", "인사이드아웃2.png", 
			"겨울왕국2.png", "당신거기있어줄래요2.png", "스파이더맨2.png"};

		ImageIcon[] busImg = new ImageIcon[busNum];

		for (int i = 0; i < busNum; i++) {
	
			busImg[i] = new ImageIcon( busurl[i] );
			if (m.getmName().equals("네이버")) {
				busflag = 0;
			} else if (m.getmName().equals("카카오")) {
				busflag = 1;
			} else if (m.getmName().equals("마이크로소프트")) {
				busflag = 2;
			} else if (m.getmName().equals("애플")) {
				busflag = 3;
			} else if (m.getmName().equals("IBM")) {
				busflag = 4;
			} else if (m.getmName().equals("구글")) {
				busflag = 5;
			} 
		}//for
		
		//이미지를 JLabel에 붙여서 출력
		JLabel img = new JLabel( busImg[busflag] );
		img.setBounds(50, 13, 285, 350);
		add(img);
		
		// 영화 관련 정보 텍스트
				TextArea story = new TextArea(
						"\n◎목적지" + "\n" + "   " + m.getmName() + 
						"\n\n" + "◎평     점" + "\n" + "   " + 
						String.format("%.1f", m.getScore()) + " / 5 점\n\n" + 
						"◎목적지 설명" + "\n" + "   " + m.getStory(),
						0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
				story.setSize(580, 280);
				story.setLocation(0, 375);
				story.setBackground(new Color(0xFFD700));
				story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
				add(story);
		JButton btnReview = new JButton("리뷰 보기");

				btnReview.setBackground(new Color(229, 216, 92));
				btnReview.setSize(150, 40);
				btnReview.setLocation(400, 325);
				btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));

				btnReview.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					
					}
				});
				add(btnReview);
	
				//하단의 버튼
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

				int buttonNum = busflag;
				btnBack.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (0 <= buttonNum && buttonNum <= 3) {
							FrameBase.getInstance(new FrameBusSelect());
						} 
					}
				});
			JButton btnHome = new JButton("처음 화면으로");

					btnHome.setBackground(new Color(0xA6A6A6));
					btnHome.setSize(183, 87);
					btnHome.setLocation(198, 0);
					btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
					bottomSet.add(btnHome);

					btnHome.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FrameBase.getInstance(new FrameBegin());
						}
					});
					
					JButton btnBuy = new JButton("예매하기");

					btnBuy.setBackground(new Color(0xA6A6A6));
					btnBuy.setSize(183, 87);
					btnBuy.setLocation(391, 0);
					btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
					bottomSet.add(btnBuy);

					btnBuy.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FrameBase.getInstance(new FrameReserve(m));
						}
					});

					add(bottomSet, BorderLayout.SOUTH);
				
				
				
	}
	
}
