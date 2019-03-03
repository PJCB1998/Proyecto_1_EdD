package pkg_Paciente;

import pkg_Paciente.Eps;

public abstract class Paciente extends Persona {
    private Eps eps;
    private String diagnostico;
    private double pulso;
    private double altura;
    private double peso;
    private Sintomas sintomas;
    private boolean urgente;

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


}
