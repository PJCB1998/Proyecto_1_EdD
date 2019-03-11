package pkg_Paciente;

import java.util.Arrays;

public class Clinica {

	private Doctor [] Doctores;
	private Paciente [] Pacientes;
	private Cita [] Citas;
	private Sala [] Salas;
	private String Direccion;
	private final String Nombre;
	private boolean Licencias_v;

	public Clinica(String direccion, boolean licencias) {
		Direccion = direccion;
		Licencias_v = licencias;
		Nombre="Clinica EIA";
	}

	public void addDoctor (String nombre, String cedula, int edad,String [] horario, String es) {
		Doctor d = new Doctor(nombre, cedula, edad, horario, es);
		if (Doctores == null ) {
			Doctores = new Doctor[1];
			//Doctores[0]=d;
		}
		else {
			Doctores = Arrays.copyOf(Doctores, Doctores.length + 1);
		}
		Doctores[Doctores.length - 1 ]= d;
	}

	public void addPaciente(String nombre, String cedula, int edad, String diagnostico, double pulso, double altura, double peso, Sintomas sintomas, boolean urgente){
		Paciente p = new Paciente(nombre, cedula, edad);
		if (Pacientes == null ) {
			Pacientes = new Paciente[1];
			//	Pacientes[0]=p;
		}
		else {
			Pacientes = Arrays.copyOf(Pacientes, Pacientes.length + 1);
		}
		Pacientes [Pacientes.length - 1 ]= p;
	}
	public void addCirugia  (String piso, String numero, String edificio, String tipo, Cita citaAsignada, Paciente pacientes,
			Doctor doctores, String [] utencilios, double precio) {
		Sala s = new Urgencias(piso, numero,  edificio);
		String t = "Cirujia";
		if (t.compareTo(tipo) == 0) {
			if (Salas == null ) {
				Salas = new Sala[1];

			}else {
				Salas = Arrays.copyOf(Salas, Salas.length + 1);
			}
			Salas [Salas.length - 1 ]= s;
		}

	}

	public void addSalas  (String piso, String numero, String edificio, String tipo, Cita citaAsignada, Paciente pacientes, Doctor doctores) {
		Sala s = null ;
		switch (tipo) {
		case "Laboratorio":
			s = new Laboratorio(piso, numero, edificio, citaAsignada, pacientes, doctores);
			break;
		case "Cosultorio":
			s = new Laboratorio(piso, numero, edificio, citaAsignada, pacientes, doctores);
			break;

		default:
			break;
		}
		if (Salas == null ) {
			Salas = new Sala[1];
			//Salas[0]=s;
		}else {
			Salas = Arrays.copyOf(Salas, Salas.length + 1);
		}
		Salas [Salas.length - 1 ]= s;
	}

	public void addCita (String ccPaciente) {

		int numPaciente = SearchPacienteCC(ccPaciente);
		int numDoctor;
		Cita c = new Cita();
		Sintomas sintomas = Pacientes[numPaciente].getSintomas();
		if(sintomas.getClass().getName().compareTo("Sint_Sicologico") == 0) {
			numDoctor = SearchDoctorEspecialidad("Psiquiatra");
			c.setDoctor(Doctores[numDoctor]);
		}

		else {
			if(((Sint_Fisico)sintomas).isDiarrea()){
				numDoctor=SearchDoctorEspecialidad("Gastrointerologo");
				c.setDoctor(Doctores[numDoctor]);
			}
			else {
				if(((Sint_Fisico)sintomas).isDolor_muscular()) {

					numDoctor= SearchDoctorEspecialidad("Reumatologo");
					c.setDoctor(Doctores[numDoctor]);

				}
				else {

					numDoctor= SearchDoctorGeneral();
					c.setDoctor(Doctores[numDoctor]);

				}
			}
		}
		if (Citas == null ) {
			Citas = new Cita[1];
			Citas[0]=c;
		}else {
			Citas = Arrays.copyOf(Citas, Citas.length + 1);
			Citas [Citas.length - 1 ]= c;
		}
	}

	public int SearchPacienteCC(String cedula) {
		int i = -1;
		while(++i<Pacientes.length && Pacientes[i].getCedula().compareTo(cedula)!=0);
		return (i<Pacientes.length)?i:-1;
	} 

	public int SearchDoctorEspecialidad(String especialidad) {
		int i = -1;
		for(Doctor e: Doctores ) {
			i++;
			if(e instanceof Especialista) {	
				String esp = ((Especialista) e).getEspecialidad();
				if(esp.compareTo(especialidad)==0) {
					return i;
				}	
			}

		}
		return -1;
	}

	public int SearchDoctorGeneral() {
		int i = -1;
		for(Doctor e: Doctores ) {
			i++;
			if(!(e instanceof Especialista)) {	
				return i;
			}

		} 
		return -1;		
	}
}


