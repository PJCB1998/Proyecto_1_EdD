package pkg_Paciente;

public class Sala {

	private String Piso, Numero, Edificio;
	private Cita[] citaAsignada;
	private double precio;
	
	public Sala(String piso, String numero, String edificio) {
		Piso = piso;
		Numero = numero;
		Edificio = edificio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void calcular_precio(){}
}
