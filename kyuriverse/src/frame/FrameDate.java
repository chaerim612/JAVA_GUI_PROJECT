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

	public FrameDate() {
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

		JButton sep = new JButton("09???");
		JButton oct = new JButton("10???");
		JButton nov = new JButton("11???");

		sep.setBounds(0, 0, 190, 100);
		oct.setBounds(198, 0, 190, 100);
		nov.setBounds(395, 0, 190, 100);
		top.add(sep);
		top.add(oct);
		top.add(nov);
		sep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				setMonth("9???");
				center2.setVisible(false);
				center3.setVisible(false);
				center1.setVisible(true);

			}
		});
		oct.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setMonth("10???");
				center1.setVisible(false);
				center3.setVisible(false);
				center2.setVisible(true);
			}
		});
		nov.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setMonth("11???");
				center1.setVisible(false);
				center2.setVisible(false);
				center3.setVisible(true);
			}
		});

		Hbtn1.setSize(160, 200);
		Hbtn1.setLocation(30, 50);
		Hbtn1.setText("3???");
		Hbtn1.setBackground(new Color(0xFFD700));
		Hbtn2.setSize(160, 200);
		Hbtn2.setLocation(215, 50);
		Hbtn2.setText("8???");
		Hbtn2.setBackground(new Color(0xFFD700));
		Hbtn3.setSize(160, 200);
		Hbtn3.setText("13???");
		Hbtn3.setLocation(400, 50);
		Hbtn3.setBackground(new Color(0xFFD700));
		Hbtn4.setSize(160, 200);
		Hbtn4.setLocation(30, 330);
		Hbtn4.setText("18???");
		Hbtn4.setBackground(new Color(0xFFD700));
		Hbtn5.setSize(160, 200);
		Hbtn5.setText("23???");
		Hbtn5.setLocation(215, 330);
		Hbtn5.setBackground(new Color(0xFFD700));
		Hbtn6.setSize(160, 200);
		Hbtn6.setLocation(400, 330);
		Hbtn6.setText("28???");
		Hbtn6.setBackground(new Color(0xFFD700));
		Hbtn7.setSize(160, 200);
		Hbtn7.setLocation(30, 50);
		Hbtn7.setText("1???");
		Hbtn7.setBackground(new Color(0xFFD700));
		Hbtn8.setSize(160, 200);
		Hbtn8.setLocation(215, 50);
		Hbtn8.setText("6???");
		Hbtn8.setBackground(new Color(0xFFD700));
		Hbtn9.setSize(160, 200);
		Hbtn9.setText("12???");
		Hbtn9.setLocation(400, 50);
		Hbtn9.setBackground(new Color(0xFFD700));
		Hbtn10.setSize(160, 200);
		Hbtn10.setLocation(30, 330);
		Hbtn10.setText("19???");
		Hbtn10.setBackground(new Color(0xFFD700));
		Hbtn11.setSize(160, 200);
		Hbtn11.setText("23???");
		Hbtn11.setLocation(215, 330);
		Hbtn11.setBackground(new Color(0xFFD700));
		Hbtn12.setSize(160, 200);
		Hbtn12.setLocation(400, 330);
		Hbtn12.setText("27???");
		Hbtn12.setBackground(new Color(0xFFD700));
		Hbtn13.setSize(160, 200);
		Hbtn13.setLocation(30, 50);
		Hbtn13.setText("4???");
		Hbtn13.setBackground(new Color(0xFFD700));
		Hbtn14.setSize(160, 200);
		Hbtn14.setLocation(215, 50);
		Hbtn14.setText("10???");
		Hbtn14.setBackground(new Color(0xFFD700));
		Hbtn15.setSize(160, 200);
		Hbtn15.setText("16???");
		Hbtn15.setLocation(400, 50);
		Hbtn15.setBackground(new Color(0xFFD700));
		Hbtn16.setSize(160, 200);
		Hbtn16.setLocation(30, 330);
		Hbtn16.setText("22???");
		Hbtn16.setBackground(new Color(0xFFD700));
		Hbtn17.setSize(160, 200);
		Hbtn17.setText("25???");
		Hbtn17.setLocation(215, 330);
		Hbtn17.setBackground(new Color(0xFFD700));
		Hbtn18.setSize(160, 200);
		Hbtn18.setLocation(400, 330);
		Hbtn18.setText("30???");
		Hbtn18.setBackground(new Color(0xFFD700));
		Hbtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("3???");
				FrameBase.getInstance(new FrameReserve(null));

			}
		});
		Hbtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("8???");
				FrameBase.getInstance(new FrameMyPage());
			}
		});
		Hbtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("13???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("18???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("23???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("28???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("1???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("6???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("12???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("19???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("23???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("27???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("4???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("10???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("16???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("22???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("25???");
				FrameBase.getInstance(new FrameReserve(null));
			}
		});
		Hbtn18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setday("30???");
				FrameBase.getInstance(new FrameReserve(null));
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
		JButton check = new JButton("??????");
		JButton invisible = new JButton("??????");
		JButton back = new JButton("??????");
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMyPage());
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
	 * FrameDate()); //FrameDate fd = new FrameDate(); }
	 */

}
