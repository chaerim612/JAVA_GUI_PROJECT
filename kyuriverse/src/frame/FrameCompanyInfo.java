package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import busVO.Company;

public class FrameCompanyInfo extends JPanel {

	public FrameCompanyInfo(Company c) {

		// 서브 프레임 구성
		Frame f = new Frame();
		f.setSize(400, 600);
		f.setLocation(1000, 50);
		f.setVisible(true);

		// JPanel 구조
		JPanel pane = new JPanel();
		pane.setBackground(new Color(250, 244, 192));
		pane.setLayout(null);
		pane.setSize(400, 600);

		final int comNum = 6;
		int comflag = 0;
		String[] comurl = { "네이버.png", "카카오.jpg", "마소.png", "애플.png", "구글.png", "IBM.png" };

		ImageIcon[] comImg = new ImageIcon[comNum];

		for (int i = 0; i < comNum; i++) {
			comImg[i] = new ImageIcon(comurl[i]);
			if (c.getcName().equals("네이버")) {
				comflag = 0;
			} else if (c.getcName().equals("카카오")) {
				comflag = 1;
			} else if (c.getcName().equals("마소")) {
				comflag = 2;
			} else if (c.getcName().equals("애플")) {
				comflag = 3;
			} else if (c.getcName().equals("IBM")) {
				comflag = 4;
			} else if (c.getcName().equals("구글")) {
				comflag = 5;
			} // for

			// 이미지를 JLabel에 붙여서 출력
			JLabel img = new JLabel(comImg[comflag]);
			img.setBounds(20, 15, 120, 150);
			pane.add(img);
			
			TextArea Info = new TextArea("\n◎영화제목" + "\n" + " " + c.getcInfo() + TextArea.SCROLLBARS_NONE);
			Info.setSize(400,270);
			Info.setLocation(0, 200);
			Info.setBackground(new Color(0xFFD700));
			Info.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			pane.add(Info);
			
			f.add(pane);

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
