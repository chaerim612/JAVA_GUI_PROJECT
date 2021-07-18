package frame;

import java.awt.BorderLayout;
import busVO.review;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameStartingPoint {
	ArrayList<String> r = new ArrayList<String>();
	String review = "";

	public void StartingPoint() {

		review re = new review();
		FrameMenu mu = new FrameMenu();

		Frame f = new Frame("출발지정보");// 프레임의 제목
		f.setLayout(null);
		f.setBounds(800, 100, 600, 800); // (x좌표, y좌표, 너비, 높이)
		f.setBackground(Color.yellow);// 배경색
		f.setVisible(true); // false는 화면에 보이지 않음

		Panel pNorth = new Panel();
		pNorth.setBackground(Color.yellow);
		TextField tf = new TextField(50); // 입력상자의 길이
		Button btn = new Button("ENTER");
		btn.setEnabled(true);// 기본 비활성화
		pNorth.setBounds(60, 560, 500, 100);
		pNorth.add(tf);
		pNorth.add(btn);
		f.add(pNorth);
		btn.setEnabled(false);

		ImageIcon c = new ImageIcon("솔데스크약도3.jpg");
		JLabel l = new JLabel(c);
		l.setBounds(50, 0, 500, 700);
		f.add(l);
		f.setVisible(true);

		JLabel screen1 = new JLabel("                       SOLDESK");
		screen1.setFont(new Font("나눔고딕코딩", Font.BOLD, 30));
		screen1.setBounds(40, -225, 600, 600);
		f.add(screen1);
		screen1.setVisible(true);

		JLabel screen2 = new JLabel("솔데스크주소: 서울특별시 종로구 관철동 13-13");
		screen2.setFont(new Font("나눔고딕코딩", Font.BOLD, 23));
		screen2.setBounds(40, -175, 600, 600);
		f.add(screen2);
		screen2.setVisible(true);

		JLabel screen3 = new JLabel("전화번호: 02-6901-7098");
		screen3.setFont(new Font("나눔고딕코딩", Font.BOLD, 25));
		screen3.setBounds(40, -125, 600, 600);
		f.add(screen3);
		screen3.setVisible(true);

		JLabel screen4 = new JLabel("한줄 리뷰작성");
		screen4.setFont(new Font("나눔고딕코딩", Font.BOLD, 25));
		screen4.setBounds(215, 225, 600, 600);
		f.add(screen4);
		screen4.setVisible(true);

		JPanel bottomSet = new JPanel();

		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setBackground(Color.yellow);
		bottomSet.setLayout(null);

		JButton btnReview = new JButton("기사정보");

		btnReview.setSize(183, 87);
		btnReview.setLocation(15, 0);
		btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnReview);

		btnReview.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameDriver());
			}
		});

		JButton btnex = new JButton("리뷰보기");

		btnex.setSize(183, 87);
		btnex.setLocation(210, 0);
		btnex.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnex);
		btnex.setVisible(true);

		btnex.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMenu2());
			}
		});

		JButton btnBuy = new JButton("이전으로");

		btnBuy.setSize(183, 87);
		btnBuy.setLocation(401, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBuy);
		btnBuy.setVisible(true);

		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.add(bottomSet);
		bottomSet.setVisible(true);

		// TextField에 값이 들어간 경우에만 입력버튼 활성화
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) { // 내용이 없으면
					btn.setEnabled(false); // 버튼잠금

				} else {
					btn.setEnabled(true); // 버튼활성화

				}

			}
		});

		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TextFiled에 엔터값이 감지되면 아래 TextArea에 내용 추가
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					review = (tf.getText() + "\n");
					re.setTest(review);
					// r.add(tf.getText()+"\n");
					System.out.println(review);
					JOptionPane.showMessageDialog(btnBuy, "리뷰가 작성되었습니다.");

					// System.out.println(review);
					// 텍스트필드 비워주고 포커스 이동
					tf.setText("");
					tf.requestFocus();
				}

			}

		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				review = (tf.getText() + "\n");
				JOptionPane.showMessageDialog(btnBuy, "리뷰가 작성되었습니다.");

				re.setTest(review);
				// r.add(tf.getText()+"\n");
				System.out.println(review);
				// 텍스트필드 비워주고 포커스 이동
				tf.setText("");
				tf.requestFocus();
			}
		});

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

	}

}
