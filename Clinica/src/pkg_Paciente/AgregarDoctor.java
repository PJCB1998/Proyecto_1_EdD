package pkg_Paciente;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTextField;

public class AgregarDoctor {

	private JFrame frame;
	private JTextField txtNombreDelDoctor;
	private JTextField txtCedula;
	private JTextField txtEdad;
	private JTextField txtEspecialidad;

	/**
	 * Launch the application.
	 */
	public static void openAD(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarDoctor window = new AgregarDoctor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnBack = new JButton("ATRAS");
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnBack.setBackground(Color.WHITE);
		btnBack.setIcon(new ImageIcon(Admin.class.getResource("/pkg_Paciente/back.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Admin.openAdim();
				frame.setVisible(false);
				
				
				
			}
		});
		panel.setLayout(null);
		btnBack.setBounds(6, 240, 100, 32);
		panel.add(btnBack);
		
		txtNombreDelDoctor = new JTextField();
		txtNombreDelDoctor.setText("NOMBRE DEL DOCTOR");
		txtNombreDelDoctor.setBounds(148, 34, 154, 26);
		panel.add(txtNombreDelDoctor);
		txtNombreDelDoctor.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setText("CEDULA");
		txtCedula.setBounds(148, 94, 154, 26);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setText("EDAD");
		txtEdad.setBounds(148, 154, 154, 26);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setText("ESPECIALIDAD");
		txtEspecialidad.setBounds(148, 214, 154, 26);
		panel.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						Welcome.clinica1.Agregar_Doctor(txtNombreDelDoctor.getText(),txtCedula.getText(),Integer.parseInt(txtEdad.getText()),txtEspecialidad.getText());
						Admin.openAdim();
						frame.setVisible(false);
						System.out.println(Welcome.clinica1.getDoctores()[0].getEspecialidad());
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ENoDoctor e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				
			
				
			}
		});
		btnListo.setBackground(Color.WHITE);
		btnListo.setBounds(344, 242, 100, 32);
		panel.add(btnListo);
	}
}
