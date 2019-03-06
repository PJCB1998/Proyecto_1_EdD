package pkg_Paciente;

public class Clinica {

	private Doctor [] Doctores;
	private Paciente [] Pacientes;
	private Cita [] Citas;
	private Sala [] Salas;
	private double PrecioConsulta;
	private Consultas [] Consutas;
	private String Direccion, EPS;
	private final String Nombre = "Idea";
	private final String  Año_Fundacion =  "2019";
	private boolean Licencias;
	
	public Clinica(Doctor[] doctores, Paciente[] pacientes, Cita[] citas, Sala[] salas, double precioConsulta,
			Consultas[] consutas, String direccion, String ePS, boolean licencias) {
		Doctores = doctores;
		Pacientes = pacientes;
		Citas = citas;
		Salas = salas;
		PrecioConsulta = precioConsulta;
		Consutas = consutas;
		Direccion = direccion;
		EPS = ePS;
		Licencias = licencias;
	}
	
	public Doctor[] getDoctores() {
		return Doctores;
	}
	public void setDoctores(Doctor[] doctores) {
		Doctores = doctores;
	}
	
	public Paciente[] getPacientes() {
		return Pacientes;
	}
	public void setPacientes(Paciente[] pacientes) {
		Pacientes = pacientes;
	}
	
	public Cita[] getCitas() {
		return Citas;
	}
	public void setCitas(Cita[] citas) {
		Citas = citas;
	}
	
	public Sala[] getSalas() {
		return Salas;
	}
	public void setSalas(Sala[] salas) {
		Salas = salas;
	}
	
	public double getPrecioConsulta() {
		return PrecioConsulta;
	}
	public void setPrecioConsulta(double precioConsulta) {
		PrecioConsulta = precioConsulta;
	}
	
	public Consultas[] getConsutas() {
		return Consutas;
	}
	public void setConsutas(Consultas[] consutas) {
		Consutas = consutas;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public String getEPS() {
		return EPS;
	}
	public void setEPS(String ePS) {
		EPS = ePS;
	}
	
	public boolean isLicencias() {
		return Licencias;
	}
	public void setLicencias(boolean licencias) {
		Licencias = licencias;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public String getAño_Fundacion() {
		return Año_Fundacion;
	}
	
	
	
}
