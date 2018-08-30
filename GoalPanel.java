import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GoalPanel extends JPanel {
	public GoalPanel(){
		setBounds(300,300,300,200);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		String name = "     Ming Wang";
		DateFormat dateFormat = new SimpleDateFormat(" yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		
		JLabel lblName = new JLabel("Name: ");
		gbc.gridx=0;
		gbc.gridy=0;
		add(lblName,gbc);
		
		JLabel lblNameFld = new JLabel(name);
		gbc.gridx=1;
		gbc.gridy=0;
		add(lblNameFld,gbc);
		
		JLabel lblTime = new JLabel("Time: ");
		gbc.gridx=0;
		gbc.gridy=1;
		add(lblTime,gbc);
		
		JLabel lblTimeFld = new JLabel(dateFormat.format(date));
		gbc.gridx=1;
		gbc.gridy=1;
		add(lblTimeFld,gbc);
		
		JLabel blankFiller = new JLabel("");
		gbc.gridx=0;
		gbc.gridy=3;
		add(blankFiller,gbc);
		
		JButton btnClockIn = new JButton("Clock In/Out");
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=4;
		gbc.insets = new Insets(10,0,0,0);
		btnClockIn.setPreferredSize(new Dimension(150,25));
		add(btnClockIn,gbc);
						
		JLabel lblTest = new JLabel("");
		gbc.gridx=4;
		gbc.gridy=4;
		add(lblTest,gbc);
	}
}
