import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.StringUtils;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import meds.*;

public class Frame {

	private JFrame frmMedAgent;
	private static JTextField tfMedLoginUsername;
	private static JPasswordField pfMedLoginPassword;
	private static JTextField tfPatientLoginControlNumber;
	private static JTextField tfAdminLoginUsername;
	private static JPasswordField pfAdminLoginPassword;
	private static JTextField tfMedTabCN;
	private static JTextField tfMedTabDate;
	private static JTextField tfMedTabAssessor;
	private static JTextField tfMedTabHeight;
	private static JTextField tfMedTabWeight;
	private static JTextField tfMedTabBP;
	private static JTextField tfMedTabTemp;
	private static JTextField tfMedTabCNView;
	private static String check;
	private static JTextField tfCreatePCN;
	private static JTextField tfLastN;
	private static JTextField tfFirstN;
	private static JTextField tfMidN;
	private static JTextField tfDateBirth;
	private static JTextField tfCreateBloodType;
	private static JTextField tfAddress;
	private static JTextField tfCreateGuardian;
	private static JTextField tfRelationship;
	private static JTextField tfContactPatient;
	private static JTextField tfContactGuardian;
	private static JTextField tfAddMedUsername;
	private static JTextField tfAddMedPassword;
	private static JTextField tfAddMedFirstName;
	private static JTextField tfAddMedMiddleName;
	private static JTextField tfAddMedLastName;
	private static JTextField tfAddMedBirthdate;
	private static JTextField tfAddMedAddress;
	private static JTextField tfAddMedTelephoneNo;
	private static JTextField tfAddMedCellphoneNo;
	private static String inputstream;
	private static ArrayList<String> listSymp = new ArrayList<String>();
	private static ArrayList<String> listSide = new ArrayList<String>();
	static String dateformat = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	static String date = dateformat;
	static String strCategory;
	static String strSex;
	static String lnamelist=null;
	static String fnamelist=null;
	static String mnamelist=null;
	static String ctrl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Setting the Look and Feel of Window
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					Frame window = new Frame();
					window.frmMedAgent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "deprecation", "unchecked" })

	private void initialize() {
		frmMedAgent = new JFrame();
		frmMedAgent.setResizable(true);
		frmMedAgent.setTitle("MedAgent v2.0");
		ImageIcon iconMain = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Main.png")));
		Image imgMain = iconMain.getImage();
		frmMedAgent.setIconImage(imgMain);
		frmMedAgent.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmMedAgent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMedAgent.getContentPane().setLayout(null);
		
		//Images
		ImageIcon imgBackground = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Background.jpg")));
		ImageIcon imgAssess = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assess2.jpg")));
		ImageIcon imgView = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("view2.jpg")));
		ImageIcon imgCreate = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("patientadd.jpg")));
		ImageIcon imgMedList= new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("medlist.jpg")));
		ImageIcon imgPatientList = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("patientlist.jpg")));
		ImageIcon imgAdminTab = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("admintabbed.jpg")));
		ImageIcon imgMedLogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MedLogo.jpg")));
		ImageIcon imgPatientLogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PatientLogo.jpg")));
		ImageIcon imgAdminLogo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminLogo.jpg")));
		ImageIcon imgMedTab = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("medtabbed.jpg")));
		ImageIcon imgMedLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MSLogin.jpg")));
		ImageIcon imgAdminLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminLogin.jpg")));
		ImageIcon imgPatientLogin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PatientLogin.jpg")));
		ImageIcon imgPatientTab = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("patienttabbed.jpg")));
		ImageIcon imgMedAdd = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("medadd.jpg")));
		ImageIcon imgWelcome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Welcome.jpg")));
		ImageIcon imgLoading = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("hourglass.gif")));
		ImageIcon imgHome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("home.jpg")));
		final ImageIcon imgDummy = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dummy pic.png")));
		ImageIcon imgAdmin = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminIcon2.jpg")));
		ImageIcon imgAdminList = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AdminList.jpg")));
		ImageIcon imgMedBtn = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon_doctor.gif")));
		ImageIcon imgPatientBtn = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("patient-512.jpg")));
		ImageIcon imgAdminBtn = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Key-icon.png")));
		final ImageIcon pic = imgDummy;
		
		final JPanel panelAdminTabbed = new JPanel();
		panelAdminTabbed.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelAdminTabbed);
		panelAdminTabbed.show(false);
		panelAdminTabbed.setLayout(null);
		
		final JPanel panelWelcome = new JPanel();
		panelWelcome.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelWelcome);
		panelWelcome.setLayout(null);
		
		JLabel lblWelcomeHourGlass = new JLabel("");
		lblWelcomeHourGlass.setBounds(639, 372, 239, 247);
		lblWelcomeHourGlass.setIcon(imgLoading);
		panelWelcome.add(lblWelcomeHourGlass);
		
		JLabel lblWelcomePic = new JLabel("");
		lblWelcomePic.setBounds(0, 0, 1362, 705);
		lblWelcomePic.setIcon(imgWelcome);
		panelWelcome.add(lblWelcomePic);
		
		final JPanel panelHome = new JPanel();
		panelHome.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelHome);
		panelHome.show(false);
		panelHome.setLayout(null);
		
		int timer = 5555;
		ActionListener display = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panelWelcome.show(false);
				panelHome.show(true);
			}
		};
		Timer time = new Timer(timer, display);
		time.setRepeats(false);
		time.start();
		
		// MedTabbed
				final JPanel panelMedTabbed = new JPanel();
				panelMedTabbed.setBounds(0, 0, 1362, 705);
				frmMedAgent.getContentPane().add(panelMedTabbed);
				panelMedTabbed.show(false);
				panelMedTabbed.setLayout(null);
		
		//Patient Tab	
				final JPanel panelPatientTabbed = new JPanel();
				panelPatientTabbed.setBounds(0, 0, 1362, 705);
				frmMedAgent.getContentPane().add(panelPatientTabbed);
				panelPatientTabbed.show(false);
				panelPatientTabbed.setLayout(null);
		/******************************************* Med Login *********************************************/
		final JPanel panelMedLogin = new JPanel();
		panelMedLogin.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelMedLogin);
		panelMedLogin.show(false);
		panelMedLogin.setLayout(null);
		
		meds.Login medLogin = new meds.Login();
		
		//Medical Staff Login
		JLabel lblMedLoginUsername = medLogin.getlblMedLoginUsername();
		panelMedLogin.add(lblMedLoginUsername);
		
		tfMedLoginUsername = medLogin.gettfMedLoginUsername();
		panelMedLogin.add(tfMedLoginUsername);
		
		JLabel lblMedLoginPassword = new JLabel("Password : ");
		lblMedLoginPassword.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblMedLoginPassword.setBounds(488, 309, 110, 31);
		panelMedLogin.add(lblMedLoginPassword);
		
		pfMedLoginPassword = medLogin.getpfMedLoginPassword();
		panelMedLogin.add(pfMedLoginPassword);
		pfMedLoginPassword.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER){
					try {
						Connection con = functions.DBConnect();
						check = functions.validation(con, tfMedLoginUsername.getText(), pfMedLoginPassword.getText(), 1);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(check.equals("granted")){
						panelMedLogin.show(false);
						panelMedTabbed.show(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
					}
				}
	
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton btnMedLoginSubmit = medLogin.getbtnMedLoginSubmit();
		panelMedLogin.add(btnMedLoginSubmit);
		btnMedLoginSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					Connection con = functions.DBConnect();
					check = functions.validation(con, tfMedLoginUsername.getText(), pfMedLoginPassword.getText(), 1);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(check.equals("granted")){
					
					panelMedLogin.show(false);
					panelMedTabbed.show(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JButton btnMedLoginClear = medLogin.getbtnMedLoginClear();
		panelMedLogin.add(btnMedLoginClear);
		btnMedLoginClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfMedLoginUsername.setText("");
				pfMedLoginPassword.setText("");
			}
		});
		
		JButton btnMedLoginBack = medLogin.getbtnMedLoginBack();
		panelMedLogin.add(btnMedLoginBack);
		btnMedLoginBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfMedLoginUsername.setText("");
				pfMedLoginPassword.setText("");
			}
		});
		
		JLabel lblMedLoginPicture = medLogin.getlblMedLoginPicture();
		panelMedLogin.add(lblMedLoginPicture);
		
	
		
		btnMedLoginBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMedLogin.show(false);
				panelHome.show(true);
			}
		});
		
		/******************************************** end Med Login **********************************************/
		
		/******************************************** Patient *****************************************/
		final JPanel panelPatientLogin = new JPanel();
		panelPatientLogin.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelPatientLogin);
		panelPatientLogin.show(false);
		panelPatientLogin.setLayout(null);
		
		patient.Components patient = new patient.Components();
		
		//Patient Login
		JLabel lblPatientLoginControlNumber = patient.getlblPatientLoginControlNumber();
		panelPatientLogin.add(lblPatientLoginControlNumber);
		
		tfPatientLoginControlNumber = patient.gettfPatientLoginControlNumber();
		panelPatientLogin.add(tfPatientLoginControlNumber);
		String strCntrlnum = tfPatientLoginControlNumber.getText().toString();
		
		JScrollPane scrollPatient = patient.getscrollPatient();
		panelPatientTabbed.add(scrollPatient);
		
		final JTextArea taPatientView = patient.gettaPatientView();
		scrollPatient.setViewportView(taPatientView);
		
		final JLabel lblPatientViewFullname = patient.getlblPatientViewFullname();
		panelPatientTabbed.add(lblPatientViewFullname);
		
		final JLabel lblPatientViewAge = patient.getlblPatientViewAge();
		panelPatientTabbed.add(lblPatientViewAge);
		
		final JLabel lblPatientViewSex = patient.getlblPatientViewSex();
		panelPatientTabbed.add(lblPatientViewSex);

		final JLabel lblPatientViewPhoto = patient.getlblPatientViewPhoto();
		panelPatientTabbed.add(lblPatientViewPhoto);
		
		
		JButton btnPatientLoginSubmit = patient.getbtnPatientLoginSubmit();
		panelPatientLogin.add(btnPatientLoginSubmit);
		btnPatientLoginSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					Connection con = functions.DBConnect();
					check = functions.validation(con, null, tfPatientLoginControlNumber.getText(), 2);///////////////////////////////////////////////
					
				} catch (Exception e1) {
				
					e1.printStackTrace();
				}
				if(check.equals("granted")){
					ctrl = tfPatientLoginControlNumber.getText();
					panelPatientLogin.show(false);
					panelPatientTabbed.show(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid Control Number", "Access Denied", JOptionPane.ERROR_MESSAGE);			
			try {
				Connection con = functions.DBConnect();
				Statement stmt = con.createStatement();
				
				String control = tfPatientLoginControlNumber.getText();
				String sql = "select * from patientrecord "
						+ "where ID = " + control;
				ResultSet rs = stmt.executeQuery(sql);
				File file = new File(control + ".txt");
				FileOutputStream out = new FileOutputStream(file);
				
				if(rs.next()){
					String bday = rs.getString("bdate");
					int age = functions.ageCalcu(dateformat, bday);
					lblPatientViewAge.setText(Integer.toString(age));
					InputStream in = rs.getBinaryStream("assess");
					
					byte[] buffer = new byte[1024];
					if(in!=null){
						while(in.read(buffer)>0)
							out.write(buffer);
					}
				}
				String lname = rs.getString("LASTNAME");
				String mname = rs.getString("MIDDLENAME");
				String fname = rs.getString("FIRSTNAME");
				String sex = rs.getString("sex");
				byte[] picture = rs.getBytes("picture");
				ImageIcon pic = new ImageIcon(picture);
				Image image = pic.getImage();
				Image newimg = image.getScaledInstance(230, 206,  java.awt.Image.SCALE_SMOOTH);
				pic = new ImageIcon(newimg);
				BufferedReader br = new BufferedReader(new FileReader(file));
				taPatientView.read(br, null);
				lblPatientViewFullname.setText(fname + " " + mname + " " + lname);
				lblPatientViewSex.setText(sex);
				lblPatientViewPhoto.setIcon(pic);
				br.close();
				taPatientView.requestFocus();
				out.close();
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}///public void actionperformed
		});//btPsubmit
		
		JButton btnPatientLoginClear = patient.getbtnPatientLoginClear();
		panelPatientLogin.add(btnPatientLoginClear);
		btnPatientLoginClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfPatientLoginControlNumber.setText("");
			}
		});
		
		JButton btnPatientLoginBack = patient.getbtnPatientLoginBack();
		
		panelPatientLogin.add(btnPatientLoginBack);
		
		JLabel lblPatientLoginPicture = patient.getlblPatientLoginPicture();
		panelPatientLogin.add(lblPatientLoginPicture);
		
		btnPatientLoginBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panelPatientLogin.show(false);
				panelHome.show(true);
			}
		});
		
		/********************************************** end Patient *******************************************/

		final JPanel panelAdLogin = new JPanel();
		panelAdLogin.setBounds(0, 0, 1362, 705);
		frmMedAgent.getContentPane().add(panelAdLogin);
		panelAdLogin.show(false);
		panelAdLogin.setLayout(null);
		
		/******************************************** Home Window ********************************************/
		
		JButton btnHomeMedStaff = new JButton();
		btnHomeMedStaff.setToolTipText("Medical Staff Menu");
		btnHomeMedStaff.setIcon(imgMedBtn);		
		btnHomeMedStaff.setBounds(299, 320, 250, 250);
		btnHomeMedStaff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHomeMedStaff.setContentAreaFilled(false);
		btnHomeMedStaff.setFocusPainted(false);
		btnHomeMedStaff.setRolloverIcon(imgMedLogo);
		panelHome.add(btnHomeMedStaff);
		
		JLabel lblMedicalStaff = new JLabel(" ");
		lblMedicalStaff.setForeground(Color.DARK_GRAY);
		lblMedicalStaff.setFont(new Font("Finale Copyist Text", Font.PLAIN, 30));
		lblMedicalStaff.setBounds(326, 571, 178, 36);
		panelHome.add(lblMedicalStaff);
		
		final JButton btnPatient = new JButton("");
		btnPatient.setToolTipText("Patient's Menu");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelHome.show(false);
				panelPatientLogin.show(true);
				tfPatientLoginControlNumber.setText("");
			}
		});
		
		btnHomeMedStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelHome.show(false);
				panelMedLogin.show(true);
				tfMedLoginUsername.setText("");
				pfMedLoginPassword.setText("");
				
			}
		});
		
		btnPatient.setIcon(imgPatientBtn);
		btnPatient.setBounds(571, 320, 250, 250);
		panelHome.add(btnPatient);
		
		btnPatient.setBorder( null );
		btnPatient.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPatient.setContentAreaFilled(false);
		btnPatient.setFocusPainted(false);
		btnPatient.setRolloverIcon(imgPatientLogo);
		
		JLabel lblPatient = new JLabel(" ");
		lblPatient.setForeground(Color.DARK_GRAY);
		lblPatient.setFont(new Font("Finale Copyist Text", Font.PLAIN, 32));
		lblPatient.setBounds(624, 575, 106, 29);
		panelHome.add(lblPatient);
		JButton btnAdmin = new JButton("");
		btnAdmin.setToolTipText("Administrator's Menu");
		btnAdmin.setIcon(imgAdminBtn);
		btnAdmin.setBounds(842, 320, 250, 250);
		panelHome.add(btnAdmin);
		btnAdmin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panelHome.show(false);
				panelAdLogin.show(true);
				tfAdminLoginUsername.setText("");
				pfAdminLoginPassword.setText("");
			}
		});
		
		btnAdmin.setBorder( null );
		btnAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdmin.setContentAreaFilled(false);
		btnAdmin.setFocusPainted(false);
		btnAdmin.setRolloverIcon(imgAdminLogo);
		
		JLabel lblAdministrator = new JLabel(" ");
		lblAdministrator.setForeground(Color.DARK_GRAY);
		lblAdministrator.setBackground(Color.DARK_GRAY);
		lblAdministrator.setFont(new Font("Finale Copyist Text Ext", Font.PLAIN, 32));
		lblAdministrator.setBounds(867, 573, 200, 33);
		panelHome.add(lblAdministrator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -182, 1362, 1056);
		panelHome.add(lblNewLabel);
		lblNewLabel.setIcon(imgBackground);		
