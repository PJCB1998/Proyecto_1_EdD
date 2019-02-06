
public class Boleta {
	private String codigoBoleta;
	private String nombre;
	private String cedula;
	private Libro libro;
	private Ejemplar ejemplar;
	
	
	public Ejemplar getEjemplar() {
		return ejemplar;
	}



	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}



	public void setCodigoBoleta(String codigoBoleta) {
		this.codigoBoleta = codigoBoleta;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public Libro getLibro() {
		return libro;
	}



	public void setLibro(Libro libro) {
		this.libro = libro;
	}



	public String getCodigoBoleta() {
		return codigoBoleta;
	}

	public Boleta(String nombre, String cedula) {
		this.nombre=nombre;
		this.cedula=cedula;
	}
	
	



}
