package Sobreescritura_Sobrecarga;

public class Perro extends Animal2{
    
    private String nombrePerro;
    private double peso;
    private double raza;
    private String sexo;
    
    //Constructores
    
    //Métodos getters y setters
    
   //-SOBREESCRIBIR
    
    @Override //Override = SOBREESCRIBIR
    public void hacerSonido() {
        System.out.println("Soy un perro y lado: Guau guau");
    }
    
    
}
