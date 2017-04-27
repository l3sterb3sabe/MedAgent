package meds;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	static JLabel lblMedLoginUsername;
	static JTextField tfMedLoginUsername;
	static JLabel lblMedLoginPassword;
	static JPasswordField pfMedLoginPassword;
	static JButton btnMedLoginSubmit;
	static JButton btnMedLoginClear;
	static JButton btnMedLoginBack;
	static JLabel lblMedLoginPicture;
	ImageIcon imgMedLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MSLogin.jpg")));
	
	
	public Login(){
		
		lblMedLoginUsername = new JLabel("Username : ");
		lblMedLoginUsername.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblMedLoginUsername.setBounds(488, 257, 110, 31);
		
		tfMedLoginUsername = new JTextField();
		tfMedLoginUsername.setBounds(638, 260, 230, 25);
		tfMedLoginUsername.setColumns(10);
		
		pfMedLoginPassword = new JPasswordField();
		pfMedLoginPassword.setBounds(638, 312, 230, 25);
		
		btnMedLoginSubmit = new JButton("Submit");
		btnMedLoginSubmit.setBackground(new Color(95, 158, 160));
		btnMedLoginSubmit.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnMedLoginSubmit.setBounds(539, 392, 116, 31);
		
		btnMedLoginClear = new JButton("Clear");
		btnMedLoginClear.setBackground(new Color(95, 158, 160));
		btnMedLoginClear.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnMedLoginClear.setBounds(729, 392, 116, 31);
		
		btnMedLoginBack = new JButton("Back to Menu");
		btnMedLoginBack.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnMedLoginBack.setBackground(new Color(255, 228, 196));
		btnMedLoginBack.setBounds(638, 615, 133, 31);
		
		lblMedLoginPicture = new JLabel("");
		lblMedLoginPicture.setIcon(imgMedLogin);
		lblMedLoginPicture.setBounds(0, 0, 1362, 705);
	}
	
	public JLabel getlblMedLoginUsername(){
		return lblMedLoginUsername;
	}
	
	public JTextField gettfMedLoginUsername(){
		return tfMedLoginUsername;
	}
	
	public JLabel getlblMedLoginPassword(){
		return lblMedLoginPassword;
	}
	
	public JPasswordField getpfMedLoginPassword(){
		return pfMedLoginPassword;
	}
	
	public JButton getbtnMedLoginSubmit(){
		return btnMedLoginSubmit;
	}
	
	public JButton getbtnMedLoginClear(){
		return btnMedLoginClear;
	}
	
	public JButton getbtnMedLoginBack(){
		return btnMedLoginBack;
	}
	
	public JLabel getlblMedLoginPicture(){
		return lblMedLoginPicture;
	}
}
