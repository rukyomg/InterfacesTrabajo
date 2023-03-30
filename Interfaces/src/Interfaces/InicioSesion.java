package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField emailsegundo;
	private JPasswordField contraseñalogin;

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
		setBounds(100, 100, 544, 712);
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
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setBounds(204, 28, 127, 120);
		lblNewLabel_1_3.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/giphy (1) (2).gif")));
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("");
		lblNewLabel_1_3_1.setBounds(69, 189, 53, 19);
		lblNewLabel_1_3_1.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/mail_30px.png")));
		lblNewLabel_1_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3_1);
		
		emailsegundo = new JTextField();
		emailsegundo.setBounds(125, 178, 311, 42);
		emailsegundo.setText("E-Mail");
		emailsegundo.setHorizontalAlignment(SwingConstants.LEFT);
		emailsegundo.setForeground(Color.BLACK);
		emailsegundo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		emailsegundo.setColumns(10);
		emailsegundo.setBackground(SystemColor.controlHighlight);
		
		
		emailsegundo.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (emailsegundo.getText().equals("E-Mail")) {
		            emailsegundo.setText("");
		            emailsegundo.setForeground(Color.BLACK); 
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (emailsegundo.getText().isEmpty()) {
		            emailsegundo.setForeground(Color.BLACK); 
		            emailsegundo.setText("E-Mail");
		        }
		    }
		});
		
		

		contentPane.add(emailsegundo);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Password");
		lblNewLabel_1_3_1_1.setBounds(125, 189, 77, 19);
		lblNewLabel_1_3_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(69, 305, 46, 27);
		lblNewLabel_1.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/password_30px.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel contraseñaolvidada = new JLabel("Have you forgotten your password?");
		contraseñaolvidada.setBounds(125, 444, 253, 33);
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
		contentPane.add(contraseñaolvidada);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(157, 102, 45, 106);
		lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/giphy.gif")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(194, 119, 45, 13);
		lblNewLabel_3.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/giphy (1).gif")));
		contentPane.add(lblNewLabel_3);
		
		JButton botonregistro1 = new JButton("Register");
		botonregistro1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		botonregistro1.setBounds(157, 585, 184, 61);
		botonregistro1.setForeground(Color.BLACK);
		botonregistro1.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		botonregistro1.setBackground(Color.WHITE);
		contentPane.add(botonregistro1);
		
		botonregistro1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String email = emailsegundo.getText();
		        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {		     
		            System.out.println("Correo electrónico válido: " + email);
		        } else {
		            JOptionPane.showMessageDialog(null, "Ingrese un correo electrónico válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		
		contraseñalogin = new JPasswordField();
		contraseñalogin.setBounds(125, 301, 311, 42);
		contraseñalogin.setBackground(SystemColor.controlHighlight);
		contentPane.add(contraseñalogin);
		
		JButton validarContraseñaBtn = new JButton("Validar contraseña");
		validarContraseñaBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        char[] passwordChars = contraseñalogin.getPassword();
		        String password = new String(passwordChars);
		        
		       
		        boolean contraseñaSegura = password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
		        
		        if (contraseñaSegura) {
		            JOptionPane.showMessageDialog(null, "La contraseña es segura");
		        } else {
		            JOptionPane.showMessageDialog(null, "La contraseña no es segura. La contraseña debe tener al menos 8 caracteres, incluyendo al menos una letra mayúscula, una letra minúscula, un número y un carácter especial (@#$%^&+=)");
		        }
		    }
		});
		validarContraseñaBtn.setBounds(273, 353, 163, 30);
		contentPane.add(validarContraseñaBtn);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/icons8_invisible_32.png")));
		lblNewLabel_4.setBounds(455, 305, 46, 53);
		contentPane.add(lblNewLabel_4);
		
		JLabel noaccount = new JLabel("Don't have account?");
		noaccount.setForeground(Color.BLUE);
		noaccount.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		noaccount.setBounds(177, 512, 164, 33);
		contentPane.add(noaccount);
		noaccount.addMouseListener(new MouseAdapter() {	
		
		public void mouseClicked(MouseEvent e) {
			JFrame frame = new ventanaPrincipal();
			frame.setVisible(true);
			dispose();
		}
	});
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-246, 10, 776, 676);
		lblNewLabel_2.setIcon(new ImageIcon(InicioSesion.class.getResource("/Imagenes/HD-wallpaper-circuit-neon-green-abstract-android-black-board-circuits-computer-motherboard-tech-technology.jpg")));
		contentPane.add(lblNewLabel_2);
	}
}
