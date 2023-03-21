package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField correo;
	private JTextField ncodigo;
	private JTextField ntelefono;
	private JPasswordField contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 783);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 123, -336, 5);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(86, 109, 68, 19);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-Mail");
		lblNewLabel_1_3.setBounds(86, 184, 77, 19);
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3);
		
		Nombre = new JTextField();
		Nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Nombre.setBounds(167, 98, 218, 42);
		Nombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setText("Enter your name");
		Nombre.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(Nombre.getText().equals("Enter your name")) {
					Nombre.setText("");
					Nombre.setForeground(new Color(0,0,0));
				}
			}
			
			public void focusLost(FocusEvent e) {
				if(Nombre.getText().equals("")){
					Nombre.setText("Enter your name");
					Nombre.setForeground(new Color(0,0,0));
				}
			}
		});


		
		
		
		Nombre.setForeground(Color.BLACK);
		Nombre.setBackground(new Color(227, 227, 227));
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 669, 66);
		panel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.setBackground(SystemColor.desktop);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel TituloRegistro = new JLabel("Register Form");
		TituloRegistro.setForeground(SystemColor.window);
		TituloRegistro.setBackground(SystemColor.desktop);
		TituloRegistro.setBounds(20, 0, 649, 65);
		panel.add(TituloRegistro);
		TituloRegistro.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		TituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox Terminos = new JCheckBox("I accept Terms and Conditions");
		Terminos.setBounds(231, 560, 232, 32);
		Terminos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		Terminos.setBackground(new Color(255, 255, 255));
		Terminos.setForeground(new Color(0, 0, 0));
		contentPane.add(Terminos);
		
		JButton botonregistro1 = new JButton("Register");
		botonregistro1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String telefono = ntelefono.getText().trim(); 
		        if (!telefono.matches("\\d{9}")) { 
		            JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Invalid phone number", JOptionPane.ERROR_MESSAGE);
		        } else {	   
		            JFrame frame = new InicioSesion();
		            frame.setVisible(true);
		            dispose();
		        }
		    }
		});
		
		
		botonregistro1.setBounds(254, 664, 184, 61);
		botonregistro1.setForeground(Color.WHITE);
		botonregistro1.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		botonregistro1.setBackground(Color.BLACK);
		contentPane.add(botonregistro1);
		
		Apellido = new JTextField();
		Apellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(Apellido.getText().equals("Enter your Last Name")) {
					Apellido.setText("");
					Apellido.setForeground(new Color(0,0,0));
				}
			}
			
			public void focusLost(FocusEvent e) {
				if(Apellido.getText().equals("")){
					Apellido.setText("Enter your Last Name");
					Apellido.setForeground(new Color(0,0,0));
				}
			}
		});
	
		
		
		Apellido.setBounds(407, 98, 218, 42);
		Apellido.setText("Enter your Last Name");
		Apellido.setHorizontalAlignment(SwingConstants.CENTER);
		Apellido.setForeground(Color.BLACK);
		Apellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Apellido.setColumns(10);
		Apellido.setBackground(SystemColor.controlHighlight);
		contentPane.add(Apellido);
		
		JLabel Phone = new JLabel("Phone");
		Phone.setBounds(86, 257, 77, 19);
		Phone.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(Phone);
		
		correo = new JTextField();
		correo.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if(correo.getText().equals("example@email.com")) {
		            correo.setText("");
		            correo.setForeground(new Color(0,0,0));
		        }
		    }
		        
		    public void focusLost(FocusEvent e) {
		        String email = correo.getText();
		        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		        if(email.equals("")) {
		            correo.setText("example@email.com");
		            correo.setForeground(new Color(0,0,0));
		        } else if (!email.matches(emailRegex)) {
		            JOptionPane.showMessageDialog(null, "Por favor, introduzca un correo electrónico válido.");
		            correo.requestFocus();
		        }
		    }
		});
		
		
		correo.setBounds(164, 173, 461, 42);
		correo.setHorizontalAlignment(SwingConstants.CENTER);
		correo.setText("example@email.com");
		correo.setForeground(Color.BLACK);
		correo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		correo.setColumns(10);
		correo.setBackground(SystemColor.controlHighlight);
		contentPane.add(correo);
		
		ncodigo = new JTextField();
		ncodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
			
			}
		});
		
		
		
		ncodigo.setBounds(164, 246, 110, 42);
		ncodigo.setText("Area Code");
		ncodigo.setHorizontalAlignment(SwingConstants.CENTER);
		ncodigo.setForeground(Color.BLACK);
		ncodigo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		ncodigo.setColumns(10);
		ncodigo.setBackground(SystemColor.controlHighlight);
		contentPane.add(ncodigo);
		
		ntelefono = new JTextField();
		ntelefono.addFocusListener(new FocusAdapter() {
			@Override
		    public void focusGained(FocusEvent e) {
		        if (ntelefono.getText().equals("Phone Number")) {
		            ntelefono.setText("");
		            ntelefono.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (ntelefono.getText().isEmpty()) {
		            ntelefono.setText("Phone Number");
		            ntelefono.setForeground(Color.BLACK);
		        }
		    }
		});
		
		ntelefono.setBounds(301, 246, 324, 42);
		ntelefono.setText("Phone Number");
		ntelefono.setHorizontalAlignment(SwingConstants.CENTER);
		ntelefono.setForeground(Color.BLACK);
		ntelefono.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		ntelefono.setColumns(10);
		ntelefono.setBackground(SystemColor.controlHighlight);
		contentPane.add(ntelefono);

		ntelefono.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c) || ntelefono.getText().length() >= 9) {
		            e.consume();
		        }
		    }
		});
		
		
		
		JLabel lblSelectYourRegion = new JLabel("Select your Region");
		lblSelectYourRegion.setBounds(86, 340, 131, 19);
		lblSelectYourRegion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblSelectYourRegion);
		
		JComboBox region = new JComboBox();
		region.setBounds(231, 329, 394, 42);
		region.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		region.setBackground(SystemColor.control);
		region.setModel(new DefaultComboBoxModel(new String[] {"Select Your Region", "Spain", "Italy", "Germany", "Japon", "China"}));
		region.setEditable(true);
		region.setToolTipText("");
		contentPane.add(region);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(29, 173, 47, 42);
		lblNewLabel.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/mail_30px.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/name_30px.png")));
		lblNewLabel_2.setBounds(29, 98, 47, 51);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/Ringing Phone_30px.png")));
		lblNewLabel_3.setBounds(29, 246, 47, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/geography_30px.png")));
		lblNewLabel_3_1.setBounds(29, 329, 47, 42);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Do you already have an account? ");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(205, 614, 225, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel login = new JLabel("Log In.");
		login.setForeground(Color.BLUE);
		login.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		login.setBounds(420, 614, 68, 21);
		contentPane.add(login);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Password");
		lblNewLabel_1_3_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(86, 420, 77, 19);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/password_30px.png")));
		lblNewLabel_3_1_1.setBounds(29, 409, 47, 42);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Repeat Password");
		lblNewLabel_1_3_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1_3_1_1.setBounds(32, 502, 131, 19);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		JPasswordField repitecontraseña = new JPasswordField();
		repitecontraseña.setBackground(SystemColor.controlHighlight);
		repitecontraseña.setBounds(164, 489, 461, 42);
		contentPane.add(repitecontraseña);
		
		contraseña = new JPasswordField();
		contraseña.setBackground(SystemColor.controlHighlight);
		contraseña.setBounds(164, 409, 461, 42);
		contentPane.add(contraseña);
	}
}


