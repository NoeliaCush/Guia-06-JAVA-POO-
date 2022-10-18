package guia06poootrosejaprendizajeextra.pkg01;

import guia06poootrosejaprendizajeextra.pkg01.Service.FracciónService;
import java.util.Scanner;

public class Guia06POOOTROSEjAprendizajeEXTRA01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        FracciónService operacion = new FracciónService();

        operacion.crearFracciones();


        do {
            
        System.out.println("Indique una opción para realizar una operación entre las dos fracciones");
        System.out.println(" 1. Suma entre fracciones");
        System.out.println(" 2. Resta entre fracciones");
        System.out.println(" 3. Multiplicación entre fracciones");
        System.out.println(" 4. División entre fracciones");
        System.out.println(" 5. Salir");

        opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    operacion.sumaFracciones();
                    break;
                case 2:
                    operacion.restaFracciones();
                    break;
                case 3:
                    operacion.multiFracciones();
                    break;
                case 4:
                    operacion.dividFracciones();
                    break;
                case 5:
                    System.out.println("Usted ha salido");
            }

        } while (opcion != 5);

    }

}
