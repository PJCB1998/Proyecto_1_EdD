package pkg_Paciente;

import java.util.Arrays;

public class ClinicaEIA {

    private String nombre;
    private Sala[] salas=new Sala[0];
    private Cita[] citas=new Cita[0];
    private Doctor[] doctores=new Doctor[0];
    private Paciente[] pacientes=new Paciente[0];

    public ClinicaEIA() {
        this.nombre="Clinica EIA";
    }

    public void Agregar_Doctor(String nombre, String cedula,int edad, String especialidad) throws ENoDoctor{
        if (especialidad=="General" || especialidad=="Cirujano" || especialidad=="Psicologo"){
            doctores= Arrays.copyOf(doctores,doctores.length+1);
            doctores[doctores.length-1]=new Doctor(nombre, cedula,edad,especialidad);
        }else {
            throw new ENoDoctor("El tipo de especialidad '"+especialidad+"' no existe");
        }
    }

    public void Agregar_Sala(String piso, String numero, String edificio, int codigo, Doctor doctor, String tipo){
        /*Nota: Cuando creo una sala, debo asignarle un doctor como minimo, para el caso de las urgencias
          que pueden tener mas de un cirujano, los otros se pueden agregar luego con un metodo para agregar
          cirujanos que ya esta creado en la clase 'Urgencias'
         */
        boolean Codigo_no_utilizado=true;
        for (int i=0; i<salas.length; i++){ //Para ver que no existan salas con el mismo codigo
            if (salas[i].getCodigo()==codigo){
                Codigo_no_utilizado=false;
            }
        }
        if (Codigo_no_utilizado==false){
            System.out.println("El codigo: '"+codigo+"' ya fue utilizado"); //Ojo a las mayusculas
        }else {
            if(tipo=="Consultorio"){
                salas=Arrays.copyOf(salas,salas.length-1);
                salas[salas.length-1]=new Consultorio(piso,numero,edificio,codigo, doctor);
            }else if (tipo=="Urgencias"){
                if (doctor.getEspecialidad()!="Cirujano"){
                    System.out.println("El doctor debe ser cirujano para trabajar en una sala de urgencias");
                }else {
                    salas=Arrays.copyOf(salas,salas.length-1);
                    salas[salas.length-1]=new Urgencias(piso,numero,edificio,codigo, doctor);
                }
            }else {
                System.out.println("El tipo de sala: '"+tipo+"' no existe");
            }
        }
    }

    /*Como funcionan las citas?:
    ->Cuando llega un paciente nuevo se toman sus datos personales en un metodo y se guardan en el vector de pacientes
    ->Luego el paciente debe ir a un medico general para que le tome los sintomas. (Hay 4 tipos de sintomas que varian
      segun si son sintomas psicologicos o fisicos)
    ->Por ultimo, un paciente puede pedir una cita a la hora que desee y a la que se le asignara una sala con un doctor (o doctores) acordes
      a los sintomas que tiene y a la hora deseada
     */
    public void Ingresar_Paciente(String nombre, String cedula, int edad){
        boolean VPaciente=false; // para ver si el paciente existe
        for (int i=0;i<pacientes.length;i++){
            if(pacientes[i].getCedula()==cedula){
                VPaciente=true;
            }
        }
        if (VPaciente==true){
            System.out.println("El paciente ya fue ingresado antes");
        }else {
            pacientes=Arrays.copyOf(pacientes,pacientes.length+1);
            pacientes[pacientes.length-1]=new Paciente(nombre,cedula,edad);
        }
    }
    public void Tomar_Sintomas(String cedula, boolean mortal, String tipo, boolean sintoma1, boolean sintoma2, boolean sintoma3, boolean sintoma4){
        boolean VPaciente=false; //para buscar el paciente por la cc
        for (int i=0;i<pacientes.length;i++){
            if (pacientes[i].getCedula()==cedula){
                Paciente paciente;
                VPaciente=true;
                paciente=pacientes[i];
                if (tipo=="Fisicos"){
                    paciente.setSintomas(new Sint_Fisico(mortal,sintoma1,sintoma2,sintoma3,sintoma4));
                }else if(tipo=="Psicologicos"){
                    paciente.setSintomas(new Sint_Sicologico(mortal,sintoma1,sintoma2,sintoma3,sintoma4));
                }else {
                    System.out.println("El tipo de sintoma '"+tipo+"' no existe");
                }
            }
        }
        if (VPaciente==false){
            System.out.println("La cedula N."+cedula+" no pertenece a ningun paciente creado");
        }
    }
    public Sala Buscar_Sala(Paciente paciente, String hora){
        Sala sala_encontrada=null;
        if(paciente.getSintomas().isMortal()==true){
            Urgencias salaU;
            for(int i=0;i<salas.length;i++){
                if(salas[i] instanceof Urgencias){
                    salaU=(Urgencias)salas[i];
                    if (salaU.Cirujanos_Disponibles(hora)==true){
                        sala_encontrada=salaU;
                    }
                }
            }
        }else{
            for(int i=0;i<salas.length;i++){
                Consultorio salaC;
                if(salas[i] instanceof Consultorio){
                    salaC=(Consultorio)salas[i];
                    if(salaC.getDoctor().Turno_Disponible(hora)==true){
                        sala_encontrada=salaC;
                    }
                }
            }
        }
        return sala_encontrada;
    }
    public void Asignar_Cita(Paciente paciente, String hora, int numero){
        Sala sala=Buscar_Sala(paciente,hora);
        if (sala==null){
            System.out.println("No hay salas disponibles");
        }else {
            citas=Arrays.copyOf(citas,citas.length+1);
            citas[citas.length-1]=new Cita(sala, paciente,hora,numero);
        }

    }

}
