package pkg_Paciente;

import java.util.Arrays;

public class Urgencias extends Sala {

    private Doctor[] cirujanos=new Doctor[0];
    public Urgencias(String piso, String numero, String edificio) {
        super(piso, numero, edificio);
    }
    private void agregar_cirujanos(Doctor cirujano) throws ENoDoctor {
        if (cirujano.getEspecialidad() == "Cirujano") {
            cirujanos = Arrays.copyOf(cirujanos, cirujanos.length + 1);
            cirujanos[cirujanos.length - 1] = cirujano;
        } else {
            throw new ENoDoctor("El doctor debe ser cirujano");
        }
    }
}

    class ENoDoctor extends Exception {
        public ENoDoctor(String mensaje){
            super(mensaje);
        }
    }

