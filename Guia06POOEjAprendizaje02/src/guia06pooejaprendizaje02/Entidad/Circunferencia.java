//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
package guia06pooejaprendizaje02.Entidad;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    //atributo
    private double radio;

    //a) Método constructor que inicialice el radio pasado como parámetro.

    public Circunferencia() {
    }
        
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public void crearCircunferencia() {
        System.out.println("Por favor, indique el valor de su radio");
        radio = leer.nextDouble();
        System.out.println("El valor del radio es: "+ radio);
    }

    //d) Método area(): para calcular el área de la circunferencia (Area = pi *radio2)
    public void calcularArea() {
        double area;
        area = (Math.PI*Math.pow(radio,2));
        System.out.println("El valor del área es: " + area);
    }

    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi* radio).
    public void calcularPerimetro(){
        double perimetro;
        perimetro = (2*Math.PI*radio);
        System.out.println("El valor del perímetro es " + perimetro);
    }
}
