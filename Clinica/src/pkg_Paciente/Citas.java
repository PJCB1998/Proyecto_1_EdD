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
import javax.swing.JTextField;

public class Citas {

	private JFrame frame;
	private JTextField txtNombre;
	private static JTextField txtCcPaciente;
	private JTextField txtEdad;
	

	public static JTextField getTxtCcPaciente() {
		return txtCcPaciente;
	}

	/**
	 * Launch the application.
	 */
	public static void openCitas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Citas window = new Citas();
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
	public Citas() {
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
		panel.setLayout(null);
		JButton btnBack = new JButton("ATRAS");
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnBack.setBackground(Color.WHITE);
		btnBack.setIcon(new ImageIcon(Admin.class.getResource("/pkg_Paciente/back.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome.main(null);
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(6, 240, 100, 32);
		panel.add(btnBack);
		
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						
						Welcome.clinica1.Ingresar_Paciente(txtNombre.getText(), txtCcPaciente.getText(), Integer.parseInt(txtEdad.getText()));
						System.out.println("Bien");
						frame.setVisible(false);
						IngSintomas.openIS();
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				
			
				
			}
		});
		btnListo.setBackground(Color.WHITE);
		btnListo.setBounds(344, 242, 100, 32);
		panel.add(btnListo);
		
		txtNombre = new JTextField();
		txtNombre.setText("NOMBRE");
		txtNombre.setBounds(160, 50, 130, 26);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCcPaciente = new JTextField();
		txtCcPaciente.setText("CC PACIENTE");
		txtCcPaciente.setColumns(10);
		txtCcPaciente.setBounds(160, 126, 130, 26);
		panel.add(txtCcPaciente);
		
		txtEdad = new JTextField();
		txtEdad.setText("EDAD");
		txtEdad.setBounds(160, 202, 130, 26);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
	}

}
