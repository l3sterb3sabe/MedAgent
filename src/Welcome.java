import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Welcome {

	static JLabel lblWelcomeHourGlass;
	static JLabel lblWelcomePic;
	ImageIcon imgLoading = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hourglass.gif")));
	ImageIcon imgWelcome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Welcome.jpg")));

	public Welcome(){
		
		lblWelcomeHourGlass = new JLabel("");
		lblWelcomeHourGlass.setBounds(639, 372, 239, 247);
		lblWelcomeHourGlass.setIcon(imgLoading);
		
		lblWelcomePic = new JLabel("");
		lblWelcomePic.setBounds(0, 0, 1362, 705);
		lblWelcomePic.setIcon(imgWelcome);
	}
	
	public static JLabel getlblWelcomeHourGlass(){
		return lblWelcomeHourGlass;
	}
}
