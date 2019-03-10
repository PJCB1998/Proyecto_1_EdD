package pkg_Paciente;

public class Paciente extends Persona {

    private double pulso;
    private double altura;
    private double peso;
    private Sintomas sintomas;

    public Paciente(String nombre, String cedula, int edad,  double pulso, double altura, double peso, Sintomas sintomas) {
		super(nombre, cedula, edad);
		this.pulso = pulso;
		this.altura = altura;
		this.peso = peso;
		this.sintomas = sintomas;
	}

	//Creo un constructor vacio por si no quiero agregarle los datos clinicos al paciente.
	public Paciente(String nombre, String cedula, int edad) {
		super(nombre, cedula, edad);
	}

	public double getPulso() {
        return pulso;
    }

    public void setPulso(double pulso) {
        this.pulso = pulso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

	public Sintomas getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}


}
