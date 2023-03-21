package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RecuperacionContraseña extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField email3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecuperacionContraseña frame = new RecuperacionContraseña();
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
	public RecuperacionContraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modify your Password");
		lblNewLabel.setBounds(155, 26, 278, 28);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 710, 71);
		textField.setBackground(Color.BLACK);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-Mail");
		lblNewLabel_1_3.setBounds(101, 127, 77, 19);
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(52, 113, 53, 48);
		lblNewLabel_1.setIcon(new ImageIcon(RecuperacionContraseña.class.getResource("/Imagenes/mail_30px.png")));
		contentPane.add(lblNewLabel_1);
		
		email3 = new JTextField();
		email3.setText("example@email.com");
		email3.setHorizontalAlignment(SwingConstants.CENTER);
		email3.setForeground(Color.BLACK);
		email3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		email3.setColumns(10);
		email3.setBackground(SystemColor.controlHighlight);
		email3.setBounds(174, 116, 358, 42);
		contentPane.add(email3);
		
		JButton obtentuenlace = new JButton("Get your Link");
		obtentuenlace.setForeground(Color.WHITE);
		obtentuenlace.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		obtentuenlace.setBackground(Color.BLACK);
		obtentuenlace.setBounds(210, 230, 151, 48);
		contentPane.add(obtentuenlace);
	}
}
