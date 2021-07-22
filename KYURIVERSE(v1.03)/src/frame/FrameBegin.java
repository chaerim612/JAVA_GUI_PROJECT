package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import busVO.Bus;
import busVO.MyBus;
import busVO.BookDAO;

public class FrameBegin extends JPanel{
	
	public FrameBegin() {
		setBackground(new Color(244, 244, 244));
		setLayout(null);
		setSize(600, 800);
		
		//메인사진
		ImageIcon cinema = new ImageIcon("메인사진.png");
		JLabel lblCinema = new JLabel(cinema);
		lblCinema.setSize(600, 620);
		lblCinema.setLocation(-9,20);
		lblCinema.setBackground(new Color(255, 255, 102));
		add(lblCinema);
		
		//로고 사진
		ImageIcon woo = new ImageIcon("reallogo2s.png");
		JLabel Woo = new JLabel(woo);
		Woo.setSize(120, 60);
		Woo.setLocation(430,530);
		add(Woo);
		
		//규리버스 프로젝트명
		ImageIcon kbus1 = new ImageIcon("title.png");
		JLabel Kbus = new JLabel(kbus1);
		Kbus.setSize(500, 200);
		Kbus.setLocation(30,-10);
		add(Kbus);
		
		//버튼객체 생성
		//ImageIcon btni = new ImageIcon("start.png");
		JButton btnInfo = new JButton("START");
		//ImageIcon btnp = new ImageIcon("end.png");
		JButton btnPost = new JButton("END");
		
		//버튼 컬러
		btnInfo.setBackground(new Color(26, 28, 32)); 
		btnPost.setBackground(new Color(26, 28, 32));
		//버튼 글씨색
		btnInfo.setForeground(new Color(255, 255, 255));
		btnPost.setForeground(new Color(255, 255, 255));
		
		//버튼(start) 사이즈
		btnInfo.setSize(300, 150);
		//버튼 위치
		btnInfo.setLocation(
				
		((int) getSize().getWidth() / 2) - 310, 
		(int) getLocation().getY() / 2 + 610);
		
		//버튼(start) 폰트 조절
		btnInfo.setFont(new Font("배달의민족 주아", Font.PLAIN, 40));
		//버튼(Exit) 사이즈
		btnPost.setSize(300, 150);
		//버튼(Exit) 위치
		btnPost.setLocation(
		
		(int) btnInfo.getLocation().getX() + 300, 
		(int) btnInfo.getLocation().getY());
		//버튼(Exit) 폰트
		btnPost.setFont(new Font("배달의민족 주아", Font.PLAIN, 40));

		add(btnInfo);
		add(btnPost);
		
		//버튼 이벤트(예매하기 / 후기 남기기)
		btnInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMenu());
			}
		});	
	
		btnPost.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
	
	}//생성자
}
