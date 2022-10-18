package guia06pooejercicioaprendizaje02.Entidad;

import java.util.Scanner;

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    private Double radio;

    //a) método constructor que inicialice el radio pasado como parámetro
    public Circunferencia(Double radio) {
        this.radio = radio;
    }
    
    //b)método get y set para el atributo
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el tamaño del radio");
        Double radio = leer.nextDouble();
        return new Circunferencia ();
    }
    
    
}
