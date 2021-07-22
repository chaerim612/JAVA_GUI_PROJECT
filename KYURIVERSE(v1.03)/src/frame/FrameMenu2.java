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

public class FrameMenu2 extends Frame  {
	
	public void Menu2() {
	Review rr=new Review();
		
		Frame frame=new Frame("리뷰보기");//프레임의 제목
		frame.setLayout(null);
		frame.setBounds(800,100,600,800); //(x좌표, y좌표, 너비, 높이)
		frame.setBackground(new Color(244, 244, 244));//배경색
		frame.setVisible(true); //false는 화면에 보이지 않음
		
		JPanel bottomSet = new JPanel();

		   bottomSet.setBounds(0, 660, 600, 100);
		   bottomSet.setBackground(new Color(244, 244, 244));
		   bottomSet.setLayout(null);
		
		   JButton btnBuy = new JButton("종료");
		   btnBuy.setBackground(new Color(26, 28, 32));
		   btnBuy.setForeground(new Color(255,255,255));
		   
		   btnBuy.setSize(183, 87);
		   btnBuy.setLocation(401, 0);
		   btnBuy.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		   bottomSet.add(btnBuy);
		   btnBuy.setVisible(true);

		   frame.add(bottomSet);

		   TextArea story = new TextArea("                         한줄리뷰\n\n" +rr.getTest());
			story.setBounds(25, 40, 555, 600);
			
			story.setFont(new Font("배달의민족 주아", Font.PLAIN,30));
			story.setEditable(false);
			frame.add(story);
		   
		   btnBuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
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


	
	


		
