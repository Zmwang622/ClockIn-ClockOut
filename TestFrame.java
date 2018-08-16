package Login_Sys;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	public TestFrame()
	{
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();
		overall.setLayout(cl);
		
		MainPanel panel1 = new MainPanel();
		overall.add(panel1);
		
		add(overall);
		
		setBounds(100,100,900,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Clock In/Clock Out");
	}
	
	public static void main (String[]args)
	{
		TestFrame frm = new TestFrame();
	}

}
