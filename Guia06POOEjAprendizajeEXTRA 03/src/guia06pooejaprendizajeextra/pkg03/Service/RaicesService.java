package guia06pooejaprendizajeextra.pkg03.Service;

import guia06pooejaprendizajeextra.pkg03.Entidad.Raices;
import java.util.Scanner;

public class RaicesService {

    Scanner leer = new Scanner(System.in);
    Raices operacion = new Raices();

    public void crearCoeficientes() {
        System.out.println("Por favor, ingrese los valores para los siguientes coeficientes");
        System.out.println("Coeficiente a");
        operacion.setA(leer.nextInt());
        System.out.println("Coeficiente b");
        operacion.setB(leer.nextInt());
        System.out.println("Coeficiente c");
        operacion.setC(leer.nextInt());
    }

    /**
     * Método getDiscriminante(): devuelve el valor del discriminante (double).
     * El discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante() {

        return Math.pow(operacion.getB(), 2) - 4 * operacion.getA() * operacion.getC();
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     */
    public boolean tieneRaices() {

        return getDiscriminante() >= 0;
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz() {

        return getDiscriminante() == 0;
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
     * las 2 posibles soluciones. Formula ecuación 2o grado:
     * (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b      *
     */
    public void obtenerRacices() {

        if (tieneRaices()) {
            System.out.println("El primer resultado es " + (-operacion.getB() + Math.sqrt(getDiscriminante() / (2 * operacion.getA()))));
            System.out.println("El segundo resultado es " + (-operacion.getB() - Math.sqrt(getDiscriminante() / (2 * operacion.getA()))));
        }

    }
    
    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     */
    
    public void obtenerRaiz(){
        
        if(tieneRaiz()){
            System.out.println("El resultado es " + (-operacion.getB()/(2*operacion.getA())));
        }
    }
    
    /**
     * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
     * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
     * con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
     * nuestros métodos y en caso de no existir solución, se mostrará un
     * mensaje.
     */
    
    public void calcular(){
        
        if(tieneRaices()){
            obtenerRacices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No existe una solución");
        }
        
    }
}
