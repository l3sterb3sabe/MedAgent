package admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class AddAdmin {

	static JLabel lblAddAdmin;
	static JLabel lblAddAdminUsername;
	static JTextField tfAddAdminUsername;
	static JLabel lblAddAdminPassword;
	static JTextField tfAddAdminPassword;
	static JSeparator separatorAddAdmin;
	static JTextField tfAddAdminFirstname;
	static JTextField tfAddAdminMiddlename;
	static JTextField tfAddAdminLastname;
	static JLabel lblAddAdminFirstname;
	static JLabel lblAddAdminMiddlename;
	static JLabel lblAddAdminLastname;
	static JTextField tfAddAdminBirthdate;
	static JLabel lblAddAdminBirthdate;
	static JTextField tfAddAdminContact;
	static JLabel lblAddAdminContact;
	static JTextField tfAddAdminEmail;
	static JLabel lblAddAdminEmail;
	static JButton btnAddAdminClear;
	static JButton btnAddAdminFinish;
	static JButton btnAddAdminBack;
	
	
	public AddAdmin(){
		
		lblAddAdmin = new JLabel("Add Administrator");
		lblAddAdmin.setFont(new Font("Finale Copyist Text Ext", Font.BOLD, 25));
		lblAddAdmin.setBounds(571, 11, 217, 26);
		
		lblAddAdminUsername = new JLabel("Username: ");
		lblAddAdminUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddAdminUsername.setBounds(543, 66, 85, 20);
		
		tfAddAdminUsername = new JTextField();
		tfAddAdminUsername.setBounds(640, 65, 199, 26);
		tfAddAdminUsername.setColumns(10);
		
		lblAddAdminPassword = new JLabel("Password: ");
		lblAddAdminPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddAdminPassword.setBounds(543, 104, 85, 20);
		
		tfAddAdminPassword = new JTextField();
		tfAddAdminPassword.setBounds(640, 102, 199, 26);
		tfAddAdminPassword.setColumns(10);
		
		separatorAddAdmin = new JSeparator();
		separatorAddAdmin.setForeground(new Color(100, 149, 237));
		separatorAddAdmin.setBounds(497, 143, 379, 9);
		
		tfAddAdminFirstname = new JTextField();
		tfAddAdminFirstname.setBounds(480, 163, 116, 20);
		tfAddAdminFirstname.setColumns(10);
		
		tfAddAdminMiddlename = new JTextField();
		tfAddAdminMiddlename.setBounds(631, 163, 116, 20);
		tfAddAdminMiddlename.setColumns(10);
		
		tfAddAdminLastname = new JTextField();
		tfAddAdminLastname.setBounds(779, 163, 116, 20);
		tfAddAdminLastname.setColumns(10);
		
		lblAddAdminFirstname = new JLabel("First Name");
		lblAddAdminFirstname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminFirstname.setBounds(508, 183, 72, 14);
		
		lblAddAdminMiddlename = new JLabel("Middle Name");
		lblAddAdminMiddlename.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminMiddlename.setBounds(656, 183, 79, 14);
		
		lblAddAdminLastname = new JLabel("Last Name");
		lblAddAdminLastname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminLastname.setBounds(808, 183, 74, 14);
		
		tfAddAdminBirthdate = new JTextField();
		tfAddAdminBirthdate.setBounds(631, 233, 116, 20);
		tfAddAdminBirthdate.setColumns(10);
		
		lblAddAdminBirthdate = new JLabel("Birthdate (yyyy-mm-dd)");
		lblAddAdminBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminBirthdate.setBounds(620, 253, 200, 14);
		
		tfAddAdminContact = new JTextField();
		tfAddAdminContact.setBounds(631, 293, 116, 20);
		tfAddAdminContact.setColumns(10);
		
		lblAddAdminContact = new JLabel("Contact Number");
		lblAddAdminContact.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminContact.setBounds(644, 313, 150, 14);
		
		tfAddAdminEmail = new JTextField();
		tfAddAdminEmail.setBounds(607, 353, 160, 20);
		tfAddAdminEmail.setColumns(10);
		
		lblAddAdminEmail = new JLabel("Email Address");
		lblAddAdminEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddAdminEmail.setBounds(650, 373, 200, 14);
		
		btnAddAdminClear = new JButton("Clear");
		btnAddAdminClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddAdminClear.setBounds(1000, 413, 153, 26);
		
		btnAddAdminFinish = new JButton("Finish");
		btnAddAdminFinish.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddAdminFinish.setBounds(1173, 411, 144, 26);
		
		btnAddAdminFinish = new JButton("Finish");
		btnAddAdminFinish.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddAdminFinish.setBounds(1173, 411, 144, 26);
		
		btnAddAdminBack = new JButton("");
		btnAddAdminBack.setBackground(new Color(0, 128, 128));
		btnAddAdminBack.setBounds(30, 11, 78, 74);
	}
	
	public JLabel getlblAddAdmin(){
		return lblAddAdmin;
	}
	public JLabel getlblAddAdminUsername(){
		return lblAddAdminUsername;
	}
	public JTextField gettfAddAdminUsername(){
		return tfAddAdminUsername;
	}
	public JLabel getlblAddAdminPassword(){
		return lblAddAdminPassword;
	}
	public JTextField gettfAddAdminPassword(){
		return tfAddAdminPassword;
	}
	public JSeparator getseparatorAddAdmin(){
		return separatorAddAdmin;
	}
	public JTextField gettfAddAdminFirstname(){
		return tfAddAdminFirstname;
	}
	public JTextField gettfAddAdminMiddlename(){
		return tfAddAdminMiddlename;
	}
	public JTextField gettfAddAdminLastname(){
		return tfAddAdminLastname;
	}
	public JLabel getlblAddAdminFirstname(){
		return lblAddAdminFirstname;
	}
	public JLabel getlblAddAdminMiddlename(){
		return lblAddAdminMiddlename;
	}
	public JLabel getlblAddAdminLastname(){
		return lblAddAdminLastname;
	}
	public JTextField gettfAddAdminBirthdate(){
		return tfAddAdminBirthdate;
	}
	public JLabel getlblAddAdminBirthdate(){
		return lblAddAdminBirthdate;
	}
	public JTextField gettfAddAdminContact(){
		return tfAddAdminContact;
	}
	public JLabel getlblAddAdminContact(){
		return lblAddAdminContact;
	}
	public JTextField gettfAddAdminEmail(){
		return tfAddAdminEmail;
	}
	public JLabel getlblAddAdminEmail(){
		return lblAddAdminEmail;
	}
	public JButton getbtnAddAdminClear(){
		return btnAddAdminClear;
	}
	public JButton getbtnAddAdminFinish(){
		return btnAddAdminFinish;
	}
	public JButton getbtnAddAdminBack(){
		return btnAddAdminBack;
	}
}