/***************************************************** end Home Window ***************************************************/
	
	
		JTabbedPane tabbedPaneMed = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneMed.setBackground(Color.LIGHT_GRAY);
		tabbedPaneMed.setBounds(0, 96, 1362, 576);
		panelMedTabbed.add(tabbedPaneMed);
		
		
/************************************************* Assess Tab ************************************************************/	
		
		meds.AssessTab assess = new meds.AssessTab();
		
		JPanel tabAssess = new JPanel();
		tabAssess.setForeground(new Color(0, 128, 128));
		tabAssess.setBackground(SystemColor.control);
		tabbedPaneMed.addTab("", imgAssess, tabAssess);
		tabAssess.setLayout(null);
		
		JLabel lblDoctorsAssessments = assess.getlblDoctorsAssessments();
		tabAssess.add(lblDoctorsAssessments);
		
		JLabel lblControlNumber = assess.getlblAssessControlNumber();
		tabAssess.add(lblControlNumber);
		
		
		final JTextField tfAssessControlNumber = assess.gettfAssessControlNumber();
		tabAssess.add(tfAssessControlNumber);
		
		JLabel lblAssessAssessor = assess.getlblAssessAssessor();
		tabAssess.add(lblAssessAssessor);
		
		final JTextField tfAssessAssessor = assess.gettfAssessAssessor();
		tfAssessAssessor.setText(pfMedLoginPassword.getText());
		tabAssess.add(tfAssessAssessor);
		
		JLabel lblAssessHeight = assess.getlblAssessHeight();
		tabAssess.add(lblAssessHeight);
		
		final JTextField tfAssessHeight = assess.gettfAssessHeight();
		tabAssess.add(tfAssessHeight);
		
		
		JLabel lblAssessWeight = assess.getlblAssessWeight();
		tabAssess.add(lblAssessWeight);
		
		final JTextField tfAssessWeight = assess.gettfAssessWeight();
		tabAssess.add(tfAssessWeight);
		
		JLabel lblAssessBloodPressure = assess.getlblAssessBloodPressure();
		tabAssess.add(lblAssessBloodPressure);
		
		final JTextField tfAssessBloodPressure = assess.gettfAssessBloodPressure();
		tabAssess.add(tfAssessBloodPressure);

		JLabel lblAssessTemperature = assess.getlblAssessTemperature();
		tabAssess.add(lblAssessTemperature);
		
		final JTextField tfAssessTemperature = assess.gettfAssessTemperature();
		tabAssess.add(tfAssessTemperature);
		
		JLabel lblAssessCurrentSymptoms = assess.getlblAssessCurrentSymptoms();
		tabAssess.add(lblAssessCurrentSymptoms);
		
		final JCheckBox chckbxCold = assess.getchckbxCold();
		chckbxCold.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxCold.getText());
			}
		});
		tabAssess.add(chckbxCold);
		
		final JCheckBox chckbxCough = assess.getchckbxCough();
		chckbxCough.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxCough.getText());
			}
		});
		tabAssess.add(chckbxCough);
		
		final JCheckBox chckbxFatigue1 = assess.getchckbxFatigue1();
		chckbxFatigue1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxFatigue1.getText());
			}
		});
		tabAssess.add(chckbxFatigue1);
		
		final JCheckBox chckbxFever1 = assess.getchckbxFever1();
		chckbxFever1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxFever1.getText());
			}
		});
		tabAssess.add(chckbxFever1);
		
		final JCheckBox chckbxHemoptysis = assess.getchckbxHemoptysis();
		chckbxHemoptysis.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxHemoptysis.getText());
			}
		});
		tabAssess.add(chckbxHemoptysis);
		
		final JCheckBox chckbxNightSweats = assess.getchckbxNightSweats();
		chckbxNightSweats.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxNightSweats.getText());
			}
		});
		tabAssess.add(chckbxNightSweats);
		
		final JCheckBox chckbxWeightLoss = assess.getchckbxWeightLoss();
		chckbxWeightLoss.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxWeightLoss.getText());
			}
		});
		tabAssess.add(chckbxWeightLoss);
		
		final JCheckBox chckbxWheezing = assess.getchckbxWheezing();
		chckbxWheezing.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSymp, chckbxWheezing.getText());
			}
		});
		tabAssess.add(chckbxWheezing);
		
		JLabel lblAssessReportedSideEffects = assess.getlblAssessReportedSideEffects();
		tabAssess.add(lblAssessReportedSideEffects);
		
		final JCheckBox chckbxBodyPain = assess.getchckbxBodyPain();
		chckbxBodyPain.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxBodyPain.getText());
			}
		});
		tabAssess.add(chckbxBodyPain);
		
		final JCheckBox chckbxDizziness = assess.getchckbxDizziness();
		chckbxDizziness.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxDizziness.getText());
			}
		});
		tabAssess.add(chckbxDizziness);
		
		final JCheckBox chckbxFatigue2 = assess.getchckbxFatigue2();
		chckbxFatigue2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxBodyPain.getText());
			}
		});
		tabAssess.add(chckbxFatigue2);
		
		final JCheckBox chckbxFever2 = assess.getchckbxFever2();
		chckbxFever2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxFever2.getText());
			}
		});
		tabAssess.add(chckbxFever2);
		
		final JCheckBox chckbxBehavioralChanges = assess.getchckbxBehavioralChanges();
		chckbxBehavioralChanges.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxBehavioralChanges.getText());
			}
		});
		tabAssess.add(chckbxBehavioralChanges);
		
		final JCheckBox chckbxJaundice = assess.getchckbxJaundice();
		chckbxJaundice.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxJaundice.getText());
			}
		});
		tabAssess.add(chckbxJaundice);
		
		final JCheckBox chckbxJointPain = assess.getchckbxJointPain();
		chckbxJaundice.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxJaundice.getText());
			}
		});
		tabAssess.add(chckbxJointPain);
		
		final JCheckBox chckbxLossOfAppetite = assess.getchckbxLossOfAppetite();
		chckbxLossOfAppetite.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxLossOfAppetite.getText());
			}
		});
		tabAssess.add(chckbxLossOfAppetite);
		
		final JCheckBox chckbxNausea = assess.getchckbxNausea();
		chckbxNausea.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxNausea.getText());
			}
		});
		tabAssess.add(chckbxNausea);
		
		final JCheckBox chckbxNumbness = assess.getchckbxNumbness();
		chckbxNumbness.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxNumbness.getText());
			}
		});
		tabAssess.add(chckbxNumbness);
		
		final JCheckBox chckbxRash = assess.getchckbxRash();
		chckbxRash.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				functions.cbManager(listSide, chckbxRash.getText());
			}
		});
		tabAssess.add(chckbxRash);
		
		JScrollPane scrollPaneAssess = assess.getscrollPaneAssess();
		tabAssess.add(scrollPaneAssess);
		
		final JTextArea taDocAssess = new JTextArea();
		scrollPaneAssess.setViewportView(taDocAssess);
		
		JButton btnAssess = assess.getbtnAssess();
		btnAssess.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
					functions.patientAssess(tfAssessControlNumber, tfAssessAssessor, tfAssessHeight, tfAssessWeight, tfAssessBloodPressure, tfAssessTemperature, taDocAssess, date, listSymp, listSide);
			 }
			});
		tabAssess.add(btnAssess);
		
		JButton btnClear = assess.getbtnClear();
		tabAssess.add(btnClear);
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				taDocAssess.setText("");
			}
		});
		
		JButton btnAddRecords = assess.getbtnAddRecords();
		tabAssess.add(btnAddRecords);
		btnAddRecords.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				AddReports ar = new AddReports();
				ar.setControlNumber(tfAssessControlNumber.getText());
				ar.main(null);
			}
		});
