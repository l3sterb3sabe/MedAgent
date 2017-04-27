package patient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Tab {

	static JLabel lblPatientControlNumber;
	static JTextArea taPatientStatus;
	static JLabel lblPatientViewName;
	static JLabel lblPatientAge;
	static JLabel lblPatientSex;
	static JLabel lblPatientBackground;
	static JButton btnPatientViewHistory;
	ImageIcon imgPatientTab = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/patienttabbed.jpg")));

	
	public Tab(){
		
		lblPatientControlNumber = new JLabel(""); 
		lblPatientControlNumber.setBounds(166, 126, 210, 24);
		
		taPatientStatus = new JTextArea();
		taPatientStatus.setBackground(new Color(175, 238, 238));
		
		lblPatientViewName = new JLabel("Name: ");
		lblPatientViewName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientViewName.setBounds(40, 130, 55, 23);
		
		lblPatientAge = new JLabel("Age: ");
		lblPatientAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientAge.setBounds(330, 130, 40, 23);
		
		lblPatientSex = new JLabel("Gender:");
		lblPatientSex.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPatientSex.setBounds(500, 130, 60, 23);
		
		
		
		lblPatientBackground = new JLabel("");
		lblPatientBackground.setIcon(imgPatientTab);
		lblPatientBackground.setBounds(0, 0, 1362, 705);
		
		btnPatientViewHistory = new JButton("View Patient History");
		btnPatientViewHistory.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPatientViewHistory.setBounds(1051, 511, 211, 29);
	}
	
	
	public JLabel getlblPatientControlNumber(){
		return lblPatientControlNumber;
	}
	
	public JTextArea gettaPatientStatus(){
		return taPatientStatus;
	}
	
	public JLabel getlblPatientViewName(){
		return lblPatientViewName;
	}
	
	public JLabel getlblPatientAge(){
		return lblPatientAge;
	}
	
	public JLabel getlblPatientSex(){
		return lblPatientSex;
	}
	
	public JLabel getlblPatientBackground(){
		return lblPatientBackground;
	}
	
	public JButton getbtnPatientViewHistory(){
		return btnPatientViewHistory;
	}
}
