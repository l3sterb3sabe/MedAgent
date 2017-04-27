package admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class AddMedicalStaff {
	
	static JLabel lblAddMedicalStaff;
	static JLabel lblAddMedUsername;
	static JTextField tfAddMedUsername;
	static JLabel lblAddMedPassword;
	static JTextField tfAddMedPassword;
	static JSeparator separatorAddMed;
	static JTextField tfAddMedFirstName;
	static JTextField tfAddMedMiddleName;
	static JTextField tfAddMedLastName;
	static JLabel lblAddMedFirstName;
	static JLabel lblAddMedMiddleName;
	static JLabel lblAddMedLastName;
	static JLabel lblAddMedCategory;
	static JComboBox<String> comboAddMedCategory;
	static JLabel lblAddMedBirthdate;
	static JTextField tfAddMedBirthdate;
	static JLabel lblAddMedAddress;
	static JTextField tfAddMedAddress;
	static JLabel lblAddMedTelephoneNo;
	static JTextField tfAddMedTelephoneNo;
	static JLabel lblAddMedCellphoneNo;
	static JTextField tfAddMedCellphoneNo;
	static JLabel lblAddMedPhoto;
	static JButton btnAddMedUpload;
	static JButton btnAddMedFinish;
	static JButton btnAddMedClear;
	final ImageIcon imgDummy = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/dummy pic.png")));

	
	
	
	public AddMedicalStaff(){
		
		lblAddMedicalStaff = new JLabel("Add Medical Staff");
		lblAddMedicalStaff.setFont(new Font("Finale Copyist Text Ext", Font.BOLD, 25));
		lblAddMedicalStaff.setBounds(571, 11, 217, 26);
		
		lblAddMedUsername = new JLabel("Username: ");
		lblAddMedUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddMedUsername.setBounds(543, 66, 85, 20);
		
		tfAddMedUsername = new JTextField();
		tfAddMedUsername.setBounds(640, 65, 199, 26);
		tfAddMedUsername.setColumns(10);
		
		lblAddMedPassword = new JLabel("Password: ");
		lblAddMedPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddMedPassword.setBounds(543, 104, 85, 20);
		
		tfAddMedPassword = new JTextField();
		tfAddMedPassword.setBounds(640, 102, 199, 26);
		tfAddMedPassword.setColumns(10);
		
		separatorAddMed = new JSeparator();
		separatorAddMed.setForeground(new Color(100, 149, 237));
		separatorAddMed.setBounds(497, 143, 379, 9);
		
		tfAddMedFirstName = new JTextField();
		tfAddMedFirstName.setBounds(480, 163, 116, 20);
		tfAddMedFirstName.setColumns(10);
		
		tfAddMedMiddleName = new JTextField();
		tfAddMedMiddleName.setBounds(631, 163, 116, 20);
		tfAddMedMiddleName.setColumns(10);
		
		tfAddMedLastName = new JTextField();
		tfAddMedLastName.setBounds(779, 163, 116, 20);
		tfAddMedLastName.setColumns(10);
		
		lblAddMedFirstName = new JLabel("First Name");
		lblAddMedFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedFirstName.setBounds(508, 183, 72, 14);
		
		lblAddMedFirstName = new JLabel("First Name");
		lblAddMedFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedFirstName.setBounds(508, 183, 72, 14);
		
		lblAddMedMiddleName = new JLabel("Middle Name");
		lblAddMedMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedMiddleName.setBounds(656, 183, 79, 14);
		
		lblAddMedLastName = new JLabel("Last Name");
		lblAddMedLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedLastName.setBounds(808, 183, 74, 14);
		
		lblAddMedCategory = new JLabel("Category: ");
		lblAddMedCategory.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedCategory.setBounds(508, 226, 65, 20);
		
		comboAddMedCategory = new JComboBox<String>();
		comboAddMedCategory.setBounds(582, 227, 153, 20);
		comboAddMedCategory.addItem("Nursing Care Unit");
		comboAddMedCategory.addItem("Medical Doctor");
		comboAddMedCategory.addItem("Anesthesiology");
		comboAddMedCategory.addItem("Cardiology");
		comboAddMedCategory.addItem("Dermatology");
		comboAddMedCategory.addItem("Endocrinology");
		comboAddMedCategory.addItem("Gastroenterology");
		comboAddMedCategory.addItem("General Surgery");
		comboAddMedCategory.addItem("Hematology");
		comboAddMedCategory.addItem("Immunology");
		comboAddMedCategory.addItem("Nephrology");
		comboAddMedCategory.addItem("Neurology");
		comboAddMedCategory.addItem("Obstetrics/Gynecology");
		comboAddMedCategory.addItem("Oncology");
		comboAddMedCategory.addItem("Ophthalmology");
		comboAddMedCategory.addItem("Orthopedics");
		comboAddMedCategory.addItem("Otorhinolaryngology");
		comboAddMedCategory.addItem("Physical Therapy");
		comboAddMedCategory.addItem("Psychiatry");
		comboAddMedCategory.addItem("Pulmonary");
		comboAddMedCategory.addItem("Radiology");
		
		lblAddMedBirthdate = new JLabel("Birthdate (yyyy-mm-dd): ");
		lblAddMedBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedBirthdate.setBounds(508, 268, 200, 20);
		
		tfAddMedBirthdate = new JTextField();
		tfAddMedBirthdate.setBounds(655, 269, 140, 19);
		tfAddMedBirthdate.setColumns(10);
		
		lblAddMedAddress = new JLabel("Address: ");
		lblAddMedAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedAddress.setBounds(508, 309, 55, 20);
		
		tfAddMedAddress = new JTextField();
		tfAddMedAddress.setBounds(582, 310, 330, 19);
		tfAddMedAddress.setColumns(10);
		
		lblAddMedTelephoneNo = new JLabel("Telephone No.:");
		lblAddMedTelephoneNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedTelephoneNo.setBounds(508, 355, 88, 20);
		
		tfAddMedTelephoneNo = new JTextField();
		tfAddMedTelephoneNo.setBounds(606, 356, 141, 20);
		tfAddMedTelephoneNo.setColumns(10);
		
		lblAddMedCellphoneNo = new JLabel("Cellphone No. :");
		lblAddMedCellphoneNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddMedCellphoneNo.setBounds(508, 397, 88, 14);
		
		tfAddMedCellphoneNo = new JTextField();
		tfAddMedCellphoneNo.setBounds(606, 395, 141, 20);
		tfAddMedCellphoneNo.setColumns(10);
		
		lblAddMedPhoto = new JLabel("");
		lblAddMedPhoto.setBounds(1146, 11, 190, 173);
		lblAddMedPhoto.setIcon(imgDummy);
		
		btnAddMedUpload = new JButton("Upload Photo");
		btnAddMedUpload.setBounds(1173, 198, 141, 26);
		
		btnAddMedFinish = new JButton("Finish");
		btnAddMedFinish.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddMedFinish.setBounds(1173, 411, 144, 26);
		
		btnAddMedClear = new JButton("Clear");
		btnAddMedClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddMedClear.setBounds(1000, 413, 153, 26);
		
	}
	public JLabel getlblAddMedicalStaff(){
		return lblAddMedicalStaff;
	}
	public JLabel getlblAddMedUsername(){
		return lblAddMedUsername;
	}
	public JTextField gettfAddMedUsername(){
		return tfAddMedUsername;
	}
	public JLabel getlblAddMedPassword(){
		return lblAddMedPassword;
	}
	public JTextField gettfAddMedPassword(){
		return tfAddMedPassword;
	}
	public JSeparator getseparatorAddMed(){
		return separatorAddMed;
	}
	public JTextField gettfAddMedFirstName(){
		return tfAddMedFirstName;
	}
	public JTextField gettfAddMedMiddleName(){
		return tfAddMedMiddleName;
	}
	public JTextField gettfAddMedLastName(){
		return tfAddMedLastName;
	}
	public JLabel getlblAddMedFirstName(){
		return lblAddMedFirstName;
	}
	public JLabel getlblAddMedMiddleName(){
		return lblAddMedMiddleName;
	}
	public JLabel getlblAddMedLastName(){
		return lblAddMedLastName;
	}
	public JLabel getlblAddMedCategory(){
		return lblAddMedCategory;
	}
	public JComboBox getcomboAddMedCategory(){
		return comboAddMedCategory;
	}
	public JLabel getlblAddMedBirthdate(){
		return lblAddMedBirthdate;
	}
	public JTextField gettfAddMedBirthdate(){
		return tfAddMedBirthdate;
	}
	public JLabel getlblAddMedAddress(){
		return lblAddMedAddress;
	}
	public JTextField gettfAddMedAddress(){
		return tfAddMedAddress;
	}
	public JLabel getlblAddMedTelephoneNo(){
		return lblAddMedTelephoneNo;
	}
	public JTextField gettfAddMedTelephoneNo(){
		return tfAddMedTelephoneNo;
	}
	public JLabel getlblAddMedCellphoneNo(){
		return lblAddMedCellphoneNo;
	}
	public JTextField gettfAddMedCellphoneNo(){
		return tfAddMedCellphoneNo;
	}
	public JLabel getlblAddMedPhoto(){
		return lblAddMedPhoto;
	}
	public JButton getbtnAddMedUpload(){
		return btnAddMedUpload;
	}
	public JButton getbtnAddMedFinish(){
		return btnAddMedFinish;
	}
	public JButton getbtnAddMedClear(){
		return btnAddMedClear;
	}

}
