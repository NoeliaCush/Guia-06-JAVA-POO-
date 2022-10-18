package guia06pooejaprendizaje03.Entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2.
 */
public class Operacion {

    Scanner leer = new Scanner(System.in);

    private int numero1;
    private int numero2;

    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    //c) Métodos get y set.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion() {
        System.out.println("Por favor, ingrese el valor del primer número");
        numero1 = leer.nextInt();
        System.out.println("Por favor, ingrese el valor del segundo número");
        numero2 = leer.nextInt();
    }

    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar() {
        int suma;
        suma = (numero1 + numero2);
        System.out.println("La suma entre los números " + numero1 + " y " + numero2 + " es " + suma);
    }

    // f) Método restar(): calcular la resta de los números y devolver el resultado al main 
    public void restar(){
        int resta;
        resta = ( numero1 - numero2);
        System.out.println("La resta entre los números " + numero1 + " y " + numero2 + " es " + resta);
      }
    
    /**
     * g) Método multiplicar(): primero valida que no se haga una multiplicación
     * por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
     * informa al usuario el error. Si no, se hace la multiplicación y se
     * devuelve el resultado al main
     */
    public void multiplicar(){
        int multi;
       multi = (numero1*numero2);
        if (numero1==0 || numero2==0){
             System.out.println("ERROR, la multiplicación entre los números " + numero1 + " y " + numero2 + " es igual a CERO " + multi);
        }else{
            System.out.println("La multiplicación entre los números " + numero1 + " y " + numero2 + " es " + multi);
        }
    }
    
    /**
     * h) Método dividir(): primero valida que no se haga una división por cero,
     * si fuera a pasar una división por cero, el método devuelve 0 y se le
     * informa al usuario el error se le informa al usuario. Si no, se hace la
     * división y se devuelve el resultado al main
     */
    public void dividir(){
        int divi;
        divi = (numero1 / numero2);
        if (numero1==0 || numero2==0){
             System.out.println("ERROR, la división entre los números " + numero1 + " y " + numero2 + " es igual a CERO " + divi);
        }else{
            System.out.println("La división entre los números " + numero1 + " y " + numero2 + " es " + divi);
        }
    }
    
}
