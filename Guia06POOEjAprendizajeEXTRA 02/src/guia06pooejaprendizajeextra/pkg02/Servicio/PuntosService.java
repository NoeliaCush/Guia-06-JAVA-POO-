package guia06pooejaprendizajeextra.pkg02.Servicio;

import guia06pooejaprendizajeextra.pkg02.Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {
   
    Scanner leer = new Scanner(System.in);
    
    Puntos p1 = new Puntos();
    Puntos p2 = new Puntos();
    
    /**
     * Generar un objeto puntos usando un método crearPuntos() que le pide al
     * usuario los dos números y los ingresa en los atributos del objeto.
     */
    
    public void crearPuntos() {
        
        System.out.println("Por favor, ingrese las coordenadas del primer punto");
       
        System.out.println("Eje X");
        p1.setX1(leer.nextInt());
        System.out.println("Eje Y");
        p1.setY1(leer.nextInt());
        System.out.println("Coodenadas del primer punto ( " + p1.getX1() + " ; " + p1.getY1() + " )");
        
        System.out.println("=====");
        
        System.out.println("Por favor, ingrese las coordenadas del segundo punto");
        System.out.println("Eje X");
        p2.setX2(leer.nextInt());
        System.out.println("Eje Y");
        p2.setY2(leer.nextInt());
        System.out.println("Coodenadas del segundo punto ( " + p2.getX2() + " ; " + p2.getY2() + " )");

    }
    
    /**
     * a través de otro método calcular y devolver la distancia que existe entre
     * los dos puntos que existen en la clase Puntos.
     * TEOREMA DE PITAGORAS
     * d (p1,p2) = Math.sqrt( Math.pow(p2.getX2() - p1.getX1() , 2) + Math.pow( p2.getY2() - p1.getY1(), 2))
     */
    
    public double distanciaPunto(){
        double distancia = Math.sqrt( Math.pow(p2.getX2() - p1.getX1() , 2) + Math.pow( p2.getY2() - p1.getY1(), 2));
       
        System.out.println("Aplicando el Teorema de Pitágoras, la distancia entre los puntos 1 y 2 es d(p1,p2) = " + distancia);
        
        return distancia;
    }
    
}
