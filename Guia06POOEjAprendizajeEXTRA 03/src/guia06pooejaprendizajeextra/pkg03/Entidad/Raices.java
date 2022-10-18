package guia06pooejaprendizajeextra.pkg03.Entidad;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2o grado. 
 *
 */

public class Raices {
    
    //Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    
    private double a;
    private double b;
    private double c;

    // Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
    
    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
    
}
