package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
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

import busVO.Bus;
import busVO.MyBus;

public class FrameCompanyInfo extends JPanel {
	MyBus mb = new MyBus();

	public FrameCompanyInfo(Bus b) {

		// 서브 프레임 구성
		Frame f = new Frame();
		f.setSize(400, 600);
		f.setLocation(1000, 50);
		f.setVisible(true);

		// JPanel 구조
		JPanel pane = new JPanel();
		pane.setBackground(Color.black);
		pane.setLayout(null);
		pane.setSize(400, 600);

		final int comNum = 6;
		int comflag = 0;
		String[] comurl = { "네이버2.png", "카카오2.png","마소2.png",
									"애플2.png",  "IBM2.png","구글2.png" };

		ImageIcon[] comImg = new ImageIcon[comNum];

		for (int i = 0; i < comNum; i++) {
			comImg[i] = new ImageIcon(comurl[i]);

			if (b.getBusName().equals("네이버")) {
				comflag = 0;
			} else if (b.getBusName().equals("카카오")) {
				comflag = 1;
			} else if (b.getBusName().equals("마이크로소프트")) {
				comflag = 2;
			} else if (b.getBusName().equals("애플")) {
				comflag = 3;
			} else if (b.getBusName().equals("IBM")) {
				comflag = 4;
			} else if (b.getBusName().equals("구글")) {
				comflag = 5;
			} // for

			// 이미지를 JLabel에 붙여서 출력
			// 기업 이미지
			JLabel img = new JLabel(comImg[comflag]);
			img.setBounds(20, 25, 120, 150);
			pane.add(img);

			// 목적지 이름
			JLabel cName = new JLabel(b.getBusName());
			cName.setBounds(170, 50, 220, 50);
			cName.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
			cName.setForeground(Color.white);
			pane.add(cName);

			// 목적지 정보1. 연봉
			JLabel cAdd = new JLabel("평균 연봉 : " + b.getPrice() + "만원");
			cAdd.setBounds(170, 100, 220, 50);
			cAdd.setFont(new Font("배달의민족 주아", Font.ITALIC, 16));
			cAdd.setForeground(Color.white);
			pane.add(cAdd);

			// 목적지 정보2. 기타
			TextArea Info = new TextArea("\n◎소요시간 : " + "\n" + b.getTime() + "\n" + "\n◎회사정보 : " + "\n" + b.getInfo()
					+ "\n" + "\n◎위치 : " + b.getAddress() + "\n", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			Info.setEditable(false);
			Info.setSize(400, 270);
			Info.setLocation(0, 200);
			Info.setBackground(Color.white);
			Info.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			pane.add(Info);
			f.add(pane);

			// 하단 버튼
			JButton btnExit = new JButton("확인");
			btnExit.setBounds(145, 490, 90, 50);
			btnExit.setForeground(Color.black);
			btnExit.setBackground(Color.white);
			pane.add(btnExit);
			
			btnExit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					f.setVisible(false);
					// mb.setGoal(b.getBusName());
					FrameBase.getInstance(new FrameDate(b));
				}
			});

			f.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(WindowEvent e) {
					f.setVisible(false);
					f.dispose();
				}
			});
		}
	}
}
