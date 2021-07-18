package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import busVO.review;

public class FrameMenu2 extends JPanel {

	public void Menu2() {
		review rr = new review();

		Frame frame = new Frame("메뉴");// 프레임의 제목
		frame.setLayout(null);
		frame.setBounds(800, 100, 600, 800); // (x좌표, y좌표, 너비, 높이)
		frame.setBackground(Color.yellow);// 배경색
		frame.setVisible(true); // false는 화면에 보이지 않음

		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setBackground(Color.yellow);
		bottomSet.setLayout(null);

		JButton btnReview = new JButton("예매하기");

		btnReview.setSize(183, 87);
		btnReview.setLocation(15, 0);
		btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		btnReview.setVisible(true);
		bottomSet.add(btnReview);

		JButton btnHome = new JButton("예매확인");

		btnHome.setSize(183, 87);
		btnHome.setLocation(208, 0);
		btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnHome);
		btnHome.setVisible(true);

		JButton btnBuy = new JButton("출발지정보");

		btnBuy.setSize(183, 87);
		btnBuy.setLocation(401, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBuy);
		btnBuy.setVisible(true);

		frame.add(bottomSet);

		TextArea story = new TextArea(rr.getTest());
		story.setBounds(25, 40, 555, 600);

		story.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		frame.add(story);

		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameStartingPoint t = new FrameStartingPoint();
				t.StartingPoint();
			}
		});

		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

	}

}
