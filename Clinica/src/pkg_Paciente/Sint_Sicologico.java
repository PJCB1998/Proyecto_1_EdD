package pkg_Paciente;

public class Sint_Sicologico extends Sintomas {
    private boolean ansiedad;
    private boolean paranoia;
    private boolean agresividad;
    private boolean insomnio;

    public Sint_Sicologico(boolean mortal, boolean ansiedad, boolean paranoia, boolean agresividad, boolean insomnio) {
        super(mortal);
        this.ansiedad = ansiedad;
        this.paranoia = paranoia;
        this.agresividad = agresividad;
        this.insomnio = insomnio;
    }

    public boolean isAnsiedad() {
        return ansiedad;
    }

    public void setAnsiedad(boolean ansiedad) {
        this.ansiedad = ansiedad;
    }

    public boolean isParanoia() {
        return paranoia;
    }

    public void setParanoia(boolean paranoia) {
        this.paranoia = paranoia;
    }

    public boolean isAgresividad() {
        return agresividad;
    }

    public void setAgresividad(boolean agresividad) {
        this.agresividad = agresividad;
    }
}
