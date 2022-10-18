package guia06pooejaprendizajeextra.pkg05.Service;

import guia06pooejaprendizajeextra.pkg05.Entidad.Meses;
import java.util.Scanner;

public class MesesService {
    
    Scanner leer = new Scanner(System.in);
    
    Meses juego = new Meses();
    
    /**
     * El programa debe pedir al usuario que adivine el mes secreto. Si el
     * usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a
     * intentar adivinar el mes secreto. Un ejemplo de ejecución del programa
     * podría ser este: Adivine el mes secreto. Introduzca el nombre del mes en
     * minúsculas: febrero No ha acertado. Intente adivinarlo introduciendo otro
     * mes: agosto ¡Ha acertado!
     */
    
    public void AdivinarMesSecreto(){
        
        System.out.println("Adivine el mes secreto");
        
        String mes;
        
        do{
            System.out.println("Introduzca el nombre del mes en minúsculas");
            mes = leer.next();
            
            if(!juego.getMesSecreto().equals(mes)){
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }
        }while(!juego.getMesSecreto().equals(mes));
        
        System.out.println("¡Ha acertado!");

    }
    
}
