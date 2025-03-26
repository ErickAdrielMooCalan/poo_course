package Herencia;

public class Herencia {
    public static void main(String args[]){
        
        //Estamos llamando al constructor sin parámetros
        Empleado emple = new Empleado();     
        //Método propio de la clase "Empleado"
        emple.getNum_legajo();      
        //Método que hereda de la clase madre "Persona"
        emple.getNombre();
        
        
        //Estamos llamando al constuctor sin parámetros
        Consultor consul = new Consultor();
        //Método propio de la clase "Consultor"
        consul.getNombre_consultora();
        //Método que hereda de la clase madre "Persona"
        consul.getApellido();
        
        
    }
}