/******************************************** end assess tab******************************************************************/

/******************************************** View Tab **********************************************************************/
			
			meds.ViewTab view = new meds.ViewTab();
		
			JPanel tabView = new JPanel();
			tabbedPaneMed.addTab("", imgView, tabView, null);
			tabView.setLayout(null);
			
			JLabel lblViewControlNumber = view.getlblViewControlNumber();
			tabView.add(lblViewControlNumber);
			
			final JTextField tfViewControlNumber = view.gettfViewControlNumber();
			tabView.add(tfViewControlNumber);
			
			JScrollPane scrollView = view.getscrollView();
			tabView.add(scrollView);
			
			final JTextArea taViewRecord = view.gettaViewRecord();
			scrollView.setViewportView(taViewRecord);

			final JLabel lblViewAge = view.getlblViewAge();
			tabView.add(lblViewAge);
			
			final JLabel lblViewSex = view.getlblViewSex();
			tabView.add(lblViewSex);
			
			final JLabel lblViewName = view.getlblViewName();
			tabView.add(lblViewName);
			
			final JLabel lblViewPhoto = view.getlblPViewPhoto();
			tabView.add(lblViewPhoto);
			
			JButton btnViewRecord = view.getbtnViewRecord();
			tabView.add(btnViewRecord);
			btnViewRecord.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						ctrl = tfViewControlNumber.getText();
						OpenHistory oh = new OpenHistory();
						oh.setControlNumber(ctrl);
						oh.main(null);
						
						Connection con = functions.DBConnect();
						Statement stmt = con.createStatement();
						
						String control = tfViewControlNumber.getText();
						String sql = "select * from patientrecord "
								+ "where ID = " + control;
						ResultSet rs = stmt.executeQuery(sql);
						
						File file = new File(control + ".txt");
						FileOutputStream out = new FileOutputStream(file);
						
						
						if(rs.next()){
							String bday = rs.getString("bdate");//////////////////////////////////////////////////////////////
							int age = functions.ageCalcu(dateformat, bday);
							lblViewAge.setText(Integer.toString(age));
							
							InputStream in = rs.getBinaryStream("assess");
							
							byte[] buffer = new byte[1024];
							if(in!=null){
								while(in.read(buffer)>0)
									out.write(buffer);
							}
						}
						String lname = rs.getString("LASTNAME");
						String mname = rs.getString("MIDDLENAME");
						String fname = rs.getString("FIRSTNAME");
						String sex = rs.getString("sex");
						byte[] picture = rs.getBytes("picture");
						if(picture != null){
							
							ImageIcon pic = new ImageIcon(picture);
							Image image = pic.getImage();
							Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
							pic = new ImageIcon(newimg);
						}
						
						BufferedReader br = new BufferedReader(new FileReader(file));
						taViewRecord.read(br, null);
						lblViewName.setText(fname + " " + mname + " " + lname);
						lblViewSex.setText(sex);
						lblViewPhoto.setIcon(pic);
						
						br.close();
						taViewRecord.requestFocus();
						out.close();
						
					} catch (Exception e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Patient Record Cannot Be Found", "Error", JOptionPane.ERROR_MESSAGE);
						
					}
				}
			});
			
			JLabel lblViewName2 = view.getlblViewName2();
			tabView.add(lblViewName2);
			
			JLabel lblViewAge2 = view.getlblViewAge2();
			tabView.add(lblViewAge2);
			
			JLabel lblViewSex2 = view.getlblViewSex2();
			tabView.add(lblViewSex2);
			
