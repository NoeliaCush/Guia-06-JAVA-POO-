/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set.
 */
package guia06pooejaprendizaje09.Entidad;

import static java.lang.Math.round;

public class Matemática {

    // atributos dos números reales
    private double numero1;
    private double numero2;

    //constructor vacío
    public Matemática() {
    }
    
    //constructor con parámetro
    
    public Matemática(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //getter & setter
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

//a) Método devolverMayor() para reto<rnar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor() {

        //Math.max(double a, double b) -> devuelve el mayor de dos números double.
        System.out.println("El número mayor es " + Math.max(numero1, numero2));

    }
    
    /**
     * b) Método calcularPotencia() para calcular la potencia del mayor valor de
     * la clase elevado al menor número. Previamente se deben redondear ambos
     * valores.
     */
    
    public void calcularPotenia(){
        
        System.out.println("Los números redondeados quedan de la siguiente forma: " + round(numero1) + " y " + round(numero2));
        
        //Math.pow(Math.max(double a, double b), Math.min(double a, double b)
        System.out.println("La potencia del mayor valor de la clase elevado al menor número es: " +  (Math.pow(Math.max(numero1, numero2), Math.min(numero1, numero2))));

    }
    
    /**
     * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los
     * dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor
     * absoluto del número.
     */

    public void calcularRaiz(){
        
       //Maths.abs(double a)
        System.out.println("El valor absoluto del número menor es " + Math.abs(Math.min(numero1, numero2)));
       
        //Math.sqrt(double a)
        System.out.println("La raíz cuadrada del menor de los dos valores será " + Math.sqrt(Math.abs(Math.min(numero1, numero2))));
    }
    
}
