package pkg_Paciente;

public class Laboratorio extends Sala{

	public Laboratorio(String piso, String numero, String edificio, String tipo, Cita citaAsignada, Paciente pacientes,
			Doctor doctores) {
		super(piso, numero, edificio, tipo, citaAsignada, pacientes, doctores);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Paciente asignarPaciente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor asignarDoctor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
