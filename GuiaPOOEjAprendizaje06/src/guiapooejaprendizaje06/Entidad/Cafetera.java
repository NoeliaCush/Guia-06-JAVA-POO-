/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
 * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
 * actual de café que hay en la cafetera).
 */

package guiapooejaprendizaje06.Entidad;

import java.util.Scanner;

public class Cafetera {
   
    Scanner leer = new Scanner(System.in);
    
    private double capacidadMaxima;
    private double cantidadActual;
    
    //Constructor predeterminado o vacío
    public Cafetera() {
    }

   //Métodos getters y setters. 

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
            
    //Constructor con la capacidad máxima y la cantidad actual
    public void determinarCapacidadMaxima(){
        System.out.println("Por favor, indique cual es la capacidad máxima de su cafetera");
      capacidadMaxima = leer.nextDouble();
    }
    
    public void determinarCantidadActual(){
        System.out.println("Por favor, indique la cantidad de café que contiene su cafetera");
        cantidadActual = leer.nextDouble();
    }
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public void llenarCafetera(){
        if(cantidadActual != capacidadMaxima){
            System.out.println("Por favor, rellene la cafetera con la cantidad que falta para la capacidad máxima");
            double llenar;
            llenar = capacidadMaxima - cantidadActual;
            cantidadActual = cantidadActual + llenar;
            
            System.out.println("Cafetera llena. La cantidad actual de café es " + cantidadActual);
          
        }else{
             System.out.println("Cafetera llena. La cantidad actual de café es " + cantidadActual);
        }
    }
    
    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza
     */
    public void servirTaza(){
        System.out.println("Por favor, indique el tamaño de su taza");
        int taza = leer.nextInt();
        System.out.println("Por favor, indique la cantidad de café que desea servir en la taza");
        double servirCafe = leer.nextDouble();
        
        //taza = (servirCafe -(servirCafe-cantidadActual));
        
        if((cantidadActual >= servirCafe)){
            System.out.println("Se ha llenado la taza");
        }else if( (cantidadActual < servirCafe)){
            System.out.println("No se ha podido llenar los " + servirCafe + " ml de café que deseaba. Pero hemos llenado esta cantidad " + (servirCafe-(servirCafe- cantidadActual)) );
        }
    }
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        System.out.println("Es momento de limpiar la cafetera, debemos vaciarla");
        cantidadActual = 0;
        System.out.println("La cantidad actual de café es " + cantidadActual);
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
public void agregarCafe(){
    System.out.println("Por favor, ingrese la cantidad de café que desea agregar");
    int agregar = leer.nextInt();
    cantidadActual = cantidadActual + agregar;
    System.out.println("Perfecto, la cantidad actual de café es de " + cantidadActual);
}
    
    
    
    
}
