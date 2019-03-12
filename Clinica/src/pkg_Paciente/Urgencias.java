package pkg_Paciente;

import java.util.Arrays;

public class Urgencias extends Sala {

    private Doctor[] cirujanos=new Doctor[0];
    public Urgencias(String piso, String numero, String edificio, int codigo, Doctor doctor) {
        super(piso, numero, edificio, codigo);
        try {
            agregar_cirujanos(doctor);
        } catch (ENoDoctor eNoDoctor) {
            eNoDoctor.printStackTrace();

        }
    }

    private void agregar_cirujanos(Doctor cirujano) throws ENoDoctor {
        if (cirujano.getEspecialidad() == "Cirujano") {
            cirujanos = Arrays.copyOf(cirujanos, cirujanos.length + 1);
            cirujanos[cirujanos.length - 1] = cirujano;
        } else {
            throw new ENoDoctor("El doctor debe ser cirujano");
        }
    }

    public Doctor[] getCirujanos() {
        return cirujanos;
    }
}

class ENoDoctor extends Exception {
    public ENoDoctor(String mensaje){
            super(mensaje);
        }
}

