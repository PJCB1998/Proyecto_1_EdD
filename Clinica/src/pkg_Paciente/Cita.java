package pkg_Paciente;

public class Cita {

	private Doctor doctor;
	private Sala sala;
	private Paciente paciente;
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Cita(Paciente pacientes) {
		this.paciente=pacientes;
	}
	
	
	
}
