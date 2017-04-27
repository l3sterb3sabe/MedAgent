import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;

public class AddReports{

	private JFrame frame;
	static String history = "";
	static String ctrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					AddReports window = new AddReports();
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
	public AddReports() {
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
		frame.setBounds(100, 100, 613, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMedicalReports = new JLabel("Medical Reports");
		lblMedicalReports.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 35));
		lblMedicalReports.setBounds(169, 18, 244, 44);
		frame.getContentPane().add(lblMedicalReports);
		
		final JTextArea taRecords = new JTextArea();
		taRecords.setWrapStyleWord(true);
		taRecords.setBounds(140, 115, 322, 252);
		frame.getContentPane().add(taRecords);
		
		final JButton btnBrowseReports = new JButton("Browse Reports");
		btnBrowseReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser jfc = new JFileChooser();
				jfc.setCurrentDirectory(new java.io.File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath()));
				jfc.setDialogTitle("Browse Medical Reports");
				jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				jfc.setMultiSelectionEnabled(true);
				if(jfc.showOpenDialog(btnBrowseReports) == JFileChooser.APPROVE_OPTION){
					
				}
				try {
					Connection con = functions.DBConnect();
					Statement stmt = con.createStatement();
					String sqlSelect = "select * from patientrecord where ID = "+ ctrl;
					ResultSet rs = stmt.executeQuery(sqlSelect);
					while(rs.next()){
						System.out.println(rs.getString("history"));
						if(rs.getString("history")!=null){
							history = rs.getString("history");
						}
					}
						
				
					File[] file = jfc.getSelectedFiles();
					for(File f : file){
						File fg = new File(f.getAbsolutePath());
						System.out.println(fg.getName());
						history = history+ f.getAbsolutePath() + ",";
						
						
					}
					taRecords.setText("");
					for(File fg: file){
						taRecords.append(functions.getName(fg.getAbsolutePath()));
						taRecords.append("\n");
					}
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBrowseReports.setBounds(199, 81, 183, 23);
		frame.getContentPane().add(btnBrowseReports);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				try {
					con = functions.DBConnect();
				
					String preparedInsert = "UPDATE patientrecord SET history = ? WHERE ID = ? ";
					PreparedStatement pstmt = con.prepareStatement(preparedInsert);
					pstmt.setString(1, history);
					pstmt.setString(2, ctrl);
					
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Successfully Recorded");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(140, 384, 152, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taRecords.setText("");
				history = "";
			}
		});
		btnClear.setBounds(322, 384, 140, 23);
		frame.getContentPane().add(btnClear);
		
	
	}
}
