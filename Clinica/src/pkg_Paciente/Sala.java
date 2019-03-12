package pkg_Paciente;

public class Sala {

	private String Piso, Numero, Edificio;
	private int codigo;

	public Sala(String piso, String numero, String edificio, int codigo) {
		Piso = piso;
		Numero = numero;
		Edificio = edificio;
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}
