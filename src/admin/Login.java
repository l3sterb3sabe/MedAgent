package admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	static JLabel lblAdminLoginUsername;
	static JTextField tfAdminLoginUsername;
	static JLabel lblAdminLoginPassword;
	static JPasswordField pfAdminLoginPassword;
	static JButton btnAdminLoginSubmit;
	static JButton btnAdminLoginClear;
	static JButton btnAdminLoginBack;
	static JLabel lblAdminLoginPicture;
	ImageIcon imgAdminLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/AdminLogin.jpg")));

	
	public Login(){
		
		lblAdminLoginUsername = new JLabel("Username : ");
		lblAdminLoginUsername.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblAdminLoginUsername.setBounds(489, 286, 110, 20);
		
		tfAdminLoginUsername = new JTextField();
		tfAdminLoginUsername.setBounds(642, 282, 228, 29);
		tfAdminLoginUsername.setColumns(10);
		
		lblAdminLoginPassword = new JLabel("Password : ");
		lblAdminLoginPassword.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblAdminLoginPassword.setBounds(489, 343, 110, 20);
		
		pfAdminLoginPassword = new JPasswordField();
		pfAdminLoginPassword.setBounds(642, 339, 228, 29);
		
		btnAdminLoginSubmit = new JButton("Submit");
		btnAdminLoginSubmit.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnAdminLoginSubmit.setBackground(new Color(95, 158, 160));
		btnAdminLoginSubmit.setBounds(565, 407, 110, 29);
		
		btnAdminLoginClear = new JButton("Clear");
		btnAdminLoginClear.setBackground(new Color(95, 158, 160));
		btnAdminLoginClear.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnAdminLoginClear.setBounds(724, 407, 105, 29);
		
		btnAdminLoginBack = new JButton("Back to Menu");
		btnAdminLoginBack.setBackground(new Color(245, 222, 179));
		btnAdminLoginBack.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnAdminLoginBack.setBounds(642, 600, 137, 29);
		
		lblAdminLoginPicture = new JLabel("");
		lblAdminLoginPicture.setIcon(imgAdminLogin);
		lblAdminLoginPicture.setBounds(0, -11, 1372, 716);
		
		
	}
	
	public JLabel getlblAdminLoginUsername(){
		return  lblAdminLoginUsername;
	}
	
	public JTextField gettfAdminLoginUsername(){
		return tfAdminLoginUsername;
	}
	
	public JLabel getlblAdminLoginPassword(){
		return lblAdminLoginPassword;
	}
	
	public JPasswordField getpfAdminLoginPassword(){
		return pfAdminLoginPassword;
	}
	
	public JButton getbtnAdminLoginSubmit(){
		return btnAdminLoginSubmit;
	}
	
	public JButton getbtnAdminLoginClear(){
		return btnAdminLoginClear;
	}
	
	public JButton getbtnAdminLoginBack(){
		return btnAdminLoginBack;
	}
	
	public JLabel getlblAdminLoginPicture(){
		return lblAdminLoginPicture;
	}
}
