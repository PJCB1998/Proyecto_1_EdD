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
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JCheckBox;

public class IngSintomas {

	private JFrame frame;
	private JButton btnFisicos;
	private JButton btnPsicologicos;

	/**
	 * Launch the application.
	 */
	public static void openIS(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngSintomas window = new IngSintomas();
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
	public IngSintomas() {
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
				Citas.openCitas();
				frame.setVisible(false);
			}
		});
		panel.setLayout(null);
		btnBack.setBounds(6, 240, 100, 32);
		panel.add(btnBack);
	
		
		btnFisicos = new JButton("FISICOS");
		btnFisicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FISI.openFi();
			}
		});
		btnFisicos.setBounds(72, 124, 117, 29);
		panel.add(btnFisicos);
		
		btnPsicologicos = new JButton("PSICOLOGICOS");
		btnPsicologicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				PSICO.openPsi();
			}
		});
		btnPsicologicos.setBounds(261, 124, 117, 29);
		panel.add(btnPsicologicos);
	}
}
