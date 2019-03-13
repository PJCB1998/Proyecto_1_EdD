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

public class Citas {

	private JFrame frame;

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
	}

}
