package pkg_Paciente;

public class Doctor extends Persona {
	private String[] horario = new String[0];
	
     public Doctor(String nombre, String cedula, int edad,String [] horario) {
		super(nombre, cedula, edad);
		this.horario =horario;
		// TODO Auto-generated constructor stub
	}

	public String[] getHorario() {
		return horario;
	}

	public void setHorario(String[] horario) {
		this.horario = horario;
	}
 
}