/******************************************** end View Tab **********************************************/

/******************************************** Add Patient Tab *******************************************/
	//Add Patient Tab
			JPanel tabCreate = new JPanel();
			tabbedPaneMed.addTab("", imgCreate, tabCreate, null);
			tabCreate.setLayout(null);
			
			meds.AddPatientTab add = new meds.AddPatientTab();
			
			JLabel lblCreateControlNumber = add.getlblCreateControlNumber();
			tabCreate.add(lblCreateControlNumber);
			
			final JTextField tfCreateControlNumber = add.gettfCreateControlNumber();
			tabCreate.add(tfCreateControlNumber);
			
			JLabel lblCreatePersonal = add.getlblCreatePersonal();
			tabCreate.add(lblCreatePersonal);
			
			JLabel lblCreateName = add.getlblCreateName();
			tabCreate.add(lblCreateName);
			
			final JTextField tfCreateLastname = add.gettfCreateLastName();
			tabCreate.add(tfCreateLastname);
			
			final JTextField tfCreateFirstName = add.gettfCreateFirstName();
			tabCreate.add(tfCreateFirstName);
			
			final JTextField tfCreateMiddleName = add.gettfCreateMiddleName();
			tabCreate.add(tfCreateMiddleName);
					
			JLabel lblCreateSurname = add.getlblCreateSurname();
			tabCreate.add(lblCreateSurname);
			
			JLabel lblCreateFirstName = add.getlblCreateFirstName();
			tabCreate.add(lblCreateFirstName);
			
			JLabel lblCreateMiddleName = add.getlblCreateMidleName();
			tabCreate.add(lblCreateMiddleName);
			
			JLabel lblCreateSex = add.getlblCreateSex();
			tabCreate.add(lblCreateSex);
			
			final JComboBox<String> comboCreateSex = add.getcomboCreateSex();
			tabCreate.add(comboCreateSex);
			comboCreateSex.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ActEvnt){
					if (comboCreateSex.getSelectedItem()!=null){
						strSex = comboCreateSex.getSelectedItem().toString();
					}
					
				}
			});
			
			JLabel lblCreateDateOfBirth = add.getlblCreateDateOfBirth();
			tabCreate.add(lblCreateDateOfBirth);
			
			final JTextField tfCreateDateOfBirth = add.gettfCreateDateOfBirth();
			tabCreate.add(tfCreateDateOfBirth);
			
			JLabel lblCreateBloodType = add.getlblCreateBloodType();
			tabCreate.add(lblCreateBloodType);
			
			final JTextField tfCreateBloodType = add.gettfCreateBloodType();
			tabCreate.add(tfCreateBloodType);
			
			JSeparator separatorCreate = add.getseparatorCreate(); 
			tabCreate.add(separatorCreate);
			
			JLabel lblCreateAdditional = add.getlblCreateAdditional();
			tabCreate.add(lblCreateAdditional);
			
			JLabel lblCreateAddress = add.getlblCreateAdditional();
			tabCreate.add(lblCreateAddress);
			
			final JTextField tfCreateAddress = add.gettfCreateAddress();
			tabCreate.add(tfCreateAddress);
			
			JLabel lblCreateGuardian = add.getlblCreateGuardian();
			tabCreate.add(lblCreateGuardian);
			
			final JTextField tfCreateGuardian = add.gettfCreateGuardian();
			tabCreate.add(tfCreateGuardian);
			
			JLabel lblCreateRelationship = add.getlblCreateRelationship();
			tabCreate.add(lblCreateRelationship);
			
			final JTextField tfCreateRelationship = add.gettfCreateRelationship();
			tabCreate.add(tfCreateRelationship);
			
			JLabel lblCreateContactPatient = add.getlblCreateContactPatient();
			tabCreate.add(lblCreateContactPatient);
			
			final JTextField tfCreateContactPatient = add.gettfCreateContactPatient();
			tabCreate.add(tfCreateContactPatient);
			
			JLabel lblCreateContactGuardian = add.getlblCreateContactGuardian();
			tabCreate.add(lblCreateContactGuardian);
			
			final JTextField tfCreateContactGuardian = add.gettfCreateContactGuardian();
			tabCreate.add(tfCreateContactGuardian);
			
			final JLabel lblCreatePhoto = add.getlblCreatePhoto();
			tabCreate.add(lblCreatePhoto);
			
			JButton btnCreateUpload = add.getbtnCreateUpload();
			tabCreate.add(btnCreateUpload);
			btnCreateUpload.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
					FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
					fileChooser.addChoosableFileFilter(filter);
					int res = fileChooser.showOpenDialog(null);
					if(res==JFileChooser.APPROVE_OPTION){
						File file = fileChooser.getSelectedFile();
						String path = file.getAbsolutePath();
						inputstream = path;
						ImageIcon imgPhoto = functions.ResizeImage(path, lblCreatePhoto);
						lblCreatePhoto.setIcon(imgPhoto);
					}
				}
			});
			
			JButton btnCreateFinish = add.getbtnCreateFinish();
			tabCreate.add(btnCreateFinish);
			btnCreateFinish.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						Connection con = functions.DBConnect();
						if(inputstream != null){
							PreparedStatement preStmt = con.prepareStatement("insert into patientrecord(ID, LASTNAME, FIRSTNAME, MIDDLENAME,sex,bdate, btype,addr,guardian, rguardian, pcontact, gcontact, picture) "
									+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
							InputStream is = new FileInputStream(new File(inputstream));
							preStmt.setInt(1, Integer.parseInt(tfCreateControlNumber.getText()));
							preStmt.setString(2, tfCreateLastname.getText());
							preStmt.setString(3, tfCreateFirstName.getText());
							preStmt.setString(4, tfCreateMiddleName.getText());
							preStmt.setString(5, strSex);
							preStmt.setString(6, tfCreateDateOfBirth.getText());
							preStmt.setString(7, tfCreateBloodType.getText());
							preStmt.setString(8, tfCreateAddress.getText());
							preStmt.setString(9, tfCreateGuardian.getText());
							preStmt.setString(10, tfCreateRelationship.getText());
							preStmt.setString(11, tfCreateContactPatient.getText());
							preStmt.setString(12, tfCreateContactGuardian.getText());
							preStmt.setBlob(13, is);
							if(functions.isNumeric(tfCreateContactPatient.getText())){
								if(functions.isNumeric(tfCreateContactGuardian.getText())){
									if(functions.bloodTypeValidation(tfCreateBloodType).equals("granted")){
										preStmt.executeUpdate();
										JOptionPane.showMessageDialog(null, "Patient Successfully Created");
									}
									else{
										JOptionPane.showMessageDialog(null, "Invalid Blood Type", "Error", JOptionPane.ERROR_MESSAGE);
									}
								}
								else{
									JOptionPane.showMessageDialog(null, "Invalid Guardian Contact", "Error", JOptionPane.ERROR_MESSAGE);
								}
							}
							else{
								JOptionPane.showMessageDialog(null, "Invalid Patient Contact", "Error", JOptionPane.ERROR_MESSAGE);
							}
						}
						else{
							PreparedStatement preStmt = con.prepareStatement("insert into patientrecord(ID, LASTNAME, FIRSTNAME, MIDDLENAME,sex,bdate, btype,addr,guardian, rguardian, pcontact, gcontact) "
									+ "values(?,?,?,?,?,?,?,?,?,?,?,?)");
							preStmt.setInt(1, Integer.parseInt(tfCreateControlNumber.getText()));
							preStmt.setString(2, tfCreateLastname.getText());
							preStmt.setString(3, tfCreateFirstName.getText());
							preStmt.setString(4, tfCreateMiddleName.getText());
							preStmt.setString(5, strSex);
							preStmt.setString(6, tfCreateDateOfBirth.getText());
							preStmt.setString(7, tfCreateBloodType.getText());
							preStmt.setString(8, tfCreateAddress.getText());
							preStmt.setString(9, tfCreateGuardian.getText());
							preStmt.setString(10, tfCreateRelationship.getText());
							preStmt.setString(11, tfCreateContactPatient.getText());
							preStmt.setString(12, tfCreateContactGuardian.getText());
							if(functions.isNumeric(tfCreateContactPatient.getText())){
								if(functions.isNumeric(tfCreateContactGuardian.getText())){
									preStmt.executeUpdate();
									JOptionPane.showMessageDialog(null, "Patient Successfully Created");
								}
								else{
									JOptionPane.showMessageDialog(null, "Invalid Guardian Contact", "Error", JOptionPane.ERROR_MESSAGE);
								}
							}
							else{
								JOptionPane.showMessageDialog(null, "Invalid Patient Contact", "Error", JOptionPane.ERROR_MESSAGE);
							}
							
						}
					}
					catch(NumberFormatException e2){
						if(e2.getMessage().startsWith("For input string: \"\"")){
							JOptionPane.showMessageDialog(null, "Control Number must be filled!", "Complete the Form", JOptionPane.ERROR_MESSAGE);
						}
						e2.printStackTrace();
					}
					catch(SQLException e3){
						
						if(e3.getMessage().startsWith("Incorrect integer value")){
							JOptionPane.showMessageDialog(null, "Invalid Contact Number", "ERROR!", JOptionPane.ERROR_MESSAGE);
						}
						e3.printStackTrace();
						
					}
					 catch (Exception e1) {
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "Error! Complete the Information", "Error", JOptionPane.ERROR_MESSAGE);
							}
				}
			});
			
			JButton btnCreateClear = add.getbtnCreateClear();
			tabCreate.add(btnCreateClear);
			btnCreateClear.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					tfCreateControlNumber.setText("");
					tfCreateLastname.setText("");
					tfCreateFirstName.setText("");
					tfCreateMiddleName.setText("");
					tfCreateDateOfBirth.setText("");
					tfCreateBloodType.setText("");
					tfCreateAddress.setText("");
					tfCreateGuardian.setText("");
					tfCreateRelationship.setText("");
					tfCreateContactPatient.setText("");
					tfCreateContactGuardian.setText("");
					lblCreatePhoto.setIcon(imgDummy);
				}
			});
			
			JButton btnMedTabBack = new JButton("aisduoasiudo");
			btnMedTabBack.setBounds(43, 11, 73, 74);
			panelMedTabbed.add(btnMedTabBack);
			btnMedTabBack.setBackground(new Color(0, 128, 128));
			btnMedTabBack.setFont(new Font("Gadugi", Font.BOLD, 14));
			btnMedTabBack.setIcon(imgHome);
			btnMedTabBack.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					panelMedTabbed.show(false);
					panelHome.show(true);
					tfCreateControlNumber.setText("");
					tfAssessAssessor.setText("");
					tfAssessHeight.setText("");
					tfAssessWeight.setText("");
					tfAssessBloodPressure.setText("");
					tfAssessTemperature.setText("");
					taDocAssess.setText("");
					tfViewControlNumber.setText("");
					taViewRecord.setText("");
					lblViewAge.setText("");
					lblViewSex.setText("");
					lblViewName.setText("");
					lblViewPhoto.setIcon(imgDummy);
					tfCreateControlNumber.setText("");
					tfCreateLastname.setText("");
					tfCreateFirstName.setText("");
					tfCreateMiddleName.setText("");
					tfCreateDateOfBirth.setText("");
					tfCreateBloodType.setText("");
					tfCreateAddress.setText("");
					tfCreateGuardian.setText("");
					tfCreateRelationship.setText("");
					tfCreateContactPatient.setText("");
					tfCreateContactGuardian.setText("");
					lblCreatePhoto.setIcon(imgDummy);
				}
			});
			
			/*JButton btnPReset = new JButton("Reset");
			btnPReset.setBounds(1200, 95, 73, 25);
			panelMedTabbed.add(btnPReset);
			btnPReset.setFont(new Font("Gadugi", Font.BOLD, 14));
			btnPReset.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					tfMedTabCN.setText("");
					tfMedTabDate.setText("");
					tfMedTabAssessor.setText("");
					tfMedTabHeight.setText("");
					tfMedTabWeight.setText("");
					tfMedTabBP.setText("");
					tfMedTabTemp.setText("");
					taDocAssess.setText("");
					tfMedTabCNView.setText("");
					taView.setText("");
					lblViewAge.setText("");
					lblViewSex.setText("");
					lblViewFullName.setText("");
					lblViewPhoto.setIcon(imgDummy);
					tfCreatePCN.setText("");
					tfLastN.setText("");
					tfFirstN.setText("");
					tfMidN.setText("");
					tfDateBirth.setText("");
					tfCreateBloodType.setText("");
					tfAddress.setText("");
					tfCreateGuardian.setText("");
					tfRelationship.setText("");
					tfContactPatient.setText("");
					tfContactGuardian.setText("");
					lblCreatePhoto.setIcon(imgDummy);
				}
			});*/
			
			JLabel lblCreatePicture = new JLabel("");
			lblCreatePicture.setIcon(imgMedTab);
			lblCreatePicture.setBounds(0, 0, 1362, 705);
			panelMedTabbed.add(lblCreatePicture);
