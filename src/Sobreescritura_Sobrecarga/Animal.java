
package Sobreescritura_Sobrecarga;

public class Animal {
    private int id_animal;
    private String descripcion;
    
    //Constructores
    
    //Métodos getters y setters
    
    //Otros métodos
    
    
    //-SOBRECARGA DE MÉTODOS
    /*
        3 métodos con el mismo nombre, pero se diferencia con el número de parámetros
    */
    public void hacerSonido() {
        System.out.println("El animal hace el sonido");
    }
    
    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal" + nombreAnimal + "hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal" + nombreAnimal + "hace un sonido" + tipoSonido);
    }
}
