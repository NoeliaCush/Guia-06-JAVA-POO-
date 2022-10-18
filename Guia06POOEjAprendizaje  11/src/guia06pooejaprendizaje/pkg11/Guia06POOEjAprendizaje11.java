package guia06pooejaprendizaje.pkg11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Guia06POOEjAprendizaje11 {

    public static void main(String[] args) {
  
        Scanner leer = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        
        
        //En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date
        Date fecha = new Date();
        
        // tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date
       
        System.out.println("Por favor ingrese los valores de la fecha");
        System.out.println("Un día");
        fecha.setDate(leer.nextInt());
        System.out.println("Un mes");
        fecha.setMonth(leer.nextInt()-1);
        System.out.println("Y un año");
        fecha.setYear(leer.nextInt()-1900);
        
        /**
         * Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar
         * cuantos años hay entre esa fecha y la fecha actual, que se puede
         * conseguir instanciando un objeto Date con constructor vacío.
         */
        
        System.out.println("La fecha ingresada es " + sdf.format(fecha));
        
        Date fechaActual = new Date();
        System.out.println("La fecha actual es " + sdf.format(fechaActual));
        
        System.out.println("Entre la fecha ingresada " + sdf.format(fecha) + " y la fecha actual " + sdf.format(fechaActual) + " hay " + (fechaActual.getYear() - fecha.getYear()) + " años de diferencia " );       

    }
    
}
