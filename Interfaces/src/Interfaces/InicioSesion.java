package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField emailsegundo;
	private JPasswordField contraseñasegundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(157, 28, 0, 0);
		panel.setLayout(null);
		panel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		
		JLabel TituloRegistro_1 = new JLabel("Register Form");
		TituloRegistro_1.setHorizontalAlignment(SwingConstants.CENTER);
		TituloRegistro_1.setForeground(Color.WHITE);
		TituloRegistro_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		TituloRegistro_1.setBackground(Color.BLACK);
		TituloRegistro_1.setBounds(20, 0, 649, 65);
		panel.add(TituloRegistro_1);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(162, 28, 0, 0);
		panel_1.setLayout(null);
		panel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel_1.setBackground(Color.BLACK);
		contentPane.add(panel_1);
		
		JLabel TituloRegistro_2 = new JLabel("Register Form");
		TituloRegistro_2.setHorizontalAlignment(SwingConstants.CENTER);
		TituloRegistro_2.setForeground(Color.WHITE);
		TituloRegistro_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		TituloRegistro_2.setBackground(Color.BLACK);
		TituloRegistro_2.setBounds(20, 0, 649, 65);
		panel_1.add(TituloRegistro_2);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(249, 3, 94, 65);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(0, 3, 596, 65);
		textField.setBackground(Color.BLACK);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-Mail");
		lblNewLabel_1_3.setBounds(71, 114, 77, 19);
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("");
		lblNewLabel_1_3_1.setBounds(20, 114, 53, 19);
		lblNewLabel_1_3_1.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/mail_30px.png")));
		lblNewLabel_1_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3_1);
		
		emailsegundo = new JTextField();
		emailsegundo.setBounds(157, 103, 395, 42);
		emailsegundo.setText("example@email.com");
		emailsegundo.setHorizontalAlignment(SwingConstants.CENTER);
		emailsegundo.setForeground(Color.BLACK);
		emailsegundo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		emailsegundo.setColumns(10);
		emailsegundo.setBackground(SystemColor.controlHighlight);
		contentPane.add(emailsegundo);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Password");
		lblNewLabel_1_3_1_1.setBounds(71, 189, 77, 19);
		lblNewLabel_1_3_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3_1_1);
		
		contraseñasegundo = new JPasswordField();
		contraseñasegundo.setBackground(SystemColor.controlHighlight);
		contraseñasegundo.setBounds(157, 180, 395, 42);
		contentPane.add(contraseñasegundo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(20, 181, 46, 27);
		lblNewLabel_1.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/password_30px.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel contraseñaolvidada = new JLabel("Have you forgotten your password?");
		contraseñaolvidada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new RecuperacionContraseña();
				frame.setVisible(true);
				dispose();
			}
		});
		contraseñaolvidada.setForeground(Color.BLUE);
		contraseñaolvidada.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contraseñaolvidada.setBounds(188, 248, 263, 33);
		contentPane.add(contraseñaolvidada);
	}
}
