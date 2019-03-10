package pkg_Paciente;

public class Consultorio extends Sala{
	private Doctor doctor;

	public Consultorio(String piso, String numero, String edificio) {
		super(piso, numero, edificio);
	}

	public void Agregar_Doctor(Doctor doctor){
		this.doctor=doctor;
	}

	@Override
	public void calcular_precio() {
		if(doctor.getEspecialidad()=="Psicologo"){
			setPrecio(70000);
		}else if(doctor.getEspecialidad()=="General"){
			setPrecio(50000);
		}
	}
}
