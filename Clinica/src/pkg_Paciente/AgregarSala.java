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

public class AgregarSala {

	private JFrame frame;
	private JTextField txtPiso;
	private JTextField txtNumero;
	private JTextField txtEdificio;
	private JTextField txtTipo;
	private JTextField txtCodigo;
	private JTextField txtDoctor;

	/**
	 * Launch the application.
	 */
	public static void openAS(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarSala window = new AgregarSala();
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
	public AgregarSala() {
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
		
		txtPiso = new JTextField();
		txtPiso.setText("PISO");
		txtPiso.setBounds(160, 17, 130, 26);
		panel.add(txtPiso);
		txtPiso.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setText("NUMERO");
		txtNumero.setColumns(10);
		txtNumero.setBounds(160, 60, 130, 26);
		panel.add(txtNumero);
		
		txtEdificio = new JTextField();
		txtEdificio.setText("EDIFICIO");
		txtEdificio.setColumns(10);
		txtEdificio.setBounds(160, 146, 130, 26);
		panel.add(txtEdificio);
		
		txtTipo = new JTextField();
		txtTipo.setText("TIPO");
		txtTipo.setBounds(160, 232, 130, 26);
		panel.add(txtTipo);
		txtTipo.setColumns(10);
		JButton btnListo = new JButton("LISTO");
		btnListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						Doctor d1= Welcome.clinica1.Buscar_Doctor(txtDoctor.getText());
						Welcome.clinica1.Agregar_Sala(txtPiso.getText(), txtNumero.getText(), txtEdificio.getText(), Integer.parseInt(txtCodigo.getText()), d1, txtTipo.getText());
						System.out.println(Welcome.clinica1.getSalas().toString());
						frame.setVisible(false);
						Admin.openAdim();
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				
			
				
			}
		});
		btnListo.setBackground(Color.WHITE);
		btnListo.setBounds(344, 242, 100, 32);
		panel.add(btnListo);
		
		txtCodigo = new JTextField();
		txtCodigo.setText("CODIGO");
		txtCodigo.setBounds(160, 103, 130, 26);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDoctor = new JTextField();
		txtDoctor.setText("C.C DOCTOR");
		txtDoctor.setBounds(160, 189, 130, 26);
		panel.add(txtDoctor);
		txtDoctor.setColumns(10);
	}

}