/******************************************************* end Add Patient Tab *******************************************/

/*******************************************************/
			
			JButton btnPTabBack = new JButton("");
			btnPTabBack.setBounds(43, 11, 73, 74);
			panelPatientTabbed.add(btnPTabBack);
			btnPTabBack.setBackground(new Color(0, 128, 128));
			btnPTabBack.setFont(new Font("Gadugi", Font.BOLD, 14));
			btnPTabBack.setIcon(imgHome);
			btnPTabBack.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					panelPatientTabbed.show(false);
					panelHome.show(true);
				}
			});
/**************************************************** Patient ********************************/
		
		patient.Tab patientTab = new patient.Tab(); 
			
		JLabel lblPatientControlNumber = patientTab.getlblPatientControlNumber();
		lblPatientControlNumber.setText(strCntrlnum);
		panelPatientTabbed.add(lblPatientControlNumber);
		
		JTextArea taPatientStatus = patientTab.gettaPatientStatus();
	    //taPStatus.setBounds(35, 208, 1282, 432);
		panelPatientTabbed.add(taPatientStatus);
		
		JLabel lblPatientViewName = patientTab.getlblPatientViewName();
		panelPatientTabbed.add(lblPatientViewName);
		
		JLabel lblPatientAge = patientTab.getlblPatientAge();
		panelPatientTabbed.add(lblPatientAge);
		
		JLabel lblPatientSex = patientTab.getlblPatientSex();
		panelPatientTabbed.add(lblPatientSex);
		
		JButton btnPatientViewHistory = patientTab.getbtnPatientViewHistory();
		btnPatientViewHistory.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				OpenHistory oh = new OpenHistory();
				oh.setControlNumber(ctrl);
				oh.main(null);
			}
		});
		panelPatientTabbed.add(btnPatientViewHistory);
		
		JLabel lblPatientBackground = patientTab.getlblPatientBackground();
		panelPatientTabbed.add(lblPatientBackground);
		
		

