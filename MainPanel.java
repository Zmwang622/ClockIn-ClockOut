package Login_Sys;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		
		JPasswordField passwordField = new JPasswordField(20);
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		passwordField.setPreferredSize(new Dimension(200,25));
		add(passwordField,gbc);
		
		JButton btnAdd = new JButton("Add");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.insets = new Insets(10,0,0,0);
		btnAdd.setPreferredSize(new Dimension(100,25));
		add(btnAdd,gbc);
		
		JButton btnLogin = new JButton("Login");
		gbc.gridx=1;
		gbc.gridy=2;
		btnLogin.setPreferredSize(new Dimension(100,25));
		add(btnLogin,gbc);
		
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
		
		
		
		
		
		JLabel lblStatus = new JLabel("");
		gbc.gridx=0;
		gbc.gridy=3;
		add(lblStatus,gbc);
		
	}
}
