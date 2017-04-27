package meds;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AssessTab {

	static JLabel lblDoctorsAssessments;
	static JLabel lblAssessControlNumber;
	static JTextField tfAssessControlNumber;
	static JLabel lblAssessDate;
	static JTextField tfAssessDate;
	static JLabel lblAssessAssessor;
	static JTextField tfAssessAssessor;
	static JLabel lblAssessHeight;
	static JTextField tfAssessHeight;
	static JLabel lblAssessWeight;
	static JTextField tfAssessWeight;
	static JLabel lblAssessBloodPressure;
	static JTextField tfAssessBloodPressure;
	static JLabel lblAssessTemperature;
	static JTextField tfAssessTemperature;
	static JLabel lblAssessCurrentSymptoms;
	static JTextField tfAssessCurrentSymptoms;
	static JCheckBox chckbxCold;
	static JCheckBox chckbxCough;
	static JCheckBox chckbxFatigue1;
	static JCheckBox chckbxFever1;
	static JCheckBox chckbxHemoptysis;
	static JCheckBox chckbxNightSweats;
	static JCheckBox chckbxWeightLoss;
	static JCheckBox chckbxWheezing;
	static JLabel lblAssessReportedSideEffects;
	static JCheckBox chckbxBodyPain;
	static JCheckBox chckbxBehavioralChanges;
	static JCheckBox chckbxDizziness;
	static JCheckBox chckbxFatigue2;
	static JCheckBox chckbxFever2;
	static JCheckBox chckbxJaundice;
	static JCheckBox chckbxJointPain;
	static JCheckBox chckbxLossOfAppetite;
	static JCheckBox chckbxNausea;
	static JCheckBox chckbxNumbness;
	static JCheckBox chckbxRash;
	static JScrollPane scrollPaneAssess;
	static JButton btnAssess;
	static JButton btnClear;
	static JButton btnAddRecords;
	

	public AssessTab(){
		
/***********************Labels and TextBoxes*****************************/
		lblDoctorsAssessments = new JLabel("Doctor's Assessments");
		lblDoctorsAssessments.setForeground(new Color(0, 128, 128));
		lblDoctorsAssessments.setBackground(Color.WHITE);
		lblDoctorsAssessments.setFont(new Font("Finale Copyist Text Ext", Font.BOLD, 16));
		lblDoctorsAssessments.setBounds(1095, 13, 190, 45);
		
		lblAssessControlNumber = new JLabel("Control Number:");
		lblAssessControlNumber.setForeground(new Color(0, 128, 128));
		lblAssessControlNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssessControlNumber.setBounds(10, 25, 130, 21);
		
		tfAssessControlNumber = new JTextField();
		tfAssessControlNumber.setBounds(138, 27, 209, 21);
		tfAssessControlNumber.setColumns(10);
		
		lblAssessDate = new JLabel("Date:");
		lblAssessDate.setForeground(new Color(0, 128, 128));
		lblAssessDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssessDate.setBounds(379, 25, 46, 21);
		
		tfAssessDate = new JTextField();
		tfAssessDate.setBounds(436, 27, 134, 21);
		tfAssessDate.setColumns(10);
		
		lblAssessAssessor = new JLabel("Assessor ID:");
		lblAssessAssessor.setForeground(new Color(0, 128, 128));
		lblAssessAssessor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssessAssessor.setBounds(462, 25, 97, 21);
		
		tfAssessAssessor = new JTextField();
		tfAssessAssessor.setBounds(566, 27, 218, 21);
		tfAssessAssessor.setColumns(10);
		
		lblAssessHeight = new JLabel("Height(ft):");
		lblAssessHeight.setForeground(new Color(0, 128, 128));
		lblAssessHeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessHeight.setBounds(122, 66, 85, 28);
		
		tfAssessHeight = new JTextField();
		tfAssessHeight.setBounds(202, 69, 96, 21);
		tfAssessHeight.setColumns(10);
		
		lblAssessWeight = new JLabel("Weight(kg): ");
		lblAssessWeight.setForeground(new Color(0, 128, 128));
		lblAssessWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessWeight.setBounds(115, 98, 91, 21);
		
		tfAssessWeight = new JTextField();
		tfAssessWeight.setBounds(202, 98, 96, 21);
		tfAssessWeight.setColumns(10);
		
		lblAssessBloodPressure = new JLabel("Blood Pressure: ");
		lblAssessBloodPressure.setForeground(new Color(0, 128, 128));
		lblAssessBloodPressure.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessBloodPressure.setBounds(476, 74, 113, 20);
		
		tfAssessBloodPressure = new JTextField();
		tfAssessBloodPressure.setBounds(601, 71, 140, 21);
		tfAssessBloodPressure.setColumns(10);
		
		lblAssessTemperature = new JLabel("Temperature(Celcius): ");
		lblAssessTemperature.setForeground(new Color(0, 128, 128));
		lblAssessTemperature.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessTemperature.setBounds(428, 98, 161, 21);
		
		tfAssessTemperature = new JTextField();
		tfAssessTemperature.setBounds(601, 99, 140, 20);
		tfAssessTemperature.setColumns(10);
		
		lblAssessCurrentSymptoms = new JLabel("Current Symptoms:");
		lblAssessCurrentSymptoms.setForeground(new Color(0, 128, 128));
		lblAssessCurrentSymptoms.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessCurrentSymptoms.setBounds(44, 141, 161, 21);
		
/******************* CheckBoxes ***************************************/
		
		chckbxCold = new JCheckBox("Cold");
		chckbxCold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCold.setBounds(70, 165, 84, 21);
		
		chckbxCough = new JCheckBox("Cough");
		chckbxCough.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCough.setBounds(70, 189, 84, 21);
		
		chckbxFatigue1 = new JCheckBox("Fatigue");
		chckbxFatigue1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxFatigue1.setBounds(70, 213, 76, 21);
		
		chckbxFever1 = new JCheckBox("Fever");
		chckbxFever1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxFever1.setBounds(70, 237, 84, 21);
		
		chckbxHemoptysis = new JCheckBox("Hemoptysis");
		chckbxHemoptysis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxHemoptysis.setBounds(70, 261, 96, 21);
		
		chckbxNightSweats = new JCheckBox("Night Sweats");
		chckbxNightSweats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNightSweats.setBounds(70, 285, 108, 21);
		
		chckbxWeightLoss = new JCheckBox("Weight Loss");
		chckbxWeightLoss.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxWeightLoss.setBounds(70, 309, 108, 23);
		
		chckbxWheezing = new JCheckBox("Wheezing");
		chckbxWheezing.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxWheezing.setBounds(70, 335, 108, 21);
		
		lblAssessReportedSideEffects = new JLabel("Reported Side Effects:");
		lblAssessReportedSideEffects.setForeground(new Color(0, 128, 128));
		lblAssessReportedSideEffects.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAssessReportedSideEffects.setBounds(297, 145, 162, 17);
		
		chckbxBodyPain = new JCheckBox("Body Pain");
		chckbxBodyPain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxBodyPain.setBounds(347, 165, 113, 21);
		
		chckbxDizziness = new JCheckBox("Dizziiness");
		chckbxDizziness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxDizziness.setBounds(348, 213, 96, 21);
		
		chckbxFatigue2 = new JCheckBox("Fatigue");
		chckbxFatigue2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxFatigue2.setBounds(347, 237, 108, 21);
		
		chckbxFever2 = new JCheckBox("Fever");
		chckbxFever2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxFever2.setBounds(347, 261, 108, 21);
		
		chckbxBehavioralChanges = new JCheckBox("Behavioral Changes");
		chckbxBehavioralChanges.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxBehavioralChanges.setBounds(347, 189, 153, 21);
		
		chckbxJaundice = new JCheckBox("Jaundice");
		chckbxJaundice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxJaundice.setBounds(347, 285, 112, 21);
		
		chckbxJointPain = new JCheckBox("Joint Pain");
		chckbxJointPain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxJointPain.setBounds(514, 165, 120, 21);
		
		chckbxLossOfAppetite = new JCheckBox("Loss of Appetite");
		chckbxLossOfAppetite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxLossOfAppetite.setBounds(514, 189, 134, 21);
		
		chckbxNausea = new JCheckBox("Nausea/Vomiting");
		chckbxNausea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNausea.setBounds(514, 213, 134, 21);
		
		chckbxNumbness = new JCheckBox("Numbness");
		chckbxNumbness.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNumbness.setBounds(514, 237, 120, 21);
		
		chckbxRash = new JCheckBox("Rash");
		chckbxRash.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxRash.setBounds(514, 261, 120, 21);
		
		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(1000, 424, 153, 29);
		
/**************************** Additional Components *******************************/

		scrollPaneAssess = new JScrollPane();
		scrollPaneAssess.setBounds(960, 54, 387, 359);
		
		btnAssess = new JButton("Assess");
		btnAssess.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAssess.setBounds(1190, 424, 140, 29);
		
		btnAddRecords = new JButton("Add Medical Records");
		btnAddRecords.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddRecords.setBounds(344, 424, 198, 29);
	}
	
/************************** Getters ****************************************************************/
	public JLabel getlblDoctorsAssessments(){
		return lblDoctorsAssessments;
	}
	
	public JLabel getlblAssessControlNumber(){
		return lblAssessControlNumber;
	}
	
	public JTextField gettfAssessControlNumber(){
		return tfAssessControlNumber;
	}
	
	public JLabel getlblAssessDate(){
		return lblAssessDate;
	}
	
	public JTextField gettfAssessDate(){
		return tfAssessDate;
	}
	
	public JLabel getlblAssessAssessor(){
		return lblAssessAssessor;
	}
	
	public JTextField gettfAssessAssessor(){
		return tfAssessAssessor;
	}
	
	public JLabel getlblAssessHeight(){
		return lblAssessHeight;
	}
	
	public JTextField gettfAssessHeight(){
		return tfAssessHeight;
	}
	
	public JLabel getlblAssessWeight(){
		return lblAssessWeight;
	}
	
	public JTextField gettfAssessWeight(){
		return tfAssessWeight;
	}
	
	public JLabel getlblAssessBloodPressure(){
		return lblAssessBloodPressure;
	}
	
	public JTextField gettfAssessBloodPressure(){
		return tfAssessBloodPressure;
	}
	
	public JLabel getlblAssessTemperature(){
		return lblAssessTemperature;
	}
	
	public JTextField gettfAssessTemperature(){
		return tfAssessTemperature;
	}
	
	public JLabel getlblAssessCurrentSymptoms(){
		return lblAssessCurrentSymptoms;
	}
	
	public JCheckBox getchckbxCold(){
		return chckbxCold;
	}
	
	public JCheckBox getchckbxCough(){
		return chckbxCough;
	}
	
	public JCheckBox getchckbxFatigue1(){
		return chckbxFatigue1;
	}
	
	public JCheckBox getchckbxFever1(){
		return chckbxFever1;
	}
	
	public JCheckBox getchckbxFever2(){
		return chckbxFever2;
	}
	
	public JCheckBox getchckbxHemoptysis(){
		return chckbxHemoptysis;
	}
	
	public JCheckBox getchckbxNightSweats(){
		return chckbxNightSweats;
	}
	
	public JCheckBox getchckbxWeightLoss(){
		return chckbxWeightLoss;
	}
	
	public JCheckBox getchckbxWheezing(){
		return chckbxWheezing;
	}
	
	public JLabel getlblAssessReportedSideEffects(){
		return lblAssessReportedSideEffects;
	}
	
	public JCheckBox getchckbxBodyPain(){
		return chckbxBodyPain;
	}
	
	public JCheckBox getchckbxBehavioralChanges(){
		return chckbxBehavioralChanges;
	}
	
	public JCheckBox getchckbxDizziness(){
		return chckbxDizziness;
	}
	
	public JCheckBox getchckbxFatigue2(){
		return chckbxFatigue2;
	}
	
	public JCheckBox getchckbxJaundice(){
		return chckbxJaundice;
	}
	
	public JCheckBox getchckbxJointPain(){
		return chckbxJointPain;
	}
	
	public JCheckBox getchckbxLossOfAppetite(){
		return chckbxLossOfAppetite;
	}
	
	public JCheckBox getchckbxNausea(){
		return chckbxNausea;
	}
	
	public JCheckBox getchckbxNumbness(){
		return chckbxNumbness;
	}
	
	public JCheckBox getchckbxRash(){
		return chckbxRash;
	}
	
	public JScrollPane getscrollPaneAssess(){
		return scrollPaneAssess;
	}
	
	public JButton getbtnAssess(){
		return btnAssess;
	}
	
	public JButton getbtnClear(){
		return btnClear;
	}
	
	public JButton getbtnAddRecords(){
		return btnAddRecords;
	}
}

