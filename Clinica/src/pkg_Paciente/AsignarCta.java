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

public class AsignarCta {

	private JFrame frame;
	private JTextField txtHora;
	public int contador = 1; 

	/**
	 * Launch the application.
	 */
	public static void openAC(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignarCta window = new AsignarCta();
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
	public AsignarCta() {
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
				Welcome.main(null);
				frame.setVisible(false);
			}
		});
		panel.setLayout(null);
		btnBack.setBounds(16, 240, 100, 32);
		panel.add(btnBack);
		
		JButton btnAsignarCita = new JButton("ASIGNAR CITA");
		btnAsignarCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Paciente p1 = Welcome.clinica1.Buscar_Paciente(Citas.getTxtCcPaciente().getText());
				Welcome.clinica1.Asignar_Cita(p1, txtHora.getText(), contador );
				contador=contador+1;
				frame.setVisible(false);
				Welcome.main(null);
				
			}
		});
		btnAsignarCita.setBounds(166, 174, 117, 29);
		panel.add(btnAsignarCita);
		
		txtHora = new JTextField();
		txtHora.setText("HORA");
		txtHora.setBounds(160, 74, 130, 26);
		panel.add(txtHora);
		txtHora.setColumns(10);
	}
}
