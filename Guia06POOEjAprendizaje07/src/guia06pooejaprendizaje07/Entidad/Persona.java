package guia06pooejaprendizaje07.Entidad;

import java.util.Scanner;

/**
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura
 */

public class Persona {
           
    private String nombre;
    private int edad;
    private String sexo; //"H" Hombre - "M" Mujer - "O" Otro
    private double peso;
    private double altura;
    
    //Un constructor por defecto
    public Persona() {
    }
    
    // Un constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Métodos getters y setters de cada atributo.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     */
    
    public void crearPersona(){

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = true;

        System.out.println("Por favor, complete los siguientes datos de la persona:");

        System.out.println("¿Cuál es su nombre?");
        nombre = leer.next();

        System.out.println("¿Cuántos años tiene?");
        edad = leer.nextInt();

        do {
            System.out.println("¿Cuál es su identidad sexual? Por favor ingrese 'H'(Hombre) / 'M'(Mujer) / 'O' (Otro)");
            sexo = leer.next().toUpperCase();
            if (sexo.length() > 1) {
                System.out.println("Error. Usted ha ingresado más de una letra");
                bandera = false;
            }
            if (sexo.startsWith("H") || sexo.startsWith("M") || sexo.startsWith("O")) {
                bandera = true;
            } else {
                System.out.println("Error. Ingresó una respuesta no válida");
                bandera = false;
            }
        } while (!bandera);

        System.out.println("¿Cuál es su peso?");
        peso = leer.nextDouble();

        System.out.println("¿Cuál es su altura?");
        altura = leer.nextDouble();
    }
    
    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     */
    
    int contPesoIdeal= 0;
    int contBajoPeso = 0;
    int contSobrePeso = 0;
    int contMayor = 0;
    int contMenor = 0;
    
    public int calcularIMC() {
        double pesoIdeal;
        int imc = 0;

        pesoIdeal = (peso / Math.pow(altura, 2));

        if (pesoIdeal < 20) {
            System.out.println("Usted se encuentra por debajo de su peso ideal");
            imc = -1;
            contBajoPeso ++;
            
        } else if ((pesoIdeal >= 20) && (pesoIdeal <= 25)) {
            System.out.println("Usted se encuentra en su peso ideal");
            imc = 0;
            contPesoIdeal ++;
            
        } else if (pesoIdeal > 25) {
            System.out.println("Usted tiene sobrepeso");
            imc = 1;
            contSobrePeso ++;
            
        }

        return imc;
    }
    
    /**
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano.
     */
    
    public boolean esMayorDeEdad(){
        
        boolean mayor = false;
        
        if(edad > 18){
            System.out.println("La persona es mayor de edad");
            mayor = true;
            contMayor ++;
        }else{
            System.out.println("La persona es menor de edad");
            contMenor ++;
        }
        
        return mayor;
    }
    
    /**
         * Por último, guardaremos los resultados de los métodos calcularIMC y
         * esMayorDeEdad en distintas variables, para después en el main,
         * calcular un porcentaje de esas 4 personas cuantas están por debajo de
         * su peso, cuantas en su peso ideal y cuantos, por encima, y también
         * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
         * menores.
         *
         */     
    
   

        
        
    

}
