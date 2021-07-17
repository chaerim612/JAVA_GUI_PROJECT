package frame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import busVO.Bus;
import busVO.MyBus;

public class FrameDate extends JPanel {
	static String Month;
	static String day;
	static String date;
	
	public static String getDate() {
		return date;
	}

	public static void setDate(String day,String Month) {
		date =Month+" "+day;
	}

	MyBus m = new MyBus();
	
	//날짜 버튼
	JButton Hbtn1 = new JButton();
	JButton Hbtn2 = new JButton();
	JButton Hbtn3 = new JButton();
	JButton Hbtn4 = new JButton();
	JButton Hbtn5 = new JButton();
	JButton Hbtn6 = new JButton();
	JButton Hbtn7 = new JButton();
	JButton Hbtn8 = new JButton();
	JButton Hbtn9 = new JButton();
	JButton Hbtn10 = new JButton();
	JButton Hbtn11 = new JButton();
	JButton Hbtn12 = new JButton();
	JButton Hbtn13 = new JButton();
	JButton Hbtn14 = new JButton();
	JButton Hbtn15 = new JButton();
	JButton Hbtn16 = new JButton();
	JButton Hbtn17 = new JButton();
	JButton Hbtn18 = new JButton();
	
	//날짜 설정
	public FrameDate(Bus b) {
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD7ff));
		top.setLayout(null);
		top.setSize(600, 100);
		top.setLocation(0, 0);

		JPanel center1 = new JPanel();
		center1.setBackground(new Color(0xffffff));
		center1.setLayout(null);
		center1.setSize(600, 600);
		center1.setLocation(0, 100);
		center1.setVisible(false);

		JPanel center2 = new JPanel();
		center2.setBackground(new Color(0x99FFCC));
		center2.setLayout(null);
		center2.setSize(600, 600);
		center2.setLocation(0, 100);
		center2.setVisible(false);

		JPanel center3 = new JPanel();
		center3.setBackground(new Color(0xff66ff));
		center3.setLayout(null);
		center3.setSize(600, 600);
		center3.setLocation(0, 100);
		center3.setVisible(false);

		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700));
		bottom.setLayout(new GridLayout(1, 3));
		bottom.setSize(600, 65);
		bottom.setLocation(0, 700);
		bottom.setVisible(true);

		JButton sep = new JButton("09월");
		JButton oct = new JButton("10월");
		JButton nov = new JButton("11월");

		sep.setBounds(0, 0, 190, 100);
		oct.setBounds(198, 0, 190, 100);
		nov.setBounds(395, 0, 190, 100);
		top.add(sep);
		top.add(oct);
		top.add(nov);
		
		//9월 버튼
		sep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				setMonth("9월");
				center2.setVisible(false);
				center3.setVisible(false);
				center1.setVisible(true);

			}
		});
		
		//10월 버튼
		oct.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setMonth("10월");
				center1.setVisible(false);
				center3.setVisible(false);
				center2.setVisible(true);
			}
		});
		
		//11월 버튼
		nov.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setMonth("11월");
				center1.setVisible(false);
				center2.setVisible(false);
				center3.setVisible(true);
			}
		});
		
		//버튼 레이아웃
		Hbtn1.setSize(160, 200);
		Hbtn1.setLocation(30, 50);
		Hbtn1.setText("3일");
		Hbtn1.setBackground(new Color(0xFFD700));
		Hbtn2.setSize(160, 200);
		Hbtn2.setLocation(215, 50);
		Hbtn2.setText("8일");
		Hbtn2.setBackground(new Color(0xFFD700));
		Hbtn3.setSize(160, 200);
		Hbtn3.setText("13일");
		Hbtn3.setLocation(400, 50);
		Hbtn3.setBackground(new Color(0xFFD700));
		Hbtn4.setSize(160, 200);
		Hbtn4.setLocation(30, 330);
		Hbtn4.setText("18일");
		Hbtn4.setBackground(new Color(0xFFD700));
		Hbtn5.setSize(160, 200);
		Hbtn5.setText("23일");
		Hbtn5.setLocation(215, 330);
		Hbtn5.setBackground(new Color(0xFFD700));
		Hbtn6.setSize(160, 200);
		Hbtn6.setLocation(400, 330);
		Hbtn6.setText("28일");
		Hbtn6.setBackground(new Color(0xFFD700));
		Hbtn7.setSize(160, 200);
		Hbtn7.setLocation(30, 50);
		Hbtn7.setText("1일");
		Hbtn7.setBackground(new Color(0xFFD700));
		Hbtn8.setSize(160, 200);
		Hbtn8.setLocation(215, 50);
		Hbtn8.setText("6일");
		Hbtn8.setBackground(new Color(0xFFD700));
		Hbtn9.setSize(160, 200);
		Hbtn9.setText("12일");
		Hbtn9.setLocation(400, 50);
		Hbtn9.setBackground(new Color(0xFFD700));
		Hbtn10.setSize(160, 200);
		Hbtn10.setLocation(30, 330);
		Hbtn10.setText("19일");
		Hbtn10.setBackground(new Color(0xFFD700));
		Hbtn11.setSize(160, 200);
		Hbtn11.setText("23일");
		Hbtn11.setLocation(215, 330);
		Hbtn11.setBackground(new Color(0xFFD700));
		Hbtn12.setSize(160, 200);
		Hbtn12.setLocation(400, 330);
		Hbtn12.setText("27일");
		Hbtn12.setBackground(new Color(0xFFD700));
		Hbtn13.setSize(160, 200);
		Hbtn13.setLocation(30, 50);
		Hbtn13.setText("4일");
		Hbtn13.setBackground(new Color(0xFFD700));
		Hbtn14.setSize(160, 200);
		Hbtn14.setLocation(215, 50);
		Hbtn14.setText("10일");
		Hbtn14.setBackground(new Color(0xFFD700));
		Hbtn15.setSize(160, 200);
		Hbtn15.setText("16일");
		Hbtn15.setLocation(400, 50);
		Hbtn15.setBackground(new Color(0xFFD700));
		Hbtn16.setSize(160, 200);
		Hbtn16.setLocation(30, 330);
		Hbtn16.setText("22일");
		Hbtn16.setBackground(new Color(0xFFD700));
		Hbtn17.setSize(160, 200);
		Hbtn17.setText("25일");
		Hbtn17.setLocation(215, 330);
		Hbtn17.setBackground(new Color(0xFFD700));
		Hbtn18.setSize(160, 200);
		Hbtn18.setLocation(400, 330);
		Hbtn18.setText("30일");
		Hbtn18.setBackground(new Color(0xFFD700));
		
		//버튼 이벤트
		Hbtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("3일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
			}
		});
		Hbtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("8일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
			}
		});
		Hbtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("13일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				
				//m.setDate(date);
			}
		});
		Hbtn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("18일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("23일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("28일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("1일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("6일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("12일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("19일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("23일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("27일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("4일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("10일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("16일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("22일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("25일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		Hbtn18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("30일");
				setDate(getday(),getMonth());
				b.setBusDate(getDate());
				
				FrameBase.getInstance(new FrameReserve(b));
				//m.setDate(date);
			}
		});
		center1.add(Hbtn1);
		center1.add(Hbtn2);
		center1.add(Hbtn3);
		center1.add(Hbtn4);
		center1.add(Hbtn5);
		center1.add(Hbtn6);
		center2.add(Hbtn7);
		center2.add(Hbtn8);
		center2.add(Hbtn9);
		center2.add(Hbtn10);
		center2.add(Hbtn11);
		center2.add(Hbtn12);
		center3.add(Hbtn13);
		center3.add(Hbtn14);
		center3.add(Hbtn15);
		center3.add(Hbtn16);
		center3.add(Hbtn17);
		center3.add(Hbtn18);
		
		JButton check = new JButton("확인");
		JButton invisible = new JButton("닫기");
		JButton back = new JButton("뒤로");
		
		//하단 버튼
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
		bottom.add(back);
		bottom.add(invisible);
		bottom.add(check);
		invisible.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				center1.setVisible(false);
				center2.setVisible(false);
				center3.setVisible(false);
			}
		});
		check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = getMonth() + getday();
				JOptionPane.showMessageDialog(null, str);

			}
		});
		add(top);
		add(center1);
		add(center2);
		add(center3);
		add(bottom);
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		this.Month = month;
	}

	public String getday() {
		return day;
	}

	public void setday(String day) {
		this.day = day;
	}

	/*
	 * public static void main(String[] args) { FrameBase.getInstance(new
	 * FrameDate(null, null)); //FrameDate fd = new FrameDate(); }
	 */

}
