package pkg_Paciente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;

public class PSICO {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void  openPsi() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PSICO window = new PSICO();
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
	public PSICO() {
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

		JCheckBox chckbxAnciedad = new JCheckBox("ANCIEDAD");
		chckbxAnciedad.setBounds(161, 227, 128, 23);
		panel.add(chckbxAnciedad);
		
		JCheckBox chckbxPara = new JCheckBox("PARANOIA");
		chckbxPara.setBounds(161, 177, 128, 23);
		panel.add(chckbxPara);
		
		JCheckBox chckbxAgresividad = new JCheckBox("AGRESIVIDAD");
		chckbxAgresividad.setBounds(161, 127, 128, 23);
		panel.add(chckbxAgresividad);
		
		JCheckBox chckbxInsobnia = new JCheckBox("INSOBNIA");
		chckbxInsobnia.setBounds(161, 77, 128, 23);
		panel.add(chckbxInsobnia);
		
		JCheckBox chckbxMortal = new JCheckBox("MORTAL");
		chckbxMortal.setBounds(161, 27, 128, 23);
		panel.add(chckbxMortal);
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			Welcome.clinica1.Tomar_Sintomas(Citas.getTxtCcPaciente().getText(), chckbxMortal.isSelected(), "Sicologico", chckbxAnciedad.isSelected(), chckbxPara.isSelected(), chckbxAgresividad.isSelected(), chckbxInsobnia.isSelected());
			frame.setVisible(false);
			AsignarCta.openAC();
			System.out.println("Bien");
		
			
			}
		});
			
			btnListo.setBackground(Color.WHITE);
			btnListo.setBounds(344, 242, 100, 32);
			panel.add(btnListo);
			
			
	}
		
		
	}
		


