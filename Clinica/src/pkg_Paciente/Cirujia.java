package pkg_Paciente;

public class Cirujia extends Sala {
	private String [] Utencilios;
	
	public Cirujia(String piso, String numero, String edificio, Cita citaAsignada, Paciente pacientes,
			Doctor doctores, String [] utencilios) {
		super(piso, numero, edificio, "Cirujia", citaAsignada, pacientes, doctores);
		// TODO Auto-generated constructor stub
		Utencilios = utencilios;
	}

	

	@Override
	public Paciente asignarPaciente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor asignarDoctor() {
		// TODO Auto-generated method stub
		return null;
	}



	public String[] getUtencilios() {
		return Utencilios;
	}
	public void setUtencilios(String[] utencilios) {
		Utencilios = utencilios;
	}
	
	
	
}
