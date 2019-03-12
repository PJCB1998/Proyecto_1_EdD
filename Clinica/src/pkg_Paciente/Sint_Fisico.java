package pkg_Paciente;

public class Sint_Fisico extends Sintomas {
    private boolean presion_alta;
    private boolean presion_baja;
    private boolean fievre;
    private boolean vomito;

    public Sint_Fisico(boolean mortal, boolean presion_alta, boolean presion_baja, boolean fievre, boolean vomito) {
        super(mortal);
        this.presion_alta = presion_alta;
        this.presion_baja = presion_baja;
        this.fievre = fievre;
        this.vomito = vomito;
    }

    public boolean isPresion_alta() {
        return presion_alta;
    }

    public void setPresion_alta(boolean presion_alta) {
        this.presion_alta = presion_alta;
    }

    public boolean isPresion_baja() {
        return presion_baja;
    }

    public void setPresion_baja(boolean presion_baja) {
        this.presion_baja = presion_baja;
    }

    public boolean isFievre() {
        return fievre;
    }

    public void setFievre(boolean fievre) {
        this.fievre = fievre;
    }

    public boolean isVomito() {
        return vomito;
    }

    public void setVomito(boolean vomito) {
        this.vomito = vomito;
    }

}
