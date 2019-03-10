package pkg_Paciente;

public class Laboratorio extends Sala{


	public Laboratorio(String piso, String numero, String edificio, Cita citaAsignada, Paciente pacientes, Doctor doctores) {
		super(piso, numero, edificio, citaAsignada, pacientes, doctores, 100000);
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
