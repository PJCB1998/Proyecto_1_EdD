package pkg_Paciente;

public class Consultorio extends Sala{
	private Doctor doctor;

	public Consultorio(String piso, String numero, String edificio, int codigo, Doctor doctor) {
		super(piso, numero, edificio, codigo);
		this.doctor = doctor;
	}

	public Doctor getDoctor() {
		return doctor;
	}
}

