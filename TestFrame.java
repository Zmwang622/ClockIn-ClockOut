

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	
	public CardLayout cl;
	public JPanel overall;
	public TestFrame()
	{	
//		setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
		overall = new JPanel(new CardLayout());
		cl = (CardLayout)(overall.getLayout());
		
		MainPanel panel1 = new MainPanel();
		GoalPanel panel2 = new GoalPanel();
		
		
		overall.add(panel1);
		overall.add(panel2);
			
		JButton btnLogin = new JButton("Login");
//		gbc.gridx=0;
//		gbc.gridy=0;
		btnLogin.setPreferredSize(new Dimension(100,25));
		add(btnLogin);
//		add(btnLogin,gbc);
		
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
