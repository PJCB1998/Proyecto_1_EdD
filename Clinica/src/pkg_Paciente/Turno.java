package pkg_Paciente;

public class Turno {
    private String hora;
    private boolean disponible;

    public Turno(String hora) {
        this.hora = hora;
        this.disponible = true;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
