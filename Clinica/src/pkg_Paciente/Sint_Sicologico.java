package pkg_Paciente;

public class Sint_Sicologico {
    private boolean depresion;
    private boolean ansiedad;
    private boolean paranoia;
    private boolean hiperactividad;
    private boolean agresividad;

    public Sint_Sicologico(boolean depresion, boolean ansiedad, boolean paranoia, boolean hiperactividad, boolean agresividad) {
        this.depresion = depresion;
        this.ansiedad = ansiedad;
        this.paranoia = paranoia;
        this.hiperactividad = hiperactividad;
        this.agresividad = agresividad;
    }

    public boolean isDepresion() {
        return depresion;
    }

    public void setDepresion(boolean depresion) {
        this.depresion = depresion;
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

    public boolean isHiperactividad() {
        return hiperactividad;
    }

    public void setHiperactividad(boolean hiperactividad) {
        this.hiperactividad = hiperactividad;
    }

    public boolean isAgresividad() {
        return agresividad;
    }

    public void setAgresividad(boolean agresividad) {
        this.agresividad = agresividad;
    }
}
