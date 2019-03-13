package pkg_Paciente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Admin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void openAdim() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
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
		
		JButton btnAgregarDoctor = new JButton("AGREGAR DOCTOR");
		btnAgregarDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarDoctor.openAD();
				frame.setVisible(false);
			}
		});
		btnAgregarDoctor.setBounds(127, 47, 195, 29);
		panel.add(btnAgregarDoctor);
		
		JButton btnAgregarSala = new JButton("AGREGAR SALA");
		btnAgregarSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarSala.openAS();
				frame.setVisible(false);
			}
		});
		btnAgregarSala.setBounds(127, 123, 195, 29);
		panel.add(btnAgregarSala);
		
		JButton btnAgregarCirujano = new JButton("AGREGAR CIRUJANO");
		btnAgregarCirujano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarCirujano.openAC();
				frame.setVisible(false);
			}
		});
		btnAgregarCirujano.setBounds(127, 199, 195, 29);
		panel.add(btnAgregarCirujano);
	}

}
