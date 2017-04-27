import java.awt.Cursor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Home {

	static JButton btnHomeMedStaff;
	static JLabel lblHomeMedStaff;
	static JButton btnHomePatient;
	static JLabel lblHomePatient;
	static JButton btnHomeAdmin;
	static JLabel lblHomeAdministrator;
	static JLabel lblHomeBackground;
	ImageIcon imgMedLogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MedLogo.jpg")));
	ImageIcon imgMedBtn = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_doctor.gif")));
	
	public Home(){
		
		
		btnHomeMedStaff = new JButton();
		btnHomeMedStaff.setToolTipText("Medical Staff Menu");
		btnHomeMedStaff.setIcon(imgMedBtn);		
		btnHomeMedStaff.setBounds(299, 320, 250, 250);
		btnHomeMedStaff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHomeMedStaff.setContentAreaFilled(false);
		btnHomeMedStaff.setFocusPainted(false);
		btnHomeMedStaff.setRolloverIcon(imgMedLogo);
	}
	
}
