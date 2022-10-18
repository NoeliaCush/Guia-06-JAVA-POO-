/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. 
 */
package guia06pooejaprendizaje08.Entidad;

import java.util.Scanner;

public class Cadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String frase;
    private int longitud;
    
    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    /**
     * se le pedirá al usuario que ingrese una
     * frase que puede ser una palabra o varias palabras separadas por un
     * espacio en blanco y a través de los métodos set, se guardará la frase y
     * la longitud de manera automática según la longitud de la frase ingresada.
     */
    public void crearFrase() {

        System.out.println("Por favor ingrese una frase, puede ser una palabra o varias separas por un espacio en blanco.");
        this.frase = leer.nextLine();
        this.longitud = getFrase().length();
        System.out.println("La palabra es: " + frase);
        System.out.println("La longitud de la frase es de " + longitud + " caracteres");
        
    }
    
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    public int mostrarVocales() {
        int vocales = 0;

        for (int i = 0; i < getFrase().length(); i++) {
            String vocal = getFrase().substring(i, i + 1);

            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
                vocales += 1;
            }
        }
       
        System.out.println("La frase contiene " +  vocales + " vocales");

        return vocales;
        
    }
    
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"
    
    public void invertirFrase() {
        
        for (int i = getFrase().length(); i > 0; i--) {
            System.out.print(getFrase().substring(i - 1, i));
        }

    }
    
    /**
     * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo: d) Entrada: frase = "casa blanca". Salida: El carácter 'a'
     * se repite 4 veces.
     *
     * @param caracter
     */
    
    public void vecesRepetido(String caracter){

         int repiteChar = 0;
        
        for (int i = 0; i < getFrase().length() ; i++) {
            
            if(getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)){
                repiteChar +=1;
            }
        }
        
        System.out.println("El caracter ' " + caracter + " ' se repite " + repiteChar + " veces" );
    }
    
    //d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario
    
    public boolean compararLongitud(String fraseNueva){
        
          boolean mismaLongitud = false;
          
          if(getFrase().length() == fraseNueva.length()){
              mismaLongitud = true;
              System.out.println("La longitud de las frases < " + frase + " >  y < " + fraseNueva + "  > coinciden");
    }else{
              System.out.println("La longitud de las frases < " + frase + "  > y < " + fraseNueva + " > no coinciden");
              mismaLongitud = false;
          }
        
        return mismaLongitud;
    }
    
    // e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrases(String fraseNueva){
        
        System.out.println("Las frases < " + frase + " > y < " + fraseNueva + " > unidas quedan de la siguiente forma: < " + getFrase().concat( ", " + fraseNueva) + " > ");
        
    }
    
    /**
     * f) Método reemplazar(String letra), deberá reemplazar todas las letras “a”
     * que se encuentren en la frase, por algún otro carácter seleccionado por
     * el usuario y mostrar la frase resultante.
     */
    
    public void reemplazar(String caracter){
        
        for (int i = 0; i < getFrase().length() ; i++) {
            if(getFrase().substring(i, i + 1).equalsIgnoreCase("a")){
                System.out.print(caracter);
            }else{
                System.out.println(getFrase().substring(i, i + 1));
            }
        }
        
    }
    
    /**
     * g) Método contiene(String letra), deberá comprobar si la frase contiene una
     * letra que ingresa el usuario y devuelve verdadero si la contiene y falso
     * si no.
     */ 
    
    public boolean contiene(String caracter) {
        boolean contieneChar = false;

        if (getFrase().contains(caracter)) {
            contieneChar = true;
            System.out.println("La frase < " + frase + " > contiene el caracter ' " + caracter + " ' por lo tanto, " + contieneChar);
        } else {
            System.out.println("La frase < " + frase + " > no contiene el caracter ' " + caracter + " ' por lo tanto, " + contieneChar);
            contieneChar = false;
        }
       
        return contieneChar;
    }
}
    
    
    
