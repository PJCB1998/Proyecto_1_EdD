package pkg_Paciente;

import java.util.Arrays;

public class Doctor extends Persona {
	private Turno[] turnos = new Turno[0];
	private String especialidad;
	
     public Doctor(String nombre, String cedula, int edad, String especialidad) {
		super(nombre, cedula, edad);
		this.especialidad=especialidad;
	}
	private void agregar_turno(String hora){
     	turnos= Arrays.copyOf(turnos,turnos.length+1);
     	turnos[turnos.length-1].setHora(hora);
	}

	public String getEspecialidad() {
		return especialidad;
	}
}
	