/*********************************************** end Patient *********************************************/

/********************************************** Admin Login *********************************************/
		//Administration Login
		
		admin.Login adminLogin = new admin.Login();
		
		JLabel lblAdminLoginUsername = adminLogin.getlblAdminLoginUsername();
		panelAdLogin.add(lblAdminLoginUsername);
		
		tfAdminLoginUsername = adminLogin.gettfAdminLoginUsername();
		panelAdLogin.add(tfAdminLoginUsername);
		
		JLabel lblAdminLoginPassword = adminLogin.getlblAdminLoginPassword();
		panelAdLogin.add(lblAdminLoginPassword);
		
		pfAdminLoginPassword = adminLogin.getpfAdminLoginPassword();
		panelAdLogin.add(pfAdminLoginPassword);
		
		JButton btnAdminLoginSubmit = adminLogin.getbtnAdminLoginSubmit();
		panelAdLogin.add(btnAdminLoginSubmit);
		btnAdminLoginSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					Connection con = functions.DBConnect();
					check = functions.validation(con, tfAdminLoginUsername.getText(),pfAdminLoginPassword.getText(), 3);
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				if(check.equals("granted")){
					panelAdLogin.show(false);
					panelAdminTabbed.show(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		JButton btnAdminLoginClear = adminLogin.getbtnAdminLoginClear();
		panelAdLogin.add(btnAdminLoginClear);
		btnAdminLoginClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfAdminLoginUsername.setText("");
				pfAdminLoginPassword.setText("");
			}
		});
		
		JButton btnAdminLoginBack = adminLogin.getbtnAdminLoginBack();
		panelAdLogin.add(btnAdminLoginBack);
		
		JLabel lblAdminLoginPicture = adminLogin.getlblAdminLoginPicture();
		panelAdLogin.add(lblAdminLoginPicture);

/********************************************** end Administration Login ***********************************************/

/********************************************** Administration Tab *****************************************************/
	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 96, 1362, 572);
		panelAdminTabbed.add(tabbedPane);
		
