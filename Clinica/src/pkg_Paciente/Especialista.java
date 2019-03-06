package pkg_Paciente;

public class Especialista extends Doctor {

	private String Especialidad;
	private boolean isCirugano;
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	public boolean isCirugano() {
		return isCirugano;
	}
	public void setCirugano(boolean isCirugano) {
		this.isCirugano = isCirugano;
	}
	
	
}
