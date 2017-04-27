package meds;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ViewTab {

	static JLabel lblViewControlNumber;
	static JTextField tfViewControlNumber;
	static JScrollPane scrollView;
	static JTextArea taViewRecord;
	static JButton btnViewRecord;
	static JLabel lblViewName;
	static JLabel lblViewAge;
	static JLabel lblViewSex;
	static JLabel lblViewFullName;
	static JLabel lblViewPhoto;
	static JLabel lblViewName2;
	static JLabel lblViewAge2;
	static JLabel lblViewSex2;
	final ImageIcon imgDummy = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/dummy pic.png")));
	
	
	public ViewTab(){
		
		lblViewControlNumber = new JLabel("Control Number:");
		lblViewControlNumber.setForeground(new Color(0, 128, 128));
		lblViewControlNumber.setBackground(new Color(255, 255, 255));
		lblViewControlNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViewControlNumber.setBounds(10, 34, 158, 23);
		
		tfViewControlNumber = new JTextField();
		tfViewControlNumber.setBounds(178, 34, 210, 23);
		tfViewControlNumber.setColumns(10);
		
		scrollView = new JScrollPane();
		scrollView.setBounds(10, 81, 949, 372);
		
		taViewRecord = new JTextArea();
		taViewRecord.setEditable(false);
		
		lblViewAge = new JLabel("");
		lblViewAge.setBounds(1030, 296, 93, 18);
		
		lblViewSex = new JLabel("");
		lblViewSex.setBounds(1026, 343, 97, 18);
		
		lblViewFullName = new JLabel("");
		lblViewFullName.setBounds(1032, 248, 280, 23);
		
		lblViewPhoto = new JLabel("");
		lblViewPhoto.setBounds(1045, 11, 230, 206);
		lblViewPhoto.setIcon(imgDummy);
		
		btnViewRecord = new JButton("View Record");
		btnViewRecord.setBackground(new Color(95, 158, 160));
		btnViewRecord.setFont(new Font("Gadugi", Font.BOLD, 14));
		btnViewRecord.setBounds(458, 34, 124, 23);
		
		lblViewName2 = new JLabel("Name: ");
		lblViewName2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblViewName2.setBounds(982, 248, 55, 23);
		
		lblViewAge2 = new JLabel("Age: ");
		lblViewAge2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblViewAge2.setBounds(980, 291, 40, 23);
		
		lblViewSex2 = new JLabel("Sex:");
		lblViewSex2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblViewSex2.setBounds(982, 343, 40, 23);
	}
	
	public JLabel getlblViewControlNumber(){
		return lblViewControlNumber;
	}
	
	public JTextField gettfViewControlNumber(){
		return tfViewControlNumber;
	}
	
	public JScrollPane getscrollView(){
		return scrollView;
	}
	
	public JTextArea gettaViewRecord(){
		return taViewRecord;
	}
	
	public JButton getbtnViewRecord(){
		return btnViewRecord;
	}
	
	public JLabel getlblPViewPhoto(){
		return lblViewPhoto;
	}
	
	public JLabel getlblViewName(){
		return lblViewFullName;
	}
	
	public JLabel getlblViewAge(){
		return lblViewAge;
	}
	
	public JLabel getlblViewSex(){
		return lblViewSex;
	}
	
	public JLabel getlblViewName2(){
		return lblViewName2;
	}
	
	public JLabel getlblViewAge2(){
		return lblViewAge2;
	}
	
	public JLabel getlblViewSex2(){
		return lblViewSex2;
	}
	
}
