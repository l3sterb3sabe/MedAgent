package patient;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Components {

	static JLabel lblPatientLoginControlNumber;
	static JTextField tfPatientLoginControlNumber;
	static JScrollPane scrollPatient;
	static JTextArea taPatientView;
	static JLabel lblPatientViewFullname;
	static JLabel lblPatientViewAge;
	static JLabel lblPatientViewSex;
	static JLabel lblPatientViewPhoto;
	static JButton btnPatientViewHistory2;
	static JButton btnPatientLoginSubmit;
	static JButton btnPatientLoginClear;
	static JButton btnPatientLoginBack;
	static JLabel lblPatientLoginPicture;
	final ImageIcon imgDummy = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/dummy pic.png")));
	ImageIcon imgPatientLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/PatientLogin.jpg")));

	
	public Components(){
		
		lblPatientLoginControlNumber = new JLabel("Control Number");
		lblPatientLoginControlNumber.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblPatientLoginControlNumber.setBounds(581, 295, 181, 27);
		
		tfPatientLoginControlNumber = new JTextField();
		tfPatientLoginControlNumber.setBounds(490, 333, 365, 33);
		tfPatientLoginControlNumber.setColumns(10);
		
		scrollPatient = new JScrollPane();
		scrollPatient.setBounds(10, 201, 949, 372);
		
		taPatientView = new JTextArea();
		taPatientView.setEditable(false);
		
		lblPatientViewFullname = new JLabel("");
		lblPatientViewFullname.setBounds(90, 130, 280, 23);
		
		lblPatientViewAge = new JLabel("");
		lblPatientViewAge.setBounds(360, 133, 93, 18);
		
		lblPatientViewSex = new JLabel("");
		lblPatientViewSex.setBounds(550, 133, 97, 18);
		
		lblPatientViewPhoto = new JLabel("");
		lblPatientViewPhoto.setBounds(1045, 181, 230, 206);
		lblPatientViewPhoto.setIcon(imgDummy);
		
		btnPatientViewHistory2 = new JButton("View Medical History");
		btnPatientViewHistory2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPatientViewHistory2.setBounds(1645, 234, 211, 29);
		
		btnPatientLoginSubmit = new JButton("Submit");
		btnPatientLoginSubmit.setBackground(new Color(95, 158, 160));
		btnPatientLoginSubmit.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnPatientLoginSubmit.setForeground(new Color(0, 0, 0));
		btnPatientLoginSubmit.setBounds(537, 405, 114, 33);
		
		btnPatientLoginClear = new JButton("Clear");
		btnPatientLoginClear.setForeground(Color.BLACK);
		btnPatientLoginClear.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnPatientLoginClear.setBackground(new Color(95, 158, 160));
		btnPatientLoginClear.setBounds(703, 405, 114, 33);
		
		btnPatientLoginBack = new JButton("Back to Menu");
		btnPatientLoginBack.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnPatientLoginBack.setBackground(new Color(245, 245, 220));
		btnPatientLoginBack.setBounds(616, 606, 135, 33);
		
		lblPatientLoginPicture = new JLabel("");
		lblPatientLoginPicture.setIcon(imgPatientLogin);
		lblPatientLoginPicture.setBounds(0, 0, 1362, 705);
	}
	
	public JLabel getlblPatientLoginControlNumber(){
		return lblPatientLoginControlNumber;
	}
	
	public JTextField gettfPatientLoginControlNumber(){
		return tfPatientLoginControlNumber;
	}
	
	public JScrollPane getscrollPatient(){
		return scrollPatient;
	}
	
	public JTextArea gettaPatientView(){
		return taPatientView;
	}
	
	public JLabel getlblPatientViewFullname(){
		return lblPatientViewFullname;
	}
	
	public JLabel getlblPatientViewAge(){
		return lblPatientViewAge;
	}
	
	public JLabel getlblPatientViewSex(){
		return lblPatientViewSex;
	}
	
	public JLabel getlblPatientViewPhoto(){
		return lblPatientViewPhoto;
	}
	
	public JButton getbtnPatientViewHistory2(){
		return btnPatientViewHistory2;
	}
	
	public JButton getbtnPatientLoginSubmit(){
		return btnPatientLoginSubmit;
	}
	
	public JButton getbtnPatientLoginClear(){
		return btnPatientLoginClear;
	}
	
	public JButton getbtnPatientLoginBack(){
		return btnPatientLoginBack;
	}
	
	public JLabel getlblPatientLoginPicture(){
		return lblPatientLoginPicture;
	}
	
}
