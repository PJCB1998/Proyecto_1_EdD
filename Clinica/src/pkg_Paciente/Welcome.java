package pkg_Paciente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import com.sun.glass.events.WindowEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;

public class Welcome {
	
	 private JFrame frame;
	 public  static ClinicaEIA clinica1= new ClinicaEIA();;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClinicaEia = new JLabel("CLINICA EIA");
		lblClinicaEia.setForeground(new Color(0, 255, 255));
		lblClinicaEia.setBounds(75, 50, 300, 51);
		frame.getContentPane().add(lblClinicaEia);
		lblClinicaEia.setHorizontalAlignment(SwingConstants.CENTER);
		lblClinicaEia.setFont(new Font("Helvetica", Font.BOLD, 50));
		
		JButton btnAdmin = new JButton("ADMINISTRADOR");
		btnAdmin.setBounds(70, 140, 152, 29);
		frame.getContentPane().add(btnAdmin);
		btnAdmin.setBackground(Color.LIGHT_GRAY);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Admin.openAdim();
				frame.setVisible(false);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(303, 75, 0, 0);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton btnCitas = new JButton("CITAS");
		btnCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Citas.openCitas();
				frame.setVisible(false);
			}
		});
		btnCitas.setBackground(Color.LIGHT_GRAY);
		btnCitas.setBounds(234, 140, 152, 29);
		frame.getContentPane().add(btnCitas);
	}
}
