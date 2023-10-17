package io.sidkulk.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DispatchPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField windDirectionTxt;
	private JTextField windSpeedTxt;
	private JTextField tempTxt;
	private JTextField dewTxt;
	private JTextField densityAltTxt;
	private JTextField altimeterSetTxt;
	private JTextField xwindCompTxt;
	private JTextField headWindCompTxt;

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
		setBounds(100, 100, 663, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dispatch Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel.setBounds(219, 12, 210, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Wind dir/spd");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1.setBounds(98, 107, 165, 39);
		contentPane.add(lblNewLabel_1);
		
		windDirectionTxt = new JTextField();
		windDirectionTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		windDirectionTxt.setToolTipText("Enter direction");
		windDirectionTxt.setBounds(273, 110, 67, 34);
		contentPane.add(windDirectionTxt);
		windDirectionTxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("/");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(350, 105, 23, 39);
		contentPane.add(lblNewLabel_1_1);
		
		windSpeedTxt = new JTextField();
		windSpeedTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		windSpeedTxt.setToolTipText("Enter wind speed");
		windSpeedTxt.setColumns(10);
		windSpeedTxt.setBounds(372, 110, 67, 34);
		contentPane.add(windSpeedTxt);
		
		JLabel lblNewLabel_1_2 = new JLabel("Temperature/Dew Point");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 165, 266, 39);
		contentPane.add(lblNewLabel_1_2);
		
		tempTxt = new JTextField();
		tempTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		tempTxt.setToolTipText("Enter direction");
		tempTxt.setColumns(10);
		tempTxt.setBounds(273, 170, 67, 34);
		contentPane.add(tempTxt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("/");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(350, 165, 23, 39);
		contentPane.add(lblNewLabel_1_1_1);
		
		dewTxt = new JTextField();
		dewTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		dewTxt.setToolTipText("Enter wind speed");
		dewTxt.setColumns(10);
		dewTxt.setBounds(372, 170, 67, 34);
		contentPane.add(dewTxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("Density Altitude");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(60, 224, 203, 39);
		contentPane.add(lblNewLabel_1_3);
		
		densityAltTxt = new JTextField();
		densityAltTxt.setEditable(false);
		densityAltTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		densityAltTxt.setToolTipText("Enter direction");
		densityAltTxt.setColumns(10);
		densityAltTxt.setBounds(273, 227, 114, 34);
		contentPane.add(densityAltTxt);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Altimeter Setting");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(47, 273, 216, 39);
		contentPane.add(lblNewLabel_1_3_1);
		
		altimeterSetTxt = new JTextField();
		altimeterSetTxt.setToolTipText("Enter direction");
		altimeterSetTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		altimeterSetTxt.setColumns(10);
		altimeterSetTxt.setBounds(273, 276, 114, 34);
		contentPane.add(altimeterSetTxt);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Crosswind Comp");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_3_2.setBounds(60, 322, 203, 39);
		contentPane.add(lblNewLabel_1_3_2);
		
		xwindCompTxt = new JTextField();
		xwindCompTxt.setToolTipText("Enter direction");
		xwindCompTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		xwindCompTxt.setEditable(false);
		xwindCompTxt.setColumns(10);
		xwindCompTxt.setBounds(273, 325, 114, 34);
		contentPane.add(xwindCompTxt);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Headwind Comp");
		lblNewLabel_1_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_3.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		lblNewLabel_1_3_3.setBounds(60, 377, 203, 39);
		contentPane.add(lblNewLabel_1_3_3);
		
		headWindCompTxt = new JTextField();
		headWindCompTxt.setToolTipText("Enter direction");
		headWindCompTxt.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		headWindCompTxt.setEditable(false);
		headWindCompTxt.setColumns(10);
		headWindCompTxt.setBounds(273, 380, 114, 34);
		contentPane.add(headWindCompTxt);
		
		JButton btnNewButton = new JButton("Compute Parameters");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("JetBrains Mono", Font.BOLD, 18));
		btnNewButton.setBounds(199, 465, 250, 34);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("JetBrains Mono", Font.BOLD, 18));
		btnClose.setBounds(199, 532, 250, 34);
		contentPane.add(btnClose);
	}
}
