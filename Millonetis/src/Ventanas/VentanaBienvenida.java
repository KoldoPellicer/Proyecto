package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import GestionCosasUsuario.GestionArrayList;
import GestionCosasUsuario.GestionFicheros;
import Logica.Usuario;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;

//import GestionArrayList;
//import GestionFicheros;
//import logicaUsuario;

public class VentanaBienvenida extends JFrame implements ActionListener{
	

	private JPanel contentPanel;
	private JTextField txtNombreUsuario;
	private JPasswordField txtContraseñaUsuario;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JPasswordField passContraseña;
	private JButton btnRegistrate;
	private JButton btnAceptarRegistro;
	private JLabel lblDni,lblNombre,lblContraseña;
	private JButton btnAceptar ;
	private ArrayList<Usuario> a;
	public static String nomfichJuegos, nomfichSoftware;
	/**
	 * Launch the application.
	 * @author koldo
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					VentanaBienvenida frame = new VentanaBienvenida();
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
	public VentanaBienvenida(){
		a=GestionFicheros.obtenerListaUsuarios();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 418);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setResizable(false);
		
		/*Panel que contiene: "Nombre, DNI, Contraseña"*/
		JPanel panelCentro = new JPanel();
		contentPanel.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(null);
		
		/*Usuario*/
		JLabel lblIntroduceTuNombre = new JLabel("Introduce tu nombre de usuario:");
		lblIntroduceTuNombre.setBounds(10, 11, 213, 14);
		panelCentro.add(lblIntroduceTuNombre);
		
		//Recuadro para introducir Nombre de Usuario
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(233, 8, 119, 20);
		panelCentro.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		/*Contraseña"*/
		JLabel lblIntroduceLaContrasea = new JLabel("Introduce la contrase\u00F1a:");
		lblIntroduceLaContrasea.setBounds(10, 36, 170, 14);
		panelCentro.add(lblIntroduceLaContrasea);
		
		//Recuadro para password
		txtContraseñaUsuario = new JPasswordField();
		txtContraseñaUsuario.setBounds(233, 33, 119, 20);
		panelCentro.add(txtContraseñaUsuario);
		txtContraseñaUsuario.setColumns(10);
		
		/*Boton de "Aceptar"*/
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(362, 7, 105, 23);
		panelCentro.add(btnAceptar);
		
		/*Boton de "Registrate"*/
		btnRegistrate = new JButton("REG\u00CDSTRATE");
		btnRegistrate.setVisible(false);
		btnRegistrate.setBounds(362, 32, 105, 23);
		panelCentro.add(btnRegistrate);
		
		/*DNI*/
		lblDni = new JLabel("Dni: ");
		lblDni.setVisible(false);
		lblDni.setBounds(10, 86, 65, 14);
		panelCentro.add(lblDni);
		
		//Recuadro para escribir DNI
		txtDni = new JTextField();
		txtDni.setBounds(96, 83, 99, 20);
		txtDni.setVisible(false);
		panelCentro.add(txtDni);
		txtDni.setColumns(10);
		
		/*Nombre*/
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 117, 76, 14);
		lblNombre.setVisible(false);
		panelCentro.add(lblNombre);
		
		//Recuadro para escribir Nombre
		txtNombre = new JTextField();
		txtNombre.setBounds(96, 114, 99, 20);
		txtNombre.setVisible(false);
		panelCentro.add(txtNombre);
		txtNombre.setColumns(10);
		
		/*Contraseña*/
		lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setBounds(10, 148, 65, 14);
		lblContraseña.setVisible(false);
		panelCentro.add(lblContraseña);
		
		//Recuadro para escribir la Contraseña
		passContraseña = new JPasswordField();
		passContraseña.setBounds(96, 145, 99, 20);
		passContraseña.setVisible(false);
		panelCentro.add(passContraseña);
		passContraseña.setColumns(10);
		
		/*Boton  Aceptar registro*/
		btnAceptarRegistro = new JButton("ACEPTAR REGISTRO");
		btnAceptarRegistro.setBounds(233, 82, 177, 23);
		btnAceptarRegistro.setVisible(false);
		panelCentro.add(btnAceptarRegistro);
						
		/*Panel de cabecera que contiene "Bienvenido"*/
		JPanel panelNorte = new JPanel();
		contentPanel.add(panelNorte, BorderLayout.NORTH);
		
		/*Bienvendido*/
		JLabel lblTitulo = new JLabel("Bienvenido a ¿Quieres ser Millonetis?");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		panelNorte.add(lblTitulo);
		
		/*Panel que contiene boton "Exit"*/
		JPanel panelSur = new JPanel();
		contentPanel.add(panelSur, BorderLayout.SOUTH);
		
		/*Boton Exit*/
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.RED);
		btnExit.setBackground(Color.BLUE);
		btnExit.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		panelSur.add(btnExit);
		
		btnAceptar.addActionListener(this);
		
		btnRegistrate.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				// TODO Auto-generated method stub
				
				lblDni.setVisible(true);
				txtDni.setVisible(true);
				lblNombre.setVisible(true);
				txtNombre.setVisible(true);
				lblContraseña.setVisible(true);
				passContraseña.setVisible(true);
				btnAceptarRegistro.setVisible(true);
				txtNombreUsuario.setText("");
				txtContraseñaUsuario.setText("");
			}
		});
		
		btnAceptarRegistro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Usuario aux = GestionArrayList.obtenerUsuario(a, txtDni.getText());
				if(aux!=null)
					//Mensaje de error en caso de DNI repetido
					JOptionPane.showMessageDialog(null, "ERROR, dni de usuario repetido", "ERROR", JOptionPane.ERROR_MESSAGE);
				else{
				
					Usuario u = new Usuario(txtDni.getText(),txtNombre.getText(), passContraseña.getText());
					a.add(u);
					GestionFicheros.volcarListaAFichero(a);
					JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Welcome", JOptionPane.INFORMATION_MESSAGE);
				}
				txtDni.setText("");
				txtNombre.setText("");
				passContraseña.setText("");
				txtDni.setVisible(false);
				txtNombre.setVisible(false);
				passContraseña.setVisible(false);
				btnAceptarRegistro.setVisible(false);
				btnRegistrate.setVisible(false);
				lblDni.setVisible(false);
				lblNombre.setVisible(false);
				lblContraseña.setVisible(false);
			}
		});
		
	}
	
	//Imagen de fondo
	public void paintComponent (Graphics g){
		Dimension tamaño = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Millonario.png"));
		g.drawImage(imagenFondo.getImage(),0,0,tamaño.width, tamaño.height, null);
		paintComponent(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton) e.getSource();
		if(botonPulsado==btnAceptar){
		
			int pos=GestionArrayList.buscarPosicionUsuarioEnLista(a,txtNombreUsuario.getText(), txtContraseñaUsuario.getText());
			if(pos==-2){
				
				//Error en nombre de usuario
				JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto", "ERROR, Allahu akbar!!", JOptionPane.ERROR_MESSAGE);
				btnRegistrate.setVisible(true);
			}
			else if(pos==-1){
				//Error en contraseña
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR, Allahu akbar!!", JOptionPane.ERROR_MESSAGE);
				txtContraseñaUsuario.setText("");
			}
			
			else{
				
				txtNombreUsuario.setText("");
				txtContraseñaUsuario.setText("");
			//	new VentanaMenu(this); //Creo que no hace falta decir a donde lleva XD
				this.setVisible(false);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
