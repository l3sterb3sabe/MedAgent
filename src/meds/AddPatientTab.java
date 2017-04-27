package meds;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class AddPatientTab {

	static JLabel lblCreateControlNumber;
	static JTextField tfCreateControlNumber;
	static JLabel lblCreatePersonal;
	static JLabel lblCreateName;
	static JTextField tfCreateLastName;
	static JTextField tfCreateFirstName;
	static JTextField tfCreateMiddleName;
	static JLabel lblCreateSurname;
	static JLabel lblCreateFirstName;
	static JLabel lblCreateMiddleName;
	static JLabel lblCreateSex;
	static JComboBox<String> comboCreateSex;
	static JLabel lblCreateDateOfBirth;
	static JTextField tfCreateDateOfBirth;
	static JLabel lblCreateBloodType;
	static JTextField tfCreateBloodType;
	static JSeparator separatorCreate;
	static JLabel lblCreateAdditional;
	static JLabel lblCreateAddress;
	static JTextField tfCreateAddress;
	static JLabel lblCreateGuardian;
	static JTextField tfCreateGuardian;
	static JLabel lblCreateRelationship;
	static JTextField tfCreateRelationship;
	static JLabel lblCreateContactPatient;
	static JTextField tfCreateContactPatient;
	static JLabel lblCreateContactGuardian;
	static JTextField tfCreateContactGuardian;
	static JLabel lblCreatePhoto;
	static JButton btnCreateUpload;
	static JButton btnCreateFinish;
	static JButton btnCreateClear;
	static JButton btnMedicalBack;
	static JLabel lblCreatePicture;
	final ImageIcon imgDummy = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/dummy pic.png")));
	final ImageIcon imgMedTab = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/medtabbed.jpg")));
	
	public AddPatientTab(){
		
		lblCreateControlNumber = new JLabel("Control Number: ");
		lblCreateControlNumber.setForeground(new Color(0, 128, 128));
		lblCreateControlNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCreateControlNumber.setBounds(48, 31, 130, 23);
		
		tfCreateControlNumber = new JTextField();
		tfCreateControlNumber.setBounds(181, 31, 197, 23);
		tfCreateControlNumber.setColumns(10);
		
		lblCreatePersonal = new JLabel("PERSONAL INFORMATION");
		lblCreatePersonal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCreatePersonal.setBounds(21, 92, 225, 23);
		
		lblCreateName = new JLabel("Name :");
		lblCreateName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateName.setBounds(21, 138, 56, 23);
		
		tfCreateLastName = new JTextField();
		tfCreateLastName.setBounds(75, 139, 139, 23);
		tfCreateLastName.setColumns(10);
		
		tfCreateFirstName = new JTextField();
		tfCreateFirstName.setBounds(235, 139, 139, 23);
		tfCreateFirstName.setColumns(10);
		
		tfCreateMiddleName = new JTextField();
		tfCreateMiddleName.setBounds(396, 139, 139, 23);
		tfCreateMiddleName.setColumns(10);
		
		lblCreateSurname = new JLabel("Last Name");
		lblCreateSurname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreateSurname.setBounds(75, 162, 65, 23);
		
		lblCreateFirstName = new JLabel("First Name");
		lblCreateFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreateFirstName.setBounds(235, 162, 59, 23);
		
		lblCreateMiddleName = new JLabel("Middle Name");
		lblCreateMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreateMiddleName.setBounds(396, 162, 76, 23);
		
		lblCreateSex = new JLabel("Sex :");
		lblCreateSex.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateSex.setBounds(24, 207, 39, 23);
		
		comboCreateSex = new JComboBox<String>();
		comboCreateSex.setBounds(75, 209, 103, 21);
		comboCreateSex.addItem("Select One");
		comboCreateSex.addItem("Male");
		comboCreateSex.addItem("Female");
		
		lblCreateDateOfBirth = new JLabel("Date of Birth(yyyy-mm-dd): ");
		lblCreateDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateDateOfBirth.setBounds(21, 270, 197, 23);
		
		tfCreateDateOfBirth = new JTextField();
		tfCreateDateOfBirth.setBounds(217, 272, 139, 21);
		tfCreateDateOfBirth.setColumns(10);
		
		lblCreateBloodType = new JLabel("Blood Type:");
		lblCreateBloodType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateBloodType.setBounds(21, 319, 87, 23);
		
		tfCreateBloodType = new JTextField();
		tfCreateBloodType.setBounds(118, 320, 76, 23);
		tfCreateBloodType.setColumns(10);
		
		separatorCreate = new JSeparator();
		separatorCreate.setOrientation(SwingConstants.VERTICAL);
		separatorCreate.setBounds(545, 77, 10, 376);
		
		lblCreateAdditional = new JLabel("ADDITIONAL INFORMATION");
		lblCreateAdditional.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCreateAdditional.setBounds(565, 92, 209, 23);
		
		lblCreateAddress = new JLabel("Address : ");
		lblCreateAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateAddress.setBounds(565, 138, 76, 23);
		
		tfCreateAddress = new JTextField();
		tfCreateAddress.setBounds(651, 139, 466, 23);
		tfCreateAddress.setColumns(10);
		
		lblCreateGuardian = new JLabel("Name of Guardian:");
		lblCreateGuardian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateGuardian.setBounds(565, 207, 130, 23);
		
		tfCreateGuardian = new JTextField();
		tfCreateGuardian.setBounds(693, 208, 197, 23);
		tfCreateGuardian.setColumns(10);
		
		lblCreateRelationship = new JLabel("Relationship to Guardian: ");
		lblCreateRelationship.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateRelationship.setBounds(565, 255, 182, 23);
		
		tfCreateRelationship = new JTextField();
		tfCreateRelationship.setBounds(743, 257, 207, 21);
		tfCreateRelationship.setColumns(10);
		
		lblCreateContactPatient = new JLabel("Contact No. of the Patient:");
		lblCreateContactPatient.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateContactPatient.setBounds(565, 300, 209, 23);
		
		tfCreateContactPatient = new JTextField();
		tfCreateContactPatient.setBounds(753, 301, 197, 23);
		tfCreateContactPatient.setColumns(10);
		
		lblCreateContactGuardian = new JLabel("Contact No. of the Guardian:");
		lblCreateContactGuardian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateContactGuardian.setBounds(565, 353, 197, 18);
		
		tfCreateContactGuardian = new JTextField();
		tfCreateContactGuardian.setBounds(772, 352, 207, 23);
		tfCreateContactGuardian.setColumns(10);
		
		lblCreatePhoto = new JLabel("");
		lblCreatePhoto.setBackground(new Color(224, 255, 255));
		lblCreatePhoto.setIcon(imgDummy);
		lblCreatePhoto.setBounds(1146, 13, 190, 172);
		
		btnCreateUpload = new JButton("Upload Picture");
		btnCreateUpload.setBounds(1170, 195, 130, 23);
		
		btnCreateFinish = new JButton("Finish");
		btnCreateFinish.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCreateFinish.setBounds(1214, 418, 109, 23);
		
		btnCreateClear = new JButton("Clear");
		btnCreateClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCreateClear.setBounds(1088, 419, 109, 22);
		
		lblCreatePicture = new JLabel("");
		lblCreatePicture.setIcon(imgMedTab);
		lblCreatePicture.setBounds(0, 0, 1362, 705);
	}
	
	public JLabel getlblCreateControlNumber(){
		return lblCreateControlNumber;
	}
	public JTextField gettfCreateControlNumber(){
		return tfCreateControlNumber;
	}
	public JLabel getlblCreatePersonal(){
		return lblCreatePersonal;
	}
	public JLabel getlblCreateName(){
		return lblCreateName;
	}
	public JTextField gettfCreateLastName(){
		return tfCreateLastName;
	}
	public JTextField gettfCreateFirstName(){
		return tfCreateFirstName;
	}
	public JTextField gettfCreateMiddleName(){
		return tfCreateMiddleName;
	}
	public JLabel getlblCreateSurname(){
		return lblCreateSurname;
	}
	public JLabel getlblCreateFirstName(){
		return lblCreateFirstName;
	}
	public JLabel getlblCreateMidleName(){
		return lblCreateMiddleName;
	}
	public JLabel getlblCreateSex(){
		return lblCreateSex;
	}
	public JComboBox<String> getcomboCreateSex(){
		return comboCreateSex;
	}
	public JLabel getlblCreateDateOfBirth(){
		return lblCreateDateOfBirth;
	}
	public JTextField gettfCreateDateOfBirth(){
		return tfCreateDateOfBirth;
	}
	public JLabel getlblCreateBloodType(){
		return lblCreateBloodType;
	}
	
	public JTextField gettfCreateBloodType(){
		return tfCreateBloodType;
	}
	
	public JSeparator getseparatorCreate(){
		return separatorCreate;
	}
	
	public JLabel getlblCreateAdditional(){
		return lblCreateAdditional;
	}
	
	public JLabel getlblCreateAddress(){
		return lblCreateAddress;
	}
	
	public JTextField gettfCreateAddress(){
		return tfCreateAddress;
	}
	
	public JLabel getlblCreateGuardian(){
		return lblCreateGuardian;
	}
	
	public JTextField gettfCreateGuardian(){
		return tfCreateGuardian;
	}
	
	public JLabel getlblCreateRelationship(){
		return lblCreateRelationship;
	}
	
	public JTextField gettfCreateRelationship(){
		return tfCreateRelationship;
	}
	
	public JLabel getlblCreateContactPatient(){
		return lblCreateContactPatient;
	}
	
	public JTextField gettfCreateContactPatient(){
		return tfCreateContactPatient;
	}
	
	public JLabel getlblCreateContactGuardian(){
		return lblCreateContactGuardian;
	}
	
	public JTextField gettfCreateContactGuardian(){
		return tfCreateContactGuardian;
	}
	
	public JLabel getlblCreatePhoto(){
		return lblCreatePhoto;
	}
	
	public JButton getbtnCreateUpload(){
		return btnCreateUpload;
	}
	
	public JButton getbtnCreateFinish(){
		return btnCreateFinish;
	}
	
	public JButton getbtnCreateClear(){
		return btnCreateClear;
	}
	
	public JButton getbtnCreateBack(){
		return btnMedicalBack;
	}
	
	public JLabel getlblCreatePicture(){
		return lblCreatePicture;
	}
}
