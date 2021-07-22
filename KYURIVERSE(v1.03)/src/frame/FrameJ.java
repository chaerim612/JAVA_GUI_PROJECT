package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import busVO.BookDAO;
import busVO.Bus;
import busVO.LecDAO;
import busVO.Lecture;
import busVO.MyBus;

public class FrameJ extends JPanel {

	public FrameJ(Bus b, MyBus m, Lecture l) {
		setBackground(new Color(244, 244, 244));
		setLayout(null);
		setSize(600, 800);

		JLabel screen1 = new JLabel("      등록시 지원되는 코스");
		screen1.setFont(new Font("배달의민족 주아", Font.BOLD, 55));
		screen1.setBounds(40, -10, 500, 110);
		add(screen1);

		// 전담매니저 사진
		ImageIcon img = new ImageIcon("조진웅.jpg");
		JLabel jI = new JLabel(img);
		jI.setBounds(20, 430, 200, 220);
		add(jI);

		// 하단 버튼 세팅
		JPanel bottomSet = new JPanel();
		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setBackground(new Color(244, 244, 244));
		bottomSet.setLayout(null);

		JButton btnBook = new JButton("이전으로");
		btnBook.setBackground(new Color(26, 28, 32));
		btnBook.setForeground(new Color(255, 255, 255));
		btnBook.setSize(183, 87);
		btnBook.setLocation(10, 0);
		btnBook.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		btnBook.setVisible(true);
		bottomSet.add(btnBook);

		JButton btnSol = new JButton("등록");
		btnSol.setBackground(new Color(26, 28, 32));
		btnSol.setForeground(new Color(255, 255, 255));

		btnSol.setSize(183, 87);
		btnSol.setLocation(396, 0);
		btnSol.setFont(new Font("배달의민족 주아", Font.PLAIN, 22));
		bottomSet.add(btnSol);
		btnSol.setVisible(true);

		add(bottomSet);

		if (l.getLecName().equals("카카오")) {

			TextArea storyKakao = new TextArea("필수 지원 자격 : 비즈니스 영어회화 가능" + "\n" + "\t\t JAVA 프로그래밍 중급 이상" + "\n"
					+ "\t\t 관련 분야 자격증 2개 이상" + "\n" + "\t\t 코딩테스트 진행" + "\n" + "\t\t 최종학력 학사 이상" + "\n\n" + "지원코스"
					+ "\n" + "◆ 영 어 회 화 : " + l.getEng() + "\n" + "◆ 프 로 젝 트 : " + l.getMinPro() + "\n" + "◆ 자  격  증 : "
					+ l.getLicense() + "\n" + "◆ 코딩테스트 준비 : " + l.getCodingTest() + "\n" + "◆ 학점 관련 안내 : "
					+ l.getDegree(), 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
			storyKakao.setEditable(false);
			storyKakao.setBounds(17, 100, 555, 320);
			storyKakao.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
			storyKakao.setVisible(true);
			add(storyKakao);

		}

		if (l.getLecName().equals("IBM")) {
			TextArea storyIBM = new TextArea("필수 지원 자격 : 비즈니스 영어회화 가능" + "\n" + "\t\t 파이썬 관련 지식 필수" + "\n"
					+ "\t\t 관련 분야 자격증 2개 이상" + "\n" + "\t\t 최종학력 학사 이상" + "\n" + "\t\t 기타 요구사항" + "\n\n" + "지원코스" + "\n"
					+ "◆ 영 어 회 화 : " + l.getEng() + "\n" + "◆ 프 로 젝 트 : " + l.getMinPro() + "\n" + "◆ 자  격  증 : "
					+ l.getLicense() + "\n" + "◆ 학점 관련 안내 : " + l.getDegree() + "\n" + "◆ 기타 제공 강의 : "
					+ l.getCodingTest(), 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

			storyIBM.setEditable(false);
			storyIBM.setBounds(17, 100, 555, 320);
			storyIBM.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
			storyIBM.setVisible(true);
			add(storyIBM);

		}

		TextArea story1 = new TextArea("조진웅\n\n◆스팩\n" + "말빨로 조짐\n" + "취업 안되면 오함마로 후두리 찹찹\n" + "아시아 아티스트 어워즈 드라마부문 \n대상"
				+ "\n" + "◆매니저의 말\n" + "없음\n" + "\n" + "◆교육필수 참가 제한\n" + "없음", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story1.setEditable(false);
		story1.setBounds(240, 430, 330, 220);
		story1.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
		story1.setVisible(true);
		add(story1);

		btnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				FrameBase.getInstance(new FrameBusConfirm(b, m));

			}
		});

		btnSol.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "(최규리)강사님의  등록 클래스 이름에 등록되었습니다");
				FrameBase.getInstance(new FrameMenu());

			}
		});

	}
}