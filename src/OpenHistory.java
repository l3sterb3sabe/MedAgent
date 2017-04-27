

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class OpenHistory {

	private JFrame frame;
	static String ctrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenHistory window = new OpenHistory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OpenHistory() {
		initialize();
	}
	
	public void setControlNumber(String control){
		ctrl = control;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 483);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon iconMain = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Main.png")));
		Image imgMain = iconMain.getImage();
		frame.setIconImage(imgMain);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblHistory.setBounds(173, 11, 169, 48);
		frame.getContentPane().add(lblHistory);
		
		try {
			Connection con = functions.DBConnect();
			Statement stmt = con.createStatement();
			String sql = "Select * From patientrecord where ID = " + ctrl;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				final String[] recordDir = rs.getString("history").split(",");
				String[] recordName = new String[recordDir.length];
				for(int i =0 ; i < recordDir.length; i++){
					recordName[i] = functions.getName(recordDir[i]);
					
				}
				final JList list = new JList(recordName);
				list.setBounds(122, 138, 258, 266);
				list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				frame.getContentPane().add(list);
				
				list.addListSelectionListener(
						new ListSelectionListener()
						{

							@Override
							public void valueChanged(ListSelectionEvent e) {
								// TODO Auto-generated method stub
								try {
									Desktop.getDesktop().open(new File(recordDir[list.getSelectedIndex()]));
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
					
						}
				);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		JLabel lblChooseFile = new JLabel("Choose File To Open\r\n");
		lblChooseFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChooseFile.setBounds(182, 95, 148, 21);
		frame.getContentPane().add(lblChooseFile);
	}
}
