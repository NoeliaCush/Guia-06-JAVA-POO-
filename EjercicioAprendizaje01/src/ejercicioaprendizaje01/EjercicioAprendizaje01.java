package ejercicioaprendizaje01;

import ejercicioaprendizaje01.Entidad.Libro;

public class EjercicioAprendizaje01 {

    public static void main(String[] args) {
        
        //Método en la main
        Libro libro1 = new Libro();
        
        libro1.cargaLibro();
        
        System.out.println(libro1);
    }

}
