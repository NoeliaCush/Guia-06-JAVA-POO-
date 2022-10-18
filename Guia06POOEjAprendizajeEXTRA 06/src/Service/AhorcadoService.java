package Service;

import guia06pooejaprendizajeextra.pkg06.Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in);
      
    Ahorcado ahorcado1 = new Ahorcado();
    
    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
     * máxima.
     */
    
    public void crearJuego(){
       
        /**
         * Con la palabra del usuario, pone la longitud de la palabra, como la
         * longitud del vector. Después ingresa la palabra en el vector, letra
         * por letra, quedando cada letra de la palabra en un índice del vector.
         */
        
        System.out.println("Ingrese la palabra para jugar");
        String palabra = leer.next(); // pide la palabra
        String Vector[] = new String[palabra.length()]; //pone la longitud de la palaba como longitud del vecto
        ahorcado1.setPalabra(new String [palabra.length()]);
        
        for (int i = 0; i < palabra.length(); i++) { //cada letra de la palabra esta en un indice del vector
            Vector[i] = palabra.substring(i, i+1);
        }
        
        // guarda en cantidad de jugadas máximas, el valor que ingresó elusuario y encontradas en 0.
        
        System.out.println("Por favor, ingrese la cantidad de jugadas máximas");
        ahorcado1.setCantJugadasMaximas(leer.nextInt());
        ahorcado1.setCantLetrasEncontradas(0);
        
    }
    
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    
    public void longitud(){
        
        System.out.println("La palabra " + " contiene " + ahorcado1.getPalabra().length + " letras" );
        
    }
    
    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. También informará
     * si la letra estaba o no.
     */
    
    public boolean buscar(String letra) {
        boolean bandera = false;

        for (int i = 0; i < ahorcado1.getPalabra().length; i++) {
            if (encontradas(letra)) {
                System.out.println("La letra es parte de la palabra");
                bandera = true;
                
            } else {
                System.out.println("La letra no es parte de la palabra");
                bandera = false;
            }

        }

        return bandera;
    }
    
    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     * @param letra
     */
    
    public boolean encontradas(String letra) {
        boolean bandera = false;

        for (String palabra : ahorcado1.getPalabra()) {
            if ((palabra).equalsIgnoreCase(letra)) {
                ahorcado1.setCantLetrasEncontradas(ahorcado1.getCantLetrasEncontradas() + 1);
                bandera = true;
            }
        }

        System.out.println("La cantidad de letras que han sido encontradas fueron " + ahorcado1.getCantLetrasEncontradas());
        System.out.println("La cantidad de letras que restan por encontrar son " + (ahorcado1.getPalabra().length - ahorcado1.getCantLetrasEncontradas()));

        return bandera;
    }

    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador
    
    public void intentos(){
        
        ahorcado1.setCantJugadasMaximas(ahorcado1.getCantJugadasMaximas()-1);
        System.out.println("La cantidad de intentos restantes es " + ahorcado1.getCantJugadasMaximas());
    }
    
    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la
     * palabra o se quede sin intentos. Este método se llamará en el main. Un
     * ejemplo de salida puede ser así: Ingrese una letra: a Longitud de la
     * palabra: 6 Mensaje: La letra pertenece a la palabra Número de letras
     * (encontradas, faltantes): (3,4) Número de oportunidades restantes: 4
     */
    
    public void juego(){
        
        crearJuego();
        longitud();
        
        do{
            System.out.println("Por favor, ingrese una letra");
            String letra = leer.next();
            buscar(letra);
            
            if(ahorcado1.getCantLetrasEncontradas()==ahorcado1.getPalabra().length){
                System.out.println("Felicidades, descubriste la palabra");
                break;
            }else if (ahorcado1.getCantJugadasMaximas()==0){
                System.out.println("No hay más intentos, no has podido adivinar la palabra");
            }
            
        }while(ahorcado1.getCantJugadasMaximas()!=0);
    }
    
}
