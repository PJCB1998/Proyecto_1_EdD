package pkg_Paciente;

public class Cita {

	private Sala sala;
	private Paciente paciente;
	private String hora;
	private double precio;
	private int NCita;

	public Cita(Sala sala, Paciente paciente, String hora, int numero) {
		this.sala = sala;
		this.paciente = paciente;
		this.hora = hora;
		this.NCita=numero;
	}

	public Cita(Paciente paciente, String hora, int numero) {
		this.paciente = paciente;
		this.hora = hora;
		this.NCita=numero;
	}

	public Sala getSala() {
		return sala;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public String getHora() {
		return hora;
	}
	public double getPrecio() {
		return precio;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
