package pkg_Paciente;

public class Consultorio extends Sala{

	public Consultorio(String piso, String numero, String edificio, Cita citaAsignada, Paciente pacientes, Doctor doctores) {
		super(piso, numero, edificio, citaAsignada, pacientes, doctores,50000);
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
