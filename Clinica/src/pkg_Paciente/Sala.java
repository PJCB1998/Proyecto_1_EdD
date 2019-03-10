package pkg_Paciente;

public abstract class Sala {

	protected String Piso, Numero, Edificio;
	protected Cita citaAsignada;
	protected Paciente Pacientes;
	protected Doctor Doctores;
	protected double precio;
	
	public Sala(String piso, String numero, String edificio, Cita citaAsignada, Paciente pacientes,
			Doctor doctores, double precio) {
		Piso = piso;
		Numero = numero;
		Edificio = edificio;
		this.citaAsignada = citaAsignada;
		Pacientes = pacientes;
		Doctores = doctores;
		this.precio=precio;
	}
	
	public abstract Paciente asignarPaciente();
	public abstract Doctor asignarDoctor();
	
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
