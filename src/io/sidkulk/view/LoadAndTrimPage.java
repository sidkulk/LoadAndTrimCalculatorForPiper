package io.sidkulk.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import io.sidkulk.database.StaticDatabaseProvider;
import io.sidkulk.exceptions.AllUpWeightOutOfLimitsException;
import io.sidkulk.model.Aircraft;
import io.sidkulk.view.helper.AircraftList;
import io.sidkulk.view.helper.LoadAndTrimCalculations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoadAndTrimPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtItemDescription;
	private JTextField txtWeightInKg;
	private JTextField txtArmInCm;
	private JTextField txtMomentInKgcm;
	private JTextField txtAcEmptyWeight;
	private JTextField txtRampFuelWeight;
	private JTextField txtPicWeight;
	private JTextField txtCopilotWeight;
	private JTextField txtRearPaxLh;
	private JTextField txtRearPaxRh;
	private JTextField txtBaggageArea;
	private JTextField txtMaxRampWeight;
	private JTextField txtFuelAllowance;
	private JTextField txtMaxAllUp;
	private JTextField acEmptyWeightTxt;
	private JTextField acCgArmTxt;
	private JTextField acMomentTxt;
	private JTextField acFuelWeightTxt;
	private JTextField acFuelArmTxt;
	private JTextField acFuelMomentTxt;
	private JTextField picWeightTxt;
	private JTextField picArmtxt;
	private JTextField picMomentTxt;
	private JTextField copWeightTxt;
	private JTextField copArmTxt;
	private JTextField copMomentTxt;
	private JTextField rearLHPaxWeightTxt;
	private JTextField rearLHPaxArmTxt;
	private JTextField rearLHPaxMomentTxt;
	private JTextField rearRHPaxWeightTxt;
	private JTextField rearRHPaxArmTxt;
	private JTextField rearRHPaxMomentTxt;
	private JTextField baggageWeighttxt;
	private JTextField baggageArmTxt;
	private JTextField baggageMomentTxt;
	private JTextField sumOfAllWeightsTxt;
	private JTextField textField_7;
	private JTextField sumOfAllMomentsTxt;
	private JTextField fuelAllowanceWeightTxt;
	private JTextField textField_10;
	private JTextField fuelAllowanceMomentTxt;
	private JTextField maxAllUpWeightTxt;
	private JTextField txtTotalMoment;
	private JTextField maxAllUpMomentTxt;

	private static Map<String, Aircraft> aircraftDatabase = StaticDatabaseProvider.getAircraftDatabase();
	private JTextField txtMomentCorrospendingTo;
	private JTextField auwMomentTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadAndTrimPage frame = new LoadAndTrimPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoadAndTrimPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 790);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Load And Trim Page");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(328, 24, 255, 36);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("A/C Registration :");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 72, 207, 36);
		getContentPane().add(lblNewLabel_1);

		txtItemDescription = new JTextField();
		txtItemDescription.setEditable(false);
		txtItemDescription.setHorizontalAlignment(SwingConstants.CENTER);
		txtItemDescription.setFont(new Font("Dialog", Font.BOLD, 20));
		txtItemDescription.setText("Item Description");
		txtItemDescription.setBounds(12, 120, 234, 32);
		getContentPane().add(txtItemDescription);
		txtItemDescription.setColumns(10);

		txtWeightInKg = new JTextField();
		txtWeightInKg.setEditable(false);
		txtWeightInKg.setText("Weight in Kg");
		txtWeightInKg.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeightInKg.setFont(new Font("Dialog", Font.BOLD, 20));
		txtWeightInKg.setColumns(10);
		txtWeightInKg.setBounds(258, 120, 207, 32);
		getContentPane().add(txtWeightInKg);

		txtArmInCm = new JTextField();
		txtArmInCm.setEditable(false);
		txtArmInCm.setText("Arm in Cm");
		txtArmInCm.setHorizontalAlignment(SwingConstants.CENTER);
		txtArmInCm.setFont(new Font("Dialog", Font.BOLD, 20));
		txtArmInCm.setColumns(10);
		txtArmInCm.setBounds(477, 120, 166, 32);
		getContentPane().add(txtArmInCm);

		txtMomentInKgcm = new JTextField();
		txtMomentInKgcm.setEditable(false);
		txtMomentInKgcm.setText("Moment in KgCm");
		txtMomentInKgcm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMomentInKgcm.setFont(new Font("Dialog", Font.BOLD, 20));
		txtMomentInKgcm.setColumns(10);
		txtMomentInKgcm.setBounds(663, 114, 210, 44);
		getContentPane().add(txtMomentInKgcm);

		txtAcEmptyWeight = new JTextField();
		txtAcEmptyWeight.setEditable(false);
		txtAcEmptyWeight.setText("A/C Empty Weight");
		txtAcEmptyWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcEmptyWeight.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtAcEmptyWeight.setColumns(10);
		txtAcEmptyWeight.setBounds(22, 164, 207, 32);
		getContentPane().add(txtAcEmptyWeight);

		txtRampFuelWeight = new JTextField();
		txtRampFuelWeight.setEditable(false);
		txtRampFuelWeight.setText("Ramp Fuel Weight");
		txtRampFuelWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtRampFuelWeight.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtRampFuelWeight.setColumns(10);
		txtRampFuelWeight.setBounds(22, 208, 207, 32);
		getContentPane().add(txtRampFuelWeight);

		txtPicWeight = new JTextField();
		txtPicWeight.setEditable(false);
		txtPicWeight.setText("PiC Weight");
		txtPicWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtPicWeight.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtPicWeight.setColumns(10);
		txtPicWeight.setBounds(22, 252, 207, 32);
		getContentPane().add(txtPicWeight);

		txtCopilotWeight = new JTextField();
		txtCopilotWeight.setEditable(false);
		txtCopilotWeight.setText("Co-Pilot Weight");
		txtCopilotWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtCopilotWeight.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtCopilotWeight.setColumns(10);
		txtCopilotWeight.setBounds(22, 296, 207, 32);
		getContentPane().add(txtCopilotWeight);

		txtRearPaxLh = new JTextField();
		txtRearPaxLh.setEditable(false);
		txtRearPaxLh.setText("Rear Pax LH Weight");
		txtRearPaxLh.setHorizontalAlignment(SwingConstants.CENTER);
		txtRearPaxLh.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtRearPaxLh.setColumns(10);
		txtRearPaxLh.setBounds(22, 340, 207, 32);
		getContentPane().add(txtRearPaxLh);

		txtRearPaxRh = new JTextField();
		txtRearPaxRh.setEditable(false);
		txtRearPaxRh.setText("Rear Pax RH Weight");
		txtRearPaxRh.setHorizontalAlignment(SwingConstants.CENTER);
		txtRearPaxRh.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtRearPaxRh.setColumns(10);
		txtRearPaxRh.setBounds(22, 384, 207, 32);
		getContentPane().add(txtRearPaxRh);

		txtBaggageArea = new JTextField();
		txtBaggageArea.setEditable(false);
		txtBaggageArea.setText("Baggage Area");
		txtBaggageArea.setHorizontalAlignment(SwingConstants.CENTER);
		txtBaggageArea.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtBaggageArea.setColumns(10);
		txtBaggageArea.setBounds(22, 428, 207, 32);
		getContentPane().add(txtBaggageArea);

		txtMaxRampWeight = new JTextField();
		txtMaxRampWeight.setEditable(false);
		txtMaxRampWeight.setText("Max Ramp Weight");
		txtMaxRampWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaxRampWeight.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtMaxRampWeight.setColumns(10);
		txtMaxRampWeight.setBounds(22, 472, 207, 32);
		getContentPane().add(txtMaxRampWeight);

		txtFuelAllowance = new JTextField();
		txtFuelAllowance.setEditable(false);
		txtFuelAllowance.setText("Fuel Allowance");
		txtFuelAllowance.setHorizontalAlignment(SwingConstants.CENTER);
		txtFuelAllowance.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtFuelAllowance.setColumns(10);
		txtFuelAllowance.setBounds(22, 516, 207, 32);
		getContentPane().add(txtFuelAllowance);

		txtMaxAllUp = new JTextField();
		txtMaxAllUp.setEditable(false);
		txtMaxAllUp.setText("Max All Up Weight");
		txtMaxAllUp.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaxAllUp.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtMaxAllUp.setColumns(10);
		txtMaxAllUp.setBounds(22, 560, 207, 32);
		getContentPane().add(txtMaxAllUp);

		acEmptyWeightTxt = new JTextField();
		acEmptyWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acEmptyWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acEmptyWeightTxt.setEditable(false);
		acEmptyWeightTxt.setColumns(10);
		acEmptyWeightTxt.setBounds(258, 164, 193, 32);
		getContentPane().add(acEmptyWeightTxt);

		acCgArmTxt = new JTextField();
		acCgArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acCgArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acCgArmTxt.setEditable(false);
		acCgArmTxt.setColumns(10);
		acCgArmTxt.setBounds(463, 164, 193, 32);
		getContentPane().add(acCgArmTxt);

		acMomentTxt = new JTextField();
		acMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acMomentTxt.setEditable(false);
		acMomentTxt.setColumns(10);
		acMomentTxt.setBounds(668, 164, 193, 32);
		getContentPane().add(acMomentTxt);

		acFuelWeightTxt = new JTextField();
		acFuelWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acFuelWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acFuelWeightTxt.setColumns(10);
		acFuelWeightTxt.setBounds(258, 208, 96, 32);
		getContentPane().add(acFuelWeightTxt);

		acFuelArmTxt = new JTextField();
		acFuelArmTxt.setText("241.0");
		acFuelArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acFuelArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acFuelArmTxt.setEditable(false);
		acFuelArmTxt.setColumns(10);
		acFuelArmTxt.setBounds(463, 208, 193, 32);
		getContentPane().add(acFuelArmTxt);

		acFuelMomentTxt = new JTextField();
		acFuelMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		acFuelMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		acFuelMomentTxt.setEditable(false);
		acFuelMomentTxt.setColumns(10);
		acFuelMomentTxt.setBounds(668, 208, 193, 32);
		getContentPane().add(acFuelMomentTxt);

		picWeightTxt = new JTextField();
		picWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		picWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		picWeightTxt.setColumns(10);
		picWeightTxt.setBounds(258, 252, 193, 32);
		getContentPane().add(picWeightTxt);

		picArmtxt = new JTextField();
		picArmtxt.setText("204.0");
		picArmtxt.setHorizontalAlignment(SwingConstants.CENTER);
		picArmtxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		picArmtxt.setEditable(false);
		picArmtxt.setColumns(10);
		picArmtxt.setBounds(463, 252, 193, 32);
		getContentPane().add(picArmtxt);

		picMomentTxt = new JTextField();
		picMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		picMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		picMomentTxt.setEditable(false);
		picMomentTxt.setColumns(10);
		picMomentTxt.setBounds(668, 252, 193, 32);
		getContentPane().add(picMomentTxt);

		copWeightTxt = new JTextField();
		copWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		copWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		copWeightTxt.setColumns(10);
		copWeightTxt.setBounds(258, 296, 193, 32);
		getContentPane().add(copWeightTxt);

		copArmTxt = new JTextField();
		copArmTxt.setText("204.0");
		copArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		copArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		copArmTxt.setEditable(false);
		copArmTxt.setColumns(10);
		copArmTxt.setBounds(463, 296, 193, 32);
		getContentPane().add(copArmTxt);

		copMomentTxt = new JTextField();
		copMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		copMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		copMomentTxt.setEditable(false);
		copMomentTxt.setColumns(10);
		copMomentTxt.setBounds(668, 296, 193, 32);
		getContentPane().add(copMomentTxt);

		rearLHPaxWeightTxt = new JTextField();
		rearLHPaxWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearLHPaxWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearLHPaxWeightTxt.setColumns(10);
		rearLHPaxWeightTxt.setBounds(258, 340, 193, 32);
		getContentPane().add(rearLHPaxWeightTxt);

		rearLHPaxArmTxt = new JTextField();
		rearLHPaxArmTxt.setText("300.0");
		rearLHPaxArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearLHPaxArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearLHPaxArmTxt.setEditable(false);
		rearLHPaxArmTxt.setColumns(10);
		rearLHPaxArmTxt.setBounds(463, 340, 193, 32);
		getContentPane().add(rearLHPaxArmTxt);

		rearLHPaxMomentTxt = new JTextField();
		rearLHPaxMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearLHPaxMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearLHPaxMomentTxt.setEditable(false);
		rearLHPaxMomentTxt.setColumns(10);
		rearLHPaxMomentTxt.setBounds(668, 340, 193, 32);
		getContentPane().add(rearLHPaxMomentTxt);

		rearRHPaxWeightTxt = new JTextField();
		rearRHPaxWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearRHPaxWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearRHPaxWeightTxt.setColumns(10);
		rearRHPaxWeightTxt.setBounds(258, 384, 193, 32);
		getContentPane().add(rearRHPaxWeightTxt);

		rearRHPaxArmTxt = new JTextField();
		rearRHPaxArmTxt.setText("300.0");
		rearRHPaxArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearRHPaxArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearRHPaxArmTxt.setEditable(false);
		rearRHPaxArmTxt.setColumns(10);
		rearRHPaxArmTxt.setBounds(463, 384, 193, 32);
		getContentPane().add(rearRHPaxArmTxt);

		rearRHPaxMomentTxt = new JTextField();
		rearRHPaxMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		rearRHPaxMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		rearRHPaxMomentTxt.setEditable(false);
		rearRHPaxMomentTxt.setColumns(10);
		rearRHPaxMomentTxt.setBounds(668, 384, 193, 32);
		getContentPane().add(rearRHPaxMomentTxt);

		baggageWeighttxt = new JTextField();
		baggageWeighttxt.setHorizontalAlignment(SwingConstants.CENTER);
		baggageWeighttxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		baggageWeighttxt.setColumns(10);
		baggageWeighttxt.setBounds(258, 428, 193, 32);
		getContentPane().add(baggageWeighttxt);

		baggageArmTxt = new JTextField();
		baggageArmTxt.setText("363.0");
		baggageArmTxt.setHorizontalAlignment(SwingConstants.CENTER);
		baggageArmTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		baggageArmTxt.setEditable(false);
		baggageArmTxt.setColumns(10);
		baggageArmTxt.setBounds(463, 428, 193, 32);
		getContentPane().add(baggageArmTxt);

		baggageMomentTxt = new JTextField();
		baggageMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		baggageMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		baggageMomentTxt.setEditable(false);
		baggageMomentTxt.setColumns(10);
		baggageMomentTxt.setBounds(668, 428, 193, 32);
		getContentPane().add(baggageMomentTxt);

		sumOfAllWeightsTxt = new JTextField();
		sumOfAllWeightsTxt.setEditable(false);
		sumOfAllWeightsTxt.setHorizontalAlignment(SwingConstants.CENTER);
		sumOfAllWeightsTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		sumOfAllWeightsTxt.setColumns(10);
		sumOfAllWeightsTxt.setBounds(258, 472, 193, 32);
		getContentPane().add(sumOfAllWeightsTxt);

		textField_7 = new JTextField();
		textField_7.setText("-");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(463, 472, 193, 32);
		getContentPane().add(textField_7);

		sumOfAllMomentsTxt = new JTextField();
		sumOfAllMomentsTxt.setHorizontalAlignment(SwingConstants.CENTER);
		sumOfAllMomentsTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		sumOfAllMomentsTxt.setEditable(false);
		sumOfAllMomentsTxt.setColumns(10);
		sumOfAllMomentsTxt.setBounds(668, 472, 193, 32);
		getContentPane().add(sumOfAllMomentsTxt);

		fuelAllowanceWeightTxt = new JTextField();
		fuelAllowanceWeightTxt.setText("-1.00");
		fuelAllowanceWeightTxt.setEditable(false);
		fuelAllowanceWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		fuelAllowanceWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		fuelAllowanceWeightTxt.setColumns(10);
		fuelAllowanceWeightTxt.setBounds(258, 516, 193, 32);
		getContentPane().add(fuelAllowanceWeightTxt);

		textField_10 = new JTextField();
		textField_10.setText("241.0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(463, 516, 193, 32);
		getContentPane().add(textField_10);

		fuelAllowanceMomentTxt = new JTextField();
		fuelAllowanceMomentTxt.setText("-241.0");
		fuelAllowanceMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		fuelAllowanceMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		fuelAllowanceMomentTxt.setEditable(false);
		fuelAllowanceMomentTxt.setColumns(10);
		fuelAllowanceMomentTxt.setBounds(668, 516, 193, 32);
		getContentPane().add(fuelAllowanceMomentTxt);

		maxAllUpWeightTxt = new JTextField();
		maxAllUpWeightTxt.setEditable(false);
		maxAllUpWeightTxt.setHorizontalAlignment(SwingConstants.CENTER);
		maxAllUpWeightTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		maxAllUpWeightTxt.setColumns(10);
		maxAllUpWeightTxt.setBounds(258, 560, 193, 32);
		getContentPane().add(maxAllUpWeightTxt);

		txtTotalMoment = new JTextField();
		txtTotalMoment.setText("Total Moment");
		txtTotalMoment.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalMoment.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtTotalMoment.setEditable(false);
		txtTotalMoment.setColumns(10);
		txtTotalMoment.setBounds(463, 560, 193, 32);
		getContentPane().add(txtTotalMoment);

		maxAllUpMomentTxt = new JTextField();
		maxAllUpMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		maxAllUpMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		maxAllUpMomentTxt.setEditable(false);
		maxAllUpMomentTxt.setColumns(10);
		maxAllUpMomentTxt.setBounds(668, 560, 193, 32);
		getContentPane().add(maxAllUpMomentTxt);

		JComboBox<String> aircraftList = new JComboBox<>(AircraftList.getListOfAircrafts());
		aircraftList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selected item: " + aircraftList.getSelectedItem().toString());
				switch (aircraftList.getSelectedItem().toString()) {
				case "VT-CHM": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}

				case "VT-CHE": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHN": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHO": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHQ": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHR": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHY": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHX": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHT": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;

				case "VT-CHS": {
					Aircraft selectedAircraft = aircraftDatabase.get(aircraftList.getSelectedItem().toString());
					acEmptyWeightTxt.setText(Double.toString(selectedAircraft.getEmptyWeight()));
					acCgArmTxt.setText(Double.toString(selectedAircraft.getEmptyWeightCG()));
					acMomentTxt.setText(LoadAndTrimCalculations.getAircraftWeightCGMoment(selectedAircraft));
				}
					break;
				}
			}
		});
		aircraftList.setFont(new Font("Dialog", Font.BOLD, 19));
		aircraftList.setBounds(247, 74, 186, 32);
		getContentPane().add(aircraftList);

		JButton calculateLoadAndTrimBtn = new JButton("Calculate Load");
		calculateLoadAndTrimBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double aircraftMoment = 0.0;
				try {
					aircraftMoment = Double.parseDouble(acMomentTxt.getText());
				} catch (NumberFormatException e1) {
					System.err.println("A/C Registration Field left blank");
					e1.printStackTrace();
				}
				double rampFuelMoment = 0.0;
				double picMoment = 0.0;
				double copMoment = 0.0;
				double rearPaxLHMoment = 0.0;
				double rearPaxRHMoment = 0.0;
				double baggageAreaMoment = 0.0;
				double momentSum = aircraftMoment;

				double acBasicEmptyWeight = 0.0;
				try {
					acBasicEmptyWeight = Double.parseDouble(acEmptyWeightTxt.getText());
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Select an Aircraft!", "Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				double fuelWeightValue = 0.0;
				double picWeightValue = 0.0;
				double copWeightValue = 0.0;
				double rearPaxLHWeightValue = 0.0;
				double rearPaxRHWeightValue = 0.0;
				double baggageAreaWeightValue = 0.0;
				double weightSum = acBasicEmptyWeight;
				try {
					String rampFuelWeight = acFuelWeightTxt.getText();
					fuelWeightValue = Double.parseDouble(rampFuelWeight);
					weightSum = weightSum + LoadAndTrimCalculations.getFuelWeightValue(fuelWeightValue);
					String acFuelArm = acFuelArmTxt.getText();
					if (rampFuelWeight.isBlank()) {
						throw new IllegalStateException("Fuel Field left blank!");
					} else {
						rampFuelMoment = LoadAndTrimCalculations.getRampFuelMoment(Double.parseDouble(rampFuelWeight),
								Double.parseDouble(acFuelArm));
						momentSum += rampFuelMoment;
						acFuelMomentTxt.setText(Double.toString(rampFuelMoment));
					}

					String picWeight = picWeightTxt.getText();
					picWeightValue = Double.parseDouble(picWeight);
					weightSum += picWeightValue;
					String picArm = picArmtxt.getText();
					if (picWeight.isEmpty()) {
						throw new IllegalStateException("Pilot in Command Field left blank!");
					} else {
						picMoment = LoadAndTrimCalculations.getPicMoment(Double.parseDouble(picWeight),
								Double.parseDouble(picArm));
						momentSum += picMoment;
						picMomentTxt.setText(Double.toString(picMoment));
					}

					String copWeight = copWeightTxt.getText();
					copWeightValue = Double.parseDouble(copWeight);
					weightSum += copWeightValue;
					String copArm = copArmTxt.getText();
					if (copWeight.isEmpty()) {
						throw new IllegalStateException("Co-Pilot/Observer Field left blank!");
					} else {
						copMoment = LoadAndTrimCalculations.getCopMoment(Double.parseDouble(copWeight),
								Double.parseDouble(copArm));
						momentSum += copMoment;
						copMomentTxt.setText(Double.toString(copMoment));
					}

					String rearPaxLHWeight = rearLHPaxWeightTxt.getText();
					rearPaxLHWeightValue = Double.parseDouble(rearPaxLHWeight);
					weightSum += rearPaxLHWeightValue;
					String rearPaxLHArm = rearLHPaxArmTxt.getText();
					if (rearPaxLHWeight.isEmpty()) {
						throw new IllegalStateException("Rear LH Pax Field left blank!");
					} else {
						rearPaxLHMoment = LoadAndTrimCalculations.getRearPaxLHMoment(
								Double.parseDouble(rearPaxLHWeight), Double.parseDouble(rearPaxLHArm));
						momentSum += rearPaxLHMoment;
						rearLHPaxMomentTxt.setText(Double.toString(rearPaxLHMoment));
					}

					String rearPaxRHWeight = rearRHPaxWeightTxt.getText();
					rearPaxRHWeightValue = Double.parseDouble(rearPaxRHWeight);
					weightSum += rearPaxRHWeightValue;
					String rearPaxRHArm = rearRHPaxArmTxt.getText();
					if (rearPaxRHWeight.isEmpty()) {
						throw new IllegalStateException("Rear RH pax Field left blank!");
					} else {
						rearPaxRHMoment = LoadAndTrimCalculations.getRearPaxRHMoment(
								Double.parseDouble(rearPaxRHWeight), Double.parseDouble(rearPaxRHArm));
						momentSum += rearPaxRHMoment;
						rearRHPaxMomentTxt.setText(Double.toString(rearPaxRHMoment));
					}

					String baggageAreaWeight = baggageWeighttxt.getText();
					baggageAreaWeightValue = Double.parseDouble(baggageAreaWeight);
					weightSum += baggageAreaWeightValue;
					String baggageAreaArm = baggageArmTxt.getText();
					if (baggageAreaWeight.isEmpty()) {
						throw new IllegalStateException("Baggage Area Field left blank!");
					} else {
						baggageAreaMoment = LoadAndTrimCalculations.getBaggageAreaMoment(baggageAreaWeightValue,
								Double.parseDouble(baggageAreaArm));
						momentSum += baggageAreaMoment;
						baggageMomentTxt.setText(Double.toString(baggageAreaMoment));
					}
					System.out.println("Total Weight = " + weightSum);
					double totalRampWeight = weightSum;
					sumOfAllWeightsTxt
							.setText(Double.toString(LoadAndTrimCalculations.getFormattedValue(totalRampWeight)));
					maxAllUpWeightTxt.setText(Double.toString(LoadAndTrimCalculations
							.getFormattedValue(LoadAndTrimCalculations.getMaxAllUpWeight(totalRampWeight))));
					sumOfAllMomentsTxt.setText(Double.toString(LoadAndTrimCalculations.getFormattedValue(momentSum)));
					maxAllUpMomentTxt.setText(Double.toString(LoadAndTrimCalculations
							.getFormattedValue(LoadAndTrimCalculations.getMaxAllUpMoment(momentSum))));
					double auwMoment = LoadAndTrimCalculations.getAllUpMoment(
							Double.parseDouble(maxAllUpMomentTxt.getText()),
							Double.parseDouble(maxAllUpWeightTxt.getText()));
					auwMoment = LoadAndTrimCalculations.getFormattedValue(auwMoment);
					auwMomentTxt.setText(Double.toString(auwMoment));
					if (totalRampWeight > 1157) {
						throw new AllUpWeightOutOfLimitsException("Load OUT OF LIMITS!!");
					}
				} catch (IllegalStateException ise) {
					ise.printStackTrace();
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Check all fields carefully!", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.err.println("NumberFormatException occured!");
					nfe.printStackTrace();
				} catch (AllUpWeightOutOfLimitsException exe) {
					JOptionPane.showMessageDialog(null, "ALL UP WEIGHT OUT OF LIMITS!!!!", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.err.println("NumberFormatException occured!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,
							"Program encountered a FATAL INTERNAL ERROR. CONTACT SOFTWARE VENDOR!", "Error",
							JOptionPane.ERROR_MESSAGE);
					System.err.println("Something went wrong!");
				}
			}
		});
		calculateLoadAndTrimBtn.setFont(new Font("Dialog", Font.BOLD, 18));
		calculateLoadAndTrimBtn.setBounds(128, 632, 186, 36);
		getContentPane().add(calculateLoadAndTrimBtn);

		txtMomentCorrospendingTo = new JTextField();
		txtMomentCorrospendingTo.setText("Moment corrospending to AUW");
		txtMomentCorrospendingTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMomentCorrospendingTo.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtMomentCorrospendingTo.setEditable(false);
		txtMomentCorrospendingTo.setColumns(10);
		txtMomentCorrospendingTo.setBounds(328, 632, 328, 36);
		getContentPane().add(txtMomentCorrospendingTo);

		auwMomentTxt = new JTextField();
		auwMomentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		auwMomentTxt.setFont(new Font("Dialog", Font.PLAIN, 18));
		auwMomentTxt.setEditable(false);
		auwMomentTxt.setColumns(10);
		auwMomentTxt.setBounds(668, 634, 193, 32);
		getContentPane().add(auwMomentTxt);

		JLabel lblNewLabel_2 = new JLabel("X 0.84");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(356, 208, 86, 32);
		getContentPane().add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Dispatch Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DispatchPage dispatchPage = new DispatchPage();
				JOptionPane.showMessageDialog(null,
						"DISPATCH PAGE IS STILL UNDER DEVELOPMENT. WIND COMPONENT VALUES MAY NOT BE ACCURATE!",
						"WARNING", JOptionPane.WARNING_MESSAGE);
				dispatchPage.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setBounds(356, 698, 199, 36);
		getContentPane().add(btnNewButton);
	}
}
