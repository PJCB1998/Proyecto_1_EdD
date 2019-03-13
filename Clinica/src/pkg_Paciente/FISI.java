package pkg_Paciente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FISI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void openFi(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FISI window = new FISI();
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
	public FISI() {
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

		JCheckBox chckbxS1 = new JCheckBox("PRECION ALTA");
		chckbxS1.setBounds(161, 227, 221, 23);
		panel.add(chckbxS1);
		
		JCheckBox chckbxS2 = new JCheckBox("PARECION BAJA");
		chckbxS2.setBounds(161, 177, 210, 23);
		panel.add(chckbxS2);
		
		JCheckBox chckbxS3 = new JCheckBox("FIEVRE");
		chckbxS3.setBounds(161, 127, 128, 23);
		panel.add(chckbxS3);
		
		JCheckBox chckbxS4 = new JCheckBox("VOMITO");
		chckbxS4.setBounds(161, 77, 128, 23);
		panel.add(chckbxS4);
		
		JCheckBox chckbxMortal = new JCheckBox("MORTAL");
		chckbxMortal.setBounds(161, 27, 128, 23);
		panel.add(chckbxMortal);
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			Welcome.clinica1.Tomar_Sintomas(Citas.getTxtCcPaciente().getText(), chckbxMortal.isSelected(), "Fisico", chckbxS1.isSelected(), chckbxS2.isSelected(), chckbxS3.isSelected(), chckbxS4.isSelected());
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
