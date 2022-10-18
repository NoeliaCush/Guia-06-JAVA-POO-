/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura
 */
package guia06pooejaprendizaje04.Entidad;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);

    private double base;
    private double altura;

    /**
     * Se deberán además definir los métodos getters, setters y constructores
     * correspondientes.
     */
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * La clase incluirá un método para crear el rectángulo con los datos del
     * Rectángulo dados por el usuario.
     */
    public void crearRectangulo() {
        System.out.println("Por favor, ingrese el valor de la base de su rectángulo");
        base = leer.nextDouble();
        System.out.println("Por favor, ingrese el valor de la altura de su rectángulo");
        altura = leer.nextDouble();
    }

    //También incluirá un método para calcular la superficie del rectángulo
    public void calcularSuperficie(){
        double superficie;
        superficie = (base * altura);
        System.out.println("La superficie del rectángulo de base "+ base + " y altura "+ altura + " es " + superficie);
    }
    
    //y un método para calcular el perímetro del rectángulo
    public void calcularPerimetro(){
        double perimetro;
        perimetro = ((base + altura) * 2);
        System.out.println("El perímetro del rectángulo de base " + base + " y altura " + altura+ " es " + perimetro);
    }

    /**
     * Por último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura.
     */
    public void dibujarRectangulo(){
          for (int i = 0; i < altura; i++) {
                      System.out.print(" * ");  
         }
             System.out.println("");
          
          for (int i = 0; i < altura -2 ; i++) {
                      System.out.print(" * ");
                      for (int j = 0; j < base -2; j++) {
                          System.out.print("   ");
                      }
            System.out.println(" * ");   
         }
   
         for (int i = 0; i < altura; i++) {
             System.out.print(" * ");
        }
    }
}
