package pkg_Paciente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class AgregarCirujano {

	private JFrame frame;
	private JTextField txtCcDoctor;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void openAC() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCirujano window = new AgregarCirujano();
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
	public AgregarCirujano() {
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
		
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						Doctor d1= Welcome.clinica1.Buscar_Doctor(txtCcDoctor.getText());
						Welcome.clinica1.Agregar_Cirujano_Urgencias(d1, Integer.parseInt(txtCodigo.getText()));
						System.out.println("Bien");
						Admin.openAdim();
						frame.setVisible(false);
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				
			
				
			}
		});
		btnListo.setBackground(Color.WHITE);
		btnListo.setBounds(344, 242, 100, 32);
		panel.add(btnListo);
		
		txtCcDoctor = new JTextField();
		txtCcDoctor.setText("CC DOCTOR");
		txtCcDoctor.setBounds(160, 75, 130, 26);
		panel.add(txtCcDoctor);
		txtCcDoctor.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("CODIGO");
		txtCodigo.setBounds(160, 176, 130, 26);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
	}

}
