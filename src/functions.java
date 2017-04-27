import java.awt.Image;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextArea;


import net.proteanit.sql.DbUtils;

public class functions {

	/**
	 * Handles the Connection of the System to MySQL Database
	 * @return Connection
	 * @throws Exception
	 */
	public static Connection DBConnect()throws Exception{
		
			try{
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/medagent?useSSL=false";
				String username = "root";
				String password = "dolphinkoala";
				Class.forName(driver);
				Connection conn = DriverManager.getConnection(url, username, password);
				
				return conn;
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
	
	public static String getName(String dir){
		
		File file = new File(dir);
		return file.getName();
		
	}
	
	
	/**
	 * Validates username and password of user
	 * @param connection
	 * @param username
	 * @param password
	 * @param typeOfUser
	 * @return
	 */
	public static String validation(Connection con, String user, String pass, int type){
		
			try {
				Statement stmt = con.createStatement();
				
				if(type == 3){
					ResultSet result = stmt.executeQuery("select * from adminrecord");
					while(result.next()){
						if(user.equals(result.getString("username"))){
							if(pass.equals(result.getString("ID")))
								return "granted";
						}
					}
				}//if
				else if(type ==1){
					ResultSet result = stmt.executeQuery("select * from medrecord");
					while(result.next()){
						if(user.equals(result.getString("username"))){
							if(pass.equals(result.getString("ID")))
								return "granted";
						}
					}
				}//else if
				else if(type == 2){
					ResultSet result = stmt.executeQuery("select * from patientrecord");
					while(result.next()){
						if(pass.equals(result.getString("ID"))){
							return "granted";
						}
					}
				}//elseif
			}//try
			 catch (SQLException e) {
				e.printStackTrace();
			}
		
		return "denied";
		
	}
	
	/**
	 * 
	 * @param connection
	 * @param controlNumber
	 * @return String "granted"/"denied"
	 */
	public static String patientValidation(Connection con, String ctrl){
		
		try {
			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from patientrecord");
			while(result.next()){
				if(ctrl.equals(result.getString("ID"))){
					
					return "granted";
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "denied";
	}
	
public static String medValidation(Connection con, String ctrl){
		
		try {
			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from medrecord");
			while(result.next()){
				if(ctrl.equals(result.getString("ID"))){
					
					return "granted";
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return "denied";
	}

	/**
	 * Checks if the height is valid for assessment
	 * @param tfAssessHeight
	 * @return "granted"/"denied"
	 */
	public static String heightValidation(JTextField tfAssessHeight){
		
		String[] height = tfAssessHeight.getText().split("'");
		try{
			
			if(Integer.parseInt(height[1]) <= 12){
				char[] first = height[0].toCharArray();
				if(Character.isDigit(first[0]))
					return "granted";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "denied";
		}
		return "denied";
	}
	
	public static String bpValidation(JTextField tfAssessBloodPressure){
		
		String[] bp = tfAssessBloodPressure.getText().split("/");
		char[] bp1 = bp[0].toCharArray();
		char[] bp2 = bp[1].toCharArray();
		if(Character.isDigit(bp1[0])){
			if(Character.isDigit(bp2[0])){
				return "granted";
			}
		}
		
		return "denied";
	}
	
	public static String bloodTypeValidation(JTextField tfCreateBloodType){
		
		String[] bloodTypes = {"A+","A-","B+","B-","O+","O-","AB+","AB-"};
		
		for(String bt : bloodTypes){
			if(tfCreateBloodType.getText().equals(bt)){
				return "granted";
			}
		}
		
		return "denied";
	}

	
	/**
	 * 
	 * @param path
	 * @param lblPhoto
	 * @return image
	 */
	public static ImageIcon ResizeImage(String path, JLabel lblPhoto){
		
		ImageIcon myImg = new ImageIcon(path);
		Image img = myImg.getImage();
		Image newImg = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}
	
	/**
	 * 
	 * @param list
	 * @param chxkbx
	 */
	public static void cbManager(ArrayList<String> list, String cb){
		
		if(!list.contains(cb)){
			list.add(cb);
		}
	}
	
	/**
	 * Writes the assessments of patients to a file
	 * @param listOfSymptoms
	 * @param listOfSideEffects
	 * @param controlNumber
	 * @param date
	 * @param assessor
	 * @param height
	 * @param weight
	 * @param bloodpressure
	 * @param temperature
	 * @param assess
	 * @return file
	 */
	public static File fileAssess(ArrayList<String> listSymp, ArrayList<String> listSide, String ctrl, String date, String assessor, String height, String weight, String bp, String temp, String assess){
		
		File file = new File(ctrl);
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.newLine();
			bw.write("---------------------------------------------");
			bw.newLine();
			bw.write("Control Number: " + ctrl);
			bw.newLine();
			bw.write("Date: " + date);
			bw.newLine();
			bw.write("Assessor: " + assessor);
			bw.newLine();
			bw.write("Height: " + height);
			bw.newLine();
			bw.write("Weight: " + weight);
			bw.newLine();
			bw.write("Blood Pressure: " + bp);
			bw.newLine();
			bw.write("Temperature: " + temp);
			bw.newLine();
			bw.write("Assessment: ");
			bw.newLine();
			bw.write("\tSymptoms: ");
			bw.newLine();
			for(String symp: listSymp){
				bw.write("\t\t" + symp);
				bw.newLine();
			}
			bw.write("\tReported Side Effects: ");
			bw.newLine();
			for(String side: listSide){
				bw.write("\t\t" + side);
				bw.newLine();
			}
			bw.write(assess);
			bw.newLine();
			bw.close();
			return file;
		} catch (IOException e) {
			e.printStackTrace();
			return file;
		}
		
	}
	/**
	 * 
	 * @param resultSet
	 * @param statement
	 * @param table
	 * @return table
	 * @throws SQLException
	 */
	public static JTable updateTable(ResultSet rs, Statement stmt, JTable table) throws SQLException{
		rs = stmt.executeQuery("select * from medrecord");
		table.setModel(DbUtils.resultSetToTableModel(rs));
		return table;
		
	}
	/**
	 * Calculates the age of the patient
	 * @param today
	 * @param bday
	 * @return ageOfToday
	 */
	public static int ageCalcu(String today, String bday){
		
		char[] bday2 =bday.toCharArray();
		String bday3 = "";
		int i=0;
		while(i<bday.length()){
			//Delete Spaces and Concatenations
			if(bday2[i] != ' ' && bday2[i]!= '-'){
				bday3 = bday3.concat(Character.toString(bday2[i]));
				i++;
			}
			else
				i++;
			
		}
		char[] today2 = today.toCharArray();
		String today3 = "";
		i = 0;
		while(i<today.length()){
			if(today2[i] != '-'){
				today3 = today3.concat(Character.toString(today2[i]));
				i++;
			}
			else
				i++;
		}
		int todayYear = Integer.parseInt(today3.substring(0, 4));
		int bdayYear = Integer.parseInt(bday3.substring(0, 4));
		int todayMD = Integer.parseInt(today3.substring(4, 6));
		int bdayMD = Integer.parseInt(bday3.substring(4,6));
		int yearCalcu = todayYear - bdayYear;
	
		if(todayMD<bdayMD)
			yearCalcu = yearCalcu - 1;
		
		return yearCalcu;
	}
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	
	public static boolean isEmailValid(String email){
		
		if(email.matches("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}")){
			return true;
		}
		
		return false;
	}

	
	/**
	 * Handles the assessments of patients from the medical staffs
	 * @param tfAssessControlNumber Control number of the patient
	 * @param tfAssessAssessor		Name of the medical staff
	 * @param tfAssessHeight		Height of the patient
	 * @param tfAssessWeight		Weight of the patient
	 * @param tfAssessBloodPressure Blood pressure of the patient
	 * @param tfAssessTemperature	Temperature of the patient
	 * @param taDocAssess			Assessment of the medical staff
	 * @param date					Data of assessment
	 * @param listSymp				List of Symptoms
	 * @param listSide				List of Side Effects
	 */
	public static void patientAssess(JTextField tfAssessControlNumber, JTextField tfAssessAssessor,JTextField tfAssessHeight, JTextField tfAssessWeight, JTextField tfAssessBloodPressure, JTextField tfAssessTemperature, JTextArea taDocAssess, String date,ArrayList<String> listSymp, ArrayList<String> listSide){
		
		try {
			
			Connection con = functions.DBConnect();
			String patientvalid = functions.patientValidation(con, tfAssessControlNumber.getText());
			String medvalid = functions.medValidation(con, tfAssessAssessor.getText());
			String heightvalid = functions.heightValidation(tfAssessHeight);
			String bpvalid = functions.bpValidation(tfAssessBloodPressure);
			PreparedStatement pstmt = con.prepareStatement("update patientrecord set assess = ? where ID = ?");
			
			if(patientvalid.equals("granted")){
				if	(medvalid.equals("granted")){
					if(heightvalid.equals("granted")){
						if(bpvalid.equals("granted")){
							File file = functions.fileAssess(listSymp, listSide, tfAssessControlNumber.getText(), date, tfAssessAssessor.getText(), 
									tfAssessHeight.getText(), tfAssessWeight.getText(), tfAssessBloodPressure.getText(), tfAssessTemperature.getText(), taDocAssess.getText());
							String path = file.getAbsolutePath();
							InputStream stream = new FileInputStream(new File(path));
							pstmt.setBlob(1, stream);
							pstmt.setInt(2, Integer.parseInt(tfAssessControlNumber.getText()));
							pstmt.executeUpdate();
							JOptionPane.showMessageDialog(null, "Assess Successfully");
						}else{
							JOptionPane.showMessageDialog(null, "Invalid Blood Pressure", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}else{
						JOptionPane.showMessageDialog(null, "Invalid Height", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(null, "Invalid Assessor", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(null, "Patient does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Occured", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	/**
	 * Sets the photo provided by the user in the label photo
	 * @param inputstream
	 * @param lblCreatePhoto
	 *
	public static void uploadPicture(String inputstream, JLabel lblCreatePhoto){
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
	}*/
}
