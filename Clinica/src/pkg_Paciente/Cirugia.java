package pkg_Paciente;

public class Cirugia extends Sala {
        private String [] Utencilios;

    public Cirugia(String piso, String numero, String edificio, Cita citaAsignada, Paciente pacientes, Doctor doctores, double precio, String[] utencilios) {
        super(piso, numero, edificio, citaAsignada, pacientes, doctores, 500000);
        Utencilios = utencilios;
    }


    @Override
    public Paciente asignarPaciente() {
        return null;
    }

    @Override
    public Doctor asignarDoctor() {
        return null;
    }
}

