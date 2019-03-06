package pkg_Paciente;

import java.util.Arrays;

public class Clinica {

	private Doctor [] Doctores;
	private Paciente [] Pacientes;
	private Cita [] Citas;
	private Sala [] Salas;
	private double PrecioSala;
	private String Direccion, EPS;
	private final String Nombre = "Idea";
	private final String  Año_Fundacion =  "2019";
	private boolean Licencias;
	
	public Clinica(Doctor[] doctores, Paciente[] pacientes, Cita[] citas, Sala[] salas, double precioSala,
			String direccion, String ePS, boolean licencias) {
		Doctores = doctores;
		Pacientes = pacientes;
		Citas = citas;
		Salas = salas;
		PrecioSala = precioSala;
		
		Direccion = direccion;
		EPS = ePS;
		Licencias = licencias;
	}
	
	public Doctor[] getDoctores() {
		return Doctores;
	}
	public void setDoctores(Doctor[] doctores) {
		Doctores = doctores;
	}
	
	public Paciente[] getPacientes() {
		return Pacientes;
	}
	public void setPacientes(Paciente[] pacientes) {
		Pacientes = pacientes;
	}
	
	public Cita[] getCitas() {
		return Citas;
	}
	public void setCitas(Cita[] citas) {
		Citas = citas;
	}
	
	public Sala[] getSalas() {
		return Salas;
	}
	public void setSalas(Sala[] salas) {
		Salas = salas;
	}
	
	public double getPrecioSala() {
		return PrecioSala;
	}
	public void setPrecioSala(double precioSala) {
		PrecioSala = precioSala;
	}
	
	public Sala [] getConsutas() {
		return Salas;
	}
	public void setConsutas(Sala [] consutas) {
		Salas = consutas;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public String getEPS() {
		return EPS;
	}
	public void setEPS(String ePS) {
		EPS = ePS;
	}
	
	public boolean isLicencias() {
		return Licencias;
	}
	public void setLicencias(boolean licencias) {
		Licencias = licencias;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public String getAño_Fundacion() {
		return Año_Fundacion;
	}
	
	//metodos para agregar
	public void addDoctor () {
		Doctor d = new Doctor();
		if (Doctores != null ) {
			Doctores = new Doctor[1];
			Doctores[0]=d;
		}
		else {
			Doctores = Arrays.copyOf(Doctores, Doctores.length + 1);
			Doctores[Doctores.length - 1 ]= d;
		}
	}
	
	
	public void addPaciente(){
		Paciente p = new Paciente();
		if (Pacientes == null ) {
			Pacientes = new Paciente[1];
			Pacientes[0]=p;
		}
		else {
			Pacientes = Arrays.copyOf(Pacientes, Pacientes.length + 1);
			Pacientes [Pacientes.length - 1 ]= p;
		}
	}
	public void addSalas  (String piso, String numero, String edificio, String tipo, Cita citaAsignada, Paciente pacientes, Doctor doctores, String [] utencilios) {
		Sala s = new Cirujia(piso, numero, edificio, citaAsignada, pacientes, doctores, utencilios);
		String t = "Cirujia";
		if (t.compareTo(tipo) == 0) {
			if (Salas == null ) {
				Salas = new Sala[1];
				
			}else {
				Salas = Arrays.copyOf(Salas, Salas.length + 1);
				Salas [Salas.length - 1 ]= s;
			}
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
		if (Salas != null ) {
			Salas = new Sala[1];
			Salas[0]=s;
		}else {
			Salas = Arrays.copyOf(Salas, Salas.length + 1);
			Salas [Salas.length - 1 ]= s;
		}
	}
	
	public void addCita (String ccPaciente) {
		
		int numPaciente = SearchPacienteCC(ccPaciente);
		Cita c = new Cita(Pacientes[numPaciente]);
		Sintomas sintomas = Pacientes[numPaciente].getSintomas();
		if(sintomas.getClass().getName().compareTo("Sint_Sicologico") ==0) {
			
			
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
		
		Especialista[] especialistas = null ;
		for(Doctor e: Doctores) {
			i++;
			if(e.getClass().getName()=="Especialisa") {	
				if (especialistas == null ) {
					especialistas = new Especialista[1];
					especialistas[0] = (Especialista) Doctores[i];
				
				}
				else 
			{
				especialistas = Arrays.copyOf(especialistas, especialistas.length + 1);
				especialistas[especialistas.length - 1 ]= (Especialista) Doctores[i];
			}
			}
		}
		
		int j = -1;
		while(++j<especialistas.length && especialistas[j].getEspecialidad().compareTo(especialidad)!=0);
		return (i<Pacientes.length)?i:-1;
		}
	} 


