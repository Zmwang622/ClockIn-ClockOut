

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	public MainPanel() {
		setBounds(300,300,300,200);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	
		JLabel lblUser = new JLabel("Username: ");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.insets = new Insets(0,5,0,0);
		add(lblUser,gbc); 
	
		JLabel lblPass = new JLabel("Password: ");
		gbc.gridx=0;
		gbc.gridy=1;
		add(lblPass,gbc);
		
		JTextField txtUser = new JTextField();
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,0,0,0);
		txtUser.setPreferredSize(new Dimension(200,25));
		add(txtUser,gbc); 
		
		JLabel lblStatus = new JLabel("");
		gbc.gridx=0;
		gbc.gridy=3;
		add(lblStatus,gbc);
		
		JPasswordField passwordField = new JPasswordField(20);
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		passwordField.setPreferredSize(new Dimension(200,25));
		add(passwordField,gbc);
		
		JButton btnExit= new JButton("Exit");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.insets = new Insets(10,0,0,0);
		btnExit.setPreferredSize(new Dimension(100,25));
		add(btnExit,gbc);
		
//		JButton btnLogin = new JButton("Login");
//		gbc.gridx=1;
//		gbc.gridy=2;
//		btnLogin.setPreferredSize(new Dimension(100,25));
//		add(btnLogin,gbc);
//		btnLogin.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				char[] input = passwordField.getPassword();
//				String user = txtUser.getText();			
//			if(credCheck(input,user))
//				{
//					lblStatus.setForeground(Color.GREEN);
//					lblStatus.setText("Correct!");
//				}
//			else if(!credCheck(input,user))
//				{
//					lblStatus.setForeground(Color.RED);
//					lblStatus.setText("Incorrect");
//				}
//			}
//		});
				
		JButton btnClear = new JButton("Clear");
		gbc.gridx=2;
		gbc.gridy=2;
		btnClear.setPreferredSize(new Dimension(100,25));
		add(btnClear,gbc);
		
		btnClear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				txtUser.setText("");
				passwordField.setText("");
			}
			
		});
		
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);						
			}
		});		
	
	}


private boolean credCheck(char[] input,String user)
{
	String username = "TEST";
	boolean isCorrect = true;
	char[] password = {'p','a','s','s'};
	if(!(input.length==password.length))
		isCorrect=false;
	isCorrect = Arrays.equals(input,password);
	return isCorrect = user.equals(username);
}


}