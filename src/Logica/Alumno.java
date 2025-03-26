package logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;
    
    //Constructor
    public Alumno(){
    }
    
    //Constructir con parámetros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public void mostrarNombre(){
        System.out.println("Mi nombre es");
    }

    public void saberAprobado(double calificacion){
        if(calificacion >= 7){
            System.out.println("Calificacion aprobatoria");
        }
        else{
            System.out.println("No aprobado");
        }
    }
    
}