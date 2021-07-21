package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
		setBackground(new Color(244, 244, 244));
		setLayout(null);
		setSize(600, 800);
		JPanel top = new JPanel();
		top.setBackground(new Color(244, 244, 244));
		top.setLayout(null);
		top.setSize(600, 100);
		top.setLocation(0, 0);

		JPanel center1 = new JPanel();
		center1.setBackground(new Color(244, 244, 244));
		center1.setLayout(null);
		center1.setSize(600, 700);
		center1.setLocation(0, 100);
		center1.setVisible(false);

		JPanel center2 = new JPanel();
		center2.setBackground(new Color(244, 244, 244));
		center2.setLayout(null);
		center2.setSize(600, 700);
		center2.setLocation(0, 100);
		center2.setVisible(false);

		JPanel center3 = new JPanel();
		center3.setBackground(new Color(244, 244, 244));
		center3.setLayout(null);
		center3.setSize(600, 700);
		center3.setLocation(0, 100);
		center3.setVisible(false);

		/*
		 * JPanel bottom = new JPanel(); bottom.setBackground(new Color(240, 165, 0));
		 * bottom.setLayout(null); bottom.setSize(600, 130); bottom.setLocation(0, 650);
		 * bottom.setVisible(true);
		 */

		JButton sep = new JButton("09월");
		sep.setBackground(new Color(26, 28, 32));
		sep.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		sep.setForeground(new Color(255,255,255));
		JButton oct = new JButton("10월");
		oct.setBackground(new Color(26, 28, 32));
		oct.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		oct.setForeground(new Color(255,255,255));
		JButton nov = new JButton("11월");
		nov.setBackground(new Color(26, 28, 32));
		nov.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		nov.setForeground(new Color(255,255,255));
		sep.setBounds(10, 5, 180, 90);
		oct.setBounds(203, 5, 180, 90);
		nov.setBounds(395, 5, 180, 90);
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
		JButton back1 = new JButton("뒤로");
		back1.setBounds(10, 570, 180, 80);
		back1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		back1.setForeground(new Color(255,255,255));
		back1.setBackground(new Color(0,0,0));
		JButton back2 = new JButton("뒤로");
		back2.setBounds(10, 570, 180, 80);
		back2.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		back2.setForeground(new Color(255,255,255));
		back2.setBackground(new Color(0,0,0));
		JButton back3 = new JButton("뒤로");
		back3.setBounds(10, 570, 180, 80);
		back3.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		back3.setForeground(new Color(255,255,255));
		back3.setBackground(new Color(0,0,0));
		JButton invisible1 = new JButton("닫기");
		invisible1.setBounds(395, 570, 180, 80);
		invisible1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		invisible1.setForeground(new Color(255,255,255));
		invisible1.setBackground(new Color(0,0,0));
		JButton invisible2 = new JButton("닫기");
		invisible2.setBounds(395, 570, 180, 80);
		invisible2.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		invisible2.setForeground(new Color(255,255,255));
		invisible2.setBackground(new Color(0,0,0));
		JButton invisible3 = new JButton("닫기");
		invisible3.setBounds(395, 570, 180, 80);
		invisible3.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		invisible3.setForeground(new Color(255,255,255));
		invisible3.setBackground(new Color(0,0,0));
		
		
		
		//버튼 레이아웃
		Hbtn1.setSize(160, 200);
		Hbtn1.setLocation(30, 50);
		Hbtn1.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn1.setText("3일");
		Hbtn1.setBackground(new Color(0xa6a6a6));
		
		Hbtn2.setSize(160, 200);
		Hbtn2.setLocation(215, 50);
		Hbtn2.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn2.setText("8일");
		Hbtn2.setBackground(new Color(0xa6a6a6));
		
		Hbtn3.setSize(160, 200);
		Hbtn3.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn3.setText("13일");
		Hbtn3.setLocation(400, 50);
		Hbtn3.setBackground(new Color(0xa6a6a6));
		
		Hbtn4.setSize(160, 200);
		Hbtn4.setLocation(30, 320);
		Hbtn4.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn4.setText("18일");
		Hbtn4.setBackground(new Color(0xa6a6a6));
		
		Hbtn5.setSize(160, 200);
		Hbtn5.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn5.setText("23일");
		Hbtn5.setLocation(215, 320);
		Hbtn5.setBackground(new Color(0xa6a6a6));
		
		Hbtn6.setSize(160, 200);
		Hbtn6.setLocation(400, 320);
		Hbtn6.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn6.setText("28일");
		Hbtn6.setBackground(new Color(0xa6a6a6));
		
		Hbtn7.setSize(160, 200);
		Hbtn7.setLocation(30, 50);
		Hbtn7.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn7.setText("1일");
		Hbtn7.setBackground(new Color(0xa6a6a6));
		
		Hbtn8.setSize(160, 200);
		Hbtn8.setLocation(215, 50);
		Hbtn8.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn8.setText("6일");
		Hbtn8.setBackground(new Color(0xa6a6a6));
		
		Hbtn9.setSize(160, 200);
		Hbtn9.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn9.setText("12일");
		Hbtn9.setLocation(400, 50);
		Hbtn9.setBackground(new Color(0xa6a6a6));
		
		Hbtn10.setSize(160, 200);
		Hbtn10.setLocation(30, 320);
		Hbtn10.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn10.setText("19일");
		Hbtn10.setBackground(new Color(0xa6a6a6));
		
		Hbtn11.setSize(160, 200);
		Hbtn11.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn11.setText("23일");
		Hbtn11.setLocation(215, 320);
		Hbtn11.setBackground(new Color(0xa6a6a6));
		
		Hbtn12.setSize(160, 200);
		Hbtn12.setLocation(400, 320);
		Hbtn12.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn12.setText("27일");
		Hbtn12.setBackground(new Color(0xa6a6a6));
		
		Hbtn13.setSize(160, 200);
		Hbtn13.setLocation(30, 50);
		Hbtn13.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn13.setText("4일");
		Hbtn13.setBackground(new Color(0xa6a6a6));
		
		Hbtn14.setSize(160, 200);
		Hbtn14.setLocation(215, 50);
		Hbtn14.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn14.setText("10일");
		Hbtn14.setBackground(new Color(0xa6a6a6));
		
		Hbtn15.setSize(160, 200);
		Hbtn15.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn15.setText("16일");
		Hbtn15.setLocation(400, 50);
		Hbtn15.setBackground(new Color(0xa6a6a6));
		
		Hbtn16.setSize(160, 200);
		Hbtn16.setLocation(30, 320);
		Hbtn16.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn16.setText("22일");
		Hbtn16.setBackground(new Color(0xa6a6a6));
		
		Hbtn17.setSize(160, 200);
		Hbtn17.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn17.setText("25일");
		Hbtn17.setLocation(215, 320);
		Hbtn17.setBackground(new Color(0xa6a6a6));
		
		Hbtn18.setSize(160, 200);
		Hbtn18.setLocation(400, 320);
		Hbtn18.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		Hbtn18.setText("30일");
		Hbtn18.setBackground(new Color(0xa6a6a6));
		
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
		center1.add(back1);
		center2.add(back2);
		center3.add(back3);
		center1.add(invisible1);
		center2.add(invisible2);
		center3.add(invisible3);
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
		
		
		back1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
		back2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
		back3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
	
		 invisible1.addActionListener(new ActionListener() {
		  
		  @Override public void actionPerformed(ActionEvent e) {
		  center1.setVisible(false); center2.setVisible(false);
		  center3.setVisible(false); } });
		 invisible2.addActionListener(new ActionListener() {
			  
			  @Override public void actionPerformed(ActionEvent e) {
			  center1.setVisible(false); center2.setVisible(false);
			  center3.setVisible(false); } });
		 invisible3.addActionListener(new ActionListener() {
			  
			  @Override public void actionPerformed(ActionEvent e) {
			  center1.setVisible(false); center2.setVisible(false);
			  center3.setVisible(false); } });
		 
		
		add(top);
		add(center1);
		add(center2);
		add(center3);

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

}
