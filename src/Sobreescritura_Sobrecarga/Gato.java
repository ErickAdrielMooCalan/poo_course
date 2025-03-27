
package Sobreescritura_Sobrecarga;

public class Gato extends Animal2{
    

//-SOBREESCRIBIR
    
    @Override //Override = SOBREESCRIBIR
    public void hacerSonido() {
        System.out.println("Soy un gato hago: Miua Miau");
    }
}
