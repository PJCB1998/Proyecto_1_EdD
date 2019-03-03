package pkg_Paciente;

public class Sint_Fisico extends Sintomas {
    private boolean presion_alta;
    private boolean presion_baja;
    private boolean fievre;
    private boolean vomito;
    private boolean sangrado;
    private boolean diarrea;
    private boolean escalofrio;
    private boolean dolor_muscular;
    private boolean flema;

    public Sint_Fisico(boolean presion_alta, boolean presion_baja, boolean fievre, boolean vomito, boolean sangrado, boolean diarrea, boolean escalofrio, boolean dolor_muscular, boolean flema) {
        this.presion_alta = presion_alta;
        this.presion_baja = presion_baja;
        this.fievre = fievre;
        this.vomito = vomito;
        this.sangrado = sangrado;
        this.diarrea = diarrea;
        this.escalofrio = escalofrio;
        this.dolor_muscular = dolor_muscular;
        this.flema = flema;
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

    public boolean isSangrado() {
        return sangrado;
    }

    public void setSangrado(boolean sangrado) {
        this.sangrado = sangrado;
    }

    public boolean isDiarrea() {
        return diarrea;
    }

    public void setDiarrea(boolean diarrea) {
        this.diarrea = diarrea;
    }

    public boolean isEscalofrio() {
        return escalofrio;
    }

    public void setEscalofrio(boolean escalofrio) {
        this.escalofrio = escalofrio;
    }

    public boolean isDolor_muscular() {
        return dolor_muscular;
    }

    public void setDolor_muscular(boolean dolor_muscular) {
        this.dolor_muscular = dolor_muscular;
    }

    public boolean isFlema() {
        return flema;
    }

    public void setFlema(boolean flema) {
        this.flema = flema;
    }
}
