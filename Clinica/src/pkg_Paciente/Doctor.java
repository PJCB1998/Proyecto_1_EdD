package pkg_Paciente;

import java.util.Arrays;

public class Doctor extends Persona {
	private Turno[] turnos = new Turno[0];
	private String especialidad;
	
	
     public Doctor(String nombre, String cedula, int edad, String especialidad) {
		super(nombre, cedula, edad);
		this.especialidad= especialidad;
	}
	private void agregar_turno(String hora){
     	turnos= Arrays.copyOf(turnos,turnos.length+1);
     	turnos[turnos.length-1].setHora(hora);
	}

	public boolean Turno_Disponible(String hora) {
     	boolean turnoD=false;
		for(int i=0;i<turnos.length;i++){
			if(turnos[i].getHora()==hora && turnos[i].isDisponible()==true){
				turnos[i].setDisponible(false);
				turnoD=true;
			}
		}
		return turnoD;
	}

	public String getEspecialidad() {
		return especialidad;
	}
}
	