package pkg_Paciente;

import pkg_Paciente.Eps;

public class Paciente extends Persona {
 
	private Eps eps;
    private String diagnostico;
    private double pulso;
    private double altura;
    private double peso;
    private Sintomas sintomas;
    private boolean urgente;

    public Paciente(String nombre, String cedula, int edad, Eps eps, String diagnostico, double pulso, double altura,
			double peso, Sintomas sintomas, boolean urgente) {
		super(nombre, cedula, edad);
		this.eps = eps;
		this.diagnostico = diagnostico;
		this.pulso = pulso;
		this.altura = altura;
		this.peso = peso;
		this.sintomas = sintomas;
		this.urgente = urgente;
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

	public Eps getEps() {
		return eps;
	}

	public void setEps(Eps eps) {
		this.eps = eps;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Sintomas getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}

	


}
