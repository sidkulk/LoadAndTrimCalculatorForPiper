package io.sidkulk.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.sidkulk.view.helper.AircraftList;
import io.sidkulk.view.helper.ExerciseType;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DispatchPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DispatchPage frame = new DispatchPage();
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
	public DispatchPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dispatch Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel.setBounds(285, 12, 210, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A/C Type");
		lblNewLabel_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1.setBounds(32, 70, 113, 34);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<?> comboBox = new JComboBox<String>(AircraftList.getListOfAircraftType());
		comboBox.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		comboBox.setBounds(146, 70, 162, 34);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student:");
		lblNewLabel_1_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(376, 70, 113, 34);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
		textField.setBounds(488, 73, 263, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Instructor:");
		lblNewLabel_1_1_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(32, 132, 143, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(193, 134, 210, 31);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Exercise:");
		lblNewLabel_1_2.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(461, 132, 125, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JComboBox<String> comboBox_1 = new JComboBox<>(ExerciseType.getExerciseType());
		comboBox_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		comboBox_1.setBounds(589, 132, 162, 34);
		contentPane.add(comboBox_1);
	}
}
