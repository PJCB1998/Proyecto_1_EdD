package pkg_Paciente;

public class Sintomas {
    private boolean mortal;

    public Sintomas(boolean mortal) {
        this.mortal = mortal;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }
}
