package Logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;
    
    //Constructor sin parámetros
    public Alumno() {
    }
    
    //Constructir con parámetros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //-METODOS CREADOR POR EL USUARIO

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