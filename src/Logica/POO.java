package Logica;


public class POO {

    public static void main(String[] args) {
        
        //Estoy llamado al constructor vacío que se encuentra en Alumno.java
        Alumno alu1 = new Alumno();
        
        //Estoy llamando al constructor con datos que se encuentra en Alumno.java
        Alumno alu2 = new Alumno(5, "Erick", "Moo");
        
        //Obtenemos y mostramos los datos del alumno 1
        System.out.println("El ID del alumno 2 es: " + alu2.getId());
        System.out.println("El Nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El Apellido del alumno 2 es: " + alu2.getApellido());
        
        //Colocamos datos al objeto vacío (alumno 1) (modificar)
        alu1.setId(9);
        alu1.setNombre("Adriel");
        alu1.setApellido("Calan");
        
        //Obtenemos los datos modificados y mostramos los datos del alumno 1
        System.out.println("El ID del alumno 1 es: " + alu1.getId());
        System.out.println("El Nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El Apellido del alumno 1 es: " + alu1.getApellido());
    }
}