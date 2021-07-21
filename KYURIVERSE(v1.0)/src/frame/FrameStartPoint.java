package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
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

public class FrameStartPoint extends JPanel{
	
	ArrayList<String> r=new ArrayList<String>();
	String review="";
	
	public FrameStartPoint () {
		
		
		
		// TODO Auto-generated constructor stub
		setBackground(new Color(244, 244, 244)); 
		setSize(600, 800);
		
		JPanel pNorth=new JPanel();
		pNorth.setSize(500, 40);
		pNorth.setLocation(0,560);
		pNorth.setBackground(new Color(244, 244, 244));
		
		//top 출발지 정보 text
		JLabel screen1 = new JLabel("SOLDESK");
		screen1.setFont(new Font("배달의민족 주아", Font.BOLD,30));
		screen1.setBounds(40,-225, 600, 600);
		add(screen1);
		
		JLabel screen2 = new JLabel("         솔데스크주소: 서울특별시 종로구 관철동 13-13");
		screen2.setFont(new Font("배달의민족 주아", Font.PLAIN,23));
		screen2.setBounds(40,-155, 600, 600);
		screen2.setVisible(true);
		add(screen2);
		
		JLabel screen3 = new JLabel("전화번호: 02-6901-7098");
		screen3.setFont(new Font("배달의민족 주아", Font.BOLD,20));
		screen3.setBounds(40,-125, 600, 600);
		screen3.setVisible(true);
		add(screen3);
		
		//center 출발지 위치정보 이미지
		ImageIcon c = new ImageIcon("솔데스크약도3.jpg");
		JLabel l = new JLabel(c);
		l.setBounds(40, 0, 500, 700);
		add(l);
		//add(center);
		
		//리뷰 입력 상자
		
		JLabel screen4 = new JLabel("한줄 리뷰작성");
		
		screen4.setFont(new Font("배달의민족 주아", Font.PLAIN,18));
		screen4.setBounds(215,225, 600, 40);
		screen4.setVisible(true);
		pNorth.add(screen4);
		
		TextField tf=new TextField(40); //입력상자의 길이
		
		Button btnEnt=new Button("ENTER");
		btnEnt.setBackground(new Color(26, 28, 32));
		btnEnt.setForeground(new Color(255,255,255));
		btnEnt.setEnabled(true);//기본 비활성화
		btnEnt.setEnabled(false);
		
		pNorth.add(tf);
		pNorth.add(btnEnt);
		add(pNorth);

		JButton btnInfo = new JButton("기사정보");
		btnInfo.setBackground(new Color(26, 28, 32));
		btnInfo.setForeground(new Color(255,255,255));
		
		btnInfo.setSize(183, 87);
		btnInfo.setLocation(0, 600);
		btnInfo.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		btnInfo.setVisible(true);
		add(btnInfo);
		
		btnInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("teach_cgr.png");
				JLabel jI = new JLabel(img);
				jI.setSize(100,150);

				TextArea driver = new TextArea("          ◎ 버스기사님 정보 확인하기 ◎" + "\n\n" 
						+"\n◎ 기사님 성함 : 최규리" + "\n\n"
						+"\n◎ 운전 경력 : N년" + "\n\n"
						+"\n◎ 수상이력 : 2021 취업률 100% 달성"+"\n\n",0,0,TextArea.SCROLLBARS_NONE);
				driver.setEditable(false);
				
				Frame f = new Frame();
				f.setTitle("Driver Information");
				f.setSize(600,400);
				f.setLocation(700,400);
				f.setLayout(new GridLayout(1,2));
				f.add(jI);
				f.add(driver);
				f.setVisible(true);
				
				f.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						f.setVisible(false);
						f.dispose();
					}
				});
			}
		});
		
		JButton btnEx = new JButton("리뷰보기");
		btnEx.setBackground(new Color(26, 28, 32));
		btnEx.setForeground(new Color(255,255,255));
		
		btnEx.setSize(183, 87);
		btnEx.setLocation(198, 600);
		btnEx.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		btnEx.setVisible(true);
		add(btnEx);
		   
		btnEx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameMenu2 menu=new FrameMenu2();
				menu.Menu2();
				Review re=new Review();
				re.getTest();
				re.str="";
			}
		});
		
		JButton btnPrev = new JButton("이전으로");
		btnPrev.setBackground(new Color(26, 28, 32));
		btnPrev.setForeground(new Color(255,255,255));
		
		btnPrev.setSize(183, 87);
		btnPrev.setLocation(391,600);
		btnPrev.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		btnPrev.setVisible(true);
		add(btnPrev);
		
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMenu());
			}
		});
		
		 //TextField에 값이 들어간 경우에만 입력버튼 활성화	
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")){ //내용이 없으면
					btnEnt.setEnabled(false); //버튼잠금
				}else{
					btnEnt.setEnabled(true); //버튼활성화
				}
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Review re=new Review();
				// TextFiled에 엔터값이 감지되면 아래 TextArea에 내용 추가
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					review=(tf.getText()+"\n\n");
					re.setTest(review);
					//r.add(tf.getText()+"\n");
					JOptionPane.showMessageDialog(null,"리뷰가 작성되었습니다.");
								
					//System.out.println(review);
					//텍스트필드 비워주고 포커스 이동
					tf.setText("");
					tf.requestFocus();	
				}
			}
		});
	  
		btnEnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Review re=new Review();
				review=(tf.getText()+"\n\n");
				JOptionPane.showMessageDialog(null,"리뷰가 작성되었습니다.");
					
				re.setTest(review);
				//r.add(tf.getText()+"\n");
				System.out.println(review);
				//텍스트필드 비워주고 포커스 이동
				tf.setText("");
				tf.requestFocus();				
			}
		});
		
	}	
}
