package frame;

import java.awt.BorderLayout;
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
import javax.swing.JFrame;
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
				JFrame frame = new JFrame();
				frame.setTitle("Driver Information");
				frame.setSize(600,400);
				frame.setLocation(700,400);
				frame.setLayout(null);
				
				String info = "♥ 강사님 정보 확인하기♥";
				JLabel Jdriver = new JLabel(info);
				Jdriver.setSize(500,40);
				Jdriver.setLocation(140, 10);
				Jdriver.setFont(new Font("배달의민족 주아", Font.BOLD, 28));
				
				ImageIcon img = new ImageIcon("teach_cgr.png");
				JLabel jI = new JLabel(img);
				jI.setSize(280,280);
				jI.setLocation(15, 50);
				
				String nInfo = "- 강사님 성함 :";
				JLabel JnInfo = new JLabel(nInfo);
				JnInfo.setSize(300,70);
				JnInfo.setLocation(300, 50);
				JnInfo.setFont(new Font("배달의민족 주아", Font.BOLD, 18));
				
				String name = "최규리";
				JLabel Jname = new JLabel(name);
				Jname.setSize(300,70);
				Jname.setLocation(380, 80);
				Jname.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));

				String career = "- 강의 경력 :";
				JLabel Jcareer = new JLabel(career);
				Jcareer.setSize(300,70);
				Jcareer.setLocation(300, 140);
				Jcareer.setFont(new Font("배달의민족 주아", Font.BOLD, 18));
				
				String nCareer = "알려고 하면 다쳐요.";
				JLabel JnCareer = new JLabel(nCareer);
				JnCareer.setSize(300,70);
				JnCareer.setLocation(380, 170);
				JnCareer.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
				
				String prize = "- 수상 이력 :";
				JLabel Jprize = new JLabel(prize);
				Jprize.setSize(300,70);
				Jprize.setLocation(300, 230);
				Jprize.setFont(new Font("배달의민족 주아", Font.BOLD, 18));
				
				String nPrize = "우리들의 우상♥";
				JLabel JnPrize = new JLabel(nPrize);
				JnPrize.setSize(300,70);
				JnPrize.setLocation(380, 260);
				JnPrize.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
				
				JButton btnClose = new JButton("확인");
				btnClose.setSize(80,30);
				btnClose.setLocation(260, 320);
				btnClose.setVisible(true);
				btnClose.setBackground(new Color(0x1A1C20));
				btnClose.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
				btnClose.setForeground(Color.white);
				
				btnClose.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				
				frame.add(Jdriver);
				frame.add(jI);
				frame.add(JnInfo);
				frame.add(Jname);
				frame.add(Jcareer);
				frame.add(JnCareer);
				frame.add(Jprize);
				frame.add(JnPrize);
				
				frame.add(btnClose);
				
				frame.setVisible(true);
				
				frame.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						frame.dispose();
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