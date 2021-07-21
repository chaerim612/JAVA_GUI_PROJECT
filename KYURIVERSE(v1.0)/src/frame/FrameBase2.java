package frame;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase2 extends JFrame {
	private static FrameBase2 instance;
	
	public FrameBase2(JPanel e) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		setTitle("KYURIVERSE");
		 // 자동조정방지
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 500);
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//생성자
	public static void getInstance(JPanel e) {
		instance = new FrameBase2(e);
		
	}//getInstance()
	
}