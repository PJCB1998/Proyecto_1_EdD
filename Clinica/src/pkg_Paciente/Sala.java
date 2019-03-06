package pkg_Paciente;

public abstract class Sala {

	protected String Piso, Numero, Edificio, Tipo;
	protected Cita citaAsignada;
	protected Paciente Pacientes;
	protected Doctor Doctores;
	
	public Sala(String piso, String numero, String edificio, String tipo, Cita citaAsignada, Paciente pacientes,
			Doctor doctores) {
		Piso = piso;
		Numero = numero;
		Edificio = edificio;
		Tipo = tipo;
		this.citaAsignada = citaAsignada;
		Pacientes = pacientes;
		Doctores = doctores;
	}
	
	public abstract Paciente asignarPaciente();
	public abstract Doctor asignarDoctor();
	
	public String getPiso() {
		return Piso;
	}
	public void setPiso(String piso) {
		Piso = piso;
	}
	
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	
	public String getEdificio() {
		return Edificio;
	}
	public void setEdificio(String edificio) {
		Edificio = edificio;
	}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public Cita getCitaAsignada() {
		return citaAsignada;
	}
	public void setCitaAsignada(Cita citaAsignada) {
		this.citaAsignada = citaAsignada;
	}
	
	public Paciente getPacientes() {
		return Pacientes;
	}
	public void setPacientes(Paciente pacientes) {
		Pacientes = pacientes;
	}
	
	public Doctor getDoctores() {
		return Doctores;
	}
	public void setDoctores(Doctor doctores) {
		Doctores = doctores;
	}
	
	
}
