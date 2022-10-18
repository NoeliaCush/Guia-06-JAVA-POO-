//Implemente la clase Persona.
package guia06pooejaprendizaje12.Entidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);

    //Una persona tiene un nombre y una fecha de nacimiento (Tipo Date)    
    private String nombre;
    private Date nacimiento;

    //constructor vacío
    public Persona() {
    }

    //constructor parametrizado
    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    //get y set.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Agregar un método de creación del objeto que respete la siguiente firma:
     * crearPersona(). Este método rellena el objeto mediante un Scanner y le
     * pregunta al usuario el nombre y la fecha de nacimiento de la persona a
     * crear, recordemos que la fecha de nacimiento debe guardarse en un Date y
     * los guarda en el objeto.
     */
    public void crearPersona() {

        System.out.println("Por favor, ingrese el nombre de la persona");
        setNombre(leer.next());
        System.out.println("Fecha de nacimiento de la persona");
        System.out.println("Por favor, ingrese el día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Por favor, ingrese el año de nacimiento");
        int anio = leer.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        setNacimiento(fechaNacimiento);
    }

    /**
     * Escribir un método calcularEdad() a partir de la fecha de nacimiento
     * ingresada. Tener en cuenta que para conocer la edad de la persona también
     * se debe conocer la fecha actual
     *
     * @return
     */
    public int calcularEdad() {
        //fecha actual        
        Date fechaActual = new Date();
        System.out.println("La fecha actual es " + fechaActual);

        int edad = (fechaActual.getYear() - nacimiento.getYear());

        System.out.println(getNombre() + " tiene " + edad + " años");

        return edad;
    }

    /**
     * Agregar a la clase el método menorQue(int edad) que recibe como parámetro
     * otra edad y retorna true en caso de que el receptor tenga menor edad que
     * la persona que se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue() {
        boolean respuesta = false;

        System.out.println("Por favor indique la edad de otra persona;");
        int edadPersona = leer.nextInt();

        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - nacimiento.getYear());
        if (edad < edadPersona) {
            respuesta = true;
            System.out.println(getNombre() + " tiene una edad menor a la igresada");
        } else {
            respuesta = false;
            System.out.println(getNombre() + " tiene una edad mayor a la igresada");
        }

        return respuesta;
    }

    /**
     * Metodo mostrarPersona(): este método muestra la persona creada en el
     * método anterior
     */
    public void mostrarPersona() {

        System.out.println("==========");
        System.out.println("Datos de la persona");
        System.out.println("Nombre " + getNombre());
        System.out.println("Nacimiento " + getNacimiento());
        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - nacimiento.getYear());
        System.out.println("Edad " + edad);
        System.out.println("==========");
    }


    
}