/********************************************* Medical Staff List *******************************************************/
			JPanel tabMedList = new JPanel();
			tabbedPane.addTab("", imgMedList, tabMedList, null);
			tabMedList.setLayout(null);
			try {
				Connection con = functions.DBConnect();
				Statement stmt = con.createStatement();
				String sql = "select * from medrecord order by LASTNAME";
				ResultSet rs = stmt.executeQuery(sql);
				JTable table = new JTable(TableModel2(rs));
				JScrollPane Scroll = new JScrollPane(table);
				table.setEnabled(false);
				tabMedList.add(Scroll);
				Scroll.setBounds(10, 26, 1337, 371);
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	
/********************************************* end Medical Staff List *******************************************************/

/********************************************* Patient List *******************************************************/

			//Patient List	
				JPanel tabPatientList = new JPanel();
				tabbedPane.addTab("", imgPatientList, tabPatientList, null);
				tabPatientList.setLayout(null);
				
				
				try {
					Connection con = functions.DBConnect();
					Statement stmt = con.createStatement();
					String sql = "select * from patientrecord order by LASTNAME";
					ResultSet rs = stmt.executeQuery(sql);
					JTable table = new JTable(TableModel1(rs));
					JScrollPane Scroll = new JScrollPane(table);
					table.setEnabled(false);
					tabPatientList.add(Scroll);
					Scroll.setBounds(10, 26, 1337, 371);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
/********************************************* end Patient List *******************************************************/

/********************************************* Admin List *******************************************************/
				
				JPanel tabAdminList = new JPanel();
				tabbedPane.addTab("", imgAdminList, tabAdminList, null);
				tabAdminList.setLayout(null);
				try {
					Connection con = functions.DBConnect();
					Statement stmt = con.createStatement();
					String sql = "select * from adminrecord order by LASTNAME";
					ResultSet rs = stmt.executeQuery(sql);
					JTable table = new JTable(TableModel1(rs));
					JScrollPane Scroll = new JScrollPane(table);
					table.setEnabled(false);
					tabAdminList.add(Scroll);
					Scroll.setBounds(10, 26, 1337, 371);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
/********************************************* end Admin List *******************************************************/

/********************************************* Add Medical Staff *******************************************************/

				JPanel tabAddMed = new JPanel();
				tabbedPane.addTab("", imgMedAdd, tabAddMed, null);
				tabAddMed.setLayout(null);
				
				admin.AddMedicalStaff addMed = new admin.AddMedicalStaff();
				
				JLabel lblAddMedicalStaff = addMed.getlblAddMedicalStaff();
				tabAddMed.add(lblAddMedicalStaff);
				
				JLabel lblAddMedUsername = addMed.getlblAddMedUsername();
				tabAddMed.add(lblAddMedUsername);
				
				tfAddMedUsername = addMed.gettfAddMedUsername();
				tabAddMed.add(tfAddMedUsername);
				
				JLabel lblAddMedPassword = addMed.getlblAddMedPassword();
				tabAddMed.add(lblAddMedPassword);
				
				tfAddMedPassword = addMed.gettfAddMedPassword();
				tabAddMed.add(tfAddMedPassword);;

				JSeparator separatorAddMed = addMed.getseparatorAddMed();
				tabAddMed.add(separatorAddMed);
				
				tfAddMedFirstName = addMed.gettfAddMedFirstName();
				tabAddMed.add(tfAddMedFirstName);

				tfAddMedMiddleName = addMed.gettfAddMedMiddleName();
				tabAddMed.add(tfAddMedMiddleName);
				
				tfAddMedLastName = addMed.gettfAddMedLastName();
				tabAddMed.add(tfAddMedLastName);
				
				JLabel lblAddMedFirstName = addMed.getlblAddMedFirstName();
				tabAddMed.add(lblAddMedFirstName);
				
				JLabel lblAddMedMiddleName = addMed.getlblAddMedMiddleName();
				tabAddMed.add(lblAddMedMiddleName);
				
				JLabel lblAddMedLastName = addMed.getlblAddMedLastName();
				tabAddMed.add(lblAddMedLastName);
				
				JLabel lblAddMedCategory = addMed.getlblAddMedCategory();
				tabAddMed.add(lblAddMedCategory);
				
				@SuppressWarnings("rawtypes")
				final JComboBox comboAddMedCategory = addMed.getcomboAddMedCategory();
				tabAddMed.add(comboAddMedCategory);
				
				comboAddMedCategory.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ActEvnt){
						if (comboAddMedCategory.getSelectedItem()!=null){
							strCategory = comboAddMedCategory.getSelectedItem().toString();
						}
					}
				});
				
				JLabel lblAddMedBirthdate = addMed.getlblAddMedBirthdate();
				tabAddMed.add(lblAddMedBirthdate);
				
				tfAddMedBirthdate = addMed.gettfAddMedBirthdate();
				tabAddMed.add(tfAddMedBirthdate);
				
				JLabel lblAddMedAddress = addMed.getlblAddMedAddress();
				tabAddMed.add(lblAddMedAddress);
				
				tfAddMedAddress = addMed.gettfAddMedAddress();
				tabAddMed.add(tfAddMedAddress);
				
				JLabel lblAddMedTelephoneNo = addMed.getlblAddMedTelephoneNo();
				tabAddMed.add(lblAddMedTelephoneNo);
				
				tfAddMedTelephoneNo = addMed.gettfAddMedTelephoneNo();
				tabAddMed.add(tfAddMedTelephoneNo);
				
				JLabel lblAddMedCellphoneNo = addMed.getlblAddMedCellphoneNo();
				tabAddMed.add(lblAddMedCellphoneNo);
				
				tfAddMedCellphoneNo = addMed.gettfAddMedCellphoneNo();
				tabAddMed.add(tfAddMedCellphoneNo);
				
				final JLabel lblAddMedPhoto = addMed.getlblAddMedPhoto();
				tabAddMed.add(lblAddMedPhoto);
				
				JButton btnAddMedUpload = addMed.getbtnAddMedUpload();
				tabAddMed.add(btnAddMedUpload);
				btnAddMedUpload.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JFileChooser fileChooser = new JFileChooser();
						fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
						FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
						fileChooser.addChoosableFileFilter(filter);
						int res = fileChooser.showOpenDialog(null);
						if(res==JFileChooser.APPROVE_OPTION){
							File file = fileChooser.getSelectedFile();
							String path = file.getAbsolutePath();
							inputstream = path;
							ImageIcon imgPhoto = functions.ResizeImage(path, lblCreatePhoto);
							lblAddMedPhoto.setIcon(imgPhoto);
						}
					}
				});
				
				JButton btnAddMedFinish = addMed.getbtnAddMedFinish();
				tabAddMed.add(btnAddMedFinish);
				btnAddMedFinish.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						try{
							
							Connection con = functions.DBConnect();
							PreparedStatement pstmt = con.prepareStatement("insert into medrecord(ID, LASTNAME, FIRSTNAME, MIDDLENAME, CATEGORY, username, bdate, address, telno, cellno, medpic)"
									+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
							InputStream is = new FileInputStream(new File(inputstream));
							pstmt.setInt(1, Integer.parseInt(tfAddMedPassword.getText()));
							pstmt.setString(2, tfAddMedLastName.getText());
							pstmt.setString(3, tfAddMedFirstName.getText());
							pstmt.setString(4, tfAddMedMiddleName.getText());
							pstmt.setString(5, strCategory);
							pstmt.setString(6, tfAddMedUsername.getText());
							pstmt.setString(7, tfAddMedBirthdate.getText());
							pstmt.setString(8, tfAddMedAddress.getText());
							pstmt.setString(9, tfAddMedTelephoneNo.getText());
							pstmt.setString(10,tfAddMedCellphoneNo.getText());
							pstmt.setBlob(11, is);
							if(functions.isNumeric(tfAddMedTelephoneNo.getText())){
								if(functions.isNumeric(tfAddMedCellphoneNo.getText())){
									pstmt.executeUpdate();
									JOptionPane.showMessageDialog(null, "Medical Staff Successfully Addedd");
								}else{
									JOptionPane.showMessageDialog(null, "Invalid Cellphone Number", "Error", JOptionPane.ERROR_MESSAGE);
								}
								
							}else{
								JOptionPane.showMessageDialog(null, "Invalid Telephone Number", "Error", JOptionPane.ERROR_MESSAGE);
							}
						}
						catch(Exception ex){
							ex.printStackTrace();
							System.out.println(ex.getMessage());
							JOptionPane.showMessageDialog(null, "Error! Complete the Information", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				
				JButton btnAddMedClear = addMed.getbtnAddMedClear();
				tabAddMed.add(btnAddMedClear);
				btnAddMedClear.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						tfAddMedUsername.setText("");
						tfAddMedPassword.setText("");
						tfAddMedFirstName.setText("");
						tfAddMedMiddleName.setText("");
						tfAddMedLastName.setText("");
						tfAddMedBirthdate.setText("");
						tfAddMedAddress.setText("");
						tfAddMedTelephoneNo.setText("");
						tfAddMedCellphoneNo.setText("");
						lblAddMedPhoto.setIcon(imgDummy);
					}
				});

