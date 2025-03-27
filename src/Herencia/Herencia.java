package Herencia;

public class Herencia {
    public static void main(String args[]){
        
        //-HERENCIA
        
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
        
        
        //-POLIMORFISMO
        
        /*
        El famoso arreglo de objetos
        Como "Persona" es la clase madre y "Emplado", "Consultor" y 
        "Jefe" son las clases hijas son formas diferentes de representar
        una misma persona
        
        */
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        //Otro ejemplo de polimorfismo
        Persona perso = new Persona();
        Consultor consult = new Consultor();
        
        perso = consult;
        /*consult = perso; esto marcaría error ya que no se le puede
                           asignar el padre al hijo*/
        
    }
}