/*********************************************************** end Add Medical Staff *********************************************/

/*********************************************************** Add Admin *********************************************/

			//Add Admin
				JPanel tabAddAdmin = new JPanel();
				tabbedPane.addTab("", imgAdmin, tabAddAdmin, null);
				tabAddAdmin.setLayout(null);
				
				admin.AddAdmin addAdmin = new admin.AddAdmin();
				
				JLabel lblAddAdmin = addAdmin.getlblAddAdmin();
				tabAddAdmin.add(lblAddAdmin);
				
				JLabel lblAddAdminUsername = addAdmin.getlblAddAdminUsername();
				tabAddAdmin.add(lblAddAdminUsername);
				
				final JTextField tfAddAdminUsername = addAdmin.gettfAddAdminUsername();
				tabAddAdmin.add(tfAddAdminUsername);
				
				JLabel lblAddAdminPassword = addAdmin.getlblAddAdminPassword();
				tabAddAdmin.add(lblAddAdminPassword);
				
				final JTextField tfAddAdminPassword = addAdmin.gettfAddAdminPassword();
				tabAddAdmin.add(tfAddAdminPassword);
				
				JSeparator separatorAddAdmin = addAdmin.getseparatorAddAdmin();
				tabAddAdmin.add(separatorAddAdmin);
				
				final JTextField tfAddAdminFirstname = addAdmin.gettfAddAdminFirstname();
				tabAddAdmin.add(tfAddAdminFirstname);
				
				final JTextField tfAddAdminMiddlename = addAdmin.gettfAddAdminMiddlename();
				tabAddAdmin.add(tfAddAdminMiddlename);
				
				final JTextField tfAddAdminLastname = addAdmin.gettfAddAdminLastname();
				tabAddAdmin.add(tfAddAdminLastname);
				
				JLabel lblAddAdminFirstname = addAdmin.getlblAddAdminFirstname();
				tabAddAdmin.add(lblAddAdminFirstname);
				
				JLabel lblAddAdminMiddlename = addAdmin.getlblAddAdminMiddlename();
				tabAddAdmin.add(lblAddAdminMiddlename);
				
				JLabel lblAddAdminLastname = addAdmin.getlblAddAdminLastname();
				tabAddAdmin.add(lblAddAdminLastname);
				
				final JTextField tfAddAdminBirthdate = addAdmin.gettfAddAdminBirthdate();
				tabAddAdmin.add(tfAddAdminBirthdate);
				
				JLabel lblAddAdminBirthdate = addAdmin.getlblAddAdminBirthdate();
				tabAddAdmin.add(lblAddAdminBirthdate);
				
				final JTextField tfAddAdminContact = addAdmin.gettfAddAdminContact();
				tabAddAdmin.add(tfAddAdminContact);
				
				JLabel lblAddAdminContact = addAdmin.getlblAddAdminContact();
				tabAddAdmin.add(lblAddAdminContact);
				
				final JTextField tfAddAdminEmail = addAdmin.gettfAddAdminEmail();
				tabAddAdmin.add(tfAddAdminEmail);
				
				JLabel lblAddAdminEmail = addAdmin.getlblAddAdminEmail();
				tabAddAdmin.add(lblAddAdminEmail);
				
				JButton btnAddAdminClear = addAdmin.getbtnAddAdminClear();
				tabAddAdmin.add(btnAddAdminClear);
				btnAddAdminClear.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						tfAddAdminUsername.setText("");
						tfAddAdminPassword.setText("");
						tfAddAdminFirstname.setText("");
						tfAddAdminMiddlename.setText("");
						tfAddAdminLastname.setText("");
						tfAddAdminBirthdate.setText("");
						tfAddAdminContact.setText("");
						tfAddAdminEmail.setText("");
					}
				});
				
				JButton btnAddAdminFinish = addAdmin.getbtnAddAdminFinish();
				tabAddAdmin.add(btnAddAdminFinish);
				btnAddAdminFinish.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						try{
							
							Connection con = functions.DBConnect();
							PreparedStatement pstmt1 = con.prepareStatement("insert into adminrecord(ID, LASTNAME, FIRSTNAME, MIDDLENAME, username, bdate, contact, email)"
									+ "values(?, ?, ?, ?, ?, ?, ?, ?)");
							pstmt1.setInt(1, Integer.parseInt(tfAddAdminPassword.getText()));
							pstmt1.setString(2, tfAddAdminLastname.getText());
							pstmt1.setString(3, tfAddAdminFirstname.getText());
							pstmt1.setString(4, tfAddAdminMiddlename.getText());
							pstmt1.setString(5, tfAddAdminUsername.getText());
							pstmt1.setString(6, tfAddAdminBirthdate.getText());
							pstmt1.setString(7, tfAddAdminContact.getText());
							pstmt1.setString(8, tfAddAdminEmail.getText());
							if(functions.isNumeric(tfAddAdminContact.getText())){
									pstmt1.executeUpdate();
									JOptionPane.showMessageDialog(null, "Administrator Successfully Added");							
							}
							else{
								JOptionPane.showMessageDialog(null, "Invalid Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
							}
													
						}catch(Exception ex){
							ex.printStackTrace();
							JOptionPane.showMessageDialog(null, "Error! Complete the Information", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});//btnAddAdminFinish.addActionListener(new ActionListener(){
					
					JButton btnAddAdminBack = addAdmin.getbtnAddAdminBack();
					panelAdminTabbed.add(btnAddAdminBack);
					btnAddAdminBack.setIcon(imgHome);
					btnAddAdminBack.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							panelAdminTabbed.show(false);
							panelHome.show(true);
							tfAddMedUsername.setText("");
							tfAddMedPassword.setText("");
							tfAddMedFirstName.setText("");
							tfAddMedMiddleName.setText("");
							tfAddMedLastName.setText("");
							tfAddMedBirthdate.setText("");
							tfAddMedAddress.setText("");
							tfAddMedTelephoneNo.setText("");
							tfAddMedCellphoneNo.setText("");
							lblAddMedPhoto.setIcon(imgDummy);
							tfAddAdminUsername.setText("");
							tfAddAdminPassword.setText("");
							tfAddAdminFirstname.setText("");
							tfAddAdminMiddlename.setText("");
							tfAddAdminLastname.setText("");
							tfAddAdminBirthdate.setText("");
							tfAddAdminContact.setText("");
							tfAddAdminEmail.setText("");
						}
					});
					
					JLabel lblAdminTabPic = new JLabel("");
					lblAdminTabPic.setIcon(imgAdminTab);
					lblAdminTabPic.setBounds(0, 0, 1362, 705);
					panelAdminTabbed.add(lblAdminTabPic);
		btnAdminLoginBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panelAdLogin.show(false);
				panelHome.show(true);
			}
		});
		
	}//private void initialize() {
	
	public static DefaultTableModel TableModel1(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = 4;
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}///public static Default
	
	public static DefaultTableModel TableModel2(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = 5;
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}
	
}//public class Frame {



